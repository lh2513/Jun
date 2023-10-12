package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class jojoWp extends Spider {
    private static String siteUrl = "https://jiohub.top";
    private static  String parseIp = "";
    private static  String LocalIpGetPidUrl = "http://127.0.0.1:9978/webparse/https://jiohub.top/<<eval:getPid()";
    private static  String longtermPid = "";

    private JSONObject pic = new JSONObject();
    private final Pattern regexUrls = Pattern.compile("(?<=let\\surls\\s=\\s\").*?(?=\";)");
    private final Pattern regexPid = Pattern.compile("(?<=pid=).*?(?=\\n)");
    private static boolean parse = false;


    public void init(Context context,String extend) {
        super.init(context);
        if(!extend.equals("")){
            parseIp = extend;
        }
        int sdkVersion = android.os.Build.VERSION.SDK_INT;
        if(sdkVersion < 28) {
            parse = true;
        }
        getPid();
    }
    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", "AppleCoreMedia/1.0.0.17D50 (iPhone; U; CPU OS 13_3_2 like Mac OS X; zh_cn)");
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        headers.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        return headers;
    }
    /**
     *  JSONObject KEY "list","class"
     */
    public String homeContent(boolean filter) {
        try {
            JSONObject data = new JSONObject();
            JSONArray classes = new JSONArray();
            JSONObject newCls = new JSONObject();
            newCls.put("type_id", "电影");
            newCls.put("type_name", "电影");
            classes.put(newCls);
            JSONObject newCls0 = new JSONObject();
            newCls0.put("type_id", "国产");
            newCls0.put("type_name", "国产");
            classes.put(newCls0);
            JSONObject newCls1 = new JSONObject();
            newCls1.put("type_id", "美剧");
            newCls1.put("type_name", "美剧");
            classes.put(newCls1);
            JSONObject newCls2 = new JSONObject();
            newCls2.put("type_id", "韩剧");
            newCls2.put("type_name", "韩剧");
            classes.put(newCls2);
            JSONObject newCls3 = new JSONObject();
            newCls3.put("type_id", "日剧");
            newCls3.put("type_name", "日剧");
            classes.put(newCls3);
            JSONObject newCls4 = new JSONObject();
            newCls4.put("type_id", "动漫");
            newCls4.put("type_name", "动漫");
            classes.put(newCls4);
            JSONObject newCls5 = new JSONObject();
            newCls5.put("type_id", "纪录");
            newCls5.put("type_name", "纪录");
            classes.put(newCls5);
            data.put("class", classes);
            //推荐数据
            Document document = Jsoup.parse(OkHttp.string(siteUrl,getHeaders()));
            Element entrance = document.select("div.content-body").get(0);
            Elements list = entrance.select("a");
            JSONArray video = new JSONArray();
            for(int i= 0; i<list.size();i++){
                JSONObject v = new JSONObject();
                Element singleData = list.get(i);
                pic.put(singleData.select("a div.card-content p").text(),singleData.select("a div.card-content img").attr("src"));
                v.put("vod_id",singleData.attr("href"));
                v.put("vod_name", singleData.select("a div.card-content p").text());
                v.put("vod_pic", singleData.select("a div.card-content img").attr("src"));
                v.put("vod_remarks",singleData.selectFirst("a div.card-tags p").text() +"-" + singleData.select("a div.card-tags p").last().text());
                video.put(v);
            }
            data.put("list", video);
            return data.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    /**
     *  JSONObject KEY "page",""pagecount","limit","total","list"
     */
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject data = new JSONObject();
            JSONArray video = new JSONArray();
            Document document = Jsoup.parse(OkHttp.string(siteUrl + "/video/" + tid + "?page=" + pg + "&size=18",getHeaders()));
            Element entrance = document.select("div.content-body").get(0);
            Elements list = entrance.select("a");
            for(int i= 0; i<list.size();i++){
                JSONObject v = new JSONObject();
                Element singleData = list.get(i);
                pic.put(singleData.select("a div.card-content p").text(),singleData.select("a div.card-content img").attr("src"));
                v.put("vod_id",singleData.attr("href"));
                v.put("vod_name", singleData.select("a div.card-content p").text());
                v.put("vod_pic", singleData.select("a div.card-content img").attr("src"));
                v.put("vod_remarks",singleData.selectFirst("a div.card-tags p").text() +"-" + singleData.select("a div.card-tags p").last().text());
                video.put(v);
            }
            int pagecount = Integer.parseInt(document.select("ui-pagination").attr("total"));
            data.put("list",video);
            data.put("page",Integer.parseInt(document.select("ui-pagination").attr("current")));
            data.put("pagecount",pagecount);
            data.put("limit",18);
            data.put("total", pagecount * 18);
            return data.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }


    /**
     *  JSONObject KEY "list"
     */
    public String detailContent(List<String> ids) {
        try {
            JSONObject data = new JSONObject();
            JSONObject vodData = new JSONObject();
            JSONArray arrayData = new JSONArray();
            String url = siteUrl + ids.get(0);
            String html = OkHttp.string(url,getHeaders());
            Document  document = Jsoup.parse(html);
            String decodeUrls = Matcher(regexUrls,html);
            if (!parse) {
                url = "http://127.0.0.1:9978/webparse/https://jiohub.top/watch/258<<eval:getData(tvbox.getPostBody())";
            }else{
                url = "http://" + parseIp + ":9978/webparse/https://jiohub.top/watch/258<<eval:getData(tvbox.getPostBody())";
            }
            String playurls = OkHttp.postJson(url,decodeUrls,getHeaders());
            if(playurls.split("\n").length>1) {
                playurls = playurls.replaceAll("\n", "#");
            }
            Element entrance = document.select("div.plyr-content").get(0);
            Elements list = entrance.select("p");
            String vod_name = "",vod_pic = "",type_name = "",vod_year = "",vod_area = "",vod_actor = "",vod_director = "",vod_content = "",vod_remarks ="";
            for(int i= 0; i<list.size();i++){
                Element singleData = list.get(i);
                if(singleData.toString().contains("更新时间：")) vod_remarks = singleData.text().replace("更新时间：","");
                if(singleData.toString().contains("类型：")) type_name = singleData.text().replace("类型：","");
                if(singleData.toString().contains("年份：")) vod_year = singleData.text().replace("年份：","");
                if(singleData.toString().contains("主演：")) vod_actor = singleData.text().replace("主演：","");
                if(singleData.toString().contains("导演：")) vod_director = singleData.text().replace("导演：","");
                if(singleData.select("span").toString().contains("简介")) vod_content = singleData.select("span").last().text();

            }
            vod_name = entrance.select("h3").text();
            vodData.put("vod_name",vod_name);
            vodData.put("type_name",type_name);
            vodData.put("vod_pic",type_name);
            vodData.put("vod_year",vod_year);
            vodData.put("vod_actor",vod_actor);
            vodData.put("vod_director",vod_director);
            vodData.put("vod_content",vod_content);
            if(!pic.isNull(vod_name)) {
                vodData.put("vod_pic",pic.getString(vod_name));
            }
            vodData.put("vod_remarks",vod_remarks);
            //获取剧集名+url
            vodData.put("vod_play_from", "JOJO");
            vodData.put("vod_play_url", playurls);
            arrayData.put(vodData);
            data.put("list",arrayData);
            return data.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    /**
     *  JSONObject KEY "parse",""jx","playUrl","url","header"
     */
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            JSONObject result = new JSONObject();
            JSONObject headerss = new JSONObject();
            headerss.put("user-agent", "AppleCoreMedia/1.0.0.17D50 (iPhone; U; CPU OS 13_3_2 like Mac OS X; zh_cn)");
            result.put("parse", 0);
            result.put("url", id + "?pid=" + longtermPid);
            result.put("playUrl", "");
            result.put("header", headerss.toString());
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }
    /**
     *  JSONObject KEY "list"
     */
    public String searchContent(String str, boolean quick) {
        if (quick)
            return "";
        try {
            JSONObject data = new JSONObject();
            JSONArray videos = new JSONArray();
            String url = siteUrl + "/video/search?q=" + URLEncoder.encode(str) + "&pid=" + getPid();
            Document  document = Jsoup.parse(OkHttp.string(url,getHeaders()));
            //页面的片源的总框架
            Element entrance = document.select("div.content-rigth").get(0);
            //片源的集合
            Elements  list = entrance.select("a.content-item");
            for (int i = 0; i < list.size(); i++) {
                JSONObject v = new JSONObject();
                Element singleData = list.get(i);
                pic.put(singleData.select("p.card-title").text(),singleData.select("img[loading]").attr("src"));
                v.put("vod_id",singleData.attr("href"));
                v.put("vod_name", singleData.select("p.card-title").text());
                v.put("vod_pic", singleData.select("img[loading]").attr("src"));
                v.put("vod_remarks",singleData.selectFirst("div.card-tags p").text() +"-" + singleData.select("div.card-tags p").last().text());
                videos.put(v);
            }
            data.put("list", videos);
            return data.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public  String Matcher(Pattern pattern,String str){
        try{
            Matcher matcher = pattern.matcher(str);
            if(matcher.find()){
                return matcher.group(0);
            }}catch(Exception e){}
        return "";

    }
    public  String getPid(){
        try{
            String pid ="";
            if(!parse) {
                pid  = OkHttp.string(LocalIpGetPidUrl,getHeaders());
            }else{
                pid =  OkHttp.string("http://"+ parseIp + ":9978/webparse/https://jiohub.top/<<eval:getPid()",getHeaders());
            }
            if(longtermPid.equals("")){
                longtermPid = Matcher(regexPid,OkHttp.string("https://hls.syrme.top/v1/file/path/video/m3u8/tv/咒术回战/咒术回战S02E01.m3u8?pid=" + pid,getHeaders()));
            }
            return pid;
        }catch(Exception e){}
        return "";
    }


}
