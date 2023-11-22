package com.github.catvod.spider;
import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class YGP extends Spider{

    private static String siteUrl = "https://www.yingshiguang.com/";

    private static String ua = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36";

    private JSONObject filterConfig;

    @Override
    public void init(Context context) {
        super.init(context);
        try {
            filterConfig = new JSONObject("{\"movlist/\":[{\"key\":\"1\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"灾难\",\"v\":\"灾难\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"冒险\",\"v\":\"冒险\"}]},{\"key\":\"0\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"大陆\",\"v\":\"大陆\"},{\"n\":\"香港\",\"v\":\"香港\"},{\"n\":\"台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"2\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"},{\"n\":\"1999\",\"v\":\"1999\"},{\"n\":\"1998\",\"v\":\"1998\"},{\"n\":\"1980\",\"v\":\"1980\"}]},{\"key\":\"3\",\"name\":\"排序\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"最近更新\",\"v\":\"\"},{\"n\":\"上映时间\",\"v\":\"pubtime\"}]}]}");
        } catch (JSONException e) {
            SpiderDebug.log(e);
        }
        }

    protected HashMap<String, String>Headers() {
        HashMap<String, String>headers = new HashMap<>();
        headers.put("method", "GET");
        headers.put("User-Agent",ua);
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
        headers.put("Accept-Language", "zh-CN,zh;q=0.9");
        return headers;
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            JSONObject type = new JSONObject();
            type.put("type_id","movlist/");
            type.put("type_name","预告片世界");
            classes.put(type);
            result.put("class", classes);
            if (filter) {
                result.put("filters", filterConfig);
            }
            Document doc = Jsoup.parse(OkHttpUtil.string(siteUrl, Headers()));
            //获取推荐页片源数据
            Elements elements = doc.select("div.inner-2col-main div.movlist > ul li > a");
            JSONArray videos = new JSONArray();
                for (int i = 0; i < 30; i++) {
                    Element vod = elements.get(i);
                    String id = vod.attr("href");
                    String title = vod.selectFirst("span").attr("title");
                    String pic = vod.selectFirst("img").attr("src");
                    pic = pic.contains("http")?pic:siteUrl + pic;
                    String remark = vod.select("span").last().text();
                    JSONObject v = new JSONObject();
                    v.put("vod_id", id);
                    v.put("vod_name", title);
                    v.put("vod_pic", pic);
                    v.put("vod_remarks", remark);
                    videos.put(v);
                }
                result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
        SpiderDebug.log(e);
    }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String>extend) {
        try {
            String[] urlParams = new String[] {"", "", "", "", "",};
            String url = siteUrl + tid;
            urlParams[4] = pg;
            if (extend != null && extend.size() > 0) {
                for (Iterator<String> it = extend.keySet().iterator(); it.hasNext(); ) {
                    String key = it.next();
                    String value = extend.get(key);
                    urlParams[Integer.parseInt(key)] = URLEncoder.encode(value);
                }
            }
            url += TextUtils.join("_", urlParams);

            String html = OkHttpUtil.string(url, Headers());
            Document doc = Jsoup.parse(html);
            JSONObject result = new JSONObject();
            int pageCount = 0;
            int page = -1;
            Elements pageInfo = doc.select("p.page-nav a");
            if (pageInfo.size() == 0) {
                page = Integer.parseInt(pg);
                pageCount = page;
            } else {
                for (int i = 0; i < pageInfo.size(); i++) {
                    Element li = pageInfo.get(i);

                    if (!isNumeric(li.text()))
                        continue;
                    pageCount = pageCount < Integer.parseInt(li.text()) ? Integer.parseInt(li.text()) : pageCount;
                }

                    if (page == -1) {
                        page = Integer.parseInt(doc.select("p.page-nav a.current").text());
                        //page = Integer.parseInt(matcher.group(1).split("-")[8]);
                    } else {
                        page = 0;
                    }
                }
            JSONArray videos = new JSONArray();
            if (!html.contains("没有找到您想要的结果哦")) {
                Elements list = doc.select("div.inner-2col-main div.movlist > ul li > a");
                for (int i = 0; i < list.size(); i++) {
                    Element vod = list.get(i);
                    String id = vod.attr("href");
                    String title = vod.selectFirst("span").attr("title");
                    String pic = vod.selectFirst("img").attr("src");
                    pic = pic.contains("http")?pic:siteUrl + pic;
                    String remark = vod.select("span").last().text();
                    JSONObject v = new JSONObject();
                    v.put("vod_id", id);
                    v.put("vod_name", title);
                    v.put("vod_pic", pic);
                    v.put("vod_remarks", remark);
                    videos.put(v);
                }
            }
            result.put("page", page);
            result.put("pagecount", pageCount);
            result.put("limit", 30);
            result.put("total", pageCount <= 1 ? videos.length() : pageCount * 30);
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static String Regex(Pattern pattern, String content) {
        if (pattern == null) {
            return content;
        }
        try {
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return content;
    }

    @Override
    public String detailContent(List<String>ids) {
        try {
            String url = siteUrl + ids.get(0);
            Document doc = Jsoup.parse(OkHttpUtil.string(url, Headers()));
            JSONObject result = new JSONObject();
            JSONObject vodList = new JSONObject();
            Element data = doc.select("div.inner-wrapper").get(0);
            String pic =doc.select("div.movie-title-mpic > a >img").attr("src");
            pic = pic.contains("http")?pic:siteUrl + pic;
            String title = doc.select("h1.movie-name").text();
            String category = "", area = "", year = "", remark = "", director = "", actor = "", desc = "";
            Elements detail = doc.select("div.movie-title-detail a");
            for(int i =0 ;i<detail.size();i++){
                if(detail.get(i).attr("href").contains("country")) area = detail.get(i).text();
                if(detail.get(i).attr("href").contains("movietype"))  category += detail.get(i).text() + "/";
            }
            director =Regex(Pattern.compile("导演：(.+)主演"), doc.select("div.movie-title-detail p").text());
            year = Regex(Pattern.compile("上映：(\\w+)"), doc.select("div.movie-title-detail p").text());
            actor = Regex(Pattern.compile("主演：(.+)剧情"), doc.select("div.movie-title-detail p").text());
            desc = Regex(Pattern.compile("剧情：(.+)\\(详细\\)"), doc.select("div.movie-title-detail p").text());
            List<String> playName = new ArrayList<>();
            List<String> listVideo = new ArrayList<>();
            Elements fromName = doc.select("div.fromurlfilter");
            String vod_play_from = "";
            String vod_play_url = "";
            for(int i = 0;i<fromName.size();i++){
                List<String> playUrl = new ArrayList<>();
                playName.add(fromName.get(i).select("h2.list-title").text());
                Elements fromPlay = fromName.get(i).select("td a.tlist-title");
                for(int j = 0;j<fromPlay.size();j++){
                    playUrl.add(fromPlay.get(j).text() + "$" + fromPlay.get(j).attr("href"));
                }
                if(playUrl.size()>1){
                    vod_play_url = TextUtils.join("#",playUrl);
                }else{
                    vod_play_url = playUrl.get(0);
                }
                listVideo.add(vod_play_url);


                if(listVideo.size()>1){
                    vod_play_url = TextUtils.join("$$$",listVideo);
                    vod_play_from = TextUtils.join("$$$",playName);
                }else{
                    vod_play_from = playName.get(0);
                }

            }
            if(vod_play_from.equals("")){
                vod_play_url = "暂无预告$www";
                vod_play_from = "暂无预告";
            }
            vodList.put("vod_id", ids.get(0));
            vodList.put("vod_name", title);
            vodList.put("vod_pic", pic);
            vodList.put("type_name", category);
            vodList.put("vod_year", year);
            vodList.put("vod_area", area);
            vodList.put("vod_remarks", remark);
            vodList.put("vod_actor", actor);
            vodList.put("vod_director", director);
            vodList.put("vod_content", desc);

            vodList.put("vod_play_from", vod_play_from);
            vodList.put("vod_play_url", vod_play_url);
            JSONArray list = new JSONArray();
            list.put(vodList);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String playerContent(String flag, String id, List<String>vipFlags) {
        try {
            String url = siteUrl + id;
            Document doc = Jsoup.parse(OkHttpUtil.string(url, Headers()));

            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", doc.select("video.player-iframe").attr("src"));
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            JSONObject result = new JSONObject();
            String url = siteUrl + "?keyword=" + URLEncoder.encode(key) + "&view=search";
            Document doc = Jsoup.parse(OkHttpUtil.string(url, Headers()));
            Elements elements = doc.select("div.inner-2col-main div.movlist > ul li > a");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < elements.size(); i++) {
                Element vod = elements.get(i);
                String id = vod.attr("href");
                String title = vod.selectFirst("span").attr("title");
                String pic = vod.selectFirst("img").attr("src");
                pic = pic.contains("http")?pic:siteUrl + pic;
                String remark = vod.select("span").last().text();
                JSONObject v = new JSONObject();
                v.put("vod_id", id);
                v.put("vod_name", title);
                v.put("vod_pic", pic);
                v.put("vod_remarks", remark);
                videos.put(v);
            }
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
}
