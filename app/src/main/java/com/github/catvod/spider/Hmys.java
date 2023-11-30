package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Base64Utils;
import com.github.catvod.utils.DES;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.Util;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.Response;


public class Hmys extends Spider {

    private String apiDomain = "";
    private String appid = "hema";
    private String channel = "share";
    private String versionCode = "58300";
    private String DESKey = "ZeYw3vSZhVcG6mTxNZqG2Pb8";
    private String DESiv = "01234567";
    private String extend = "com.leosnv";
    private String app_name = "河马视频";
    private String deviceId = "";//021356458af96dc6
    private String userinit = "";

    private String usertoken = "";
    private static String signPlayerStr = "mSodtaPBoHJaQIQHJBLrm06INCC7axnK";
    private String salt = "a0b3e42be8e9b38ce9ef13fd71d1470e";

    @Override
    public void init(Context context,String ext) {
        super.init(context,ext);
        apiDomain = ext;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp_Hmys", Context.MODE_PRIVATE);
        try {
            deviceId = sharedPreferences.getString("device", null);
        } catch (Throwable th) {
        } finally {
            if (deviceId == null) {
                deviceId = Util.randomDeviceId(16);
                sharedPreferences.edit().putString("device", deviceId).commit();
            }
        }
        regLogin();
    }

