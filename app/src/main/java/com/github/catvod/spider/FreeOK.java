package com.github.catvod.spider;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;

import com.github.catvod.utils.okhttp.OkHttpUtil;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;

public class FreeOK extends Spider {

    private static final String siteUrl = "https://www.freeok.vip";

    protected HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent",
                "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.183 Safari/537.36");
        return headers;
    }

    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();

            JSONObject rebopaihang = new JSONObject();
            JSONObject dianying = new JSONObject();
            JSONObject dianshiju = new JSONObject();
            JSONObject dongman = new JSONObject();
            JSONObject zongyi = new JSONObject();

            rebopaihang.put("type_id", "/label/hot.html");
            rebopaihang.put("type_name", "热播排行");
            dianying.put("type_id", "/vod-show/1--------");
            dianying.put("type_name", "电影");

            dianshiju.put("type_id", "/vod-show/2--------");
            dianshiju.put("type_name", "电视剧");

            dongman.put("type_id", "/vod-show/3--------");
            dongman.put("type_name", "动漫");

            zongyi.put("type_id", "/vod-show/4--------");
            zongyi.put("type_name", "综艺");

            classes.put(rebopaihang);
            classes.put(dianying);
            classes.put(dianshiju);
            classes.put(dongman);
            classes.put(zongyi);

            result.put("class", classes);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public String getVideoDetail(String videoId) {
        try {
            String url = siteUrl + "/vod-detail-id-" + videoId + ".html";
            String html = OkHttpUtil.get(url, getHeaders());
            Document doc = Jsoup.parse(html);

            // 解析视频详情页面，提取所需信息
            Element titleElement = doc.selectFirst(".vod-n-l .vod-n-l-tit h1");
            String title = titleElement.text();
            Element descElement = doc.selectFirst(".vod-n-l .vod-n-l-jj");
            String description = descElement.text();

            // 构建包含视频详细信息的JSON对象
            JSONObject videoDetail = new JSONObject();
            videoDetail.put("title", title);
            videoDetail.put("description", description);

            // 获取播放链接
            Elements playLinks = doc.select(".vod-play-list ul li a");
            JSONArray playUrls = new JSONArray();
            for (Element link : playLinks) {
                String playUrl = link.attr("href");
                String playTitle = link.text();
                JSONObject playLink = new JSONObject();
                playLink.put("title", playTitle);
                playLink.put("url", playUrl);
                playUrls.put(playLink);
            }
            videoDetail.put("play_urls", playUrls);

            return videoDetail.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
}