    private HashMap<String, String>  getHeaders(String token) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Cache-Control", "max-age=10, max-stale=10, min-fresh=10");
        headers.put("Mob-Model", URLEncoder.encode(Build.MODEL));
        headers.put("Screen-Width", "1080");
        headers.put("Screen-Height", "2340");
        headers.put("Device-Id", deviceId);
        headers.put("Operator", "Mobile");
        headers.put("salt", salt);
        headers.put("Accept", "application/vnd.yourapi.v1.full+json");
        headers.put("is-push", "1");
        headers.put("User-Agent", "Android");
        headers.put("Mob-Mfr", URLEncoder.encode(Build.BRAND));
       // headers.put("client-ip", "");
        headers.put("prefersex", "1");
        headers.put("Token", token);
        headers.put("Sys-Release", Build.VERSION.SDK_INT + "");
        headers.put("NetWorkType", "NETWORK_WIFI");
        headers.put("Sys-Platform", "Android");
        headers.put("appid", appid);
        headers.put("Channel", channel);
        headers.put("Version-Code", versionCode);
        Log.d("TTT", "login...");
        String currentTime = System.currentTimeMillis() + "";
        headers.put("Cur-Time", currentTime);
        headers.put("Sign", Misc.MD5(deviceId + "kstv#@!" + currentTime,Misc.CharsetUTF8).toUpperCase());
        return headers;
    }



    @Override
    public String homeContent(boolean filter) {
        try {

            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {

                }

                @Override
                public String onResponse(String response) {

                    return response;
                }
            };
            HashMap<String, String> params = new HashMap<>();
            OkHttpUtil.post(OkHttpUtil.defaultClient(), apiDomain+"/api/block/category_type", params,getHeaders(usertoken), callback);
            String loginBody = new JSONObject(callback.getResult()).optString("data");
            String loginFormat = DES.decode(loginBody.replaceAll("\n",""), DESKey, DESiv);
            JSONArray parsearr = new JSONObject(loginFormat).getJSONArray("result");
            for (int i = 0; i < parsearr.length(); i++) {
                JSONObject vObj = parsearr.getJSONObject(i);
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("type_id", vObj.getString("type_pid"));
                jsonObject.put("type_name", vObj.getString("type_name"));
                classes.put(jsonObject);
            }

            result.put("class", classes);
            if (filter) {
                JSONObject filterConfig = new JSONObject("{\"1\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"爱情\",\"v\":\"爱情\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"警匪\",\"v\":\"警匪\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动画\",\"v\":\"动画\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"武侠\",\"v\":\"武侠\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"枪战\",\"v\":\"枪战\"},{\"n\":\"恐怖\",\"v\":\"恐怖\"},{\"n\":\"悬疑\",\"v\":\"悬疑\"},{\"n\":\"惊悚\",\"v\":\"惊悚\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"青春\",\"v\":\"青春\"},{\"n\":\"文艺\",\"v\":\"文艺\"},{\"n\":\"微电影\",\"v\":\"微电影\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"农村\",\"v\":\"农村\"},{\"n\":\"儿童\",\"v\":\"儿童\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国香港\",\"v\":\"香港\"},{\"n\":\"中国台湾\",\"v\":\"台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"法国\",\"v\":\"法国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"德国\",\"v\":\"德国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"意大利\",\"v\":\"意大利\"},{\"n\":\"西班牙\",\"v\":\"西班牙\"},{\"n\":\"加拿大\",\"v\":\"加拿大\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"2\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"古装\",\"v\":\"古装\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"青春偶像\",\"v\":\"青春偶像\"},{\"n\":\"喜剧\",\"v\":\"喜剧\"},{\"n\":\"家庭\",\"v\":\"家庭\"},{\"n\":\"犯罪\",\"v\":\"犯罪\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"奇幻\",\"v\":\"奇幻\"},{\"n\":\"剧情\",\"v\":\"剧情\"},{\"n\":\"历史\",\"v\":\"历史\"},{\"n\":\"经典\",\"v\":\"经典\"},{\"n\":\"乡村\",\"v\":\"乡村\"},{\"n\":\"情景\",\"v\":\"情景\"},{\"n\":\"商战\",\"v\":\"商战\"},{\"n\":\"网剧\",\"v\":\"网剧\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"中国大陆\",\"v\":\"大陆\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"英国\",\"v\":\"英国\"},{\"n\":\"新加坡\",\"v\":\"新加坡\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}]}],\"4\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"科幻\",\"v\":\"科幻\"},{\"n\":\"热血\",\"v\":\"热血\"},{\"n\":\"推理\",\"v\":\"推理\"},{\"n\":\"搞笑\",\"v\":\"搞笑\"},{\"n\":\"冒险\",\"v\":\"冒险\"},{\"n\":\"萝莉\",\"v\":\"萝莉\"},{\"n\":\"校园\",\"v\":\"校园\"},{\"n\":\"动作\",\"v\":\"动作\"},{\"n\":\"机战\",\"v\":\"机战\"},{\"n\":\"运动\",\"v\":\"运动\"},{\"n\":\"战争\",\"v\":\"战争\"},{\"n\":\"少年\",\"v\":\"少年\"},{\"n\":\"少女\",\"v\":\"少女\"},{\"n\":\"社会\",\"v\":\"社会\"},{\"n\":\"原创\",\"v\":\"原创\"},{\"n\":\"亲子\",\"v\":\"亲子\"},{\"n\":\"益智\",\"v\":\"益智\"},{\"n\":\"励志\",\"v\":\"励志\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国\",\"v\":\"内地\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"欧美\",\"v\":\"欧美\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009\",\"v\":\"2009\"},{\"n\":\"2008\",\"v\":\"2008\"},{\"n\":\"2007\",\"v\":\"2007\"},{\"n\":\"2006\",\"v\":\"2006\"},{\"n\":\"2005\",\"v\":\"2005\"},{\"n\":\"2004\",\"v\":\"2004\"},{\"n\":\"2003\",\"v\":\"2003\"},{\"n\":\"2002\",\"v\":\"2002\"},{\"n\":\"2001\",\"v\":\"2001\"},{\"n\":\"2000\",\"v\":\"2000\"}],\"3\":[{\"key\":\"type\",\"name\":\"类型\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"选秀\",\"v\":\"选秀\"},{\"n\":\"情感\",\"v\":\"情感\"},{\"n\":\"访谈\",\"v\":\"访谈\"},{\"n\":\"播报\",\"v\":\"播报\"},{\"n\":\"旅游\",\"v\":\"旅游\"},{\"n\":\"音乐\",\"v\":\"音乐\"},{\"n\":\"美食\",\"v\":\"美食\"},{\"n\":\"纪实\",\"v\":\"纪实\"},{\"n\":\"曲艺\",\"v\":\"曲艺\"},{\"n\":\"生活\",\"v\":\"生活\"},{\"n\":\"游戏互动\",\"v\":\"游戏互动\"},{\"n\":\"财经\",\"v\":\"财经\"},{\"n\":\"求职\",\"v\":\"求职\"}]},{\"key\":\"area\",\"name\":\"地区\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"内地\",\"v\":\"内地\"},{\"n\":\"港台\",\"v\":\"港台\"},{\"n\":\"日韩\",\"v\":\"日韩\"},{\"n\":\"欧美\",\"v\":\"欧美\"}]},{\"key\":\"year\",\"name\":\"年份\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"}]}]}]}");
                result.put("filters", filterConfig);
            }
            return result.toString();
        } catch (Throwable th) {
            System.out.println(th);
        }
        return "";
    }

    @Override
    public String homeVideoContent() {
        try {
            JSONArray videos = new JSONArray();
            String url = apiDomain+"/api/nav/index?nav_id=98";
            String parsing = OkHttpUtil.string(url,getHeaders(usertoken));
            String loginBody = new JSONObject(parsing).optString("data");
            String loginFormat = DES.decode(loginBody.replaceAll("\n",""), DESKey, DESiv);
            JSONArray jsonArray =new JSONObject(loginFormat).getJSONArray("result").getJSONObject(1).getJSONArray("block_list").getJSONObject(0).getJSONArray("vod_list");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject vObj = jsonArray.getJSONObject(i);
                JSONObject v = new JSONObject();
                v.put("vod_id", vObj.getString("vod_id"));
                v.put("vod_name", vObj.getString("title"));
                v.put("vod_pic", vObj.getString("pic"));
                v.put("vod_remarks", vObj.getString("score"));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            int limit = 12;
            int page = Integer.parseInt(pg);
            if (page == 0) {
                page = 1;
            }
            JSONArray videos = new JSONArray();
            String url = apiDomain+"/api/block/category";
            extend = extend == null ? new HashMap<>() : extend;
            if (!extend.containsKey("area")) {
                extend.put("area", "全部");
            }
            if (!extend.containsKey("type")) {
                extend.put("type", "全部");
            }
            if (!extend.containsKey("year")) {
                extend.put("year", "全部");
            }if (!extend.containsKey("class")) {
                extend.put("class", "全部");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cate", extend.get("type"));
            hashMap.put("order", "全部");
            hashMap.put("type_pid", tid);
            hashMap.put("page", pg);
            hashMap.put("area", extend.get("area"));
            hashMap.put("length", "12");
            hashMap.put("year", extend.get("year"));
            OkHttpUtil.post(OkHttpUtil.defaultClient(), url, hashMap, getHeaders(usertoken), new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {
                }

                @Override
                public String onResponse(String response) {
                    try {

                        String loginBody = new JSONObject(response).optString("data");
                        String loginFormat = DES.decode(loginBody.replaceAll("\n",""), DESKey, DESiv);
                        JSONObject jsonObject = new JSONObject(loginFormat);
                        JSONArray jsonArray = jsonObject.getJSONArray("result");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject vObj = jsonArray.getJSONObject(i);
                            JSONObject v = new JSONObject();
                            v.put("vod_id", vObj.getString("vod_id"));
                            v.put("vod_name", vObj.getString("title"));
                            v.put("vod_pic", vObj.optString("pic"));
                            String mark = vObj.optString("score");
                            if (mark.equals("null"))
                                mark = "";
                            v.put("vod_remarks", mark);
                            videos.put(v);
                        }
                    } catch (JSONException e) {
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return response;
                }
            });
            JSONObject result = new JSONObject();
            result.put("page", page);
            int pageCount = videos.length() == limit ? page + 1 : page;
            result.put("pagecount", pageCount);
            result.put("limit", limit);
            result.put("total", Integer.MAX_VALUE);
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    @Override
    public String detailContent(List<String> ids) {
        try {

            JSONObject vodAtom = new JSONObject();

            String url = apiDomain+"/api/vod/info";
            HashMap hashMap = new HashMap();
            hashMap.put("vod_id", ids.get(0));
            ArrayList<String> playList = new ArrayList<>();
            OkHttpUtil.post(OkHttpUtil.defaultClient(), url, hashMap, getHeaders(usertoken), new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {
                }

                @Override
                public String onResponse(String response) {
                    try {
                        JSONObject jsonObject = new JSONObject(response);
                        String loginFormat = DES.decode(jsonObject.optString("data").replaceAll("\n",""), DESKey, DESiv);
                        JSONObject vObj = new JSONObject(loginFormat).getJSONObject("result");
                        JSONArray playSource = vObj.getJSONArray("map_list");
                        vodAtom.put("vod_id", vObj.getString("id"));
                        vodAtom.put("vod_name", vObj.getString("title"));
                        vodAtom.put("vod_pic", vObj.getString("pic"));
                        vodAtom.put("vod_remarks", vObj.getString("remarks"));
                        vodAtom.put("vod_actor", vObj.getString("actor"));
                        vodAtom.put("vod_director", vObj.getString("director"));
                        vodAtom.put("type_name", vObj.getString("tags"));
                        vodAtom.put("vod_year", vObj.getString("year"));
                        vodAtom.put("vod_area", vObj.getString("area"));
                        vodAtom.put("vod_content", vObj.getString("intro"));
                        vodAtom.put("vod_play_from", "秒播");
                        ArrayList<String> urls = new ArrayList<>();
                        for (int j = 0; j < playSource.length(); j++) {
                            JSONObject urlObj = playSource.getJSONObject(j);
                            urls.add(urlObj.getString("title") + "$" + urlObj.getString("title") + "|" + vObj.getString("id"));
                        }
                        playList.add(TextUtils.join("#", urls));
                    } catch (JSONException e) {
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return response;
                }
            });
            vodAtom.put("vod_play_url", TextUtils.join("$$$", playList));
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(vodAtom);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }


    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        m.cx();
        JSONObject result = new JSONObject();
        String[] item = id.split("\\|");
        String purl = item[0];
        String pkey = item[1];
        try {
            OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {

                }

                @Override
                public String onResponse(String response) {

                    return response;
                }
            };
            HashMap<String, String> params = new HashMap<>();
            params.put("vod_map_id", purl);
            params.put("vod_id", pkey);
            OkHttpUtil.post(OkHttpUtil.defaultClient(), apiDomain+"/api/vod/play_url", params,getHeaders(usertoken), callback);
            String loginBody = new JSONObject(callback.getResult()).optString("data");
            String loginFormat = DES.decode(loginBody.replaceAll("\n",""), DESKey, DESiv);
            JSONObject imurl = new JSONObject(loginFormat).getJSONObject("result");
            String str3 = Proxy.localProxyUrl() + "?do=hmys&type=m3u8&url=" + Base64.encodeToString(imurl.getString("vod_url").getBytes(Misc.CharsetUTF8), Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP) + "&ck=" + imurl.getString("ck");
            result.put("parse", 0);
            result.put("url",str3);
            result.put("playUrl", "");
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return result.toString();
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            JSONArray videos = new JSONArray();
            try {
                String url = apiDomain+"/search/vod/result";
                HashMap hashMap = new HashMap();
                hashMap.put("pn", "1");
                hashMap.put("type_pid", "0");
                hashMap.put("kw", key);
                OkHttpUtil.post(OkHttpUtil.defaultClient(), url, hashMap, getHeaders(usertoken), new OKCallBack.OKCallBackString() {
                    @Override
                    public void onFailure(Call call, Exception e) {
                    }

                    @Override
                    public String onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String loginFormat = DES.decode(jsonObject.optString("data").replaceAll("\n",""), DESKey, DESiv);
                            JSONArray jsonArray = new JSONObject(loginFormat).getJSONArray("result");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject vObj = jsonArray.getJSONObject(i);
                                if(!vObj.getString("title").contains(key)){
                                    continue;
                                }
                                JSONObject v = new JSONObject();
                                v.put("vod_id", vObj.getString("vod_id"));
                                v.put("vod_name", vObj.getString("title"));
                                v.put("vod_pic", vObj.optString("pic"));
                                String mark = vObj.optString("serial");
                                if (mark.equals("null"))
                                    mark = "";
                                v.put("vod_remarks", mark);
                                videos.put(v);
                            }
                        } catch (JSONException e) {
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        return response;
                    }
                });


            } catch (Exception e) {

            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    public void regLogin() {
        try {
            Util.randomIp();
            HashMap<String, String> params = new HashMap<>();
            params.put("action", "5");
            OKCallBack.OKCallBackString callback = new OKCallBack.OKCallBackString() {
                @Override
                public void onFailure(Call call, Exception e) {

                }

                @Override
                public String onResponse(String response) {

                    return response;
                }
            };
            OkHttpUtil.post(OkHttpUtil.defaultClient(), apiDomain+"/api/stats/login", params,getHeaders(""), callback);
            String loginBody = new JSONObject(callback.getResult()).optString("data");
            String loginFormat = DES.decode(loginBody.replaceAll("\n",""), DESKey, DESiv);
            Log.d("TTT", "loginFormat = " + loginFormat);
            Log.d("TTT", "init...");
            HashMap<String, String> params2 = new HashMap<>();
            params2.put("app_name", app_name);
            params2.put("extend", extend);
            OkHttpUtil.post(OkHttpUtil.defaultClient(), apiDomain+"/api/user/init", params,getHeaders(""), callback);
            String initBody = new JSONObject(callback.getResult()).optString("data");
            String initFormat = DES.decode(initBody.replaceAll("\n",""), DESKey, DESiv);
            Log.d("TTT", "initFormat = " + initFormat);
            userinit = initFormat;
            usertoken = new JSONObject(userinit).getJSONObject("result").getJSONObject("user_info").getString("token");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object[] vod(Map<String, String> params) {
        String type = params.get("type");
        String url = params.get("url");
        String ck = params.get("ck");
        url = new String(Base64.decode(url, Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP), Misc.CharsetUTF8);
        try {
            if (type.equals("m3u8")) {
                return getVodContent(url,ck);
            } else if (type.equals("ts")) {
                return getTsContent(url,ck);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    private static final Pattern tsRex = Pattern.compile("(\\S+.ts)|(#EXT-X-KEY:\\S+\")(\\S+)(\")");
    static Object[] getVodContent(String m3u8,String ck) throws Exception {
        String uri = Uri.parse(m3u8).getPath();
        String time = Integer.toHexString((int) (System.currentTimeMillis() / 1000));
        String key = Misc.MD5(signPlayerStr+uri+time, Misc.CharsetUTF8).toLowerCase();
        String deck = new String(Base64Utils.decode(ck));
        String realUrl = m3u8 + "?" + deck + "&wsSecret=" + key + "&wsTime=" + time;
        HashMap<String, String> params = new HashMap<>();
        params.put("User-Agent","Mozi");
        params.put("Accept","*/*");
        String m3u8Content = OkHttpUtil.string(realUrl, params);
        String tsUrl = m3u8.substring(0, m3u8.indexOf(Uri.parse(m3u8).getLastPathSegment()));
        StringBuilder sb = new StringBuilder();
        int start = 0;
        Matcher matcher = tsRex.matcher(m3u8Content);
        while (matcher.find()) {
            sb.append(m3u8Content, start, matcher.start());
            if (matcher.group().contains("EXT-X-KEY")) {
            } else {
                String tsRealUrl = Proxy.localProxyUrl() + "?do=hmys&type=ts&url=" + Base64.encodeToString((tsUrl + matcher.group(1)).getBytes(Misc.CharsetUTF8), Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP)+ "&ck=" + deck.replaceAll("&","|");
                sb.append(tsRealUrl);
            }
            start = matcher.end();
        }
        sb.append(m3u8Content, start, m3u8Content.length());
        String type = "application/octet-stream";
        Object[] result = new Object[3];
        result[0] = 200;
        result[1] = type;
        ByteArrayInputStream baos = new ByteArrayInputStream(sb.toString().getBytes(Misc.CharsetUTF8));
        result[2] = baos;
        return result;
    }

    static Object[] getTsContent(String url, String ts) throws Exception {
        String dets;
        if(ts.contains("?")){
            String[] item = ts.split("\\?");
            dets = item[0];
        }else {
            dets = ts;
        }
        String uri = Uri.parse(url).getPath();
        String time = Integer.toHexString((int) (System.currentTimeMillis() / 1000));
        String key = Misc.MD5(signPlayerStr+uri+time, Misc.CharsetUTF8).toLowerCase();
        String realUrl = url + "?" + dets.replaceAll("\\|","&") + "&wsSecret=" + key + "&wsTime=" + time;
        OKCallBack.OKCallBackDefault callBack = new OKCallBack.OKCallBackDefault() {


            @Override
            public void onFailure(Call call, Exception e) {

            }

            @Override
            public String onResponse(Response response) {
                return null;
            }
        };
        HashMap<String, String> params = new HashMap<>();
        params.put("User-Agent","Mozi");
        params.put("Accept","*/*");
        OkHttpUtil.get(OkHttpUtil.defaultClient(), realUrl, null, params, callBack);
        if (callBack.getResult().code() == 200) {
            Headers headers = callBack.getResult().headers();
            String type = headers.get("Content-Type");
            if (type == null) {
                type = "application/octet-stream";
            }
            Object[] result = new Object[3];
            result[0] = 200;
            result[1] = type;
            result[2] = callBack.getResult().body().byteStream();
            return result;
        }
        return null;
    }
}
