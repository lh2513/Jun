package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderApi;
import com.github.catvod.spider.merge.N.a;
import com.github.catvod.spider.merge.PqS;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.b.p;
import com.github.catvod.spider.merge.c0.h;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.i.b;
import com.github.catvod.spider.merge.j.k;
import com.github.catvod.spider.merge.j.m;
import com.github.catvod.spider.merge.k.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.MediaType;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class XBPQ extends Spider {
    protected JSONObject A;
    private Context B;
    private PushAgent C;
    private boolean D;
    private HashMap E;
    private String F;
    private int G;
    private SpiderApi H;
    private String I;
    public static String J = "";
    private static HashMap K;
    private boolean a;
    private String b;
    private String c;
    private boolean d;
    private int e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private ArrayList j;
    private JSONObject k;
    private boolean l;
    private String m;
    private String n;
    private int o;
    private boolean p;
    private String q;
    private String r;
    private boolean s;
    private int t;
    private int u;
    private String v;
    private String w;
    private boolean x;
    private String y;
    private String z;

    public XBPQ() {
        this.a = false;
        this.c = "";
        this.d = false;
        this.f = "";
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = "";
        this.o = 0;
        this.p = false;
        this.q = "";
        this.r = "";
        this.s = false;
        this.t = 0;
        this.u = 3;
        this.v = "";
        this.w = "";
        this.x = false;
        this.y = "";
        this.z = "";
        this.A = null;
        this.D = true;
        this.E = null;
        this.G = 0;
        this.H = null;
        this.I = "9978";
    }

    private JSONObject A(String arg17, String arg18, String arg19, String arg20) {
        String[] v3_1;
        String v2 = arg19;
        try {
            JSONObject v6 = new JSONObject();
            JSONArray v7 = new JSONArray();
            boolean v8 = arg17.equals("by");
            if(!v8 && !arg17.equals("cateId")) {
                v6.put("n", "全部");
                v6.put("v", "");
                v7.put(v6);
                v6 = new JSONObject();
                if(v2.indexOf("--") >= 0) {
                    v2 = v2.split("--")[1];
                }
            }

            int v11 = 0;
            if(arg17.equals("cateId")) {
                v6.put("n", "全部");
                v6.put("v", v2.split("--")[0]);
                v7.put(v6);
                v6 = new JSONObject();
                if(v2.indexOf("--") >= 0) {
                    v2 = v2.split("--")[1];
                }
            }

            if(v2.indexOf("#") >= 0) {
                int v3 = v2.indexOf("#");
                if(v3 >= 0) {
                    String[] v2_1 = v2.split("#");
                    int v5;
                    for(v5 = 0; v5 < v2_1.length; ++v5) {
                        String v8_1 = v2_1[v5];
                        v6.put("n", v8_1.split("\\$")[0]);
                        v6.put("v", v8_1.split("\\$")[1]);
                        v7.put(v6);
                        v6 = new JSONObject();
                    }
                }
                else {
                    v6.put("n", v2.split("\\$")[0]);
                    v6.put("v", v2.split("\\$")[1]);
                    v7.put(v6);
                }
            }
            else if(v2.indexOf("&") >= 0) {
                String[] v2_2 = v2.split("\\&");
                if("".equals(arg20)) {
                label_97:
                    v3_1 = v2_2;
                }
                else {
                    if("*".equals(arg20)) {
                        goto label_97;
                    }

                    v3_1 = arg20.split("\\&");
                }

                while(v11 < v2_2.length) {
                    v6.put("n", v2_2[v11]);
                    v6.put("v", v3_1[v11]);
                    v7.put(v6);
                    v6 = new JSONObject();
                    ++v11;
                }
            }

            JSONObject v2_3 = new JSONObject();
            v2_3.put("key", arg17);
            v2_3.put("name", arg18);
            v2_3.put("value", v7);
            return v2_3;
        }
        catch(Exception v0) {
            if(this.l) {
                Init.show(this.F + "调试->getRType出错：" + v0.toString());
            }

            SpiderApi v2_4 = this.H;
            if(v2_4 != null) {
                b.a(v0, d.b("getRType()错误-->"), v2_4);
            }

            return null;
        }
    }

    private String B(String arg2) {
        return this.C(arg2, "");
    }

    private String C(String arg10, String arg11) {
        String v0 = this.A.optString(arg10);
        if((arg10.equals("主页url")) && (v0.isEmpty())) {
            v0 = this.A.optString("首页推荐链接");
            if(v0.isEmpty()) {
                v0 = this.A.optString("网站地址");
                if(v0.isEmpty()) {
                    v0 = this.A.optString("url");
                    if(v0.isEmpty()) {
                        v0 = this.A.optString("homeUrl");
                        if(v0.isEmpty()) {
                            String v0_1 = this.A.optString("分类url");
                            if(v0_1.isEmpty()) {
                                v0_1 = this.A.optString("分类链接");
                                if((v0_1.isEmpty()) || !v0_1.startsWith("http")) {
                                    v0_1 = this.A.optString("分类页");
                                    if(v0_1.isEmpty()) {
                                        v0_1 = this.A.optString("class_url");
                                        if(v0_1.isEmpty()) {
                                            v0_1 = this.A.optString("cateUrl");
                                            if(v0_1.isEmpty()) {
                                                v0_1 = this.A.optString("搜索url");
                                                if(!v0_1.startsWith("http")) {
                                                    v0_1 = "";
                                                }

                                                if(v0_1.isEmpty()) {
                                                    v0_1 = this.A.optString("搜索链接");
                                                    if(!v0_1.startsWith("http")) {
                                                        v0_1 = "";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            v0 = v0_1.replaceAll(v0_1.indexOf("/webparse/") <= 0 ? ".*(https?\\://[^/]+)/.*" : ".*/webparse/(https?\\://[^/]+)/.*", "$1");
                        }
                    }
                }
            }
        }

        if(arg10.equals("分类")) {
            if(v0.isEmpty()) {
                v0 = this.A.optString("分类名称");
                if(v0.isEmpty()) {
                    v0 = this.A.optString("class_name");
                    if(!v0.isEmpty()) {
                        v0 = this.R(v0, this.A.optString("class_value"));
                    }
                }
                else {
                    v0 = this.R(v0, this.A.optString("分类名称替换词"));
                }
            }
            else if(v0.indexOf("&") >= 0) {
                v0 = this.R(v0, this.A.optString("分类值"));
            }
        }

        if(!v0.isEmpty() && !v0.equals("空")) {
            if(!arg10.equals("剧情") && !arg10.equals("地区") && !arg10.equals("类型") && !arg10.equals("年份") && !arg10.equals("排序")) {
                if(v0.indexOf("||") >= 0 && v0.indexOf("--") >= 0) {
                    String[] v1 = v0.split("\\|\\|");
                    int v5;
                    for(v5 = 0; v5 < v1.length; ++v5) {
                        String v7 = v1[v5];
                        if(v7.indexOf(this.q) >= 0) {
                            return v7.split("--")[1];
                        }
                    }

                    if(v0.indexOf("||") >= 0) {
                        String[] v10 = v1[0].split("--");
                        return v10.length <= 1 ? v10[0] : v10[1];
                    }

                    return "";
                }

                return v0;
            }

            return v0;
        }

        return !arg10.equals("搜索后缀") || !v0.equals("空") ? arg11 : "";
    }

    private String D(String arg1, String arg2, String arg3) {
        return this.C(arg1, this.C(arg2, arg3));
    }

    private String E(String arg1, String arg2, String arg3, String arg4) {
        return this.C(arg1, this.C(arg2, this.C(arg3, arg4)));
    }

    private String F(String arg1, String arg2, String arg3, String arg4, String arg5) {
        return this.C(arg1, this.C(arg2, this.C(arg3, this.C(arg4, arg5))));
    }

    private String G(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        return this.C(arg1, this.C(arg2, this.C(arg3, this.C(arg4, this.C(arg5, arg6)))));
    }

    private String H(String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        return this.C(arg2, this.C(arg3, this.C(arg4, this.C(arg5, this.C(arg6, this.C(arg7, ""))))));
    }

    protected final HashMap I(String arg13) {
        HashMap v0 = new HashMap();
        String v1 = this.F("搜索请求头", "搜索请求头参数", "search_header", "SHeaders", "");
        if(!"搜索".equals(this.q) || v1.length() <= 1) {
            v1 = this.G("请求头", "请求头参数", "ua", "Headers", "UserAgent", "");
        }

        if(v1.length() > 1 && v1.indexOf("@") > 0) {
            v1 = v1.replace("@", "$").replace("&&", "#").replace("；；", ";");
        }

        v0.put("User-Agent", this.J(v1));
        String v2 = this.n(arg13);
        if(this.r.indexOf("c0") < 0 && v2.length() > 1) {
            v0.put("Cookie", v2);
        }

        if(v1.indexOf("Referer") < 0 && this.r.indexOf("r1") >= 0) {
            v0.put("Referer", arg13.split(";")[0]);
        }
        else if(v1.indexOf("Referer") < 0 && this.r.indexOf("r") >= 0) {
            v0.put("Referer", arg13 + "/".replaceAll(".*(https?\\://[^/]+)/.*", "$1") + "/");
        }

        String v13 = v1.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
        if(v13.indexOf("$") >= 0) {
            String[] v13_1 = v13.split("#");
            int v4;
            for(v4 = 0; v4 < v13_1.length; ++v4) {
                String v5 = v13_1[v4];
                if(!"Cookie".equals(v5.split("\\$")[0]) && !"cookie".equals(v5.split("\\$")[0])) {
                    String v7 = v5.split("\\$")[0];
                    Object v5_1 = v5.split("\\$")[1].equals("空") ? "" : v5.split("\\$")[1];
                    v0.put(v7, v5_1);
                }
            }
        }

        return v0;
    }

    protected final String J(String arg11) {
        String v0 = this.B("登录");
        if(!"搜索".equals(this.q)) {
            if(XBPQ.J.length() > 1) {
                return XBPQ.J;
            }

            if(this.r.indexOf("c") < 0 && (v0.length() > 1 || this.r.indexOf("y") >= 0 || this.r.indexOf("Y") >= 0 || this.r.indexOf("L") >= 0 || this.r.indexOf("点击") >= 0 || this.B("验证").length() > 0 || this.B("浏览器").length() > 0)) {
                String v0_1 = Init.d.getString(this.F + "_ua", "");
                if(v0_1.length() > 1) {
                    XBPQ.J = v0_1;
                    return v0_1;
                }
            }
        }

        if(arg11.length() < 1) {
            arg11 = this.G("请求头", "请求头参数", "ua", "Headers", "UserAgent", "");
        }

        String v11 = arg11.replace("@", "$").replace("&&", "#").replace("；；", ";").trim();
        boolean v0_2 = v11.isEmpty();
        String v6 = PqS.d("181E1D211A2B345E526646677D3D0E26033F6E51262612353A18036847766E5120200E2E753312211A237A232C1947696741577044717B41577A4D6722074E683737251D021F13251E1813674374625F547E566F1E3933053A6B751D0E23136712140423196E7527023A052E3A1F487C587775320F3A192A305E507E58777B425F784F696D48470519253C1D026825263310152159726646497B40");
        String v7 = PqS.d("B3F8ECAEEAFD");
        if((v0_2) || v11.indexOf(v7) >= 0 || v11.indexOf("MOBILE_UA") >= 0 || v11.indexOf(PqS.d("B2E5D2A0F2D6")) >= 0 || v11.indexOf(PqS.d("0532381D37")) >= 0 || v11.indexOf(PqS.d("0002023A5B063214093C")) < 0 && (this.r.indexOf("a") >= 0 || this.r.indexOf("A") >= 0 || this.r.indexOf(PqS.d("02")) >= 0)) {
            v11 = v11.indexOf(v7) >= 0 || v11.indexOf("MOBILE_UA") >= 0 || this.r.indexOf("a") >= 0 || this.r.indexOf("A") >= 0 ? v6 : PqS.d("181E1D211A2B345E526646677D260E261228220247062267644149784D670218097E427C7509517C5F6714011724131030132C21026860425066457175592C00220A195D47241F2C3051202D152C3A58470B1E353A1C02674F737B41497C4077635F527C56143417063A1F68604250664571");
        }
        else if(v11.indexOf(PqS.d("0002023A5B063214093C52")) >= 0) {
            v11 = v11 + "#".replaceAll(PqS.d("7B5B323B13357830002D183309554F665C787C524962"), PqS.d("7140"));
        }
        else if(v11.indexOf("$") >= 0) {
            v11 = v6;
        }

        XBPQ.J = v11;
        return v11;
    }

    private String K(String arg6) {
        Charset v3;
        if(arg6.indexOf("时间戳") >= 0) {
            StringBuilder v1 = d.b("");
            v1.append(new Date().getTime());
            arg6 = arg6.replace("时间戳", v1.toString());
        }

        if(arg6.indexOf(":9978/") > 0 && !"9978".equals(this.I)) {
            arg6 = arg6.replace("9978", this.I);
        }

        if(arg6.indexOf("md5(") > 0) {
            String v0 = arg6.replaceAll("md5\\((.*?)\\)", "$1");
            if(v0.indexOf(",iso") > 0) {
                v0 = v0.split(",")[0];
                v3 = m.c;
            }
            else {
                v3 = m.b;
            }

            arg6 = arg6.replaceAll("md5\\(.*?\\)", m.a(v0, v3));
        }

        if(arg6.indexOf("+url:") > 0) {
            String[] v0_1 = arg6.split("\\+url\\:");
            if(v0_1.length > 1) {
                if(arg6.indexOf("$sub:") > 0) {
                    String[] v6 = v0_1[1].split("\\$sub\\:");
                    return v6.length <= 1 ? v0_1[0] + this.j(v6[0]) : v0_1[0] + ((String)this.c0(this.j(v6[0]), v6[1], "").get(0)).trim();
                }

                return v0_1[0] + this.j(v0_1[1]);
            }

            return v0_1[0];
        }

        return arg6;
    }

    private String L(String arg7) {
        if(arg7.length() < 1) {
            return arg7;
        }

        String v7;
        for(v7 = arg7.replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "/").replaceAll("[><]", "").replaceAll(" ", "空空空").replaceAll("\\s+", "").replaceAll("空空空", " ").replaceAll("/+", "/"); v7.startsWith("/"); v7 = v7.substring(1, v7.length())) {
        }

        while(v7.endsWith("/")) {
            v7 = v7.substring(0, v7.length() - 1);
        }

        return v7;
    }

    private void M() {
        boolean v0_5;
        boolean v0_2;
        try {
            String v2 = this.B("主页url") + "/".replaceAll(".*(https?\\://[^/]+)/.*", "$1");
            this.f = v2;
            this.F = v2;
            this.F = v2.split("://")[1].split("/")[0].replace(".", "_");
            String v1 = this.G("分类url", "分类链接", "分类页", "class_url", "cateUrl", "");
            this.b = v1;
            int v1_1 = v1.indexOf(";;");
            if(v1_1 >= 0) {
                if(this.b.split(";;").length > 1) {
                    this.r = this.b.split(";;")[1];
                }

                this.b = this.b.split(";;")[0];
            }
            else if(this.D("搜索url", "搜索链接", "").indexOf(";;") < 0) {
                this.r = "";
            }
            else if(this.D("搜索url", "搜索链接", "").split(";;").length > 1) {
                this.r = this.D("搜索url", "搜索链接", "").split(";;")[1];
            }

            try {
                if(this.r.indexOf("阿里") >= 0) {
                    this.A.put("跳转链接", "https://www.aliyundrive.com/s/+aliyundrive.com/s/&&\"");
                }
            }
            catch(JSONException unused_ex) {
            }

            boolean v0_1 = this.E("图片代理", "图片是否需要代理", "PicNeedProxy", "0").equals("1");
            if(v0_1) {
            label_128:
                v0_2 = true;
            }
            else {
                if(this.E("图片代理", "图片是否需要代理", "PicNeedProxy", "0").equals("是")) {
                    goto label_128;
                }

                if(this.r.indexOf("t") >= 0) {
                    goto label_128;
                }

                v0_2 = false;
            }

            this.g = v0_2;
            String v0_3 = this.r.indexOf("T") < 0 ? this.D("调试", "debug", "") : "1";
            this.n = v0_3;
            boolean v0_4 = v0_3.length() > 0 && !"0".equals(this.n);
            this.l = v0_4;
            if(this.n.indexOf("$") >= 0) {
                this.o = Integer.parseInt(this.n.split("\\$")[1]);
                this.n = this.n.split("\\$")[0];
            }

            if(!this.F("倒序", "倒序播放", "是否反转选集序列", "epi_reverse", "0").equals("1") && !this.F("倒序", "倒序播放", "是否反转选集序列", "epi_reverse", "0").equals("是")) {
                if(this.r.indexOf("d0") < 0 && this.r.indexOf("d") >= 0) {
                    goto label_209;
                }

                v0_5 = false;
            }
            else {
            label_209:
                v0_5 = true;
            }

            this.x = v0_5;
            if(this.r.indexOf("o") >= 0) {
                String v0_6 = this.r.replaceAll(".*o(\\d+).*", "$1");
                if(v0_6.length() > 0) {
                    this.u = Integer.parseInt(v0_6);
                    return;
                }
            }
        }
        catch(Exception v0) {
            SpiderApi v1_2 = this.H;
            if(v1_2 != null) {
                b.a(v0, d.b("初始化全局变量错误！-->"), v1_2);
                return;
            }
        }
    }

    private String N(String arg3) {
        return arg3.indexOf("转义井号") < 0 ? arg3 : arg3.replace("转义井号", "#");
    }

    private String O(String arg11, String arg12, String arg13) {
        String v5;
        int v3_1;
        try {
            SpiderApi v0 = this.H;
            if(v0 != null) {
                v0.log("请求跳转播放链接源码，webUrl--> " + arg11);
            }

            String v0_1 = this.j(arg11);
            SpiderApi v1 = this.H;
            if(v1 != null) {
                if(v0_1 == null) {
                    v1.log("未获取到跳转源码");
                    v0_1 = "";
                }
                else {
                    boolean v4 = this.l;
                    String v3 = v4 ? "获取到跳转源码--> " + v0_1 : "获取到跳转源码--> " + v0_1.split("<meta http")[0].split(",\\{")[0] + "......";
                    v1.log(v3);
                }
            }

            if(arg12.length() <= 0) {
                arg12 = "\"url\"*\"&&\",";
            }

            if(v0_1 != null && ((v0_1.startsWith("{")) && (v0_1.endsWith("}")) && arg12.indexOf("&&") < 0)) {
                JSONObject v13 = new JSONObject(v0_1);
                if(arg12.indexOf(".") < 0) {
                    v13.optString(arg12).getClass();
                    return arg11;
                }

                this.u(v0_1, arg12);
                return arg11;
            }

            if(v0_1 != null && arg12.indexOf("&&") >= 0) {
                ArrayList v13_1 = this.Y(v0_1, arg13, "");
                int v0_2 = 0;
                while(true) {
                    if(v0_2 >= v13_1.size()) {
                        return arg11;
                    }

                    String v1_1 = (String)v13_1.get(v0_2);
                    if(v1_1.length() > 10) {
                        ArrayList v1_2 = this.Y(v1_1, arg12, "");
                        v3_1 = 0;
                        while(true) {
                        label_91:
                            if(v3_1 >= v1_2.size()) {
                                break;
                            }

                            v5 = ((String)v1_2.get(v3_1)).trim();
                            goto label_96;
                        }
                    }

                    ++v0_2;
                }
            }

            return arg11;
        }
        catch(Exception v12) {
            goto label_134;
        }

        try {
        label_96:
            if(this.r.indexOf("u0") < 0) {
                v5 = URLDecoder.decode(v5);
            }

            goto label_130;
        }
        catch(Exception v6) {
        }

        try {
            if(this.l) {
                Init.show(this.F + "调试->跳转Url解码出错：" + v6.toString());
            }

            SpiderApi v7 = this.H;
            if(v7 != null) {
                v7.log("跳转Url解码错误！-->" + v6.toString());
            }

        label_130:
            int v6_1 = v5.length();
            goto label_153;
        }
        catch(Exception v12) {
        }

    label_134:
        if(this.l) {
            Init.show(this.F + "调试->jumpCut出错：" + v12.toString());
        }

        SpiderApi v13_2 = this.H;
        if(v13_2 != null) {
            b.a(v12, d.b("jumpCut()错误！-->"), v13_2);
        }

        return arg11;
    label_153:
        if(v6_1 > 10) {
            return v5;
        }

        ++v3_1;
        goto label_91;
    }

    private String P(String arg12, String arg13) {
        StringBuilder v3;
        StringBuilder v1_1;
        if(arg13.length() >= 1 && this.t < this.u) {
            boolean v4 = false;
            if(arg13.indexOf("检测中") >= 0 && arg13.indexOf("跳转中") >= 0 && arg13.indexOf("btwaf") >= 0) {
                SpiderApi v0 = this.H;
                if(v0 != null) {
                    v0.log("过宝塔盾--> " + arg13);
                }

                String v13 = (String)this.Y(arg13, "btwaf=&&\"", "").get(0);
                StringBuilder v0_1 = d.b(arg12);
                String v1 = "?";
                if(arg12.indexOf("?") >= 0) {
                    v1 = "&";
                }

                v0_1.append(v1);
                v0_1.append("btwaf=");
                v0_1.append(v13);
                String v12 = v0_1.toString();
                ++this.t;
                arg13 = this.j(v12);
                this.s = true;
                return arg13;
            }

            if(arg13.contains("正在进行人机识别")) {
                SpiderApi v0_2 = this.H;
                if(v0_2 != null) {
                    v0_2.log("人机验证--> " + arg13);
                }

                String v0_3 = ((String)this.Y(arg13, "src=\"&&\"", "").get(0)).trim();
                if(v0_3.length() > 0) {
                    HashMap v13_1 = new HashMap();
                    if(!v0_3.startsWith("http")) {
                        if(v0_3.startsWith("/")) {
                            v1_1 = new StringBuilder();
                            v1_1.append(this.f);
                        }
                        else {
                            v1_1 = new StringBuilder();
                            v1_1.append(this.f);
                            v1_1.append("/");
                        }

                        v1_1.append(v0_3);
                        v0_3 = v1_1.toString();
                    }

                    String v0_4 = g.h(v0_3, this.r(v0_3), v13_1);
                    String v1_2 = ((String)this.Y(v0_4, "var key=\"&&\"", "").get(0)).trim();
                    String v7 = ((String)this.Y(v0_4, ",value=\"&&\"", "").get(0)).trim();
                    int v8 = 0;
                    String v9 = "";
                    while(v8 < v7.length()) {
                        StringBuilder v9_1 = d.b(v9);
                        v9_1.append(Integer.toString(v7.charAt(v8)));
                        v9 = v9_1.toString();
                        ++v8;
                    }

                    String v7_1 = m.a(v9, m.b);
                    String v0_5 = ((String)this.Y(v0_4, "c.get(\"&&\\&", "").get(0)).trim();
                    if(!v0_5.startsWith("http")) {
                        if(v0_5.startsWith("/")) {
                            v3 = new StringBuilder();
                            v3.append(this.f);
                        }
                        else {
                            v3 = new StringBuilder();
                            v3.append(this.f);
                            v3.append("/");
                        }

                        v3.append(v0_5);
                        v0_5 = v3.toString();
                    }

                    String v0_6 = v0_5 + "&key=" + v1_2 + "&value=" + v7_1;
                    g.h(v0_6, this.r(v0_6), v13_1);
                    for(Object v0_7: v13_1.entrySet()) {
                        Map.Entry v0_8 = (Map.Entry)v0_7;
                        if(!((String)v0_8.getKey()).equals("set-cookie") && !((String)v0_8.getKey()).equals("Set-Cookie")) {
                            continue;
                        }

                        this.y = this.y.length() >= 1 ? this.y + ";" + TextUtils.join(";", ((Iterable)v0_8.getValue())) : TextUtils.join(";", ((Iterable)v0_8.getValue()));
                        break;
                    }

                    ++this.t;
                    return this.j(arg12);
                }
            }
            else if(arg13.indexOf("输入验证码") >= 0 || arg13.indexOf("滑动验证") >= 0) {
                try {
                    SpiderApi v6 = this.H;
                    if(v6 != null) {
                        v6.log("OCR辅助验证--> " + arg13);
                    }

                    if(arg13.indexOf("输入验证码") >= 0) {
                        v4 = true;
                    }

                    JSONObject v1_3 = this.y(this.B("验证"), v4);
                    String v6_1 = this.y;
                    String v7_2 = v1_3.getString("str");
                    String v1_4 = v1_3.getString("codeUrl");
                    String v8_1 = this.E("ocr", "Ocr", "OCR", "");
                    String v9_2 = "1";
                    if(!v4) {
                        if(v8_1.length() < 1 || !v8_1.startsWith("http")) {
                            v8_1 = "https://ocr1.wogg.link/";
                        }

                        v9_2 = "3";
                    }
                    else if(v8_1.length() < 1 || !v8_1.startsWith("http")) {
                        v8_1 = "https://ocr.wogg.link/";
                    }

                    this.J("");
                    JSONObject v3_1 = this.o(v7_2, v8_1, v9_2);
                    String v5 = v3_1.getString("code");
                    this.y = v3_1.getString("cookie");
                    if(v5.length() <= 0 || this.y.length() <= 0) {
                        this.y = v6_1;
                        int v3_2 = this.t + 1;
                        this.t = v3_2;
                        if(v3_2 >= this.u) {
                            return arg13;
                        }

                        this.P(arg12, arg13);
                    }

                    HashMap v3_3 = this.r(v7_2);
                    if(v4) {
                        if(new JSONObject(com.github.catvod.spider.merge.h.b.c(v1_4 + v5, new HashMap(), v3_3)).optInt("code") == 1) {
                            ++this.t;
                            return this.j(arg12);
                        }

                        this.y = v6_1;
                        int v0_9 = this.t + 1;
                        this.t = v0_9;
                        if(v0_9 < this.u) {
                            this.P(arg12, arg13);
                            ++this.t;
                            return this.j(arg12);
                        }

                        return arg13;
                    }

                    if(!g.g(v1_4 + v5, v3_3).contains("ok")) {
                        this.y = v6_1;
                        int v0_10 = this.t + 1;
                        this.t = v0_10;
                        if(v0_10 >= this.u) {
                            return arg13;
                        }

                        this.P(arg12, arg13);
                    }

                    ++this.t;
                    return this.j(arg12);
                }
                catch(Exception v12_1) {
                    SpiderApi v0_11 = this.H;
                    if(v0_11 != null) {
                        b.a(v12_1, d.b("jumpbtwaf()错误-->"), v0_11);
                    }
                }
            }
        }

        return arg13;
    }

    private String Q(String arg3) {
        if(arg3.indexOf("转义左括号") >= 0) {
            arg3 = arg3.replace("转义左括号", "[");
        }

        return arg3.indexOf("转义右括号") < 0 ? arg3 : arg3.replace("转义右括号", "]");
    }

    private String R(String arg6, String arg7) {
        if((arg7.equals("*")) || (arg7.isEmpty())) {
            arg7 = arg6;
        }

        String[] v6 = arg6.split("\\&");
        String[] v7 = arg7.split("\\&");
        int v0 = 0;
        String v2 = "";
        while(v0 < v6.length) {
            String v3 = v0 >= v6.length - 1 ? "" : "#";
            StringBuilder v2_1 = d.b(v2);
            v2_1.append(v6[v0]);
            v2_1.append("$");
            v2 = n.b(v2_1, v7[v0], v3);
            ++v0;
        }

        return v2;
    }

    private String S(String arg9, String arg10) {
        String v10;
        String v9_1;
        if(arg9.length() > 1) {
            String[] v9 = arg9.split("#");
            if(v9.length == 1) {
                v9_1 = v9[0].replaceAll(".*(http.*)", "$1");
                return v9_1 == null || !v9_1.startsWith("http") ? "" : v9_1;
            }

            if(v9.length > 1) {
                int v4 = 0;
                while(v4 < v9.length) {
                    String v6 = v9[v4];
                    if(arg10.equals(v6.split("\\$")[0])) {
                        v10 = v6.split("\\$")[1];
                        goto label_35;
                    }

                    ++v4;
                }

                v10 = "";
            label_35:
                if(v10.length() < 1) {
                    v9_1 = v9[0].split("\\$")[1];
                    return v9_1 == null || !v9_1.startsWith("http") ? "" : v9_1;
                }

                return v10 == null || !v10.startsWith("http") ? "" : v10;
            }

            return (true) || !"".startsWith("http") ? "" : "";
        }

        return "";
    }

    private void T(Map arg11) {
        if(arg11.isEmpty()) {
            return;
        }

        SpiderApi v0 = this.H;
        if(v0 != null) {
            StringBuilder v1 = d.b("响应--> ");
            v1.append(arg11.toString());
            v0.log(v1.toString());
        }

        StringBuilder v0_1 = new StringBuilder();
        if(arg11.get("set-cookie") != null && !((List)arg11.get("set-cookie")).isEmpty()) {
            for(Object v2: ((List)arg11.get("set-cookie"))) {
                v0_1.append(((String)v2).split(";")[0]);
                v0_1.append(";");
            }
        }

        if(arg11.get("Set-cookie") != null && !((List)arg11.get("Set-cookie")).isEmpty()) {
            for(Object v2_1: ((List)arg11.get("Set-cookie"))) {
                String v2_2 = (String)v2_1;
                if(v0_1.indexOf(v2_2.split(";")[0]) >= 0) {
                    continue;
                }

                v0_1.append(v2_2.split(";")[0]);
                v0_1.append(";");
            }
        }

        if(arg11.get("Set-Cookie") != null && !((List)arg11.get("Set-Cookie")).isEmpty()) {
            for(Object v2_3: ((List)arg11.get("Set-Cookie"))) {
                String v2_4 = (String)v2_3;
                if(v0_1.indexOf(v2_4.split(";")[0]) >= 0) {
                    continue;
                }

                v0_1.append(v2_4.split(";")[0]);
                v0_1.append(";");
            }
        }

        if(arg11.get("set-Cookie") != null && !((List)arg11.get("set-Cookie")).isEmpty()) {
            for(Object v1_4: ((List)arg11.get("set-Cookie"))) {
                String v1_5 = (String)v1_4;
                if(v0_1.indexOf(v1_5.split(";")[0]) >= 0) {
                    continue;
                }

                v0_1.append(v1_5.split(";")[0]);
                v0_1.append(";");
            }
        }

        if(v0_1.toString().length() < 3) {
            return;
        }

        String[] v11_1 = v0_1.toString().split(";");
        int v1_6;
        for(v1_6 = 0; v1_6 < v11_1.length; ++v1_6) {
            String v2_5 = v11_1[v1_6];
            if(this.y.indexOf(v2_5.split("=")[0]) < 0) {
                this.y = this.y.length() >= 1 && !"0".equals(this.y) ? this.y + ";" + v2_5 : v2_5;
            }
            else if(!v2_5.endsWith("=") && !"0".equals(v2_5.split("=")[1])) {
                String v2_6 = n.b(new StringBuilder(), this.y, ";").replaceAll(n.b(new StringBuilder(), v2_5.split("=")[0], "=.*?;"), v2_5 + ";");
                this.y = v2_6;
                this.y = v2_6.substring(0, v2_6.length() - 1);
            }
        }
    }

    final String U(String arg1) {
        return a.l(arg1).p0();
    }

    private static String V(String arg6) {
        if(arg6.length() < 1) {
            return arg6;
        }

        Matcher v0 = Pattern.compile("(\\\\u(\\w{4}))").matcher(arg6);
        while(v0.find()) {
            arg6 = arg6.replace(v0.group(1), ((char)Integer.parseInt(v0.group(2), 16)) + "");
        }

        return arg6.replaceAll("\\\\", "");
    }

    private JSONObject W(String arg70, String arg71, boolean arg72) {
        // ERROR - The method was not decompiled
        // Self interruption
    }

    private void X(String arg6) {
        if(this.B("简介").length() > 0) {
            p.l = this.L(((String)this.Y(arg6, this.B("简介"), "").get(0)));
        }

        if(this.B("导演").length() > 0) {
            p.m = this.L(((String)this.Y(arg6, this.B("导演"), "").get(0)));
        }

        if(this.D("主演", "演员", "").length() > 0) {
            p.n = this.L(((String)this.Y(arg6, this.D("主演", "演员", ""), "").get(0)));
        }
    }

    private ArrayList Y(String arg9, String arg10, String arg11) {
        String v4_1;
        ArrayList v0 = new ArrayList();
        if(arg10.indexOf("\\+") >= 0) {
            arg10 = arg10.replace("\\+", "转义加号");
        }

        if(arg10.indexOf("\\(") >= 0) {
            arg10 = arg10.replace("\\(", "转义左小括号");
        }

        if(arg10.indexOf("\\)") >= 0) {
            arg10 = arg10.replace("\\)", "转义右小括号");
        }

        if(arg10.indexOf("+") < 0) {
            return this.c0(arg9, arg10, arg11);
        }

        String[] v10 = arg10.split("\\+");
        StringBuilder v11 = new StringBuilder();
        int v3;
        for(v3 = 0; v3 < v10.length; ++v3) {
            String v4 = v10[v3];
            if(!v4.isEmpty()) {
                if(v4.startsWith("url:")) {
                    String v4_2 = v4.substring(4);
                    if(v4_2.indexOf("$sub:") > 0) {
                        String[] v4_3 = v4_2.split("\\$sub\\:");
                        v4_1 = v4_3.length > 1 ? ((String)this.c0(this.j(v4_3[0]), v4_3[1], "").get(0)).trim() : this.j(v4_3[0]);
                    }
                    else {
                        v4_1 = this.j(v4_2);
                    }
                }
                else {
                    v4_1 = ((String)this.c0(arg9, v4, "").get(0)).trim();
                }

                if(!v4_1.isEmpty()) {
                    if((v4_1.startsWith("http")) && !v11.toString().trim().endsWith("=") && !v11.toString().trim().endsWith("解析")) {
                        v11 = new StringBuilder();
                    }

                    v11.append(v4_1);
                }
            }
        }

        v0.add(v11.toString());
        return v0;
    }

    private ArrayList Z(String arg19, String arg20, String arg21) {
        int v20;
        Matcher v19;
        int v7_5;
        Matcher v0_3;
        int v2_6;
        String v5_3;
        int v5_2;
        String v2_4;
        String v4_1;
        String v3_4;
        StringBuilder v3_3;
        int v14;
        XBPQ v1 = this;
        String v0 = arg19;
        String v2 = arg20;
        ArrayList v13 = new ArrayList();
        if((!arg20.isEmpty() || !arg21.isEmpty()) && !v2.equals("空$$空") && !v2.equals("空")) {
            try {
                if(v2.indexOf("转义加号") >= 0) {
                    v2 = v2.replace("转义加号", "+");
                }

                if(v2.indexOf("转义左小括号") >= 0) {
                    v2 = v2.replace("转义左小括号", "(");
                }

                if(v2.indexOf("转义右小括号") >= 0) {
                    v2 = v2.replace("转义右小括号", ")");
                }

                int v6 = v2.indexOf("&&");
                v14 = 1;
                if(v6 < 0 && (v2.indexOf("$$") < 0 && v2.length() > 0 && arg21.length() < 1)) {
                    if(v2.indexOf("替换") >= 0) {
                        v2 = v1.a0(v2, v0);
                    }

                    v13.add(v2);
                    return v13;
                }

                if(v2.endsWith("整页")) {
                    v2 = v2.replace("整页", "");
                    if(v1.w.length() > 0) {
                        v0 = v1.w;
                    }
                }

                if(v2.indexOf("\\[") >= 0) {
                    v2 = v2.replace("\\[", "转义左括号");
                }

                if(v2.indexOf("\\]") >= 0) {
                    v2 = v2.replace("\\]", "转义右括号");
                }

                if(v2.indexOf("\\*") >= 0) {
                    v2 = v2.replace("\\*", "转义星号");
                }

                int v3 = v2.indexOf("\\&");
                if(v3 >= 0) {
                    v2 = v2.replace("\\&", "转义连接符");
                }

                if(v2.indexOf("\\#") >= 0) {
                    v2 = v2.replace("\\#", "转义井号");
                }

                int v3_1 = v2.indexOf("&&");
                if(v3_1 >= 0) {
                    if(v2.split("\\&\\&") != null && v2.split("\\&\\&").length >= 1) {
                        int v3_2 = v2.split("\\&\\&").length;
                        if(v3_2 == 1) {
                            if(v2.startsWith("&&")) {
                                v0 = "从头截取" + v0;
                                v3_3 = new StringBuilder();
                                v3_3.append("从头截取");
                                v3_3.append(v2);
                                goto label_155;
                            }
                            else {
                                if(!v2.endsWith("&&")) {
                                    goto label_156;
                                }

                                v0 = v0 + "截取到末尾";
                                v3_3 = new StringBuilder();
                                v3_3.append(v2);
                                v3_3.append("截取到末尾");
                            label_155:
                                v2 = v3_3.toString();
                            }
                        }

                    label_156:
                        v3_4 = v2.split("\\&\\&")[1];
                        if(v3_4.startsWith("[")) {
                            v3_4 = "截取到末尾" + v3_4;
                            v0 = v0 + "截取到末尾";
                        }

                        v2 = v2.split("\\&\\&")[0];
                        goto label_192;
                    }

                    v13.add(v0);
                    return v13;
                }

                if(v2.indexOf("$$") >= 0) {
                    if(v2.split("\\$\\$") != null && v2.split("\\&\\&").length >= 2) {
                        v3_4 = v2.split("\\$\\$")[1];
                        v2 = v2.split("\\$\\$")[0];
                        goto label_192;
                    }

                    v13.add(v0);
                    return v13;
                }

                v3_4 = arg21;
            label_192:
                if(v2.indexOf("转义连接符") >= 0) {
                    v2 = v2.replace("转义连接符", "&");
                }

                if(v3_4.indexOf("转义连接符") >= 0) {
                    v3_4 = v3_4.replace("转义连接符", "&");
                }

                int v4 = v2.indexOf("[");
                if(v4 >= 0) {
                    v4_1 = v2.replaceAll(".*(\\[.*)", "$1");
                    v2 = v2.replaceAll("\\[.*", "");
                }
                else {
                    v4_1 = "";
                }

                if(v3_4.indexOf("[") >= 0) {
                    v4_1 = v3_4.replaceAll(".*(\\[.*)", "$1");
                    v3_4 = v3_4.replaceAll("\\[.*", "");
                }

                boolean v5 = v2.matches("-?\\d+");
                if((v5) && (v3_4.matches("-?\\d+"))) {
                    int v5_1 = v2.startsWith("-") ? v0.length() - Integer.parseInt(v2.replace("-", "")) : Integer.parseInt(v2) - 1;
                    int v2_1 = v3_4.startsWith("-") ? v0.length() - Integer.parseInt(v3_4.replace("-", "")) + 1 : Integer.parseInt(v3_4);
                    String v0_2 = v0.substring(v5_1, v2_1);
                    if(v4_1.indexOf("替换") > 0) {
                        v0_2 = v1.a0(v4_1, v0_2);
                    }

                    v13.add(v0_2);
                    return v13;
                }

                String v2_2 = v1.Q(v2);
                String v3_5 = v1.Q(v3_4);
                String v2_3 = v1.N(v2_2);
                String v3_6 = v1.N(v3_5);
                if(v2_3.indexOf("*") < 0) {
                    v2_4 = v1.i(v2_3);
                    v5_2 = 1;
                }
                else {
                    if(v2_3.indexOf("**") < 0) {
                        String[] v2_5 = v2_3.split("\\*");
                        v5_3 = v1.i(v1.e0(v2_5[0]));
                        int v7;
                        for(v7 = 1; v7 < v2_5.length; ++v7) {
                            v5_3 = v5_3 + "([^>]*?)" + v1.i(v1.e0(v2_5[v7]));
                        }

                        v2_6 = v2_5.length;
                    }
                    else {
                        String[] v2_7 = v2_3.split("\\*\\*");
                        v5_3 = v1.i(v1.e0(v2_7[0]));
                        int v7_1;
                        for(v7_1 = 1; v7_1 < v2_7.length; ++v7_1) {
                            v5_3 = v5_3 + "([\\S\\s]*?)" + v1.i(v1.e0(v2_7[v7_1]));
                        }

                        v2_6 = v2_7.length;
                    }

                    v5_2 = v2_6;
                    v2_4 = v5_3;
                }

                v0_3 = Pattern.compile(v2_4 + "([\\S\\s]*?)" + v1.i(v3_6)).matcher(v0);
                int v2_8 = 0;
                while(true) {
                label_331:
                    if(!v0_3.find()) {
                        goto label_533;
                    }

                    v2_8 += v14;
                    String v3_7 = v1.a0(v4_1, v0_3.group(v5_2) + "<序号>" + v2_8);
                    int v7_2 = v4_1.indexOf("[包含:");
                    if(v7_2 >= 0) {
                        String v7_3 = v1.Q(v4_1.replaceAll(".*\\[包含:(.*?)\\].*", "$1"));
                        if(v7_3.isEmpty()) {
                            v7_5 = 1;
                        }
                        else {
                            String[] v7_4 = v7_3.split("#");
                            int v10 = v7_4.length;
                            int v11 = 0;
                            while(v11 < v10) {
                                int v14_1 = v3_7.indexOf(v1.e0(v1.N(v7_4[v11])));
                                if(v14_1 < 0) {
                                    ++v11;
                                    continue;
                                }

                                v7_5 = 1;
                                goto label_374;
                            }

                            v7_5 = 0;
                        }
                    }
                    else {
                        v7_5 = 1;
                    }

                label_374:
                    if(v7_5 == 0) {
                        v13.add("不要");
                        v19 = v0_3;
                        v20 = v5_2;
                    }
                    else {
                        if(v4_1.indexOf("[不包含:") >= 0) {
                            String v11_1 = v1.Q(v4_1.replaceAll(".*\\[不包含:(.*?)\\].*", "$1"));
                            if(!v11_1.isEmpty()) {
                                String[] v7_6 = v11_1.split("#");
                                int v11_2 = v7_6.length;
                                int v14_2 = 0;
                                while(v14_2 < v11_2) {
                                    if(v3_7.indexOf(v1.e0(v1.N(v7_6[v14_2]))) >= 0) {
                                        v7_5 = 0;
                                        goto label_402;
                                    }

                                    ++v14_2;
                                }

                                v7_5 = 1;
                            }
                        }

                    label_402:
                        if(v7_5 == 0) {
                            v13.add("不要");
                            v19 = v0_3;
                            v20 = v5_2;
                            break;
                        }

                        if(v4_1.indexOf("[含序号:") >= 0) {
                            String v11_3 = v4_1.replaceAll(".*\\[含序号:(.*?)\\].*", "$1");
                            if(v11_3.isEmpty()) {
                                goto label_452;
                            }

                            String[] v7_7 = v11_3.split("#");
                            int v11_4 = v7_7.length;
                            int v14_3 = 0;
                            int v15 = 0;
                            while(v15 < v11_4) {
                                v19 = v0_3;
                                String v0_4 = v7_7[v15];
                                if(v0_4.indexOf("-") < 0) {
                                    goto label_439;
                                }

                                String[] v0_5 = v0_4.split("-");
                                v20 = v5_2;
                                int v5_4 = Integer.parseInt(v0_5[0]);
                                while(true) {
                                label_428:
                                    String[] v21 = v0_5;
                                    if(v5_4 > Integer.parseInt(v0_5[1])) {
                                        break;
                                    }

                                    if(v5_4 == v2_8) {
                                        v14_3 = 1;
                                        break;
                                    }

                                    ++v5_4;
                                    v0_5 = v21;
                                    goto label_428;
                                label_439:
                                    v20 = v5_2;
                                    if(Integer.parseInt(v0_4) != v2_8) {
                                        break;
                                    }

                                    v7_5 = 1;
                                    goto label_454;
                                }

                                ++v15;
                                v0_3 = v19;
                                v5_2 = v20;
                            }

                            v19 = v0_3;
                            v20 = v5_2;
                            v7_5 = v14_3;
                        }
                        else {
                        label_452:
                            v19 = v0_3;
                            v20 = v5_2;
                        }

                    label_454:
                        if(v7_5 == 0) {
                            v13.add("不要");
                            break;
                            v13.add(v3_7);
                        }
                        else {
                            if(v4_1.indexOf("[不含序号:") >= 0) {
                                String v0_6 = v4_1.replaceAll(".*\\[不含序号:(.*?)\\].*", "$1");
                                if(!v0_6.isEmpty()) {
                                    String[] v0_7 = v0_6.split("#");
                                    int v5_5 = v0_7.length;
                                    int v7_8 = 0;
                                    int v9 = 1;
                                    while(v7_8 < v5_5) {
                                        String v11_5 = v0_7[v7_8];
                                        if(v11_5.indexOf("-") >= 0) {
                                            String[] v11_6 = v11_5.split("-");
                                            int v14_4 = Integer.parseInt(v11_6[0]);
                                            while(true) {
                                                if(v14_4 > Integer.parseInt(v11_6[1])) {
                                                    goto label_492;
                                                }

                                                if(v14_4 == v2_8) {
                                                    v9 = 0;
                                                    goto label_492;
                                                }

                                                ++v14_4;
                                            }
                                        }

                                        if(Integer.parseInt(v11_5) == v2_8) {
                                            v7_5 = 0;
                                            goto label_495;
                                        }

                                    label_492:
                                        ++v7_8;
                                    }

                                    v7_5 = v9;
                                }
                            }

                        label_495:
                            if(v7_5 != 0) {
                                v13.add(v3_7);
                                break;
                            }

                            v13.add("不要");
                            break;
                        }
                    }

                    break;
                }
            }
            catch(Throwable v0_1) {
                if(v1.l) {
                    Init.show(v1.F + "调试->subContentExt出错：" + v0_1.toString());
                }

                SpiderApi v2_9 = v1.H;
                if(v2_9 != null) {
                    StringBuilder v3_8 = d.b("subContentExt()错误-->");
                    v3_8.append(v0_1.toString());
                    v2_9.log(v3_8.toString());
                }

                goto label_533;
            }

            v14 = 1;
            v0_3 = v19;
            v5_2 = v20;
            goto label_331;
        label_533:
            if(v13.isEmpty()) {
                v13.add("");
            }

            return v13;
        }

        v13.add(v0);
        return v13;
    }

    static String a(XBPQ arg0, String arg1) {
        arg0.z = arg1;
        return arg1;
    }

    private String a0(String arg18, String arg19) {
        String v12_4;
        StringBuilder v13_2;
        String v11_1;
        String v12_1;
        String v3 = arg19;
        try {
            String v10 = v3.replaceAll(".*<序号>(.*)", "$1");
            v3 = v3.replaceAll("<序号>.*", "");
            if(arg18.indexOf("替换") >= 0) {
                String v6 = arg18.replaceAll(".*\\[仅?替换[:：](.*?)\\].*", "$1");
                int v12 = 0;
                if(v6.indexOf("##") >= 0) {
                    return ((String)this.Y(v3, v6.replace("##", "&&"), "").get(0)).trim();
                }

                String v5 = this.Q(v6).replace("<序号>", v10);
                if(!v5.isEmpty()) {
                    String[] v5_1 = v5.split("#");
                    int v10_1 = 0;
                    while(true) {
                    label_51:
                        if(v10_1 >= v5_1.length) {
                            return v3;
                        }

                        String v11 = this.N(v5_1[v10_1]);
                        if(v11.indexOf(">>>") < 0) {
                            v12_1 = v11.split(">>")[v12];
                            v11_1 = v11.split(">>")[1];
                        }
                        else {
                            v12_1 = v11.split(">>>")[v12] + ">";
                            v11_1 = v11.split(">>>")[1];
                        }

                        String v11_2 = this.f0(v11_1);
                        int v13 = v12_1.indexOf("*");
                        if(v13 >= 0) {
                            if(v11_2.length() <= 0) {
                                goto label_127;
                            }

                            if(v11_2.equals("空")) {
                                v11_2 = "";
                            }

                            boolean v13_1 = v12_1.startsWith("*");
                            if(v13_1) {
                                String v12_2 = this.e0(v12_1.substring(1, v12_1.length()));
                                v13_2 = new StringBuilder();
                                v13_2.append("([\\S\\s]*?)");
                                v13_2.append(this.i(v12_2));
                                goto label_109;
                            }
                            else {
                                if(v12_1.endsWith("*")) {
                                    String v12_3 = this.e0(v12_1.substring(0, v12_1.length() - 1));
                                    v13_2 = new StringBuilder();
                                    v13_2.append(this.i(v12_3));
                                    v13_2.append("([\\S\\s]*?)");
                                label_109:
                                    v12_4 = v13_2.toString();
                                    v3 = v3.replaceAll(v12_4, v11_2);
                                    ++v10_1;
                                    v12 = 0;
                                    goto label_51;
                                }

                                String v13_3 = this.e0(v12_1.split("\\*")[0]);
                                String v12_5 = this.e0(v12_1.split("\\*")[1]);
                                v12_4 = this.i(v13_3) + "([\\S\\s]*?)" + this.i(v12_5);
                            }

                            v3 = v3.replaceAll(v12_4, v11_2);
                            ++v10_1;
                            v12 = 0;
                            goto label_51;
                        }
                        else {
                        label_127:
                            if(v11_2.length() <= 0) {
                                ++v10_1;
                                v12 = 0;
                                goto label_51;
                            }

                            if(v12_1.equals("空")) {
                                return v11_2;
                            }

                            if(v11_2.equals("空")) {
                                v11_2 = "";
                            }

                            v12_4 = this.i(this.e0(v12_1));
                            v3 = v3.replaceAll(v12_4, v11_2);
                        }

                        ++v10_1;
                        v12 = 0;
                    }
                }
            }
        }
        catch(Exception v0) {
            if(this.l) {
                Init.show(this.F + "调试->替换出错，请检查：" + arg18 + "->" + v0.toString());
            }

            SpiderApi v2 = this.H;
            if(v2 != null) {
                b.a(v0, d.b("替换tH()错误！-->"), v2);
            }
        }

        return v3;
    }

    static String b(XBPQ arg0) {
        return arg0.F;
    }

    private ArrayList b0(String arg17, String arg18, String arg19) {
        String v10;
        String v2_1;
        int v6;
        ArrayList v4 = new ArrayList();
        if(arg18.indexOf("Base64") >= 0) {
            int v5 = arg18.indexOf("B[");
            String v5_1 = v5 < 0 ? "" : arg18.replaceAll(".*B\\[(.*?)\\].*", "$1").replace("##", "&&");
            if(v5_1 != null && v5_1.indexOf("替换") > 0) {
                v5_1 = n.a(v5_1, "]");
            }

            String v2 = arg18.replaceAll(".*Base64\\((.*?)\\).*", "$1");
            if(v2.matches(".*,\\d")) {
                v6 = Integer.parseInt(v2.substring(v2.length() - 1, v2.length()));
                v2 = v2.substring(0, v2.length() - 2);
            }
            else {
                v6 = 1;
            }

            if(v2.isEmpty()) {
                if(v6 == 2) {
                    v2_1 = new String(Base64.decode(arg17, 1));
                    if(this.l) {
                        Init.show("Base64.NO_PADDING模式");
                    }
                }
                else if(v6 == 3) {
                    v2_1 = new String(Base64.decode(arg17, 2));
                    if(this.l) {
                        Init.show("Base64.NO_WRAP模式");
                    }
                }
                else if(v6 == 4) {
                    v2_1 = new String(Base64.decode(arg17, 8));
                    if(this.l) {
                        Init.show("Base64.URL_SAFE模式");
                    }
                }
                else {
                    v2_1 = new String(Base64.decode(arg17, 0));
                }

                v10 = v2_1;
                if(v5_1.indexOf("&&") >= 0 || v5_1.indexOf("替换") > 0) {
                    v10 = ((String)this.Z(v10, v5_1, "").get(0)).trim();
                }
            }
            else {
                if(v6 == 2) {
                    v10 = new String(Base64.decode(((String)this.Z(arg17, v2, arg19).get(0)).trim(), 1));
                    if(this.l) {
                        Init.show("Base64.NO_PADDING模式");
                    }
                }
                else if(v6 == 3) {
                    String v11 = new String(Base64.decode(((String)this.Z(arg17, v2, arg19).get(0)).trim(), 2));
                    if(this.l) {
                        Init.show("Base64.NO_WRAP模式");
                    }

                    v10 = v11;
                }
                else if(v6 == 4) {
                    v10 = new String(Base64.decode(((String)this.Z(arg17, v2, arg19).get(0)).trim(), 8));
                    if(this.l) {
                        Init.show("Base64.URL_SAFE模式");
                    }
                }
                else {
                    v10 = "";
                }

                if(v6 == 1) {
                    v10 = new String(Base64.decode(((String)this.Z(arg17, v2, arg19).get(0)).trim(), 0));
                }

                if(v5_1.indexOf("&&") >= 0 || v5_1.indexOf("替换") > 0) {
                    v10 = ((String)this.Z(v10, v5_1, "").get(0)).trim();
                }
            }

            v4.add(v10);
            return v4;
        }

        return this.Z(arg17, arg18, arg19);
    }

    static String c(XBPQ arg0) {
        return arg0.y;
    }

    private ArrayList c0(String arg11, String arg12, String arg13) {
        String v11;
        ArrayList v0 = new ArrayList();
        if(arg12.indexOf("urlDecode") >= 0) {
            int v1 = arg12.indexOf("B[");
            String v1_1 = v1 < 0 ? "" : arg12.replaceAll(".*(B\\[.*?\\]).*", "$1");
            int v4 = arg12.indexOf("D[");
            String v4_1 = v4 < 0 ? "" : arg12.replaceAll(".*D\\[(.*?)\\].*", "$1").replace("##", "&&");
            if(v4_1 != null && v4_1.indexOf("替换") > 0) {
                v4_1 = n.a(v4_1, "]");
            }

            String v12 = arg12.replaceAll(".*urlDecode\\((.*?)\\).*", "$1");
            if(v12.isEmpty()) {
                v11 = URLDecoder.decode(arg11);
                if(v4_1.indexOf("&&") >= 0 || v4_1.indexOf("替换") > 0) {
                    v11 = ((String)this.Z(v11, v4_1, "").get(0)).trim();
                }
            }
            else {
                if(v12.indexOf("Base64") >= 0) {
                    v12 = v1_1 == null || v1_1.length() < 1 ? n.a(v12, ")") : v12 + ")" + v1_1;
                }

                v11 = URLDecoder.decode(((String)this.b0(arg11, v12, arg13).get(0)).trim());
                if(v4_1.indexOf("&&") >= 0 || v4_1.indexOf("替换") > 0) {
                    v11 = ((String)this.Z(v11, v4_1, "").get(0)).trim();
                }
            }

            v0.add(v11);
            return v0;
        }

        return this.b0(arg11, arg12, arg13);
    }

    public String categoryContent(String arg4, String arg5, boolean arg6, HashMap arg7) {
        SpiderApi v0 = this.H;
        if(v0 != null) {
            v0.log("categoryContent(tid=" + arg4 + ", pg=" + arg5 + ", filter=" + arg6 + ", extend=" + arg7.toString() + ")");
        }

        JSONObject v4 = this.e(arg4, arg5, arg6, arg7);
        return v4 == null ? "" : v4.toString();
    }

    static String d(XBPQ arg0, String arg1) {
        arg0.y = arg1;
        return arg1;
    }

    protected final String d0(String arg10, String arg11, String arg12, String arg13) {
        String v11_3;
        HashMap v11_1;
        String v13;
        if("0".equals(this.z)) {
            return arg12;
        }

        int v1 = this.G + 1;
        this.G = v1;
        if(v1 == 2 && this.r.indexOf("c") < 0) {
            this.r = n.b(new StringBuilder(), this.r, "c");
        }

        if(this.G == 4) {
            this.G = 0;
            return arg12;
        }

        String v3 = arg11.split("###")[1];
        String v11 = arg11.split("###")[0];
        try {
            JSONObject v1_2 = this.m(v11, arg13);
            String v4 = v1_2.getString("str");
            arg13 = v1_2.getString("codeUrl");
            if(arg12.indexOf("输入验证码") >= 0) {
                k.i = "请输入验证码";
            }
            else {
                int v1_3 = arg12.indexOf("滑动验证");
                if(v1_3 < 0) {
                    if(arg12.indexOf("人机验证") >= 0) {
                        goto label_64;
                    }

                    k.i = "网页浏览";
                    v4 = v11;
                }
                else {
                label_64:
                    k.i = "人机验证";
                }
            }

            Init.run(new c(this, v4, this.y), 200);
            while(true) {
            label_70:
                boolean v1_4 = "".equals(this.z);
                break;
            }
        }
        catch(Exception v1_1) {
            goto label_104;
        }

        if(v1_4) {
            try {
                Thread.sleep(500L);
                goto label_70;
            }
            catch(Exception v1_5) {
                try {
                    if(this.l) {
                        Init.show(this.F + "调试->webViewDialog睡眠错：" + v1_5.toString());
                    }

                    SpiderApi v4_1 = this.H;
                    if(v4_1 == null) {
                        goto label_70;
                    }

                    v4_1.log("webViewDialog睡眠错误-->" + v1_5.toString());
                    goto label_70;
                }
                catch(Exception v1_1) {
                label_104:
                    if(this.l) {
                        Init.show(this.F + "调试->验证出错：" + v1_1.toString());
                    }

                    SpiderApi v4_2 = this.H;
                    if(v4_2 != null) {
                        b.a(v1_1, d.b("验证错误-->"), v4_2);
                    }
                }
            }
        }

        if("1".equals(this.z)) {
            this.z = "";
        }

        if(!"".equals(this.z) && !"0".equals(this.z) && this.r.indexOf("Y") < 0) {
            if(arg13.indexOf("{code}") > 0) {
                v13 = arg13.replace("{code}", this.z);
            }
            else {
                StringBuilder v13_1 = d.b(arg13);
                v13_1.append(this.z);
                v13 = v13_1.toString();
            }

            if("搜索".equals(this.q)) {
                v11_1 = this.I(v11);
            }
            else if(this.r.indexOf("c") >= 0) {
                v11_1 = this.r(v11);
            }
            else {
                this.r = n.b(new StringBuilder(), this.r, "c");
                v11_1 = this.r(v11);
                this.r = this.r.replace("c", "");
            }

            if(this.l) {
                Init.show(this.y);
            }

            try {
                if(v13.indexOf(";post;") < 0) {
                    com.github.catvod.spider.merge.h.b.g(v13, v11_1);
                }
                else {
                    XBPQ.5 v1_6 = new XBPQ.5();
                    g.e(g.b(), v13.split(";")[0], null, v11_1, v1_6);
                    v11_3 = (String)v1_6.getResult();
                    boolean v13_2 = this.l;
                    goto label_196;
                }

                goto label_240;
            }
            catch(Exception v11_2) {
                goto label_220;
            }

        label_196:
            if(v13_2) {
                String v13_3 = v11_3 == null ? "验证失败" : v11_3;
                try {
                    Init.show(v13_3);
                label_204:
                    SpiderApi v13_4 = this.H;
                    if(v13_4 != null) {
                        if("验证结果--> " + v11_3 == null) {
                            v11_3 = "验证失败";
                        }

                        v13_4.log(v11_3);
                    }
                }
                catch(Exception v11_2) {
                label_220:
                    if(this.l) {
                        Init.show(this.F + PqS.d("BDC1E4A0D9D2784F102D14113C14100C1F26391E00A1DCCBBDDEE6ADE6C9251E143C9FD3CC9EDBD2") + v11_2.toString());
                    }

                    SpiderApi v13_5 = this.H;
                    if(v13_5 != null) {
                        b.a(v11_2, d.b(PqS.d("2214051E1F2222350E291A283298CDC49EE8D494F7C6062826058EDCEFAFFADE4A6548")), v13_5);
                    }
                }
            }
            else {
                goto label_204;
            }

        label_240:
            if(!"0".equals(this.z)) {
                this.z = "";
            }
        }

        if("0".equals(this.z)) {
            return arg12;
        }

        if(PqS.d("3314132B1E").equals(arg10)) {
            arg12 = this.j(v3);
        }

        return PqS.d("3314132B1E173A0213").equals(arg10) ? this.k(v3) : arg12;
    }

    public String decrypt(String arg4, String arg5, String arg6, String arg7) {
        try {
            SecretKeySpec v0 = new SecretKeySpec(arg6.getBytes("UTF-8"), "AES");
            Cipher v6 = Cipher.getInstance("AES/CTR/PKCS5Padding");
            v6.init(2, v0, new IvParameterSpec(arg7.getBytes()));
            return new String(v6.doFinal(Base64.decode(arg4, 0)), arg5);
        }
        catch(Exception v4) {
            SpiderApi v5 = this.H;
            if(v5 != null) {
                b.a(v4, d.b("decrypt()错误-->"), v5);
            }

            return null;
        }
    }

    public String detailContent(List arg59) {
        // ERROR - The method was not decompiled
        // Self interruption
    }

    private JSONObject e(String arg12, String arg13, boolean arg14, HashMap arg15) {
        String v13;
        String v12_1;
        JSONObject v4;
        try {
            this.w = "";
            v4 = this.x(arg12, arg13, arg14, arg15);
            JSONArray v5 = new JSONArray();
            if(v4 != null) {
                v5 = v4.getJSONArray("list");
            }

            int v7 = v5.length();
            if(v7 < 1 && this.v.length() < 1) {
                if(("搜索".equals(this.q)) && this.r.indexOf("k0") >= 0) {
                    this.r = this.r.replace("k0", "");
                }

                if(this.r.indexOf("c") < 0) {
                    this.r = this.r + "c";
                }

                SpiderApi v1 = this.H;
                if(v1 != null) {
                    v1.log("自动模式<li>未截取到数据，尝试用<a>再截取一次");
                }

                this.v = "<a&&</a>";
                v4 = this.x(arg12, arg13, arg14, arg15);
            }

            if(v4 != null) {
                v5 = v4.getJSONArray("list");
            }

            if(v5.length() < 1 && ("<a&&</a>".equals(this.v))) {
                SpiderApi v1_1 = this.H;
                if(v1_1 != null) {
                    v1_1.log("自动模式<a>未截取到数据，尝试用<div>再截取一次");
                }

                this.v = "<div&&</div>";
                v4 = this.x(arg12, arg13, arg14, arg15);
                if("搜索".equals(this.q)) {
                    this.v = "";
                }
            }

            v12_1 = this.B("浏览器");
            if(v12_1.length() < 1 && this.r.indexOf("L") >= 0 || ("1".equals(v12_1))) {
                v12_1 = this.f;
            }

            v13 = this.n(v12_1);
            if(!"搜索".equals(this.q) && (v12_1.startsWith("http"))) {
                boolean v14 = "0".equals(this.z);
                goto label_96;
            }

            this.w = "";
            return v4;
        }
        catch(JSONException v12) {
            goto label_137;
        }

    label_96:
        if(!v14) {
            try {
                Init.run(new com.github.catvod.spider.a(this, v12_1, v13), 200);
                if(!"0".equals(this.z)) {
                    this.z = "";
                }

                this.w = "";
                return v4;
            }
            catch(Exception v12_2) {
            }

            try {
                if(this.l) {
                    Init.show(this.F + "调试->内置浏览器运行出错：" + v12_2.toString());
                }

                SpiderApi v13_1 = this.H;
                if(v13_1 != null) {
                    v13_1.log("内置浏览器运行()错误！-->" + v12_2.toString());
                }

                this.w = "";
                return v4;
            }
            catch(JSONException v12) {
                goto label_137;
            }
        }

        this.w = "";
        return v4;
    label_137:
        if(this.l) {
            Init.show(this.F + "调试->category出错：" + v12.toString());
        }

        SpiderApi v13_2 = this.H;
        if(v13_2 != null) {
            StringBuilder v14_1 = d.b("category()错误！-->");
            v14_1.append(v12.toString());
            v13_2.log(v14_1.toString());
        }

        this.w = "";
        return null;
    }

    private String e0(String arg3) {
        return arg3.indexOf("转义星号") < 0 ? arg3 : arg3.replace("转义星号", "*");
    }

    public String encrypt(String arg5, String arg6, String arg7, String arg8) {
        try {
            Cipher v0 = Cipher.getInstance("AES/CTR/PKCS5Padding");
            v0.init(1, new SecretKeySpec(arg7.getBytes(), "AES"), new IvParameterSpec(arg8.getBytes()));
            return Base64.encodeToString(v0.doFinal(arg5.getBytes(arg6)), 0);
        }
        catch(Exception v5) {
            SpiderApi v6 = this.H;
            if(v6 != null) {
                b.a(v5, d.b("encrypt()错误-->"), v6);
            }

            return null;
        }
    }

    protected final String f(String arg12, String arg13, boolean arg14, HashMap arg15) {
        if(arg12.startsWith("http")) {
            return arg12;
        }

        String v0 = this.b;
        String v1 = this.E("特殊分类", "特殊分类url", "特殊分类链接", "");
        String v2 = this.F("起始页", "分类起始页码", "qishiye", "firstpage", "1");
        if(this.q.length() > 0 && v1.indexOf("$") >= 0 && v1.indexOf(this.q) >= 0) {
            String v0_1 = n.a(v1, "#");
            StringBuilder v1_1 = d.b(".*");
            v1_1.append(this.q);
            v1_1.append(".*?\\$(.*?)#.*");
            v0 = v0_1.replaceAll(v1_1.toString(), "$1");
        }

        if(v0.indexOf("[") >= 0 || v0.indexOf("|") >= 0) {
            v0 = arg13.equals(v2) ? v0.replaceAll(".*[\\[|\\|].*(http[^\\]]*)\\]?.*", "$1").replace("firstPage=", "") : v0.replaceAll("\\|\\|", "\\|").replaceAll("(.*)[\\[|\\|].*", "$1");
        }

        if((arg14) && (this.a) && arg15 != null && arg15.size() > 0) {
            for(Object v3: arg15.keySet()) {
                String v3_1 = (String)v3;
                String v5 = (String)arg15.get(v3_1);
                if(v5.length() <= 0) {
                    continue;
                }

                v0 = v0.replace("{" + v3_1 + "}", URLEncoder.encode(v5));
            }
        }

        String v12 = v0.replace("{cateId}", arg12).replace("{catePg}", arg13);
        Matcher v13 = Pattern.compile("\\{(.*?)\\}").matcher(v12);
        while(v13.find()) {
            String v15 = v13.group(0).replace("{", "").replace("}", "");
            v12 = v12.replace(v13.group(0), "").replace("/" + v15 + "/", "");
        }

        return v12;
    }

    private String f0(String arg6) {
        try {
            if(arg6.length() < 0) {
                return "";
            }

            if(arg6.indexOf("*") < 0) {
                return this.e0(arg6);
            }

            Matcher v6_1 = Pattern.compile(this.i(this.e0(arg6.split("\\*")[0])) + "([\\S\\s]*?)" + this.i(this.e0(arg6.split("\\*")[1]))).matcher(this.w);
            if(v6_1.find()) {
                return v6_1.group(1).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
            }

            if(this.l) {
                Init.show("替换未获取到有效截取内容");
                return "";
            }
        }
        catch(Exception v6) {
            if(this.l) {
                Init.show(this.F + "调试->替换截取出错：" + v6.toString());
            }

            SpiderApi v0 = this.H;
            if(v0 != null) {
                b.a(v6, d.b("替换截取xhSubCut()错误！-->"), v0);
            }

            return "";
        }

        return "";
    }

    private String fixCover(String arg3, String arg4) {
        try {
            return "proxy://do=xbpq&site=" + arg4 + "&pic=" + arg3 + "&sourcekey=" + this.B("指定代理");
        }
        catch(Exception v4) {
            if(this.l) {
                Init.show(this.F + "调试->fixCover出错：" + v4.toString());
            }

            SpiderApi v0 = this.H;
            if(v0 != null) {
                b.a(v4, d.b("fixCover()错误-->"), v0);
            }

            return arg3;
        }
    }

    private JSONArray g(String arg18, String arg19, String arg20, String arg21, String arg22) {
        JSONObject v0_10;
        JSONObject v0_8;
        String v0_7;
        JSONObject v0_5;
        JSONObject v0_3;
        JSONObject v0_1;
        JSONArray v9;
        String v6 = "时长";
        try {
            v9 = new JSONArray();
            int v10 = arg18.indexOf("$");
            if(v10 >= 0) {
                v0_1 = this.A("cateId", "类型", arg18, "");
                v9.put(v0_1);
            }
            else if(arg18.indexOf("&") >= 0) {
                v0_1 = this.A("cateId", "类型", arg18, this.D("类型值", "筛选子分类替换词", ""));
                v9.put(v0_1);
            }

            int v0_2 = arg19.indexOf("$");
            if(v0_2 >= 0) {
                v0_3 = this.A("class", "剧情", arg19, "");
                v9.put(v0_3);
            }
            else if(arg19.indexOf("&") >= 0) {
                v0_3 = this.A("class", "剧情", arg19, this.D("剧情值", "筛选类型替换词", ""));
                v9.put(v0_3);
            }

            int v0_4 = arg20.indexOf("$");
            if(v0_4 >= 0) {
                v0_5 = this.A("area", "地区", arg20, "");
                v9.put(v0_5);
            }
            else if(arg20.indexOf("&") >= 0) {
                v0_5 = this.A("area", "地区", arg20, this.D("地区值", "筛选地区替换词", ""));
                v9.put(v0_5);
            }

            if(arg21.indexOf("-") >= 0 && arg21.indexOf("--") < 0) {
                int v0_6 = Integer.parseInt(arg21.split("-")[1]);
                int v2 = Integer.parseInt(arg21.split("-")[0]);
                if(v2 > v0_6) {
                    int v16 = v2;
                    v2 = v0_6;
                    v0_6 = v16;
                }

                StringBuilder v3 = new StringBuilder();
                while(v0_6 >= v2) {
                    if(v0_6 == v2) {
                        v3.append(String.valueOf(v0_6));
                    }
                    else {
                        v3.append(String.valueOf(v0_6));
                        v3.append("&");
                    }

                    --v0_6;
                }

                v0_7 = v3.toString();
            }
            else {
                v0_7 = arg21;
            }

            if(this.B("时长").length() <= 0) {
                v6 = "年份";
            }

            int v2_1 = v0_7.indexOf("$");
            if(v2_1 >= 0) {
                v0_8 = this.A("year", v6, v0_7, "");
                v9.put(v0_8);
            }
            else if(v0_7.indexOf("&") >= 0) {
                v0_8 = this.A("year", v6, v0_7, this.E("年份值", "时长值", "筛选年份替换词", ""));
                v9.put(v0_8);
            }

            int v0_9 = arg22.indexOf("$");
            if(v0_9 >= 0) {
                v0_10 = this.A("by", "排序", arg22, "");
            }
            else {
                if(arg22.indexOf("&") < 0) {
                    return v9;
                }

                v0_10 = this.A("by", "排序", arg22, this.D("排序值", "筛选排序替换词", ""));
            }

            v9.put(v0_10);
            return v9;
        }
        catch(Exception v0) {
            if(this.l) {
                Init.show(this.F + "调试->creatFilter出错：" + v0.toString());
            }

            SpiderApi v2_2 = this.H;
            if(v2_2 != null) {
                b.a(v0, d.b("creatFilter()错误-->"), v2_2);
            }

            return null;
        }

        return v9;
    }

    protected final com.github.catvod.spider.merge.f0.a g0(String arg3) {
        if(arg3.indexOf(";post") >= 0) {
            return new com.github.catvod.spider.merge.f0.a(a.l(this.k(n.a("xp", arg3))).R());
        }

        StringBuilder v0 = d.b("xp");
        v0.append(arg3.split(";")[0]);
        return new com.github.catvod.spider.merge.f0.a(a.l(this.j(v0.toString())).R());
    }

    public String getToken(String arg1, String arg2, String arg3, String arg4) {
        return this.encrypt(arg1, arg2, arg3, arg4);
    }

    private String h(String arg15) {
        String v1_2;
        XBPQ.3 v0 = new XBPQ.3();
        String v1 = this.r;
        String v2 = arg15.indexOf(";post") <= 0 ? "" : arg15.split(";post;")[1].trim();
        String v15 = arg15.split(";")[0];
        if(this.r.indexOf("J") >= 0 && v15.indexOf("outerHTML") < 0 && v15.indexOf("innerHTML") < 0 && this.H != null) {
            String v6 = this.r.indexOf("Jb") < 0 ? ":document.documentElement.outerHTML" : ":document.body.innerHTML";
            String v1_1 = v1.matches(".*Jb?\\d+.*") ? v1.replaceAll(".*Jb?(\\d+).*", "$1") : "";
            v1_2 = this.H.getAddress(true) + "webparse/" + v15 + "<<eval" + v1_1 + v6;
            SpiderApi v6_1 = this.H;
            if(v6_1 != null) {
                v6_1.log("正在使用代理--> " + v1_2);
            }
        }
        else {
            v1_2 = v15;
        }

        HashMap v15_1 = "搜索".equals(this.q) ? this.I(v15) : this.r(v15);
        if(v2.length() > 2) {
            LinkedHashMap v6_2 = new LinkedHashMap();
            String[] v7 = v2.split("\\&");
            int v10;
            for(v10 = 0; v10 < v7.length; ++v10) {
                String v11 = v7[v10];
                if(!v11.endsWith("=")) {
                    int v12 = v11.indexOf("=");
                    v6_2.put(v11.substring(0, v12), v11.substring(v12 + 1));
                }
            }

            if(v2.isEmpty()) {
                g.e(g.b(), v1_2, null, v15_1, v0);
            }
            else {
                g.e(g.b(), v1_2, v6_2, v15_1, v0);
            }
        }
        else {
            g.c(g.b(), v1_2, v15_1, v0);
        }

        try {
            byte[] v15_3 = ((Response)v0.getResult()).body().bytes();
            String v0_1 = this.r.indexOf("g") < 0 ? this.E("编码", "网页编码格式", "Coding_format", "UTF-8") : "GBK";
            if(v15_3 != null) {
                return new String(v15_3, v0_1);
            }
        }
        catch(IOException v15_2) {
            if(this.l) {
                Init.show(this.F + "调试->deEnCode出错：" + v15_2.toString());
            }

            SpiderApi v0_2 = this.H;
            if(v0_2 != null) {
                StringBuilder v1_3 = d.b("deEnCode()错误-->");
                v1_3.append(v15_2.toString());
                v0_2.log(v1_3.toString());
            }

            return "";
        }

        return "";
    }

    public String homeContent(boolean arg29) {
        String v5_1;
        JSONObject v0_4;
        JSONObject v2;
        String v6_2;
        String v4_1;
        String v0_1;
        int v11;
        XBPQ v1 = this;
        String v6 = "";
        try {
            JSONObject v7 = new JSONObject();
            JSONArray v8 = new JSONArray();
            String v9 = v1.D("横图", "横图模式", "");
            String v10 = v1.B("分类详情");
            if(v10.indexOf("类型") < 0 && v10.indexOf("年份") < 0 && v10.indexOf("地区") < 0 && v10.indexOf("导演") < 0 && v10.indexOf("主演") < 0) {
                if(v10.indexOf("简介") >= 0) {
                    goto label_51;
                }

                v11 = 0;
            }
            else {
            label_51:
                v11 = 1;
            }

            int v12 = v1.r.indexOf("h");
            JSONArray v23 = v8;
            if(v12 < 0) {
                if(("1".equals(v9)) || ("全部".equals(v9))) {
                    goto label_120;
                }

                if(v9.indexOf("首页") >= 0) {
                    goto label_120;
                }

                if(v11 == 0) {
                    v0_1 = "";
                    v4_1 = "";
                }
                else {
                    String v4 = v1.p(v10, "列数");
                    if(v4.length() <= 0 || !v4.matches("\\d")) {
                        v4 = "0";
                    }

                    if("2".equals(v4)) {
                        v4 = "32";
                    }
                    else if("1".equals(v4)) {
                        v4 = "21";
                    }

                    v7.put("type_flag", "3-" + v4);
                    v0_1 = v4;
                    v4_1 = "";
                }
            }
            else {
            label_120:
                v4_1 = v1.p(v9, "列数");
                if(v4_1.length() <= 0 || !v4_1.matches("\\d")) {
                    v4_1 = "0";
                }

                if(v1.r.indexOf("h2") >= 0) {
                    v4_1 = "32";
                }
                else if(v1.r.indexOf("h1") >= 0) {
                    v4_1 = "21";
                }

                v7.put("type_flag", "2-" + v4_1 + "-H");
                v0_1 = "";
            }

            v1.c = this.l();
            String v10_1 = v1.D(PqS.d("B0F9F0A0D7EFB0F9E1AFC7FC"), PqS.d("33140924132E"), "");
            if(v10_1.isEmpty()) {
                v10_1 = v1.c;
            }

            String[] v10_2 = v10_1.split(PqS.d("76"));
            int v12_1 = v10_2.length;
            int v6_1 = 0;
            while(v6_1 < v12_1) {
                int v16 = v12_1;
                String[] v24 = v10_2;
                String[] v10_3 = v10_2[v6_1].split(PqS.d("0955"));
                JSONObject v12_2 = new JSONObject();
                JSONObject v25 = v7;
                int v27 = v6_1;
                v12_2.put(PqS.d("2108172D2929341C02"), v10_3[0]);
                v12_2.put(PqS.d("2108172D292E31"), v10_3[1]);
                if(v1.r.indexOf("h") < 0 && !"1".equals(v9) && !"全部".equals(v9)) {
                    if(v9.indexOf(v10_3[0]) >= 0) {
                        goto label_204;
                    }

                    if(v11 == 0) {
                        goto label_211;
                    }

                    v6_2 = "3-" + v0_1;
                    goto label_210;
                }
                else {
                label_204:
                    v6_2 = "2-" + v4_1 + "-H";
                label_210:
                    v12_2.put("type_flag", v6_2);
                }

            label_211:
                v23.put(v12_2);
                v23 = v23;
                v6_1 = v27 + 1;
                v12_1 = v16;
                v10_2 = v24;
                v7 = v25;
            }

            v2 = v7;
            v2.put(PqS.d("361D063B05"), v23);
        }
        catch(Exception v0) {
            goto label_384;
        }

        try {
            JSONObject v0_3 = v1.A.optJSONObject("筛选");
        }
        catch(Exception v0_2) {
            goto label_352;
        }

        String v4_2 = PqS.d("33180B3C133531101329");
        String v5 = PqS.d("33180B3C1335");
        if(v0_3 == null) {
            try {
                if(!v1.B("筛选").isEmpty()) {
                    goto label_249;
                }

                if(v1.A.optJSONObject(v5) != null) {
                    v4_2 = v5;
                }
                else if(v1.A.optJSONObject(v4_2) == null) {
                    v4_2 = "";
                    goto label_250;
                label_249:
                    v4_2 = "筛选";
                }

            label_250:
                v0_4 = v1.A.optJSONObject(v4_2);
                v5_1 = PqS.d("B2DCFCA1F6CEB3E4D7AEFBE9");
                goto label_254;
            }
            catch(Exception v0_2) {
                goto label_352;
            }
        }
        else {
            goto label_249;
        }

        goto label_250;
    label_254:
        v6 = "";
        try {
            String v4_3 = v1.D(v4_2, v5_1, "");
            boolean v3 = !"0".equals(v1.B("筛选")) && (v1.b.indexOf(PqS.d("2E120B29053428")) >= 0 || v1.b.indexOf(PqS.d("2E10152D173A")) >= 0 || v1.b.indexOf(PqS.d("2E080229043A")) >= 0 || v1.b.indexOf(PqS.d("2E131E35")) >= 0 || v1.D("类型", PqS.d("B2DCFCA1F6CEB0DCF7ADFEC1B2C0DCADE6CAB2D6D7"), "").length() > 1 || v0_4 != null && v0_4.length() > 0 || v4_3.length() > 1);
            v1.a = v3;
            if((arg29) && (v3)) {
                if(v4_3.startsWith(PqS.d("3D051338"))) {
                label_312:
                    InetAddress v3_1 = InetAddress.getLocalHost();
                    StringBuilder v5_2 = new StringBuilder(PqS.d("3D0513384C687A"));
                    v5_2.append(v3_1.getHostAddress());
                    v5_2.append(PqS.d("6F"));
                    v5_2.append(v1.I);
                    v5_2.append(PqS.d("7A170E241368"));
                    if(v4_3.startsWith("clan://")) {
                        v4_3 = v4_3.startsWith("clan://localhost/") ? v4_3.replace("clan://localhost/", v5_2.toString()) : v4_3.replace("clan://", v5_2.toString());
                    }

                    String v3_2 = com.github.catvod.spider.merge.h.b.h(v4_3, null, null);
                    if(v3_2 != null) {
                        v0_4 = new JSONObject(v3_2);
                    }
                }
                else {
                    if(v4_3.startsWith(PqS.d("361D0626"))) {
                        goto label_312;
                    }

                    if(v0_4 == null || (v4_3.equals(PqS.d("300913")))) {
                        v0_4 = this.q();
                    }
                }

                if(v0_4 != null) {
                    v2.put(PqS.d("33180B3C133526"), v0_4);
                }
            }

            return v2.toString();
        }
        catch(Exception v0_2) {
        }

        try {
        label_352:
            if(v1.l) {
                Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F8FC6C1A2DAE780E5EDAED5F882CFCCAEC1E888F4EC") + v0_2.toString());
            }

            SpiderApi v3_3 = v1.H;
            if(v3_3 != null) {
                v3_3.log(PqS.d("BDFFD0ADF9D1B2DCFCA1F6CEBCE5FEA0D9E8BACDE6655B79") + v0_2.toString());
            }

            return v2.toString();
        }
        catch(Exception v0) {
        }

    label_384:
        if(v1.l) {
            Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F0F271B22161E093C13292194E0F29FD3CC9EDBD2") + v0.toString());
        }

        SpiderApi v2_1 = v1.H;
        if(v2_1 != null) {
            b.a(v0, d.b(PqS.d("3D1E0A2D35283B050226026F7C98F3D19EE8FA9EDBC95B6A6B")), v2_1);
        }

        return v6;
    }

    public String homeVideoContent() {
        String v0_3;
        String v0_2;
        try {
            String v5 = this.F("首页", "热门", "homeContent", "shouye", "40");
            boolean v6 = v5.equals("1");
            if((v6) || (v5.equals("首页"))) {
                v5 = "40";
            }

            int v6_1 = this.D("列表分类", "fenlei", "").length();
            String v1 = v6_1 < 3 ? this.c + "#" : this.D("列表分类", "fenlei", "") + "#";
            this.e = 40;
            int v2 = v5.indexOf("$");
            if(v2 >= 0) {
                this.e = Integer.parseInt(v5.split("\\$")[1]);
                String v0_1 = v5.split("\\$")[0];
                if(v0_1.equals("首页")) {
                    goto label_84;
                }

                v0_2 = ".*" + v0_1 + "\\$(.*?)#.*";
                goto label_92;
            }
            else {
                if(v5.matches("\\d+")) {
                    this.e = Integer.parseInt(v5);
                label_84:
                    v0_3 = "";
                    goto label_93;
                }

                v0_2 = ".*" + v5 + "\\$(.*?)#.*";
            label_92:
                v0_3 = v1.replaceAll(v0_2, "$1");
            }

        label_93:
            if(this.e > 0) {
                this.d = true;
                this.q = "首页";
                JSONObject v0_4 = this.e(v0_3, "1", false, new HashMap());
                this.q = "";
                this.d = false;
                return v0_4 == null ? "" : v0_4.toString();
            }
        }
        catch(Exception v0) {
            if(this.l) {
                Init.show(this.F + "调试->获取首页资源出错：" + v0.toString());
            }

            SpiderApi v1_1 = this.H;
            if(v1_1 != null) {
                b.a(v0, d.b("获取首页资源错误！-->"), v1_1);
                return "";
            }
        }

        return "";
    }

    final String i(String arg7) {
        if(!arg7.isEmpty()) {
            String[] v1 = new String[14];
            int v2 = 0;
            v1[0] = "\\";
            v1[1] = "$";
            v1[2] = "(";
            v1[3] = ")";
            v1[4] = "*";
            v1[5] = "+";
            v1[6] = ".";
            v1[7] = "[";
            v1[8] = "]";
            v1[9] = "?";
            v1[10] = "^";
            v1[11] = "{";
            v1[12] = "}";
            v1[13] = "|";
            while(v2 < 14) {
                String v4 = v1[v2];
                if(arg7.indexOf(v4) >= 0) {
                    arg7 = arg7.replace(v4, "\\" + v4);
                }

                ++v2;
            }
        }

        return arg7;
    }

    public void init(Context arg1) {
        super.init(arg1);
    }

    public void init(Context arg10, String arg11) {
        this.B = arg10;
        super.init(arg10, arg11);
        if(arg11 != null) {
            try {
                if(arg11.startsWith("http")) {
                    if(arg11.indexOf("{cateId}") < 0) {
                        this.A = new JSONObject(com.github.catvod.spider.merge.h.b.h(arg11, null, null));
                    }
                    else {
                        JSONObject v10_1 = new JSONObject();
                        this.A = v10_1;
                        v10_1.put("分类url", arg11);
                    }
                }
                else if(arg11.startsWith("{")) {
                    this.A = new JSONObject(arg11);
                }
                else {
                    this.A = new JSONObject();
                    String v10_2 = arg11.replace("\\,", "逗号");
                    int v11 = v10_2.indexOf(",");
                    if(v11 < 0) {
                        this.A.put(v10_2.substring(0, v10_2.indexOf(":")), v10_2.substring(v10_2.indexOf(":") + 1).replace("逗号", ","));
                    }
                    else {
                        String[] v10_3 = v10_2.split(",");
                        int v4;
                        for(v4 = 0; v4 < v10_3.length; ++v4) {
                            this.A.put(v10_3[v4].substring(0, v10_3[v4].indexOf(":")), v10_3[v4].substring(v10_3[v4].indexOf(":") + 1).replace("逗号", ","));
                        }
                    }
                }

                this.M();
                return;
            }
            catch(JSONException v10) {
                if(this.l) {
                    Init.show("请检配置ext");
                }

                SpiderApi v11_1 = this.H;
                if(v11_1 != null) {
                    StringBuilder v0 = d.b("请检配置ext-->");
                    v0.append(v10.toString());
                    v11_1.log(v0.toString());
                    return;
                }
            }
        }
    }

    public void initApi(SpiderApi arg3) {
        this.H = arg3;
        super.initApi(arg3);
        String v0 = arg3.getPort();
        this.I = v0;
        Init.e = v0;
        StringBuilder v0_1 = d.b("Id版端口：");
        v0_1.append(this.I);
        arg3.log(v0_1.toString());
    }

    public boolean isVideoFormat(String arg7) {
        String v7 = arg7.toLowerCase();
        if(!v7.startsWith("http") && !v7.startsWith("magnet")) {
            return 0;
        }

        String v0 = this.D("嗅探词", "VideoFormat", PqS.d("3842127055693801536B5821390744661B37665249254226761C062F1822214B442D12753E4B442E02376F521320032931141572553720020F725533231308305B3F324B"));
        String v2 = PqS.d("76");
        String[] v0_1 = v0.split(v2);
        String[] v2_1 = this.D(PqS.d("BDCEE0AECDE3BDDEEA"), PqS.d("0318032D19013C1D132D04"), PqS.d("20030B751E3321014473062826055C6B582D26")).split(v2);
        int v4;
        for(v4 = 0; v4 < v0_1.length; ++v4) {
            if(v7.indexOf(v0_1[v4]) >= 0) {
                int v3;
                for(v3 = 0; v3 < v2_1.length; ++v3) {
                    if(v7.indexOf(v2_1[v3]) >= 0) {
                        return 0;
                    }
                }

                return 1;
            }
        }

        return 0;
    }

    protected final String j(String arg14) {
        String v2_3;
        String v4_2;
        String v0 = n.a(PqS.d("765244"), arg14);
        String v14 = this.K(arg14);
        if(v14.indexOf(PqS.d("6E01083B02")) >= 0) {
            return this.k(v14);
        }

        boolean v1 = v14.startsWith(PqS.d("2D01"));
        String v2 = PqS.d("7140");
        if(v1) {
            v14 = v14.replaceAll(PqS.d("2D014F200233255F4D61"), v2);
        }

        String v3 = this.r;
        int v4 = v3.indexOf(PqS.d("32"));
        String v5 = PqS.d("002521654E");
        String v4_1 = v4 < 0 ? this.E(PqS.d("B2CDF1AFD6C6"), PqS.d("B2CCF6A1D7F2B2CDF1AFD6C6B3D1DBADCAC8"), PqS.d("161E032118200A17083A1B2621"), v5) : PqS.d("12332C");
        String v6 = "";
        if(v5.equals(v4_1)) {
            v4_2 = "";
        }
        else {
            SpiderApi v5_1 = this.H;
            if(v5_1 != null) {
                v5_1.log(PqS.d("B2CDF1AFD6C6785C5968") + v4_1);
            }

            v4_2 = this.h(v14);
        }

        HashMap v5_2 = new HashMap();
        int v8 = 1;
        if(v4_2.length() < 1) {
            if(this.r.indexOf(PqS.d("1F")) >= 0 && v14.indexOf(PqS.d("3A04132D040F013C2B")) < 0 && v14.indexOf(PqS.d("3C1F092D040F013C2B")) < 0 && this.H != null) {
                String v4_3 = this.r.indexOf(PqS.d("1F13")) < 0 ? PqS.d("6F15082B032A301F1366122836040A2D1833101D02251329215F083D0222273933053A") : PqS.d("6F15082B032A301F1366142831084921182930032F1C3B0B");
                String v2_1 = v3.matches(PqS.d("7B5B2D2A491B315A4962")) ? v3.replaceAll(PqS.d("7B5B2D2A496F09154C61586D"), v2) : "";
                String v2_2 = this.H.getAddress(true) + PqS.d("221405381735261448") + v14 + PqS.d("694D023E172B") + v2_1 + v4_3;
                SpiderApi v3_1 = this.H;
                if(v3_1 != null) {
                    v3_1.log(PqS.d("B3DCC4ADEAEFB1CCD8AFE2EFB1CAC4AFE6C1321413655B7975") + v2_2);
                }

                v2_3 = this.H.webParse(v2_2, "");
            }
            else {
                v2_3 = com.github.catvod.spider.merge.h.b.h(v14, PqS.d("B3E1FBAFC2E5").equals(this.q) ? this.I(v14) : this.r(v14), v5_2);
            }

            v4_2 = v2_3;
            if(v4_2 == null) {
                v4_2 = "";
            }
        }

        this.T(v5_2);
        String v2_4 = XBPQ.V(this.P(v14, v4_2));
        String v3_2 = this.z;
        String v4_4 = PqS.d("65");
        boolean v3_3 = v4_4.equals(v3_2);
        String v5_3 = PqS.d("B1CBDDAEEAFDBCDBEBA0D9C6");
        String v7 = PqS.d("B3CAF6ADFCEFBCDBEBA0D9C6");
        String v9 = PqS.d("BCDBEBA0D9C6");
        String v10 = PqS.d("BDCFF4ADF3E2BCDBEBA0D9C6B2D1E6");
        String v11 = PqS.d("B0DFEEADF3EFBCDBEBA0D9C6");
        if((v3_3) || this.r.indexOf(PqS.d("2C")) < 0 && this.r.indexOf(PqS.d("0C")) < 0 && this.B(v9).length() <= 0 || v2_4.indexOf(v11) < 0 && v2_4.indexOf(v10) < 0 && v2_4.indexOf(v7) < 0 && v2_4.indexOf(v5_3) < 0) {
            v8 = 0;
        }

        if(v8 != 0) {
            SpiderApi v3_4 = this.H;
            if(v3_4 != null) {
                v3_4.log(PqS.d("B0CDDEAFDCD0BCDBEBA0D9C6BACDEBAECCD7B2D1E6ACCEFD785C5968") + v2_4);
            }

            String v14_1 = n.a(v14, v0);
            String v0_1 = this.B(v9);
            v2_4 = this.d0(PqS.d("3314132B1E"), v14_1, v2_4, v0_1);
            if(v2_4.indexOf(v11) < 0 || v2_4.indexOf(v10) < 0 || v2_4.indexOf(v7) < 0 || v2_4.indexOf(v5_3) < 0) {
                Init.show(PqS.d("BCDBEBA0D9C6B3F9F7ADFCD8BACDE6"));
                this.z = v4_4;
            }
        }

        if(v2_4 != null) {
            if(v1) {
                v6 = v2_4;
            }
            else {
                String v14_2 = PqS.d("75");
                String v0_2 = PqS.d("B2D8DDAFDFFDB2D8DD");
                v6 = v2_4.replace(v14_2, v0_2).replaceAll(PqS.d("09024C"), "").replace(v0_2, v14_2).trim();
            }
        }

        this.w = v6;
        return v6;
    }

    protected final String k(String arg18) {
        String[] v18;
        String v0_3;
        String v5_2;
        XBPQ v1 = this;
        String v3 = n.a(PqS.d("765244"), arg18);
        String v0 = this.K(arg18);
        boolean v2 = v0.startsWith(PqS.d("2D01"));
        String v4 = PqS.d("7140");
        if(v2) {
            v0 = v0.replaceAll(PqS.d("2D014F200233255F4D61"), v4);
        }

        int v5 = v1.r.indexOf(PqS.d("32"));
        String v6 = PqS.d("002521654E");
        String v5_1 = v5 < 0 ? v1.E(PqS.d("B2CDF1AFD6C6"), PqS.d("B2CCF6A1D7F2B2CDF1AFD6C6B3D1DBADCAC8"), PqS.d("161E032118200A17083A1B2621"), v6) : PqS.d("12332C");
        String v7 = "";
        if(v6.equals(v5_1)) {
            v5_2 = "";
        }
        else {
            SpiderApi v6_1 = v1.H;
            if(v6_1 != null) {
                v6_1.log(PqS.d("B2CDF1AFD6C6785C5968") + v5_1);
            }

            v5_2 = v1.h(v0);
        }

        int v8 = 0;
        if(v5_2.length() < 1) {
            String v5_3 = v0.split(PqS.d("6E01083B027C"))[1].trim();
            String v6_2 = v0.split(PqS.d("6E"))[0];
            String v0_1 = v1.r;
            if(v0_1.indexOf(PqS.d("1F")) >= 0 && v6_2.indexOf(PqS.d("3A04132D040F013C2B")) < 0 && v6_2.indexOf(PqS.d("3C1F092D040F013C2B")) < 0 && v1.H != null) {
                String v10 = v1.r.indexOf(PqS.d("1F13")) < 0 ? PqS.d("6F15082B032A301F1366122836040A2D1833101D02251329215F083D0222273933053A") : PqS.d("6F15082B032A301F1366142831084921182930032F1C3B0B");
                String v0_2 = v0_1.matches(PqS.d("7B5B2D2A491B315A4962")) ? v0_1.replaceAll(PqS.d("7B5B2D2A496F09154C61586D"), v4) : "";
                v0_3 = v1.H.getAddress(true) + PqS.d("221405381735261448") + v6_2 + PqS.d("694D023E172B") + v0_2 + v10;
                SpiderApi v4_1 = v1.H;
                if(v4_1 != null) {
                    v4_1.log(PqS.d("B3DCC4ADEAEF251E143C92FCF696F7CE5B6A6B51") + v0_3);
                }

                SpiderApi v4_2 = v1.H;
                if(v4_2 != null) {
                    v4_2.log(PqS.d("251E143C342831084A654867") + v5_3);
                }
            }
            else {
                v0_3 = v6_2;
            }

            HashMap v4_3 = PqS.d("B3E1FBAFC2E5").equals(v1.q) ? v1.I(v6_2) : v1.r(v6_2);
            XBPQ.6 v10_1 = new XBPQ.6();
            SpiderApi v11 = v1.H;
            if(v11 != null) {
                v11.log(PqS.d("B0FEF6ADF1FD251E143C9EE8E297D6CA58697B"));
            }

            if(v5_3.isEmpty()) {
                g.e(g.b(), v0_3, null, v4_3, v10_1);
            }
            else if((v5_3.startsWith(PqS.d("2E"))) && (v5_3.endsWith(PqS.d("28")))) {
                try {
                    JSONObject v9 = new JSONObject(v5_3);
                    g.f(g.b(), v0_3, v9.toString(), v4_3, v10_1);
                }
                catch(JSONException v0_4) {
                    if(v1.l) {
                        Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F012D02243D21083B02A2D2CB8EDCEFA8E9EB") + v0_4.toString());
                    }

                    SpiderApi v4_4 = v1.H;
                    if(v4_4 != null) {
                        StringBuilder v5_4 = d.b(PqS.d("3314132B1E173A0213605FAEC1E88FE7D96A784F"));
                        v5_4.append(v0_4.toString());
                        v4_4.log(v5_4.toString());
                    }
                }
            }
            else {
                LinkedHashMap v11_1 = new LinkedHashMap();
                String[] v5_5 = v5_3.split(PqS.d("0957"));
                int v12 = v5_5.length;
                int v13 = 0;
                while(v13 < v12) {
                    String v14 = v5_5[v13];
                    String v15 = PqS.d("68");
                    if(v14.endsWith(v15)) {
                        v18 = v5_5;
                    }
                    else {
                        int v15_1 = v14.indexOf(v15);
                        v18 = v5_5;
                        v11_1.put(v14.substring(0, v15_1), v14.substring(v15_1 + 1));
                    }

                    ++v13;
                    v5_5 = v18;
                }

                g.e(g.b(), v0_3, v11_1, v4_3, v10_1);
            }

            v5_2 = (String)v10_1.getResult();
            v0 = v6_2;
        }

        if(v5_2 == null) {
            v5_2 = "";
        }

        String v4_5 = XBPQ.V(v1.P(v0, v5_2));
        String v5_6 = v1.z;
        String v6_3 = PqS.d("65");
        boolean v5_7 = v6_3.equals(v5_6);
        String v9_1 = PqS.d("B1CBDDAEEAFDBCDBEBA0D9C6");
        String v10_2 = PqS.d("B3CAF6ADFCEFBCDBEBA0D9C6");
        String v11_2 = PqS.d("BCDBEBA0D9C6");
        String v12_1 = PqS.d("BDCFF4ADF3E2BCDBEBA0D9C6B2D1E6");
        String v13_1 = PqS.d("B0DFEEADF3EFBCDBEBA0D9C6");
        if(!v5_7 && (v1.r.indexOf(PqS.d("2C")) >= 0 || v1.r.indexOf(PqS.d("0C")) >= 0 || v1.B(v11_2).length() > 0) && (v4_5.indexOf(v13_1) >= 0 || v4_5.indexOf(v12_1) >= 0 || v4_5.indexOf(v10_2) >= 0 || v4_5.indexOf(v9_1) >= 0)) {
            v8 = 1;
        }

        if(v8 != 0) {
            SpiderApi v5_8 = v1.H;
            if(v5_8 != null) {
                v5_8.log(PqS.d("BCEDE7A0D0C6BCDBEBA0D9C6BACDEBAECCD7B2D1E6ACCEFD785C5968") + v4_5);
            }

            String v0_5 = n.a(v0, v3);
            String v3_1 = v1.B(v11_2);
            v4_5 = v1.d0(PqS.d("3314132B1E173A0213"), v0_5, v4_5, v3_1);
            if(v4_5.indexOf(v13_1) < 0 || v4_5.indexOf(v12_1) < 0 || v4_5.indexOf(v10_2) < 0 || v4_5.indexOf(v9_1) < 0) {
                Init.show(PqS.d("BCDBEBA0D9C6B3F9F7ADFCD8BACDE6"));
                v1.z = v6_3;
            }
        }

        if(v4_5 != null) {
            if(v2) {
                v7 = v4_5;
            }
            else {
                String v0_6 = PqS.d("75");
                String v2_1 = PqS.d("B2D8DDAFDFFDB2D8DD");
                v7 = v4_5.replace(v0_6, v2_1).replaceAll(PqS.d("09024C"), "").replace(v2_1, v0_6).trim();
            }
        }

        v1.w = v7;
        return v7;
    }

    private String l() {
        String v6_2;
        String v0_5;
        List v19_1;
        String v14;
        String v0_4;
        String v21_1;
        String v11_1;
        String v8_4;
        int v5_3;
        List v4_5;
        String v6;
        String v8_2;
        com.github.catvod.spider.merge.f0.a v4_4;
        StringBuilder v7;
        String v2;
        String v0_2;
        String v19;
        String v18 = "分类";
        String v9 = null;
        XBPQ v1 = this;
        if(v1.c.length() < 3) {
            String v16 = "/";
            String v10 = v1.B("分类");
            try {
                int v18_1 = v10.indexOf("$");
            }
            catch(Exception v0) {
                goto label_557;
            }

            if(v18_1 >= 0) {
                v9 = "\\s";
                v18 = "分类";
            }
            else {
                v18 = "分类";
                try {
                    v19 = "http";
                    int v11 = v1.B("分类数组").indexOf("&&");
                }
                catch(Exception v0) {
                    goto label_557;
                }

                String v20 = "/@href";
                String v0_1 = "分类标题";
                String v21 = "直播";
                String v22 = "\\s";
                if(v11 >= 0) {
                    try {
                        if(!v1.B("分类数组").startsWith("//")) {
                            String v4 = v1.j(v1.B("主页url"));
                            String v5 = v1.B("分类二次截取").isEmpty() ? v4 : ((String)v1.Y(v4, v1.B("分类二次截取"), "").get(0));
                            if(!v5.isEmpty()) {
                                v4 = v5;
                            }

                            ArrayList v4_1 = v1.Y(v4, v1.B("分类数组"), "");
                            StringBuilder v5_1 = new StringBuilder();
                            int v8;
                            for(v8 = 0; v8 < v4_1.size(); ++v8) {
                                if(!((String)v4_1.get(v8)).equals("不要")) {
                                    String v9_1 = ((String)v1.Y(((String)v4_1.get(v8)) + "</a>", v1.B("分类标题"), ">&&</a>").get(0)).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
                                    String v10_1 = (String)v1.Y(((String)v4_1.get(v8)), v1.B("分类ID"), "href=\"&&\"").get(0);
                                    if(!v9_1.equals("不要") && !v9_1.isEmpty() && !v10_1.isEmpty()) {
                                        v5_1.append(v9_1);
                                        v5_1.append("$");
                                        v5_1.append(v10_1);
                                        v5_1.append("#");
                                    }
                                }
                            }

                            v0_2 = v5_1.toString();
                            v2 = v5_1.toString();
                            goto label_173;
                        }

                    label_149:
                        v7 = new StringBuilder();
                        if(!v1.B("cateManual").isEmpty()) {
                            JSONObject v8_1 = v1.A.optJSONObject("cateManual");
                            if(v8_1 == null) {
                                goto label_180;
                            }

                            Iterator v0_3 = v8_1.keys();
                            while(v0_3.hasNext()) {
                                Object v4_2 = v0_3.next();
                                String v4_3 = (String)v4_2;
                                v7.append(v4_3.trim());
                                v7.append("$");
                                v7.append(v8_1.getString(v4_3).trim());
                                v7.append("#");
                            }

                            v0_2 = v7.toString();
                            v2 = v7.toString();
                        label_173:
                            int v2_1 = v2.length();
                            v10 = v0_2.substring(0, v2_1 - 1);
                            v9 = "\\s";
                            goto label_581;
                        }

                    label_180:
                        v4_4 = v1.g0(v1.B("主页url"));
                        if(v10.length() < 1 && (v1.B("分类数组").startsWith("//"))) {
                            v10 = v1.B("分类数组");
                        }

                        v8_2 = "ul";
                        v9 = "a";
                        if(v10.length() < 1) {
                            v6 = "";
                            v10 = "萝莉";
                        }
                        else {
                            goto label_201;
                        }

                        goto label_236;
                    }
                    catch(Exception v0) {
                        goto label_557;
                    }
                }
                else {
                    goto label_149;
                    v10 = "萝莉";
                    goto label_236;
                    try {
                    label_201:
                        if(!v10.startsWith("//") && v10.indexOf("\\.") >= 0) {
                            if(v10.split("\\.")[0].indexOf("[") >= 0) {
                                v8_2 = v10.split("\\.")[0].split("\\[")[0];
                                v6 = "[" + v10.split("\\.")[0].split("\\[")[1];
                            }
                            else {
                                v8_2 = v10.split("\\.")[0];
                                v6 = "";
                            }

                            v9 = v10.split("\\.")[1];
                            v10 = "萝莉";
                        }
                        else {
                            goto label_235;
                        }

                        goto label_236;
                    }
                    catch(Exception v0) {
                        goto label_557;
                    }

                    v10 = "萝莉";
                    goto label_236;
                label_235:
                    v6 = "";
                    try {
                    label_236:
                        String v5_2 = v10.startsWith("//") ? v10 : "//" + v8_2 + "[(contains(//text(),\'" + v10 + PqS.d("725847270467361E093C172E3B024F675933300913605F6B7299D8D691FCF894EEEF516E751E156815283B05062118347D5E4808022E211D026451AED5D280F2FAA2DFF6406156282751042718333418093B5E687A050230026F7C5D40AFE2F2BDD6E1ADFFE0725847270467361E093C172E3B024F67590721181324136B7298FCF39EE1C394EDCF516E751E156815283B05062118347D5E483C133F21594E6451A2DCD68ED3F0607C51083A56243A1F13291F292659486736333C050B2D5A60B0FBE0A1EDC1725847270467361E093C172E3B024F675933300913605F6B7296F3FD93FAE4564E6819357512082602263C1F1460596815050E3C1A2279568ED3CDA2E8C0406156282751042718333418093B5E687A050230026F7C5D40AEE1E7B2D1E66F5F673A03472B192921100E26056F7A5E273C1F3339144B6F90D0F596C7C9516E751E156815283B05062118347D5E483C133F21594E6451A0D1D080EACA607C51083A56243A1F13291F292659486736333C050B2D5A60B2F5C6AFD4FB725847270467361E093C172E3B024F675933300913605F6B7294FCF592FDF2564E6819357512082602263C1F1460596815050E3C1A22795682D4FDA0C1D3406156282751042718333418093B5E687A050230026F7C5D40ACCCDDB3C5D56F5F673A03472B192921100E26056F7A5E273C1F3339144B6F92FDCF97D3FA516E751E156815283B05062118347D5E483C133F21594E6451A3EFEF81FCC4607C51083A56243A1F13291F292659486736333C050B2D5A60B1CBF9AEC2F572584E68172931510927026F361E093C172E3B024F675907311013295B28271800211826395D4067516E751E156815283B05062118347D5E4808122621104A3B04247956486F5F673A03472B192921100E26056F7A5E273B04247956486F5F673A03472B192921100E26056F7A5E272A17243E1615270329315D4067516E7C2C") + v6 + "//" + v9 + PqS.d("0E1F083C5E243A1F13291F292659486702222D054F615A60BCD0D26F5F673A03472B192921100E26056F7A5E132D0E337D584B6F9EE9FA564E6819357512082602263C1F1460596821141F3C5E6E795681DEC6607C51083A56243A1F13291F292659486702222D054F615A60BDCEDAADFFE0725847270467361E093C172E3B024F675933300913605F6B7296E4E590D7C9564E6819357512082602263C1F1460596821141F3C5E6E795681EEEAA2D8E4406156282751042718333418093B5E687A050230026F7C5D40ACCADDB0E0FF6F5F673A03472B192921100E26056F7A5E132D0E337D584B6F90C9C799C6C4516E751E156815283B05062118347D5E483C133F21594E6451A0C0E88FE0F6607C51083A56243A1F13291F292659486702222D054F615A60B2D6E6ACCCFD725847270467361E093C172E3B024F675933300913605F6B7294DAF99FDEF7564E6819357512082602263C1F1460596821141F3C5E6E795680F5E7607C51083A56243A1F13291F292659486702222D054F615A60B0CCD6A0D1C1725847270467361E093C172E3B024F675933300913605F6B7299E6DC91F4EE564E6819357512082602263C1F1460596821141F3C5E6E795683F0E5AEF7E9406156282751042718333418093B5E687A050230026F7C5D40AEEEC9B3E9F86F5F673A03472B192921100E26056F7A5E132D0E337D584B6F9EE0C799EEFA516E751E156815283B05062118347D5E483C133F21594E6451A2CECF406156282751042718333418093B5E687A050230026F7C5D40A0FCC5B2EAC96F5F673A03472B192921100E26056F7A5E132D0E337D584B6F9FD8FC94CFF9516E751E156815283B05062118347D5E483C133F21594E6451A1E9E582D9EE607C51083A56243A1F13291F292659486702222D054F615A60B3E7E0AFDDE7725847270467361E093C172E3B024F675933300913605F6B7294E2FE92FCC3564E6819357512082602263C1F1460596821141F3C5E6E79568ED7C5A3ECE1406156282751042718333418093B5E687A050230026F7C5D40AEF8EFBDFCF76F5F673A03472B192921100E26056F7A5E132D0E337D584B6F371705564E6819357512082602263C1F1460596821141F3C5E6E795683F0FDAFE8CC40615F1A");
                        v4_5 = v4_4.a(v5_2);
                        v5_3 = 0;
                        while(true) {
                        label_260:
                            LinkedList v6_1 = (LinkedList)v4_5;
                            if(v5_3 >= v6_1.size()) {
                                goto label_531;
                            }

                            String v8_3 = ((com.github.catvod.spider.merge.f0.b)v6_1.get(v5_3)).c(v1.D(v0_1, PqS.d("3610132D38263814"), PqS.d("7A5E132D0E337D58"))).a();
                            v9 = v22;
                            v8_4 = v8_3.replaceAll(v9, "").trim();
                            if(v8_4.length() < 2) {
                                v8_4 = ((com.github.catvod.spider.merge.f0.b)v6_1.get(v5_3)).c(PqS.d("7A311321022B30")).a().trim();
                            }

                            if(v8_4.length() <= 9 && v8_4.length() >= 2 && v7.toString().indexOf(v8_4) < 0) {
                                v11_1 = v21;
                                if(v8_4.indexOf(v11_1) >= 0 && v10.indexOf(v11_1) < 0 || v1.r.indexOf(PqS.d("74")) >= 0 && (v8_4.indexOf(PqS.d("B2E1E1")) >= 0 || v8_4.indexOf(PqS.d("B2D7E8")) >= 0 || v8_4.indexOf(PqS.d("B2CFE9ADD3F4")) >= 0)) {
                                    v21_1 = v0_1;
                                    v0_4 = v16;
                                    v14 = v19;
                                    v19_1 = v4_5;
                                    goto label_523;
                                }

                                v21_1 = v0_1;
                                v0_5 = v20;
                                String v12 = v1.E("分类ID", PqS.d("B0F9E1AFC7FCBCE2D9AEF8E2"), PqS.d("3610132D3F23"), v0_5);
                                v14 = v19;
                                if(v12.startsWith(v14)) {
                                    v12 = v0_5;
                                }

                                v6_2 = ((com.github.catvod.spider.merge.f0.b)v6_1.get(v5_3)).c(v12).a().trim();
                                int v12_1 = v6_2.indexOf(PqS.d("2614063A152F"));
                                break;
                            }
                            else {
                                goto label_516;
                            }

                            goto label_523;
                        }
                    }
                    catch(Exception v0) {
                        goto label_557;
                    }

                    v20 = v0_5;
                    String v0_6 = PqS.d("26");
                    v19_1 = v4_5;
                    String v4_6 = PqS.d("2641");
                    if(v12_1 < 0) {
                        goto label_368;
                    }

                    try {
                        if(v7.toString().indexOf(PqS.d("B0F8C0")) < 0 && v7.toString().indexOf(PqS.d("B0FBE0")) < 0 || v1.r.indexOf(v4_6) < 0 && v1.r.indexOf(v0_6) >= 0) {
                            v7.append(v8_4);
                            v7.append("$");
                            v7.append(v8_4);
                            v7.append("#");
                            goto label_521;
                        label_368:
                            if(v1.r.indexOf(v4_6) < 0 && v1.r.indexOf(v0_6) >= 0) {
                                goto label_521;
                            }

                            if(v6_2.startsWith(v14)) {
                                v6_2 = v6_2.replace(v1.f, "");
                            }

                            if(v6_2.length() < 2) {
                                goto label_521;
                            }

                            v0_4 = v16;
                            if(v6_2.indexOf(v0_4) >= 0 && v6_2.indexOf(PqS.d("311413291F2B")) < 0 && v6_2.indexOf(PqS.d("111413291F2B")) < 0 && v6_2.indexOf(PqS.d("2619083F")) < 0 && v6_2.indexOf(PqS.d("251D0631")) < 0) {
                                String v4_7 = v6_2.matches(PqS.d("7A5F4D772D6A0A0F48152A237E2A4A170868082A56782B697F")) ? v6_2.replaceAll(PqS.d("7A5F4D772D68782E19672B6F09154C612D1C782E19672B1A0E405715586D"), PqS.d("7140")) : v6_2;
                                if(v4_7 == null || !v4_7.matches(PqS.d("09154C"))) {
                                    if(v6_2.matches(PqS.d("7B5B0E2C2D6A0A0F48752B697F"))) {
                                        v6_2 = v0_4 + v6_2.split(PqS.d("3C153C6529397A4C3A"))[1];
                                    }

                                    if(v6_2.endsWith(PqS.d("7B1913251A"))) {
                                        v6_2 = v6_2.substring(0, v6_2.length() - 5);
                                    }

                                    if(v6_2.endsWith(PqS.d("1E"))) {
                                        v6_2 = v6_2.substring(0, v6_2.length() - 1);
                                    }

                                    if(v6_2.endsWith(PqS.d("7A40482118233009"))) {
                                        v6_2 = v6_2.substring(0, v6_2.length() - 6);
                                    }

                                    if(v6_2.endsWith(PqS.d("7A18092C133F"))) {
                                        v6_2 = v6_2.substring(0, v6_2.length() - 6);
                                    }

                                    if(v6_2.endsWith(PqS.d("7840"))) {
                                        v6_2 = v6_2.substring(0, v6_2.length() - 2);
                                    }

                                    if(v6_2.endsWith(PqS.d("2B40"))) {
                                        v6_2 = v6_2.substring(0, v6_2.length() - 2);
                                    }

                                    if(!v6_2.startsWith(v14)) {
                                        v6_2 = v6_2.substring(v6_2.lastIndexOf(v0_4) + 1, v6_2.length());
                                    }

                                    v4_7 = v6_2.replace(PqS.d("3C1F032D0E"), "").replace(PqS.d("785C4A655B6A785C4A655B"), "");
                                    if(v4_7.startsWith(PqS.d("385C"))) {
                                        v4_7 = v4_7.substring(2, v4_7.length());
                                    }

                                    if(v4_7.length() < 1 || v4_7.length() > 21 || (v4_7.startsWith(v14))) {
                                        goto label_523;
                                    }

                                    if(v7.toString().indexOf(v4_7) < 0) {
                                        goto label_511;
                                    }
                                }
                                else {
                                label_511:
                                    v7.append(v8_4);
                                    v7.append("$");
                                    v7.append(v4_7);
                                    v7.append("#");
                                    goto label_523;
                                label_516:
                                    v14 = v19;
                                    v11_1 = v21;
                                    v21_1 = v0_1;
                                    v19_1 = v4_5;
                                    goto label_521;
                                }
                            }
                        }
                        else {
                        label_521:
                            v0_4 = v16;
                        }

                    label_523:
                        ++v5_3;
                        v16 = v0_4;
                        v22 = v9;
                        v4_5 = v19_1;
                        v0_1 = v21_1;
                        v21 = v11_1;
                        v19 = v14;
                        goto label_260;
                    label_531:
                        v9 = v22;
                        if(v7.toString().length() < 6) {
                            v10 = "电影$1#连续剧$2#综艺$3#动漫$4";
                        }
                        else {
                            goto label_539;
                        }

                        goto label_581;
                    }
                    catch(Exception v0) {
                        goto label_557;
                    }

                    v10 = "电影$1#连续剧$2#综艺$3#动漫$4";
                    goto label_581;
                    try {
                    label_539:
                        v10 = v7.toString().substring(0, v7.toString().length() - 1);
                    }
                    catch(Exception v0) {
                    label_557:
                        if(v1.l) {
                            Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F043A1326211424290222B0F6DDA1E2DEBACDFD") + v0.toString());
                        }

                        SpiderApi v2_2 = v1.H;
                        if(v2_2 == null) {
                            v10 = "电影$1#连续剧$2#综艺$3#动漫$4";
                        }
                        else {
                            b.a(v0, d.b(PqS.d("3603022902221610132D5E6EBCE5FEA0D9E8785C59")), v2_2);
                            v10 = "电影$1#连续剧$2#综艺$3#动漫$4";
                        }
                    }
                }
            }

        label_581:
            v1.c = v10.replace(PqS.d("BCEADCADCBF6"), PqS.d("B2E5D2ADCBF6")).replace(PqS.d("BCF1C4AFCCCBB0FBE0"), PqS.d("BDCEF9AFCDEAB0F8C0")).replace(PqS.d("BCEADCA0D0D1B0FBE0"), PqS.d("B2E5D2A0D1C1B0F8C0")).replace(PqS.d("B0FBE0A1EDC1"), PqS.d("B0F8C0A1EDC1")).replace(PqS.d("B0FAF2AECAEC"), PqS.d("B0FBCFAECAEC")).replace(PqS.d("B2C7FBA0E1DA"), PqS.d("B2CADBA0FFFD")).replaceAll(v9, "");
            if(v1.H != null && v1.B(v18).length() < 1) {
                SpiderApi v0_7 = v1.H;
                StringBuilder v2_3 = d.b(PqS.d("BDF6CDADFCEFBDFFD0ADF9D1B0F9E1AFC7FC785C5968"));
                v2_3.append(v1.c);
                v0_7.log(v2_3.toString());
            }
        }

        return v1.c;
    }

    public static Object[] loadPic(Map arg5) {
        try {
            String v0 = (String)arg5.get("site");
            String v5 = (String)arg5.get("pic");
            if(XBPQ.K == null) {
                HashMap v1 = new HashMap();
                XBPQ.K = v1;
                v1.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                XBPQ.K.put("referer", v0);
            }

            XBPQ.7 v0_1 = new XBPQ.7();
            g.c(g.b(), v5, XBPQ.K, v0_1);
            if(((Response)v0_1.getResult()).code() == 200) {
                String v1_1 = ((Response)v0_1.getResult()).headers().get("Content-Type");
                if(v1_1 == null) {
                    v1_1 = "application/octet-stream";
                }

                Object[] v3 = new Object[]{((int)200), v1_1, null};
                System.out.println(v5);
                System.out.println(v1_1);
                v3[2] = ((Response)v0_1.getResult()).body().byteStream();
                return v3;
            }
        }
        catch(Throwable unused_ex) {
        }

        return null;
    }

    private JSONObject m(String arg10, String arg11) {
        String v0;
        StringBuilder v11_4;
        String v11_3;
        StringBuilder v10_1;
        String v11_2;
        StringBuilder v11_1;
        try {
            if((arg11.equals("post")) || (arg11.equals("空#post#空"))) {
                arg11 = "空#" + this.f + "/index.php/ajax/verify_check?type=show&verify={code};post;#空";
            }

            String[] v1 = arg11.split("#");
            int v11 = arg11.length();
            if(v11 < 1) {
                if("搜索".equals(this.q)) {
                    v11_1 = new StringBuilder();
                    v11_1.append(this.f);
                    v11_1.append("/index.php/ajax/verify_check?type=search&verify=");
                }
                else {
                    v11_1 = new StringBuilder();
                    v11_1.append(this.f);
                    v11_1.append("/index.php/ajax/verify_check?type=show&verify=");
                }

                v11_2 = v11_1.toString();
                if(this.r.indexOf("y") >= 0) {
                    arg10 = this.f + "/index.php/verify/index.html?";
                }
            }
            else {
                if(this.r.indexOf("y") >= 0) {
                    arg10 = this.f + "/index.php/verify/index.html?";
                }

                boolean v4 = "空".equals(v1[0]);
                if(!v4) {
                    if(v1[0].startsWith("http")) {
                        arg10 = v1[0];
                    }
                    else {
                        if(v1[0].startsWith("/")) {
                            v10_1 = new StringBuilder();
                            v10_1.append(this.f);
                            v11_3 = v1[0];
                        }
                        else {
                            v10_1 = new StringBuilder();
                            v10_1.append(this.f);
                            v10_1.append("/");
                            v11_3 = v1[0];
                        }

                        v10_1.append(v11_3);
                        arg10 = v10_1.toString();
                    }
                }

                if("搜索".equals(this.q)) {
                    v11_2 = this.f + "/index.php/ajax/verify_check?type=search&verify=";
                    if("空".equals(v1[2])) {
                        goto label_173;
                    }

                    if(v1[2].startsWith("http")) {
                        v11_2 = v1[2];
                        goto label_173;
                    }

                    if(v1[2].startsWith("/")) {
                        v11_4 = new StringBuilder();
                        v11_4.append(this.f);
                        v0 = v1[2];
                    }
                    else {
                        v11_4 = new StringBuilder();
                        v11_4.append(this.f);
                        v11_4.append("/");
                        v0 = v1[2];
                    }

                    goto label_170;
                }
                else {
                    v11_2 = this.f + "/index.php/ajax/verify_check?type=show&verify=";
                    if("空".equals(v1[1])) {
                        goto label_173;
                    }

                    if(v1[1].startsWith("http")) {
                        v11_2 = v1[1];
                        goto label_173;
                    }

                    if(v1[1].startsWith("/")) {
                        v11_4 = new StringBuilder();
                        v11_4.append(this.f);
                    }
                    else {
                        v11_4 = new StringBuilder();
                        v11_4.append(this.f);
                        v11_4.append("/");
                    }

                    v0 = v1[1];
                label_170:
                    v11_4.append(v0);
                    v11_2 = v11_4.toString();
                }
            }

        label_173:
            JSONObject v0_1 = new JSONObject();
            v0_1.put("str", arg10);
            v0_1.put("codeUrl", v11_2);
            return v0_1;
        }
        catch(Exception v10) {
            SpiderApi v11_5 = this.H;
            if(v11_5 != null) {
                b.a(v10, d.b("getCodeUrl()错误-->"), v11_5);
            }

            return null;
        }
    }

    public Object[] mProxy(Map arg1) {
        return Proxy.proxy(arg1);
    }

    public boolean manualVideoCheck() {
        return !this.D(PqS.d("B0E6E2AEF8E5BDDEEA"), PqS.d("BDCEE0AECDE3BDDEEA"), "").isEmpty() || (this.C(PqS.d("B3F8ECADFCEFB0E6E2AEF8E5"), PqS.d("1810093D172B061F0E2E102227")).equals(PqS.d("64"))) || this.r.indexOf(PqS.d("2D")) >= 0;
    }

    protected final String n(String arg27) {
        String v21_1;
        String v4_1;
        String v22;
        String v0_3;
        String v10;
        String v17;
        String v9_1;
        String v19;
        XBPQ v7 = this;
        String v8 = arg27;
        String v0 = v7.y;
        String v9 = PqS.d("65");
        if(v9.equals(v0)) {
            return "";
        }

        String v11 = v7.B(PqS.d("B2E8DCADCBD2"));
        boolean v0_1 = PqS.d("B3E1FBAFC2E5").equals(v7.q);
        String v12 = PqS.d("BACDFCA7CADC");
        String v13 = PqS.d("7357");
        String v14 = PqS.d("71");
        String v15 = PqS.d("15");
        String v6 = PqS.d("76");
        String v5 = PqS.d("6E");
        if(v0_1) {
            v19 = v9;
            v17 = "";
            v9_1 = v5;
            v10 = v6;
            v0_3 = this.F(PqS.d("B3E1FBAFC2E5BDDED0AEC7C5B0D5D3"), PqS.d("B3E1FBAFC2E5BDDED0AEC7C5B0D5D3ADF9C5B3E4D7"), PqS.d("2614063A152F0A190229122227"), PqS.d("0639022912222702"), "").replace(v15, v14).replace(v13, v10).replace(v12, v9_1).trim();
            if(v0_3.length() < 1) {
                v0_3 = this.G(PqS.d("BDDED0AEC7C5B0D5D3"), PqS.d("BDDED0AEC7C5B0D5D3ADF9C5B3E4D7"), PqS.d("2010"), PqS.d("1D14062C133526"), PqS.d("0002023A3720301F13"), "").replace(v15, v14).replace(v13, v10).replace(v12, v9_1).trim();
            }
        }
        else {
            if(v7.y.length() > 1) {
                return v7.y;
            }

            if(v7.r.indexOf(PqS.d("36")) < 0 && (v11.length() > 1 || v7.r.indexOf(PqS.d("2C")) >= 0 || v7.r.indexOf(PqS.d("0C")) >= 0 || v7.r.indexOf(PqS.d("19")) >= 0 || v7.r.indexOf(PqS.d("B2F3DEADF1FC")) >= 0 || v7.B(PqS.d("BCDBEBA0D9C6")).length() > 0 || v7.B(PqS.d("B3C4E8A0D1CFB0E8CF")).length() > 0)) {
                String v0_2 = Init.d.getString(v7.F, "");
                if(v0_2.length() > 1) {
                    v7.y = v0_2;
                    return v0_2;
                }
            }

            v19 = v9;
            v9_1 = v5;
            v17 = "";
            v10 = v6;
            v0_3 = this.G(PqS.d("BDDED0AEC7C5B0D5D3"), PqS.d("BDDED0AEC7C5B0D5D3ADF9C5B3E4D7"), PqS.d("2010"), PqS.d("1D14062C133526"), PqS.d("0002023A3720301F13"), "").replace(v15, v14).replace(v13, v10).replace(v12, v9_1).trim();
        }

        HashMap v1 = new HashMap();
        String v2 = v7.J(v0_3);
        v1.put(PqS.d("0002023A5B063214093C"), v2);
        HashMap v2_1 = new HashMap();
        HashMap v3 = new HashMap();
        int v4 = v11.length();
        String v5_1 = PqS.d("68");
        String v6_1 = PqS.d("7140");
        String v20 = v12;
        String v12_1 = PqS.d("6E01083B027C");
        if(v4 > 0 && v11.indexOf(v12_1) >= 0 || v8.indexOf(v12_1) >= 0) {
            if(v11.length() > 0) {
                String v21 = v11.split(v12_1)[0];
                v22 = v13;
                v11 = v11.split(v12_1).length <= 1 ? v17 : v11.split(v12_1)[1];
                v4_1 = v21;
            }
            else {
                v22 = v13;
                if(v8.indexOf(v12_1) >= 0) {
                    v4_1 = v8.split(v12_1)[0];
                    v11 = v8.split(v12_1).length > 1 ? v8.split(v12_1)[1] : v17;
                }
                else {
                    v4_1 = v17;
                }
            }

            if(v11.length() > 0) {
                String[] v12_2 = v11.split(PqS.d("0957"));
                int v13_1 = v12_2.length;
                v21_1 = v11;
                int v11_1 = 0;
                while(v11_1 < v13_1) {
                    v2_1.put(v12_2[v11_1].split(v5_1)[0], v12_2[v11_1].split(v5_1)[1]);
                    ++v11_1;
                    v13_1 = v13_1;
                    v12_2 = v12_2;
                }
            }
            else {
                v21_1 = v11;
            }

            v1.put(PqS.d("0714012D042227"), v4_1);
            String v8_1 = PqS.d("7A");
            String v8_2 = v8 + v8_1.replaceAll(PqS.d("7B5B4F200233250258144C687A2A39672B6C7C5E4962"), v6_1) + v8_1;
            v1.put(PqS.d("1A030E2F1F29"), v8_2);
            com.github.catvod.spider.merge.h.b.d(v4_1, v2_1, v1, v3);
            v11 = v21_1;
        }
        else {
            v22 = v13;
        }

        v7.T(v3);
        StringBuilder v1_1 = new StringBuilder(v7.y);
        String v4_2 = v17;
        String v2_2 = v7.D(PqS.d("B3E3CAAEE2F9BDDED0AEC7C5B0D5D3"), PqS.d("B2EAD3AEF8E2B3E3CAAEE2F9B2EAD3A1E5F9BDD6E1A1D4D6BDDED0AEC7C5B0D5D3"), v4_2);
        String v3_1 = PqS.d("3A1E0C2113");
        if(v0_3.indexOf(v3_1) >= 0 || v2_2.indexOf(v3_1) >= 0) {
            int v8_3 = v0_3.indexOf(v3_1);
            String v12_3 = PqS.d("7B5B08271D2E302D43602D19762C4C775F647B5B");
            String v0_4 = v8_3 < 0 ? v4_2 : v0_3 + v10.replaceAll(v12_3, v6_1);
            if(v2_2.indexOf(v3_1) >= 0) {
                v0_4 = v0_4 + v9_1 + v2_2.replace(v15, v14).replace(v22, v10) + v10.replace(v20, v9_1).replaceAll(v12_3, v6_1);
            }

            String[] v0_5 = v0_4.replaceAll(PqS.d("6E5A"), v9_1).split(v9_1);
            int v2_3 = v0_5.length;
            int v3_2;
            for(v3_2 = 0; v3_2 < v2_3; ++v3_2) {
                String v6_2 = v0_5[v3_2];
                if(v1_1.indexOf(v6_2.split(v5_1)[0]) < 0) {
                    v1_1.append(v6_2);
                    v1_1.append(v9_1);
                }
            }
        }

        if(v1_1.toString().length() < 2) {
            v7.y = v19;
            return v4_2;
        }

        if(v11.length() > 1) {
            SharedPreferences.Editor v0_6 = Init.d.edit();
            String v2_4 = v1_1.toString();
            v7.y = v2_4;
            v0_6.putString(v7.F, v2_4);
            v0_6.apply();
        }

        if(PqS.d("361E08231F22").equals(v7.n)) {
            Init.show(v1_1.toString());
        }

        return v1_1.toString();
    }

    private JSONObject o(String arg11, String arg12, String arg13) {
        try {
            Request v11_1 = new Request.Builder().url(arg11).addHeader("User-Agent", this.J("")).build();
            Response v11_2 = g.b().newCall(v11_1).execute();
            String v4 = v11_2.headers().get("Set-Cookie");
            InputStream v11_3 = v11_2.body().byteStream();
            byte[] v5 = new byte[0x400];
            ByteArrayOutputStream v6 = new ByteArrayOutputStream();
            while(true) {
                int v7 = v11_3.read(v5);
                if(v7 == -1) {
                    break;
                }

                v6.write(v5, 0, v7);
            }

            String v11_4 = Base64.encodeToString(v6.toByteArray(), 0).replaceAll("\\s", "");
            String v5_1 = arg13.equals("1") ? "{\"ocr_type\":1,\"img\":\"" + v11_4 + "\",\"backgroundlmg\":\"None\"}" : "";
            if(arg13.equals("3")) {
                v5_1 = "{\"ocr_type\":3,\"img\":\"" + v11_4 + "\"}";
            }

            RequestBody v11_5 = RequestBody.create(MediaType.parse("application/json"), v5_1);
            Request v11_6 = new Request.Builder().url(arg12).post(v11_5).addHeader("User-Agent", this.J("")).build();
            JSONObject v12 = new JSONObject(g.b().newCall(v11_6).execute().body().string());
            JSONObject v11_7 = new JSONObject();
            boolean v1 = arg13.equals("1");
            if(v1) {
                v11_7.put("cookie", v4);
                v11_7.put("code", v12.getString("result"));
                return v11_7;
            }

            if(arg13.equals("3")) {
                v11_7.put("cookie", v4);
                v11_7.put("code", v12.getJSONObject("result").getString("target").replaceAll("[\\[\\]]", ""));
                return v11_7;
            }
        }
        catch(Exception v11) {
            SpiderApi v12_1 = this.H;
            if(v12_1 != null) {
                b.a(v11, d.b("getDatas()错误-->"), v12_1);
                return null;
            }
        }

        return null;
    }

    private String p(String arg3, String arg4) {
        return arg3.indexOf(arg4) >= 0 ? "#" + arg3 + "#".replaceAll(".*" + arg4 + "\\$([^#]+?)#.*", "$1") : "";
    }

    public String playerContent(String arg28, String arg29, List arg30) {
        int v0_27;
        String v7_2;
        String v19_1;
        String v8_3;
        String v4_10;
        String v0_25;
        String v4_9;
        String v4_8;
        String v21_1;
        String v6_2;
        JSONObject v2_2;
        String v8_2;
        h v0_17;
        String v0_15;
        String v4_5;
        String v29_1;
        StringBuilder v5_3;
        SpiderApi v4_3;
        int v0_9;
        String v8;
        String v15;
        String v4_1;
        String v16;
        int v0_8;
        String v0_2;
        String v3_1;
        JSONObject v6_1;
        String v10;
        String v23 = null;
        XBPQ v1 = this;
        String v2 = arg28;
        String v0 = arg29;
        String v3 = PqS.d("6A");
        String v4 = PqS.d("BDC6D4A0CBEBB3E3CAAEE2F9BCE2D9AEF8E2");
        String v5 = PqS.d("65");
        String v6 = PqS.d("B3FDE0ADD8DDB1CAC4AFE6C1");
        String v7 = PqS.d("64");
        SpiderApi v9 = v1.H;
        if(v9 != null) {
            v10 = PqS.d("251D06311335161E093C132921590124172068") + v2 + PqS.d("79510E2C4B") + v0 + PqS.d("7951112106013910003B4B") + arg30.toString() + PqS.d("7C");
            v9.log(v10);
        }

        try {
            if((v2.equals(PqS.d("6B99D1CD90FFD04D"))) || (v2.equals(PqS.d("6B432C74")))) {
                goto label_963;
            }

            if(v2.equals(PqS.d("6B94E9D791D3EE4D"))) {
                goto label_963;
            }

            v6_1 = new JSONObject();
            if((v0.startsWith(PqS.d("7A"))) && !v0.startsWith(PqS.d("7A5E"))) {
                v0 = v1.f + v0;
            }

            if((v1.s) && !v1.isVideoFormat(v0)) {
                String v9_1 = com.github.catvod.spider.merge.h.b.g(v0, v1.r(v0));
                if(v9_1.indexOf(PqS.d("B3D2E7AEC3CCB1C9CA")) >= 0 && v9_1.indexOf(PqS.d("BDC6D4A0CBEBB1C9CA")) >= 0 && v9_1.indexOf(PqS.d("3705102910")) >= 0) {
                    String v9_2 = (String)v1.Y(v9_1, PqS.d("37051029107A735745"), "").get(0);
                    StringBuilder v10_1 = new StringBuilder();
                    v10_1.append(v0);
                    if(v0.indexOf(v3) >= 0) {
                        v3 = PqS.d("73");
                    }

                    v10_1.append(v3);
                    v10_1.append(PqS.d("37051029107A"));
                    v10_1.append(v9_2);
                    v0 = v10_1.toString();
                }
            }

            v3_1 = v0;
            v0_2 = v1.n(v3_1);
            if(v1.r.indexOf(PqS.d("B2F3DEADF1FC")) >= 0) {
                boolean v9_3 = v5.equals(v1.z);
                goto label_117;
            }

            goto label_187;
        }
        catch(Exception v0_1) {
            v10 = "";
            goto label_983;
        }

    label_117:
        if(!v9_3) {
            try {
                Init.run(new com.github.catvod.spider.b(v1, v3_1, v0_2), 200);
                while(true) {
                label_122:
                    boolean v0_4 = "".equals(v1.z);
                    break;
                }
            }
            catch(Exception v0_3) {
                goto label_156;
            }

            if(!v0_4) {
                goto label_183;
            }

            long v9_4 = 500L;
            try {
                Thread.sleep(v9_4);
                goto label_122;
            }
            catch(Exception v0_5) {
            }

            Exception v9_5 = v0_5;
            try {
                if(v1.l) {
                    Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F1724173E300324271833301F13AFCCF8B2D9ECAFEBE6B2EDC7A1E2DEBACDFD") + v9_5.toString());
                }

                SpiderApi v0_6 = v1.H;
                if(v0_6 == null) {
                    goto label_122;
                }

                v0_6.log(PqS.d("251D06311335161E093C13292196DDF791EFDE96FAE991DBF598F3D19EE8FA9EDBC95B6A6B") + v9_5.toString());
                goto label_122;
            }
            catch(Exception v0_3) {
            }

            try {
            label_156:
                if(v1.l) {
                    Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F80CACFA2D2CA81DADBA1C1CF82F4CFA0FFE682CFCCAEC1E888F4EC") + v0_3.toString());
                }

                SpiderApi v9_6 = v1.H;
                if(v9_6 != null) {
                    v9_6.log(PqS.d("B2F3DEADF1FCB3E3CAAEE2F9B0CDDEAFDCD0BCE5FEA0D9E8BACDE6655B79") + v0_3.toString());
                }

            label_183:
                if(!v5.equals(v1.z)) {
                    v1.z = "";
                }

            label_187:
                boolean v0_7 = v1.E(PqS.d("B0F4EAADE1C2"), PqS.d("381004"), PqS.d("141F0624290A34123724173E3003"), v7).equals(v7);
                goto label_195;
            }
            catch(Exception v0_1) {
                v10 = "";
                goto label_983;
            }
        }

        goto label_187;
    label_195:
        String v5_1 = PqS.d("B0CDDDADFEF1BDD6C4AEE8D7");
        String v9_7 = PqS.d("3F");
        if(v0_7) {
            try {
                if(v1.r.indexOf(PqS.d("3841")) < 0 && v1.r.indexOf(v9_7) < 0 && !v1.B(v5_1).equals(v7) && v1.r.indexOf(PqS.d("2D")) < 0) {
                    v0_8 = 1;
                }
                else {
                label_218:
                    v0_8 = 0;
                }

            label_219:
                v10 = v1.D(v4, PqS.d("B3E3CAAEE2F9BCE2D9AEF8E2B1CBEBAEDAE6B3F9CDADF9D1"), "");
                String v11 = v1.B(PqS.d("B1CBEBAEDAE6BDC6D4A0CBEBB3E3CAAEE2F9BCE2D9AEF8E2"));
                String v12 = v1.B(PqS.d("B1C9EEAEDAE6BDC6D4A0CBEBB3E3CAAEE2F9BCE2D9AEF8E2"));
                String v13 = v1.B(PqS.d("B0EAFCAEDAE6BDC6D4A0CBEBB3E3CAAEE2F9BCE2D9AEF8E2"));
                String v14 = v1.B(PqS.d("B1CBF3AEDAE6BDC6D4A0CBEBB3E3CAAEE2F9BCE2D9AEF8E2"));
                v16 = v4;
                v4_1 = v1.C(PqS.d("163E230D"), PqS.d("002521654E"));
                v15 = v1.B(PqS.d("1E343E"));
                goto label_247;
            }
            catch(Exception v0_1) {
                v10 = "";
                goto label_983;
            }
        }
        else {
            goto label_218;
        }

        goto label_219;
        v10 = "";
        goto label_983;
    label_247:
        String v17 = "";
        try {
            v8 = v1.B(PqS.d("1C27"));
            boolean v18 = v1.isVideoFormat(v3_1);
        }
        catch(Exception v0_1) {
            v10 = "";
            goto label_983;
        }

        String v2_1 = PqS.d("20030B");
        String v29 = v9_7;
        String v30 = PqS.d("BDC6D4A0CBEB251E143C");
        String v19 = PqS.d("BDD6C4AEE8D7");
        String v9_8 = PqS.d("2510153B13");
        if(v18) {
            v0_9 = 0;
            goto label_572;
        }
        else {
            try {
                int v18_1 = v15.length();
            }
            catch(Exception v0_1) {
                v10 = "";
                goto label_983;
            }

            String v20 = v5_1;
            String v5_2 = PqS.d("3D051338");
            if(v18_1 <= 0) {
                goto label_351;
            }

            try {
                int v18_2 = v8.length();
            }
            catch(Exception v0_1) {
                v10 = "";
                goto label_983;
            }

            if(v18_2 <= 0) {
                goto label_351;
            }

            try {
                if(!v1.isVideoFormat(v3_1)) {
                    v10 = new Date().getTime();
                    String v0_11 = v1.getToken(Long.valueOf(((long)v10)).toString(), v4_1, v15, v8);
                    if(v0_11 != null && v0_11.length() > 0) {
                        String v0_12 = v3_1.indexOf(PqS.d("2E050C35")) <= 0 ? v3_1 + v0_11 : v3_1.replace(PqS.d("2E050C35"), v0_11);
                        v10 = v1.r(v0_12);
                        String v4_2 = new JSONObject(v1.decrypt(com.github.catvod.spider.merge.h.b.g(v0_12, ((Map)v10)), v4_1, v15, v8)).getString(v2_1);
                        if(v4_2 != null) {
                            boolean v0_13 = v4_2.startsWith(v5_2);
                            if(!v0_13) {
                                goto label_314;
                            }

                            v6_1.put(v9_8, 0);
                            v3_1 = v4_2;
                            goto label_577;
                        }

                    label_314:
                        if(!v1.l || !v1.l) {
                            goto label_577;
                        }

                        goto label_321;
                    }
                    else {
                        if(!v1.l) {
                            goto label_577;
                        }

                    label_321:
                        String v0_14 = PqS.d("BDD6C4ADD9C1B0D5D6A0C2E2BACDE6");
                        Init.show(v0_14);
                    }
                }

                goto label_577;
            }
            catch(Exception v0_10) {
            }

            try {
                if(v1.l) {
                    Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F8FEFD5A2FAF780F5E7A2C8F113271D223B94E0F29FD3CC9EDBD2") + v0_10.toString());
                }

                v4_3 = v1.H;
                if(v4_3 != null) {
                    v5_3 = new StringBuilder();
                    v5_3.append(PqS.d("BDD6C4ADD9C1B2CCF6ADEBC7211E0C2D18AEC1E88FE7D9A8E9F04A6548"));
                    v5_3.append(v0_10.toString());
                    goto label_530;
                label_351:
                    int v4_4 = v10.length();
                    goto label_352;
                }

                goto label_577;
            }
            catch(Exception v0_1) {
                v10 = "";
                goto label_983;
            }

        label_352:
            String v8_1 = PqS.d("30");
            String v15_1 = PqS.d("3F09");
            String v18_3 = v10;
            v10 = PqS.d("23");
            String v21 = v7;
            String v7_1 = PqS.d("3F41");
            String v22 = v15_1;
            String v15_2 = PqS.d("20030B751E332101");
            if(v4_4 <= 0) {
                try {
                    if(v11.length() > 0 || v12.length() > 0 || v13.length() > 0 || v14.length() > 0) {
                        goto label_583;
                    }

                    if(v1.r.indexOf(v8_1) >= 0) {
                        v29_1 = v2_1;
                        v4_5 = v21;
                        v0_15 = v22;
                        goto label_586;
                    }

                    if(v0_8 == 0 || (v3_1.startsWith(PqS.d("381000261333")))) {
                        goto label_539;
                    }

                    HashMap v0_16 = PqS.d("B3E1FBAFC2E5").equals(v1.q) ? v1.I(v3_1) : v1.r(v3_1);
                    v0_17 = a.l(com.github.catvod.spider.merge.h.b.g(v3_1, v0_16));
                }
                catch(Exception v0_1) {
                    v10 = "";
                    goto label_983;
                }

                try {
                    com.github.catvod.spider.merge.e0.g v0_19 = v0_17.j0(PqS.d("261215210633"));
                    int v4_6 = 0;
                    v8_2 = "";
                    while(v4_6 < v0_19.size()) {
                        String v11_1 = ((l)v0_19.get(v4_6)).X().trim();
                        if(v11_1.startsWith(PqS.d("23101568062B3408023A29"))) {
                            JSONObject v12_1 = new JSONObject(v11_1.substring(v11_1.indexOf(0x7B), v11_1.lastIndexOf(0x7D) + 1));
                            String v11_2 = v12_1.getString(v2_1);
                            if(v12_1.has(PqS.d("301F043A0F3721"))) {
                                int v12_2 = v12_1.getInt(PqS.d("301F043A0F3721"));
                                if(v12_2 == 1) {
                                    if(v1.r.indexOf(PqS.d("2041")) < 0) {
                                        v11_2 = URLDecoder.decode(v11_2);
                                    }
                                }
                                else if(v12_2 == 2) {
                                    String v12_3 = new String(Base64.decode(v11_2, 0));
                                    v11_2 = v1.r.indexOf(PqS.d("2041")) >= 0 ? v12_3 : URLDecoder.decode(v12_3);
                                }
                            }

                            if(v11_2.length() <= 6 || (m.d(v11_2))) {
                                goto label_459;
                            }

                            v8_2 = m.b(v3_1, v11_2);
                            if(!v8_2.startsWith(v5_2)) {
                                goto label_459;
                            }

                            break;
                        }

                    label_459:
                        ++v4_6;
                    }

                    if(v8_2.length() < 1 || !v8_2.startsWith(v5_2)) {
                        v8_2 = v3_1;
                    }

                    if(v1.isVideoFormat(v8_2)) {
                    label_497:
                        int v0_21 = v8_2.indexOf(v15_2) < 0 ? 0 : 1;
                        v6_1.put(v9_8, v0_21);
                        v3_1 = v8_2;
                    }
                    else {
                        if(v1.r.indexOf(v10) >= 0) {
                            goto label_497;
                        }

                        if((m.d(v8_2)) && v1.r.indexOf(v7_1) < 0) {
                            int v0_20 = v8_2.indexOf(v15_2);
                            if(v0_20 >= 0) {
                                goto label_491;
                            }

                            v6_1.put(v9_8, 1);
                            v6_1.put(v22, v21);
                            v3_1 = v8_2;
                        }
                        else {
                        label_491:
                            if(v8_2.startsWith(v5_2)) {
                                v3_1 = v8_2;
                            }

                            v6_1.put(v9_8, 1);
                        }
                    }

                    goto label_577;
                }
                catch(Exception v0_18) {
                }

                try {
                    v6_1.put(v9_8, 1);
                    if(v1.l) {
                        Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F82CDFBA2C2F482CFCCAEC1E888F4EC") + v0_18.toString());
                    }

                    v4_3 = v1.H;
                    if(v4_3 != null) {
                        v5_3 = new StringBuilder();
                        v5_3.append(PqS.d("B0F4EAADE1C2BCE5FEA0D9E8BACDE6655B79"));
                        v5_3.append(v0_18.toString());
                    label_530:
                        String v0_22 = v5_3.toString();
                        v4_3.log(v0_22);
                        goto label_577;
                        v3_1 = v8_2;
                        goto label_577;
                    label_539:
                        String v4_7 = v21;
                        String v0_23 = v22;
                        if(v3_1.indexOf(v15_2) < 0 && ((v1.B(v20).equals(v4_7)) || (m.d(v3_1)) && v1.r.indexOf(v7_1) < 0 || v1.r.indexOf(v29) >= 0 && v1.r.indexOf(v7_1) < 0)) {
                            v6_1.put(v9_8, 1);
                            v6_1.put(v0_23, v4_7);
                            goto label_577;
                        }

                        v0_9 = v1.r.indexOf(v10) >= 0 && v3_1.indexOf(v15_2) < 0 ? 0 : 1;
                    label_572:
                        v6_1.put(v9_8, v0_9);
                    }

                    goto label_577;
                }
                catch(Exception v0_1) {
                }

                try {
                    v10 = "";
                }
                catch(Exception v0_1) {
                }

                goto label_983;
            label_577:
                v23 = v2_1;
                v2_2 = v6_1;
                v10 = "";
                v15_2 = v19;
                v6_2 = v30;
                goto label_896;
            }

        label_583:
            v4_5 = v21;
            v0_15 = v22;
            v29_1 = v2_1;
            try {
            label_586:
                String v2_3 = v1.B(PqS.d("BDC6D4A0CBEBBDD6C4AEE8D7"));
                v23 = v29_1;
                v21_1 = v4_5;
                v4_8 = arg28;
                v2_2 = v1.S(v2_3, v4_8);
            }
            catch(Exception v0_24) {
                v2_2 = v6_1;
                v4_9 = v9_8;
                v10 = "";
                v15_2 = v19;
                v6_2 = v30;
                goto label_869;
            }

            String v22_1 = v0_15;
            JSONObject v20_1 = v6_1;
            v6_2 = v30;
            try {
                v0_25 = v1.S(v1.B(v6_2), v4_8);
                v4_9 = v1.r.indexOf(v8_1);
            }
            catch(Exception v0_24) {
                v4_9 = v9_8;
                v10 = "";
                v15_2 = v19;
                v2_2 = v20_1;
                goto label_869;
            }

            if(((int)v4_9) >= 0) {
                try {
                    v4_9 = v1.r.matches(PqS.d("7B5B021412697F"));
                    goto label_623;
                }
                catch(Exception v0_24) {
                }

                try {
                    v29_1 = v9_8;
                    v10 = "";
                    v15_2 = v19;
                }
                catch(Exception v0_24) {
                }

                v4_9 = v29_1;
                v2_2 = v20_1;
                goto label_869;
            label_623:
                if(((boolean)v4_9)) {
                    try {
                        v4_10 = v1.r;
                        v8_3 = PqS.d("7B5B02602A237C584962");
                    }
                    catch(Exception v0_24) {
                        v4_9 = v9_8;
                        v10 = "";
                        v15_2 = v19;
                        v2_2 = v20_1;
                        goto label_869;
                    }

                    v29_1 = v9_8;
                    try {
                        v4_9 = Integer.parseInt(v4_10.replaceAll(v8_3, PqS.d("7140")));
                        goto label_646;
                    }
                    catch(Exception v0_24) {
                    }

                    v4_9 = v29_1;
                    v10 = "";
                    v15_2 = v19;
                    v2_2 = v20_1;
                    goto label_869;
                }
                else {
                    v29_1 = v9_8;
                    v4_9 = 1;
                }

            label_646:
                int v8_4 = 0;
                String v9_9 = v3_1;
                while(true) {
                label_648:
                    if(((int)v4_9) <= 0) {
                        goto label_678;
                    }

                    String v30_1 = v15_2;
                    v15_2 = v19;
                    try {
                        v9_9 = v9_9.replace(v15_2, ((CharSequence)v2_2)).replace(v6_2, v0_25);
                        v19_1 = v7_1;
                        v7_2 = PqS.d("77041524546D7757416A5A");
                        goto label_660;
                    }
                    catch(Exception v0_24) {
                    }

                    try {
                        v10 = v17;
                        v4_9 = v29_1;
                        v2_2 = v20_1;
                        goto label_869;
                    label_660:
                        String v24 = v10;
                        v10 = v17;
                        String v7_3 = v1.O(v9_9, v7_2, v10);
                        if(!v9_9.equals(v7_3)) {
                            v9_9 = m.b(v3_1, v7_3);
                            ++v8_4;
                            if(!v7_3.startsWith(v5_2)) {
                                break;
                            }

                            v4_9 = ((int)v4_9) - 1;
                            v17 = v10;
                            v7_1 = v19_1;
                            v10 = v24;
                            v19 = v15_2;
                            v15_2 = v30_1;
                            goto label_648;
                        label_678:
                            v24 = v10;
                            v30_1 = v15_2;
                            v10 = v17;
                            v15_2 = v19;
                            v19_1 = v7_1;
                            break;
                        label_684:
                            v29_1 = v9_8;
                            v24 = v10;
                            v30_1 = v15_2;
                            v10 = "";
                            v15_2 = v19;
                            v19_1 = v7_1;
                            v4_9 = 1;
                            v8_4 = 0;
                            v9_9 = v3_1;
                        }

                    label_693:
                        int v7_4 = 5;
                        int v17_1 = (int)v4_9;
                        v4_9 = new String[]{v10, PqS.d("B1CBEBAEDAE6"), PqS.d("B1C9EEAEDAE6"), PqS.d("B0EAFCAEDAE6"), PqS.d("B1CBF3AEDAE6")};
                        if(v14.length() > 0) {
                        }
                        else if(v13.length() > 0) {
                            v7_4 = 4;
                        }
                        else if(v12.length() > 0) {
                            v7_4 = 3;
                        }
                        else if(v11.length() > 0) {
                            v7_4 = 2;
                        }
                        else {
                            v7_4 = v18_3.length() <= 0 ? v17_1 : 1;
                        }

                        int v11_3 = v7_4;
                        while(v11_3 > 0) {
                            v9_9 = v9_9.replace(v15_2, ((CharSequence)v2_2)).replace(v6_2, v0_25);
                            int v13_1 = v7_4 - v11_3;
                            String v14_1 = v16;
                            int v16_1 = v7_4;
                            String v7_5 = v1.C(((String[])v4_9)[v13_1] + v14_1, PqS.d("77041524546D7757416A5A")).replace(v15_2, ((CharSequence)v2_2)).replace(v6_2, v0_25);
                            String v12_4 = v1.O(v9_9, v7_5, v1.C(((String[])v4_9)[v13_1] + PqS.d("BDC6D4A0CBEBB3E3CAAEE2F9BCE2D9AEF8E2B3E4D7AFCDC3"), v10));
                            if((v9_9.equals(v12_4)) || (v9_9.endsWith(PqS.d("20030B75")))) {
                                break;
                            }

                            if(v7_5.indexOf(PqS.d("20030B755D")) > 0 && v12_4.indexOf(PqS.d("20030B7550")) > 0) {
                                break;
                            }

                            v9_9 = m.b(v3_1, v12_4);
                            if(!v12_4.startsWith(v5_2)) {
                                break;
                            }

                            ++v8_4;
                            --v11_3;
                            v7_4 = v16_1;
                            v16 = v14_1;
                        }

                        if(v8_4 == 0) {
                            goto label_851;
                        }
                        else {
                            v2_2 = null;
                            if(v9_9.length() < 10) {
                                goto label_851;
                            }

                            if(v1.l) {
                                v2_2 = PqS.d("B3DDC6");
                                Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F81DADBA1C1CF8EDBC8A1DBD481C0E6A2DFEE8FFFC5AFE8DD") + v8_4 + ((String)v2_2));
                            }

                            v3_1 = v9_9.replace(v15_2, v10).replace(v6_2, v10);
                            if(v1.isVideoFormat(v3_1)) {
                                goto label_841;
                            }
                            else {
                                v2_2 = v24;
                                if(v1.r.indexOf(((String)v2_2)) >= 0) {
                                    goto label_841;
                                }

                                if(!m.d(v3_1)) {
                                    v4_9 = v29_1;
                                    v2_2 = v20_1;
                                    goto label_846;
                                }

                                v2_2 = v19_1;
                                if(v1.r.indexOf(((String)v2_2)) >= 0) {
                                    v4_9 = v29_1;
                                    v2_2 = v20_1;
                                    goto label_846;
                                }

                                int v0_26 = v3_1.indexOf(v30_1);
                                goto label_829;
                            }
                        }

                        goto label_896;
                    }
                    catch(Exception v0_24) {
                        v4_9 = v29_1;
                        v2_2 = v20_1;
                        goto label_869;
                    }
                }
            }
            else {
                goto label_684;
            }

            goto label_693;
            try {
            }
            catch(Exception v0_24) {
                goto label_869;
            }

            try {
            }
            catch(Exception v0_24) {
            }

            v4_9 = v29_1;
            v2_2 = v20_1;
            goto label_869;
        label_829:
            if(v0_26 >= 0) {
                v4_9 = v29_1;
                v2_2 = v20_1;
                goto label_846;
            }

            v4_9 = v29_1;
            v2_2 = v20_1;
            try {
                v2_2.put(v4_9, 1);
                v2_2.put(v22_1, v21_1);
                goto label_896;
                v4_9 = v29_1;
                v2_2 = v20_1;
                goto label_846;
            label_841:
                v4_9 = v29_1;
                v2_2 = v20_1;
                if(v3_1.indexOf(v30_1) >= 0) {
                label_846:
                    v0_27 = 1;
                }
                else {
                    v0_27 = 0;
                }

                v2_2.put(v4_9, v0_27);
                goto label_896;
            label_851:
                v4_9 = v29_1;
                v2_2 = v20_1;
                v2_2.put(v4_9, 1);
                if(v1.l) {
                    Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F81DADBA1C1CF8EDBC8A1DBD48FFFC5AFE8DD81D4DCA1DDE182C2E9"));
                }

                goto label_896;
            }
            catch(Exception v0_24) {
            }

            try {
            label_869:
                v2_2.put(v4_9, 1);
                if(v1.l) {
                    Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F8FFFC5AFE8DD81DADBA1C1CF8EDBC8A1DBD482CFCCAEC1E888F4EC") + v0_24.toString());
                }

                SpiderApi v4_11 = v1.H;
                if(v4_11 != null) {
                    v4_11.log(PqS.d("251D06311335161E093C13292199D0FB9EFAF997F5E590D3EB98F4F690C9F098F3D19EE8FA9EDBC95B6A6B") + v0_24.toString());
                }

            label_896:
                String v0_28 = v1.S(v1.B(v15_2), arg28);
                if(v0_28.length() > 1) {
                    v2_2.put(PqS.d("251D0631233539"), v0_28);
                }

                v2_2.put(v23, v3_1.replace(v15_2, v10).replace(v6_2, v10));
                if(v1.B(PqS.d("B3E3CAAEE2F9BDDED0AEC7C5B0D5D3")).length() > 0 || v1.r.indexOf(PqS.d("02")) >= 0 || v1.r.indexOf(PqS.d("14")) >= 0 || v1.r.indexOf(PqS.d("16")) >= 0 || v1.r.indexOf(PqS.d("07")) >= 0) {
                    v2_2.put(PqS.d("3D14062C1335"), v1.z(v3_1));
                }

                if((v1.n.equals(PqS.d("251D0631242226040B3C"))) || (v1.l)) {
                    v1.m = v2_2.toString();
                }

                SpiderApi v0_29 = v1.H;
                if(v0_29 != null) {
                    v0_29.log(PqS.d("B3DCC4ADEAEFB3E3CAAEE2F9785C5968") + v2_2.toString().replaceAll(PqS.d("092D"), v10));
                }

                return v2_2.toString();
            label_963:
                String v4_12 = v2;
                v10 = "";
                PushAgent v2_4 = v1.C;
                if(v1.B(v6).length() > 0) {
                    v0 = v0 + PqS.d("261E123A15223E141E") + v1.B(v6);
                }

                return v2_4.playerContent(v4_12, v0, arg30);
            }
            catch(Exception v0_1) {
                goto label_983;
            }
        }

        goto label_896;
    label_983:
        if(v1.l) {
            Init.show(v1.F + PqS.d("BDC1E4A0D9D2784F1724173E300324271833301F13ADF1FDBCE5FEA7CADD") + v0_1.toString());
        }

        SpiderApi v2_5 = v1.H;
        if(v2_5 != null) {
            b.a(v0_1, d.b(PqS.d("251D06311335161E093C132921594EA1E2DEBDDEC8A7CAC6785C59")), v2_5);
        }

        return v10;
    }

    private JSONObject q() {
        int v19_4;
        String v20_3;
        String v29;
        String v19_3;
        String v2_11;
        String v4_3;
        String v25_1;
        String v19_2;
        String v2_10;
        String v20_2;
        String v3_3;
        String v13_1;
        String v12_2;
        String v2_9;
        String v28;
        String v27;
        String v3_2;
        String v3_1;
        String v2_8;
        int v6_1;
        String v12_1;
        String v10;
        String v25;
        String v2_3;
        String v11_2;
        String[] v23_1;
        String v22_1;
        String v14;
        String v18;
        int v2_1;
        String[] v12;
        ArrayList v3;
        XBPQ v7 = this;
        String v0 = "{by}";
        String v1 = "电视剧";
        String v11 = "#";
        try {
            String v2 = v7.c;
            v3 = new ArrayList();
            v12 = v2.split("#");
            v2_1 = v12.length;
        }
        catch(Exception v0_1) {
            goto label_394;
        }

        String v13 = "";
        int v5 = 0;
        String v6 = "连续剧";
        String v15 = "";
        String v16 = "";
        String v17 = "";
        while(true) {
        label_26:
            v18 = v15;
            if(v5 >= v2_1) {
                goto label_110;
            }

            int v19 = v2_1;
            try {
                String v2_2 = v12[v5];
                String v22 = v11;
                v3.add(v2_2.split("\\$")[1]);
                boolean v11_1 = v1.equals(v2_2.split("\\$")[0]);
                String v20 = v1;
                String[] v23 = v12;
                if(v11_1) {
                    v17 = v2_2.split("\\$")[1];
                    v15 = v18;
                    v6 = v20;
                }
                else if("电视".equals(v2_2.split("\\$")[0])) {
                    v14 = v2_2.split("\\$")[1];
                    v6 = "电视";
                    goto label_82;
                }
                else {
                    if("剧集".equals(v2_2.split("\\$")[0])) {
                        v14 = v2_2.split("\\$")[1];
                        v6 = "剧集";
                        goto label_82;
                    }

                    if("连续剧".equals(v2_2.split("\\$")[0])) {
                        v14 = v2_2.split("\\$")[1];
                    label_82:
                        v17 = v14;
                    }
                    else {
                        if("电影".equals(v2_2.split("\\$")[0])) {
                            v15 = v2_2.split("\\$")[1];
                            goto label_104;
                        }

                        if("动漫".equals(v2_2.split("\\$")[0])) {
                            v16 = v2_2.split("\\$")[1];
                        }
                    }

                    v15 = v18;
                }

            label_104:
                ++v5;
                v2_1 = v19;
                v1 = v20;
                v11 = v22;
                v12 = v23;
                goto label_26;
            label_110:
                v22_1 = v11;
                v23_1 = v12;
                v11_2 = v7.D("类型", "筛选子分类名称", "0");
                String v1_1 = v7.b;
                v2_3 = v7.D("剧情", "筛选类型名称", "");
                int v5_1 = v1_1.indexOf("{class}");
                break;
            }
            catch(Exception v0_1) {
                goto label_394;
            }
        }

        String v19_1 = v11_2;
        String v20_1 = "{class}";
        String v21 = "电影";
        String v24 = "\\$";
        if(v5_1 >= 0) {
            try {
                if(!v2_3.isEmpty()) {
                label_143:
                    if(v2_3.indexOf("[替换") < 0) {
                        goto label_155;
                    }
                }

                String v5_2 = PqS.d("B2E5D2ADCBF6785C82DEEAA2DCD641AFFEF6B3F2E26E93CDFD95DAD450A0F2E082F1CD61B0F8C0AEF5C27397EFD092FDDC578FE5D0A2D9DB41AFFCE8B2CCCD6E93CDFD96F3F350A2F0F682F1CD61B3DCC1ACC8E77394E1DA9FDEFC5781D6DCA1DDE941AEF7D7B3F1F16E90C5F996F1D950AEC8E381D0D361B0FEC3A0D5C27394E9CE93C8E7578FF7E6A2DFD941ADF2F8B2DAC26E92FBF396F7CE0A3BBDCEF9AFCDEAB0F8C0655BA2DAD58FEBF361B2D4F9A0D9DA7397EFD092FDDC5782C9C0A2D6FE41AFFEF6B3F2E26E93D1C994EEEF50A2FBC782F2DB61B2FBC8AFCBED7397E5E491D1C45781C9E6A1D5E741AEDBE1B1CFC76E93CDFD95DAD450A2F0F682F1CD61B0F8C0AEF5C27395DBEE91D7D35782C6F0A2DAC31B3491FCE999EEF25B6ABDF5D6ADF9E4B2D6E76E91DBCA95DDF291E0D55781CBF3A1D1EE41AEE1C2B3C9DF6E9FD8E695DED850AFDDEF8FF1FE61B2CFE9A1D5D87396DDE293E9CB5780DCE9A1E1CA1B3493CDFD97DBE35B6AB2D6F6ADCFFC7396E4E59EE6D55781D8E8A0F9E041ADF0D5BCE8CE6E90E7F494FCE550A2DFD983F5EA61BDCEF7ADFCEF290D80F2DCA2E8E480C1F16A7896DDE293FAC05782C6F0A2DAC341ACCAE7BDDFD76E9FD8E695DED850A1F8FD8FC0E861B2EECAAFFFC07396C0D993FEEE");
                if(!"连续剧".equals(v6)) {
                    v5_2 = v5_2.replace("连续剧", v6);
                }

                if(v2_3.indexOf("[替换") >= 0) {
                    v2_3 = v7.a0(v2_3, v5_2).replaceAll("\\&+", "&").replace("--&", "--");
                label_155:
                    v5_2 = v2_3;
                }

            label_156:
                v25 = v5_2;
                String v2_4 = v7.D(PqS.d("B0EDD7ADFAFD"), PqS.d("B2DCFCA1F6CEB0EDD7ADFAFDB0E1EAAFD1F7"), "");
                if(v1_1.indexOf("{area}") >= 0 && (v2_4.isEmpty()) || v2_4.indexOf("[替换") >= 0) {
                    String v5_3 = PqS.d("B2E5D2ADCBF6785C82ECD1AECCF741A1D0DEB3C9C86E93C8E597DEF650A0EBFF82D3CB61B3C2F2ADEDFA7399ECF993DCE85781DFD3A1C9DD41A1E9EEB0EADA6E93F9E294FCF550A1E6C182D3CB61B0FCD7ADCCE17395D8CC91FAC297F1E750A1D1FE82ECD1A2DDD841A0D3F8B2FECAAFFFDE7394EDE890CCEA94C3EF0A3BBDCEF9AFCDEAB0F8C0655BA2F1D68ED1F061BCD7FEAECEE87394E8F890FEEB5780F6F8A2CECC41AEC5D2B0EADA6E9ECCE494FCF550A1C2D481D4DA61BCEECEADEDFA7394D9FF93DCE85781FBC6A2CECC41ADFBF7B0CBC16E92F8D196DADF90D1FA5781CCF9A2F1D682C0DF61BDD4D8AFF9EAB2F8FE6E93CDF597ECF793E3F20D1BAFCDFBBDF8DD655BA2F1D68ED1F061BCD7FEAECEE87394E8F890FEEB5781DFD3A1C9DD41A1E9EEB0EADA6E91F9DB94FCF550AFDEC082D3CB3B2994EDE090FBFE5C4AADD2E0BCE8E16E90D0F097FBE450AECAD882D3CB61B2CFE9ADEDFA7399ECF993DCE85781FBE3A2CECC1B3491FDFF94DADD91CED25C4AADD2E0BCE8E16E9FE1CC97DFE750A2DAC181F1C861B2CFE9ADEDFA7397D4DD93DCE8578FC3C7A2CECC41AEE1E2B3EDCB6E9FD8FC94FCF550A2EBC682D3CB61B3C2D7ADEDFA7394EAF893FDF35783F7F2A0E8E681DED961B3F5E8ADD2E0B0F9CE6E9EE2EA96E8E591CECC5782C2D6A1DECE82ECD1");
                    if(!"连续剧".equals(v6)) {
                        v5_3 = v5_3.replace("连续剧", v6);
                    }

                    if(v2_4.indexOf("[替换") >= 0) {
                        v2_4 = v7.a0(v2_4, v5_3).replaceAll("\\&+", "&").replace("--&", "--");
                        goto label_181;
                    }

                    v10 = v5_3;
                }
                else {
                label_181:
                    v10 = v2_4;
                }

                String v2_5 = v7.E(PqS.d("B0C8D3ACCDFA"), PqS.d("B3E6D1A1E3F8"), PqS.d("B2DCFCA1F6CEB0C8D3ACCDFAB0E1EAAFD1F7"), "");
                if(v1_1.indexOf("{year}") >= 0 && (v2_5.isEmpty())) {
                    int v2_6 = new Date().getYear() + 1900;
                    v2_5 = v2_6 - 15 + PqS.d("78") + v2_6;
                }

                String v11_3 = v2_5;
                String v2_7 = v7.D(PqS.d("B3FFF5ADCCC8"), PqS.d("B2DCFCA1F6CEB3FFF5ADCCC8B0E1EAAFD1F7"), "");
                if(v1_1.indexOf("{by}") >= 0 && (v2_7.isEmpty())) {
                    v2_7 = PqS.d("B3E6D1A1E1F371050E251364B1CBDDAEC6D371190E3C0564BDDEE3ADFEC1710204270422");
                }

                v12_1 = v2_7;
                JSONObject v14_1 = new JSONObject();
                new JSONArray();
                String v15_1 = v7.E(PqS.d("B2F8DEAED8CDB0F9E1AFC7FC"), PqS.d("B2F8DEAED8CDB0F9E1AFC7FC20030B"), PqS.d("B2F8DEAED8CDB0F9E1AFC7FCBCE2D9AEF8E2"), "");
                Iterator v26 = v3.iterator();
                v6_1 = 0;
                while(true) {
                label_233:
                    if(!v26.hasNext()) {
                        return v14_1;
                    }

                    Object v1_2 = v26.next();
                    String v5_4 = (String)v1_2;
                    String v4 = v24;
                    String v1_3 = v23_1[v6_1].split(v4)[0];
                    if(v1_3.indexOf(PqS.d("B0F8C0")) >= 0 && v1_3.indexOf(PqS.d("B2E4CDADFFE0")) < 0) {
                        v2_8 = v5_4;
                        v3_1 = v17;
                    }
                    else if(v1_3.indexOf(PqS.d("B2F8E0")) < 0) {
                        v3_2 = v21;
                        if(v1_3.indexOf(v3_2) < 0) {
                            goto label_275;
                        }

                        goto label_263;
                    }
                    else {
                        v3_2 = v21;
                    label_263:
                        if(v1_3.indexOf(PqS.d("B2CBCDADCBD2B2F8E0")) < 0 && v1_3.indexOf(PqS.d("B0FBCFAFE2FCB2F8E0")) < 0) {
                            v21 = v3_2;
                            v3_1 = v5_4;
                            v2_8 = v18;
                            goto label_293;
                        }

                    label_275:
                        if(v1_3.indexOf(PqS.d("B2E4CD")) < 0 && v1_3.indexOf(PqS.d("B0FBCFAFE2FC")) < 0) {
                            if(v1_3.indexOf(PqS.d("B0E2F3ADE5EE")) >= 0) {
                                goto label_290;
                            }

                            v2_8 = v5_4;
                        }
                        else {
                        label_290:
                            v2_8 = v16;
                        }

                        v21 = v3_2;
                        v3_1 = v2_8;
                    }

                label_293:
                    if(v15_1.length() > 0) {
                        v24 = v4;
                        if(v15_1.indexOf(PqS.d("71")) < 0 || v15_1.indexOf(v1_3) < 0) {
                            goto label_367;
                        }

                        v27 = v12_1;
                        String v4_1 = v15_1 + v22_1;
                        v22_1 = v22_1;
                        v28 = v13;
                        String v1_4 = v4_1.replaceAll(PqS.d("7B5B") + v1_3 + PqS.d("7B5B5814526F7B5B586155697F"), PqS.d("7140"));
                        String v4_2 = v1_4.indexOf("{year}") <= 0 ? v28 : v7.s(v6_1, v5_4, v11_3);
                        if(v1_4.indexOf("{area}") > 0) {
                            v2_9 = v7.s(v6_1, v2_8, v10);
                            v12_2 = v20_1;
                        }
                        else {
                            v12_2 = v20_1;
                            v2_9 = v28;
                        }

                        if(v1_4.indexOf(v12_2) > 0) {
                            v13_1 = v25;
                            v3_3 = v7.s(v6_1, v3_1, v13_1);
                            v20_2 = v2_9;
                        }
                        else {
                            v13_1 = v25;
                            v20_2 = v2_9;
                            v3_3 = v28;
                        }

                        if(v1_4.indexOf(PqS.d("2E12063C130E310C")) > 0) {
                            v2_10 = v19_1;
                            v19_2 = v7.s(v6_1, v5_4, v2_10);
                        }
                        else {
                            v2_10 = v19_1;
                            v19_2 = v28;
                        }

                        String v1_5 = v1_4.indexOf(v0) >= 0 ? v27 : v28;
                        v25_1 = v1_5;
                        v4_3 = v2_10;
                        v2_11 = v19_2;
                        v19_3 = v4_2;
                    }
                    else {
                        v24 = v4;
                    label_367:
                        v27 = v12_1;
                        v28 = v13;
                        v4_3 = v19_1;
                        v12_2 = v20_1;
                        v13_1 = v25;
                        String v1_6 = v7.s(v6_1, v5_4, v11_3);
                        String v2_12 = v7.s(v6_1, v2_8, v10);
                        v3_3 = v7.s(v6_1, v3_1, v13_1);
                        v20_2 = v2_12;
                        v2_11 = v7.s(v6_1, v5_4, v4_3);
                        v25_1 = v27;
                        v19_3 = v1_6;
                    }

                    v29 = v4_3;
                    v20_3 = v0;
                    v19_4 = v6_1;
                    v14_1.put(v5_4, this.g(v2_11, v3_3, v20_2, v19_3, v25_1));
                    goto label_414;
                }
            }
            catch(Exception v0_1) {
                goto label_394;
            }
        }
        else {
            goto label_143;
        }

        goto label_156;
    label_394:
        if(v7.l) {
            Init.show(v7.F + PqS.d("BDC1E4A0D9D2784F002D02013C1D132D0403340506ADF1FDBCE5FEA7CADD") + v0_1.toString());
        }

        SpiderApi v1_7 = v7.H;
        if(v1_7 != null) {
            b.a(v0_1, d.b(PqS.d("3214130E1F2B2114150C173334594EA1E2DEBDDEC8655B79")), v1_7);
        }

        return null;
    label_414:
        v6_1 = v19_4 + 1;
        v25 = v13_1;
        v0 = v20_3;
        v13 = v28;
        v19_1 = v29;
        v20_1 = v12_2;
        v12_1 = v27;
        goto label_233;
    }

    protected final HashMap r(String arg15) {
        if(this.E != null && !this.E.isEmpty() && this.r.indexOf("r1") < 0 && this.r.indexOf("c") < 0) {
            return this.E;
        }

        this.E = new HashMap();
        String v0 = this.G("请求头", "请求头参数", "ua", "Headers", "UserAgent", "").trim();
        if(v0.length() > 1 && v0.indexOf("@") > 0) {
            v0 = v0.replace("@", "$").replace("&&", "#").replace("；；", ";");
        }

        String v2 = this.J(v0);
        this.E.put("User-Agent", v2);
        String v7 = this.n(arg15);
        if(this.r.indexOf("c0") < 0 && v7.length() > 1) {
            this.E.put("Cookie", v7);
        }

        if(v0.indexOf("Referer") < 0 && this.r.indexOf("r1") >= 0) {
            this.E.put("Referer", arg15.split(";")[0]);
        }
        else if(v0.indexOf("Referer") < 0 && this.r.indexOf("r") >= 0) {
            this.E.put("Referer", arg15 + "/".replaceAll(".*(https?\\://[^/]+)/.*", "$1") + "/");
        }

        String v15 = v0.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
        if(v15.indexOf("$") >= 0) {
            String[] v15_1 = v15.split("#");
            int v3;
            for(v3 = 0; v3 < v15_1.length; ++v3) {
                String v4 = v15_1[v3];
                if((!"User-Agent".equals(v4.split("\\$")[0]) || v2.length() <= 0) && !"Cookie".equals(v4.split("\\$")[0]) && !"cookie".equals(v4.split("\\$")[0])) {
                    HashMap v7_1 = this.E;
                    String v9 = v4.split("\\$")[0];
                    Object v4_1 = v4.split("\\$")[1].equals("空") ? "" : v4.split("\\$")[1];
                    v7_1.put(v9, v4_1);
                }
            }
        }

        SpiderApi v15_2 = this.H;
        if(v15_2 != null) {
            StringBuilder v0_1 = d.b("请求头--> ");
            v0_1.append(this.E.toString());
            v15_2.log(v0_1.toString());
        }

        return this.E;
    }

    private String s(int arg13, String arg14, String arg15) {
        String v14;
        StringBuilder v13;
        String v0_2;
        String v2;
        StringBuilder v0_1;
        String v0 = n.b(d.b("#"), this.c, "#").replaceAll(".*#(.*?)\\$" + arg14 + "#.*", "$1");
        if(arg15.indexOf("||") >= 0 || arg15.indexOf("--") >= 0) {
            if(arg15.indexOf("--") < 0) {
                return arg14 + "--" + arg15.split("\\|\\|")[arg13];
            }

            if(arg15.indexOf("||") < 0) {
                if(v0.equals(arg15.split("--")[0])) {
                    v0_1 = new StringBuilder(arg14);
                    v0_1.append("--");
                    v2 = arg15.split("--")[1];
                    v0_1.append(v2);
                    v0_2 = v0_1.toString();
                    goto label_77;
                }

                v0_2 = "0";
            }
            else {
                String[] v2_1 = arg15.split("\\|\\|");
                int v9 = 0;
                while(v9 < v2_1.length) {
                    String v10 = v2_1[v9];
                    if(v0.equals(v10.split("--")[0])) {
                        v0_1 = new StringBuilder(arg14);
                        v0_1.append("--");
                        v2 = v10.split("--")[1];
                        v0_1.append(v2);
                        v0_2 = v0_1.toString();
                        goto label_77;
                    }

                    ++v9;
                }

                v0_2 = "0";
            }

        label_77:
            if(v0_2.equals("0")) {
                if(arg15.indexOf("||") < 0) {
                    String v1 = arg15.split("--")[0];
                    StringBuilder v2_2 = d.b("");
                    v2_2.append(arg13 + 1);
                    if(!v1.equals(v2_2.toString())) {
                        return v0_2;
                    }

                    v13 = new StringBuilder(arg14);
                    v13.append("--");
                    v14 = arg15.split("--")[1];
                    v13.append(v14);
                    return v13.toString();
                }

                String[] v15 = arg15.split("\\|\\|");
                int v4;
                for(v4 = 0; v4 < v15.length; ++v4) {
                    String v5 = v15[v4];
                    String v8 = v5.split("--")[0];
                    StringBuilder v9_1 = d.b("");
                    v9_1.append(arg13 + 1);
                    if(v8.equals(v9_1.toString())) {
                        v13 = new StringBuilder(arg14);
                        v13.append("--");
                        v14 = v5.split("--")[1];
                        v13.append(v14);
                        return v13.toString();
                    }
                }
            }

            return v0_2;
        }

        return arg15;
    }

    public String searchContent(String arg13, boolean arg14) {
        int v5_1;
        String[] v3_1;
        JSONArray v2_2;
        String v3;
        JSONObject v2_1;
        String v0 = PqS.d("3E41");
        try {
            SpiderApi v2 = this.H;
            if(v2 != null) {
                v2.log(PqS.d("2614063A152F161E093C132921590C2D0F7A") + arg13 + PqS.d("7951163D1F243E4C") + arg14 + PqS.d("7C"));
            }

            this.q = PqS.d("B3E1FBAFC2E5");
            v2_1 = this.W("", arg13, arg14);
            v3 = this.E(PqS.d("B2F8DEAED8CDB0F9E1AFC7FC"), PqS.d("B2F8DEAED8CDB0F9E1AFC7FC20030B"), PqS.d("B2F8DEAED8CDB0F9E1AFC7FCBCE2D9AEF8E2"), "").replace(this.f, "");
        }
        catch(Exception v13) {
            goto label_179;
        }

        String v4 = PqS.d("3918143C");
        if(v2_1 != null) {
            try {
                if(v2_1.getJSONArray(v4) != null && v2_1.getJSONArray(v4).length() > 0 && v3.indexOf(PqS.d("7619133C06")) < 0) {
                    return v2_1.toString();
                }

            label_47:
                v2_2 = v2_1 == null ? new JSONArray() : v2_1.getJSONArray(v4);
                v3_1 = v3.split(PqS.d("7619"));
                int v5 = v3_1.length;
                goto label_56;
            }
            catch(Exception v13) {
                goto label_179;
            }
        }

        goto label_47;
    label_56:
        int v6 = 0;
        int v7 = 0;
        while(true) {
        label_58:
            String v8 = PqS.d("76");
            if(v7 >= v5) {
                goto label_101;
            }

            try {
                String v9 = v3_1[v7];
                if(v9.startsWith(PqS.d("210517"))) {
                    JSONObject v8_1 = this.W(PqS.d("3D") + v9 + v8.replaceAll(PqS.d("7B5B4F3C02377B5B586155697F"), PqS.d("7140")), arg13, arg14);
                    JSONArray v8_2 = v8_1 == null ? new JSONArray() : v8_1.getJSONArray(v4);
                    if(v8_2.length() > 0) {
                        int v9_1;
                        for(v9_1 = 0; v9_1 < v8_2.length(); ++v9_1) {
                            v2_2.put(v8_2.get(v9_1));
                        }
                    }
                }

                ++v7;
                goto label_58;
            label_101:
                if(this.r.indexOf(v0) >= 0) {
                    this.r = this.r.replace(v0, "");
                }

                if(v2_2.length() > 0) {
                    return new JSONObject().put(v4, v2_2).toString();
                }

                JSONObject v0_1 = this.W(this.f + PqS.d("7A4A5CAEE6DBBCD7F1A1D7F2"), arg13, arg14);
                if(v0_1 != null && v0_1.getJSONArray(v4) != null && v0_1.getJSONArray(v4).length() > 0) {
                    return v0_1.toString();
                }

                String[] v0_2 = this.c.split(v8);
                v5_1 = 0;
                while(true) {
                label_135:
                    if(v5_1 >= v0_2.length) {
                        return v2_2.length() > 0 ? new JSONObject().put(v4, v2_2).toString() : "";
                    }

                    JSONObject v7_1 = this.W(this.f(v0_2[v5_1].split(PqS.d("0955"))[1], PqS.d("64"), false, null) + PqS.d("6E4A81D8EAAEF3E78EE9C3"), arg13, arg14);
                    JSONArray v7_2 = v7_1 == null ? new JSONArray() : v7_1.getJSONArray(v4);
                    if(v7_2.length() <= 0) {
                        goto label_168;
                    }

                    while(true) {
                    label_161:
                        if(v6 >= v7_2.length()) {
                            return v2_2.length() > 0 ? new JSONObject().put(v4, v2_2).toString() : "";
                        }

                        v2_2.put(v7_2.get(v6));
                        break alab1;
                    }
                }
            }
            catch(Exception v13) {
                goto label_179;
            }
        }

        ++v6;
        goto label_161;
        try {
        label_168:
            Thread.sleep(1000L);
        }
        catch(Exception unused_ex) {
        }

        ++v5_1;
        goto label_135;
        try {
            return v2_2.length() > 0 ? new JSONObject().put(v4, v2_2).toString() : "";
        }
        catch(Exception v13) {
        }

    label_179:
        if(this.l) {
            Init.show(this.F + PqS.d("BDC1E4A0D9D2784F142D1735361924271833301F13ADF1FDBCE5FEA7CADD") + v13.toString());
        }

        SpiderApi v14 = this.H;
        if(v14 != null) {
            b.a(v13, d.b(PqS.d("2614063A152F161E093C132921594EA1E2DEBDDEC8655B79")), v14);
        }

        return "";
    }

    private JSONArray t(String arg10, String arg11) {
        JSONArray v1;
        try {
            if(arg11.length() < 1) {
                return new JSONArray(arg10);
            }

            if(arg11.indexOf("&&") >= 0) {
                arg11 = "data";
            }

            v1 = new JSONArray();
            int v3 = arg11.indexOf("[");
        }
        catch(JSONException v10) {
            goto label_104;
        }

        String v4 = "";
        if(v3 >= 0) {
            try {
                String v3_1 = arg11.replaceAll(".*\\[(.*?)\\].*", "$1");
                arg11 = arg11.replaceAll("\\[.*", "");
                v4 = v3_1;
            label_29:
                String[] v11 = arg11.split("\\.");
                int v3_2 = 0;
                int v6 = 0;
                while(true) {
                    if(v6 >= v11.length) {
                        return null;
                    }

                    JSONObject v7 = new JSONObject(arg10);
                    if(v6 == v11.length - 1) {
                        if((v7.get(v11[v6]) instanceof JSONObject)) {
                            v1.put(v7.getJSONObject(v11[v6]));
                            return v1;
                        }

                        JSONArray v10_1 = v7.getJSONArray(v11[v6]);
                        int v11_1 = v10_1.length();
                        if(v4 != null && v4.length() > 0) {
                            int v6_1 = v4.indexOf(",");
                            if(v6_1 < 0) {
                                if(!v4.matches("\\d+")) {
                                    goto label_68;
                                }

                                if(v11_1 > Integer.parseInt(v4)) {
                                    v11_1 = Integer.parseInt(v4);
                                }

                                v3_2 = v11_1 - 1;
                            }
                            else {
                            label_68:
                                String v6_2 = v4.replaceAll("(.*),.*", "$1");
                                String v4_1 = v4.replaceAll(".*,(.*)", "$1");
                                if(v4_1 != null && v4_1.length() > 0 && (v4_1.matches("\\d+")) && Integer.parseInt(v4_1) < v11_1) {
                                    v11_1 = Integer.parseInt(v4_1);
                                }

                                if(v6_2 != null && v6_2.length() > 0 && (v6_2.matches("\\d+")) && Integer.parseInt(v6_2) <= v11_1) {
                                    v3_2 = Integer.parseInt(v6_2) - 1;
                                }
                            }

                            while(v3_2 < v11_1) {
                                v1.put(v10_1.getJSONObject(v3_2));
                                ++v3_2;
                            }

                            return v1;
                        }

                        return v10_1;
                    }

                    arg10 = v7.getJSONObject(v11[v6]).toString();
                    ++v6;
                }
            }
            catch(JSONException v10) {
                goto label_104;
            }
        }

        goto label_29;
    label_104:
        if(this.l) {
            Init.show(this.F + "调试->getJsonArray出错：" + v10.toString());
        }

        SpiderApi v11_2 = this.H;
        if(v11_2 != null) {
            StringBuilder v1_1 = d.b("getJsonArray()错误！-->");
            v1_1.append(v10.toString());
            v11_2.log(v1_1.toString());
        }

        return null;
    }

    private String u(String arg8, String arg9) {
        String v4;
        String v1 = "";
        if(arg9.indexOf("替换") >= 0) {
            String v0 = arg9.replaceAll(".*(\\[仅?替换[:：][^\\]]+?\\]).*", "$1");
            arg9 = arg9.replaceAll("\\[仅?替换[:：]([^\\]]+?)\\]", "");
            v1 = v0;
        }

        if(arg9.indexOf("+") < 0) {
            return this.a0(v1, this.v(arg8, arg9));
        }

        String[] v9 = arg9.split("\\+");
        StringBuilder v0_1 = new StringBuilder();
        int v3;
        for(v3 = 0; v3 < v9.length; ++v3) {
            if(v9[v3].startsWith("url:")) {
                String v4_1 = v9[v3].substring(4);
                if(v4_1.indexOf("$sub:") > 0) {
                    String[] v4_2 = v4_1.split("\\$sub\\:");
                    v4 = v4_2.length > 1 ? this.v(this.j(v4_2[0]), v4_2[1]) : this.j(v4_2[0]);
                }
                else {
                    v4 = this.j(v4_1);
                }
            }
            else {
                v4 = this.v(arg8, v9[v3]);
            }

            if(v4.length() > 0) {
                if((v4.startsWith("http")) && !v0_1.toString().trim().endsWith("=") && !v0_1.toString().trim().endsWith("解析")) {
                    v0_1 = new StringBuilder();
                }

                v0_1.append(v4);
            }
        }

        return this.a0(v1, v0_1.toString());
    }

    private String v(String arg10, String arg11) {
        if(arg11.endsWith("整页")) {
            arg11 = arg11.replace("整页", "");
            if(this.w.length() > 0) {
                arg10 = this.w;
            }
        }

        try {
            if(arg11.indexOf("\'") >= 0) {
                return arg11.replace("\'", "");
            }

            if(arg11.indexOf("&&") >= 0 || arg11.length() < 1) {
                arg11 = "data";
            }

            if(arg11.indexOf("].") < 0) {
                return this.w(arg10, arg11);
            }

            String v0 = ",";
            String[] v11 = arg11.split("\\]\\.");
            int v2 = v11.length;
            int v5 = 0;
            if(v2 > 2) {
                int v2_1;
                for(v2_1 = 0; v2_1 < v11.length - 2; ++v2_1) {
                    arg10 = this.t(arg10, v11[v2_1] + "]").getJSONObject(0).toString();
                }
            }

            String v2_2 = v11[v11.length - 1];
            String v11_1 = v11[v11.length - 2] + "]";
            if(v2_2.indexOf("(") >= 0) {
                v0 = v2_2.replaceAll(".*\\((.*?)\\).*", "$1");
                v2_2 = v2_2.replaceAll("\\(.*", "");
            }

            JSONArray v10_1 = this.t(arg10, v11_1);
            StringBuilder v11_2 = new StringBuilder();
            if(v10_1 != null && v10_1.length() > 0) {
                while(v5 < v10_1.length()) {
                    String v4 = v10_1.getJSONObject(v5).toString();
                    if(v5 == v10_1.length() - 1) {
                        v0 = "";
                    }

                    v11_2.append(this.w(v4, v2_2));
                    v11_2.append(v0);
                    ++v5;
                }

                return v11_2.toString();
            }
        }
        catch(JSONException v10) {
            if(this.l) {
                Init.show(this.F + "调试->getJsonArrayStringAction出错：" + v10.toString());
            }

            SpiderApi v11_3 = this.H;
            if(v11_3 != null) {
                StringBuilder v0_1 = d.b("getJsonArrayStringAction()错误！-->");
                v0_1.append(v10.toString());
                v11_3.log(v0_1.toString());
            }

            return "";
        }

        return "";
    }

    private String w(String arg6, String arg7) {
        String v6_3;
        JSONObject v6_2;
        int v1;
        try {
            if(arg7.indexOf("&&") >= 0 || arg7.length() < 1) {
                arg7 = "data";
            }

            int v3 = 0;
            if(arg7.endsWith(";json;")) {
                arg7 = arg7.substring(0, arg7.length() - 6);
                v1 = 1;
            }
            else {
                v1 = 0;
            }

            if(arg7.indexOf("[") < 0) {
                String[] v7 = arg7.split("\\.");
                while(true) {
                    if(v3 >= v7.length) {
                        return "";
                    }

                    JSONObject v4 = new JSONObject(arg6);
                    if(v3 == v7.length - 1) {
                        if(v1 == 0) {
                            v6_3 = v4.optString(v7[v3]).trim().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll("\"", "");
                        }
                        else {
                            Object v6_1 = v4.get(v7[v3]);
                            if((v6_1 instanceof JSONObject)) {
                                v6_2 = (JSONObject)v6_1;
                                goto label_49;
                            }
                            else {
                                if((v6_1 instanceof JSONArray)) {
                                    v6_2 = new JSONObject().put(v7[v3], ((JSONArray)v6_1));
                                label_49:
                                    v6_3 = v6_2.toString();
                                    return v6_3 == null ? "" : v6_3;
                                }

                                v6_3 = "";
                            }
                        }

                        return v6_3 == null ? "" : v6_3;
                    }

                    arg6 = v4.getJSONObject(v7[v3]).toString();
                    ++v3;
                }
            }
        }
        catch(JSONException v6) {
            if(this.l) {
                Init.show(this.F + "调试->getJsonString出错：" + v6.toString());
            }

            SpiderApi v7_1 = this.H;
            if(v7_1 != null) {
                StringBuilder v1_1 = d.b("getJsonString()错误！-->");
                v1_1.append(v6.toString());
                v7_1.log(v1_1.toString());
            }
        }

        return "";
    }

    private JSONObject x(String arg63, String arg64, boolean arg65, HashMap arg66) {
        // ERROR - The method was not decompiled
        // Self interruption
    }

    public String xpDetailContent(List arg19) {
        StringBuilder v7_5;
        String v6_4;
        SpiderApi v2_3;
        List v19;
        String v0_3;
        Object v12_1;
        String v11_1;
        String v9_1;
        com.github.catvod.spider.merge.f0.b v4_1;
        String v3;
        String v14;
        String v13;
        String v12;
        String v11;
        String v7_2;
        String v0_1;
        String v6_1;
        String v10;
        String v9;
        com.github.catvod.spider.merge.f0.a v8;
        Object v7 = "";
        XBPQ v1 = this;
        List v2 = arg19;
        try {
            String[] v6 = ((String)v2.get(0)).split("\\$\\$\\$");
            String v7_1 = !v6[2].startsWith("/") || (v6[2].startsWith("//")) ? v6[2] : v1.f + v6[2];
            v8 = v1.g0(v7_1);
            v9 = v1.D("播放二次截取", "dtNode", "");
            v10 = v6[1];
            v6_1 = v6[0];
            if(v1.g) {
                v10 = v1.fixCover(v10, v7_1);
            }

            v0_1 = v1.D("简介", "dtDesc", "");
            v7_2 = v1.D("影片类型", "dtCate", "");
            v11 = v1.D("影片地区", "dtArea", "");
            v12 = v1.D("影片年代", "dtYear", "");
            v13 = v1.D("影片状态", "dtMark", "");
            v14 = v1.D("导演", "dtDirector", "");
            v3 = v1.E("主演", "演员", "dtActor", "");
        }
        catch(Exception v0) {
            goto label_392;
        }

        try {
            LinkedList v4 = (LinkedList)v8.a(v9);
            v4_1 = v4.size() <= 0 ? null : ((com.github.catvod.spider.merge.f0.b)v4.get(0));
            v7 = v4_1.c(v7_2).a().trim();
            v9_1 = v4_1.c(v12).a().trim();
            goto label_105;
        }
        catch(Exception v0_2) {
        }

        v9_1 = "";
        goto label_111;
        try {
        label_105:
            v11_1 = v4_1.c(v11).a().trim();
            v12_1 = v4_1.c(v13).a().trim();
            goto label_125;
        }
        catch(Exception v0_2) {
        }

    label_111:
        Object v3_1 = "";
        v11_1 = "";
        v12_1 = "";
        goto label_123;
        try {
            v12_1 = v4_1.c(v13).a().trim();
            goto label_125;
        }
        catch(Exception v0_2) {
        }

        v3_1 = "";
        v12_1 = "";
    label_123:
        Object v13_1 = v12_1;
        goto label_146;
        try {
        label_125:
            v3_1 = v4_1.c(v3).a().trim();
        }
        catch(Exception v0_2) {
            v3_1 = "";
            v13_1 = "";
            goto label_146;
        }

        try {
            v13_1 = v4_1.c(v14).a().trim();
            goto label_140;
        }
        catch(Exception v0_2) {
        }

        v13_1 = "";
        goto label_146;
        try {
        label_140:
            v0_3 = v4_1.c(v0_1).a().trim();
            goto label_173;
        }
        catch(Exception v0_2) {
        }

        try {
        label_146:
            if(v1.l) {
                Init.show(v1.F + "调试->xpDetailContent获取列表错：" + v0_2.toString());
            }

            SpiderApi v4_2 = v1.H;
            if(v4_2 != null) {
                v4_2.log("xpDetailContent获取列表错误！-->" + v0_2.toString());
            }

            v0_3 = "";
        label_173:
            JSONObject v4_3 = new JSONObject();
            v4_3.put("vod_id", v2.get(0));
            v4_3.put("vod_name", v6_1);
            v4_3.put("vod_pic", v10);
            v4_3.put("type_name", v7);
            v4_3.put("vod_year", v9_1);
            v4_3.put("vod_area", v11_1);
            v4_3.put("vod_remarks", v12_1);
            v4_3.put("vod_actor", v3_1);
            v4_3.put("vod_director", v13_1);
            v4_3.put("vod_content", v0_3);
            ArrayList v0_4 = new ArrayList();
            List v2_1 = v8.a(v1.D("线路数组", "dtFromNode", ""));
            int v3_2;
            for(v3_2 = 0; true; ++v3_2) {
                LinkedList v6_2 = (LinkedList)v2_1;
                int v7_3 = v6_2.size();
                if(v3_2 >= v7_3) {
                    break;
                }

                v0_4.add(((com.github.catvod.spider.merge.f0.b)v6_2.get(v3_2)).c(v1.D("线路标题", "dtFromName", "/text()")).a().trim());
            }

            ArrayList v2_2 = new ArrayList();
            String v3_3 = v1.D("播放数组", "dtUrlNode", "");
            String v6_3 = v1.D("播放列表", "dtUrlSubNode", "//a");
            String v7_4 = v1.D("播放标题", "dtUrlName", "/text()");
            String v9_2 = v1.D("播放链接", "dtUrlId", "/@href");
            List v3_4 = v8.a(v3_3);
            int v8_1 = 0;
            while(true) {
                LinkedList v10_1 = (LinkedList)v3_4;
                if(v8_1 >= v10_1.size()) {
                    break;
                }

                List v10_2 = ((com.github.catvod.spider.merge.f0.b)v10_1.get(v8_1)).b(v6_3);
                ArrayList v11_2 = new ArrayList();
                int v12_2 = 0;
                while(true) {
                    LinkedList v13_2 = (LinkedList)v10_2;
                    if(v12_2 >= v13_2.size()) {
                        break;
                    }

                    int v14_1 = v1.x ? v13_2.size() - 1 - v12_2 : v12_2;
                    String v15 = ((com.github.catvod.spider.merge.f0.b)v13_2.get(v14_1)).c(v7_4).a().trim();
                    String v13_3 = ((com.github.catvod.spider.merge.f0.b)v13_2.get(v14_1)).c(v9_2).a().trim();
                    if(v13_3 == null) {
                        v19 = v3_4;
                    }
                    else {
                        v19 = v3_4;
                        if(v13_3.length() >= 1) {
                            v11_2.add(v15 + "$" + v13_3);
                        }
                    }

                    ++v12_2;
                    v3_4 = v19;
                }

                List v19_1 = v3_4;
                if(v11_2.size() == 0 && v0_4.size() > v8_1) {
                    v0_4.set(v8_1, "");
                }

                v2_2.add(TextUtils.join("#", v11_2));
                ++v8_1;
                v3_4 = v19_1;
            }

            int v3_5;
            for(v3_5 = v0_4.size() - 1; v3_5 >= 0; --v3_5) {
                if(((String)v0_4.get(v3_5)).isEmpty()) {
                    v0_4.remove(v3_5);
                }
            }

            String v0_5 = TextUtils.join("$$$", v0_4);
            String v3_6 = TextUtils.join("$$$", v2_2);
            if(v1.H != null) {
                if(v2_2.size() < 1) {
                    v2_3 = v1.H;
                    v6_4 = "Xpath方式未获取到播放列表！";
                }
                else {
                    boolean v2_4 = v1.l;
                    if(v2_4) {
                        v2_3 = v1.H;
                        v7_5 = new StringBuilder();
                        v7_5.append("Xpath方式获取播放到列表--> ");
                        v7_5.append(v3_6);
                    }
                    else {
                        v2_3 = v1.H;
                        v7_5 = new StringBuilder();
                        v7_5.append("Xpath方式获取播放到列表--> ");
                        v7_5.append(v3_6.split("\\$\\$\\$")[0]);
                        v7_5.append("......");
                    }

                    v6_4 = v7_5.toString();
                }

                v2_3.log(v6_4);
            }

            v4_3.put("vod_play_from", v0_5);
            v4_3.put("vod_play_url", v3_6);
            JSONObject v0_6 = new JSONObject();
            JSONArray v2_5 = new JSONArray();
            v2_5.put(v4_3);
            v0_6.put("list", v2_5);
            return v0_6.toString();
        }
        catch(Exception v0) {
        }

    label_392:
        if(v1.l) {
            Init.show(v1.F + "调试->xpDetailContent出错：" + v0.toString());
        }

        SpiderApi v2_6 = v1.H;
        if(v2_6 != null) {
            b.a(v0, d.b("xpDetailContent()错误！-->"), v2_6);
        }

        return "";
    }

    private JSONObject y(String arg12, boolean arg13) {
        String v13_2;
        StringBuilder v12_5;
        String v12_4;
        String v2;
        StringBuilder v1_1;
        String v1;
        String v13_1;
        StringBuilder v13;
        String v12_3;
        StringBuilder v12_2;
        try {
            String[] v0 = arg12.split("#");
            int v12_1 = arg12.length();
            if(v12_1 < 1) {
                if(arg13) {
                    if("搜索".equals(this.q)) {
                        v12_2 = new StringBuilder();
                        v12_2.append(this.f);
                        v12_2.append("/index.php/ajax/verify_check?type=search&verify=");
                    }
                    else {
                        v12_2 = new StringBuilder();
                        v12_2.append(this.f);
                        v12_2.append("/index.php/ajax/verify_check?type=show&verify=");
                    }

                    v12_3 = v12_2.toString();
                    v13 = new StringBuilder();
                    v13.append(this.f);
                    v13.append("/index.php/verify/index.html?");
                }
                else {
                    v12_3 = this.f + "/extend/vercode/check.php?tn_r=";
                    v13 = new StringBuilder();
                    v13.append(this.f);
                    v13.append("/extend/vercode/tncode.php?");
                }

                v13_1 = v13.toString();
            }
            else {
                if(arg13) {
                    v13_1 = this.f + "/index.php/verify/index.html?";
                    if(!"搜索".equals(this.q)) {
                        goto label_101;
                    }

                    v1 = this.f + "/index.php/ajax/verify_check?type=search&verify=";
                    if("空".equals(v0[2])) {
                        goto label_200;
                    }

                    if(v0[2].startsWith("http")) {
                        v1 = v0[2];
                        goto label_200;
                    }

                    if(v0[2].startsWith("/")) {
                        v1_1 = new StringBuilder();
                        v1_1.append(this.f);
                        v2 = v0[2];
                    }
                    else {
                        v1_1 = new StringBuilder();
                        v1_1.append(this.f);
                        v1_1.append("/");
                        v2 = v0[2];
                        goto label_197;
                    label_101:
                        v1 = this.f + "/index.php/ajax/verify_check?type=show&verify=";
                        if("空".equals(v0[1])) {
                            goto label_200;
                        }

                        if(v0[1].startsWith("http")) {
                            v1 = v0[1];
                            goto label_200;
                        }

                        if(v0[1].startsWith("/")) {
                            v1_1 = new StringBuilder();
                            v1_1.append(this.f);
                        }
                        else {
                            v1_1 = new StringBuilder();
                            v1_1.append(this.f);
                            v1_1.append("/");
                        }

                        v2 = v0[1];
                    }

                    goto label_197;
                }
                else {
                    v13_1 = this.f + "/extend/vercode/tncode.php?";
                    v1 = this.f + "/extend/vercode/check.php?tn_r=";
                    if(!"搜索".equals(this.q)) {
                        goto label_172;
                    }

                    if("空".equals(v0[2])) {
                        goto label_200;
                    }

                    if(v0[2].startsWith("http")) {
                        v1 = v0[2];
                        goto label_200;
                    }

                    if(v0[2].startsWith("/")) {
                        v1_1 = new StringBuilder();
                        v1_1.append(this.f);
                        v2 = v0[2];
                    }
                    else {
                        v1_1 = new StringBuilder();
                        v1_1.append(this.f);
                        v1_1.append("/");
                        v2 = v0[2];
                        goto label_197;
                    label_172:
                        if("空".equals(v0[1])) {
                            goto label_200;
                        }

                        if(v0[1].startsWith("http")) {
                            v1 = v0[1];
                            goto label_200;
                        }

                        if(v0[1].startsWith("/")) {
                            v1_1 = new StringBuilder();
                            v1_1.append(this.f);
                        }
                        else {
                            v1_1 = new StringBuilder();
                            v1_1.append(this.f);
                            v1_1.append("/");
                        }

                        v2 = v0[1];
                    }

                label_197:
                    v1_1.append(v2);
                    v1 = v1_1.toString();
                }

            label_200:
                if(!"空".equals(v0[0])) {
                    if(v0[0].startsWith("http")) {
                        v12_4 = v0[0];
                    }
                    else {
                        if(v0[0].startsWith("/")) {
                            v12_5 = new StringBuilder();
                            v12_5.append(this.f);
                            v13_2 = v0[0];
                        }
                        else {
                            v12_5 = new StringBuilder();
                            v12_5.append(this.f);
                            v12_5.append("/");
                            v13_2 = v0[0];
                        }

                        v12_5.append(v13_2);
                        v12_4 = v12_5.toString();
                    }

                    v13_1 = v12_4;
                }

                v12_3 = v1;
            }

            JSONObject v0_1 = new JSONObject();
            v0_1.put("str", v13_1);
            v0_1.put("codeUrl", v12_3);
            return v0_1;
        }
        catch(Exception v12) {
            SpiderApi v13_3 = this.H;
            if(v13_3 != null) {
                b.a(v12, d.b("getOcrUrl()错误-->"), v13_3);
            }

            return null;
        }
    }

    protected final String z(String arg15) {
        JSONObject v2_1;
        String v6;
        String v0 = PqS.d("7A");
        String v1 = PqS.d("0002023A5B063214093C");
        String v2 = PqS.d("15");
        String v3 = PqS.d("0714012D042227");
        String v4 = PqS.d("0955");
        try {
            v6 = this.E(PqS.d("B3E3CAAEE2F9BDDED0AEC7C5B0D5D3"), PqS.d("B2EAD3AEF8E2B3E3CAAEE2F9B2EAD3A1E5F9BDD6E1A1D4D6BDDED0AEC7C5B0D5D3"), PqS.d("251D0631292F3010032D04"), "").trim();
            int v7 = v6.length();
        }
        catch(JSONException v15) {
            goto label_147;
        }

        String v8 = PqS.d("76");
        String v9 = PqS.d("71");
        if(v7 > 1) {
            try {
                if(v6.indexOf(v2) > 0) {
                    v6 = v6.replace(v2, v9).replace(PqS.d("7357"), v8).replace(PqS.d("BACDFCA7CADC"), PqS.d("6E"));
                }

            label_37:
                if((v6.startsWith(PqS.d("2E"))) && (v6.endsWith(PqS.d("28")))) {
                    return v6;
                }

                v2_1 = new JSONObject();
                String v7_1 = this.J(v6);
                v2_1.put(v1, v7_1);
                int v11 = this.r.indexOf(PqS.d("16"));
                goto label_54;
            }
            catch(JSONException v15) {
                goto label_147;
            }
        }

        goto label_37;
    label_54:
        String v12 = PqS.d("161E08231F22");
        if(v11 >= 0) {
            try {
                if(this.n(arg15).length() > 1) {
                    v2_1.put(v12, this.n(arg15));
                }

            label_62:
                if(v6.indexOf(v3) < 0 && this.r.indexOf(PqS.d("0740")) >= 0) {
                    v2_1.put(v3, arg15);
                }
                else if(v6.indexOf(v3) < 0 && this.r.indexOf(PqS.d("07")) >= 0) {
                    arg15 = arg15 + v0.replaceAll(PqS.d("7B5B4F200233250258144C687A2A39672B6C7C5E4962"), PqS.d("7140")) + v0;
                    v2_1.put(v3, arg15);
                }

                String v15_1 = v6.replaceAll(PqS.d("7B5B80DCC3AFD1E044"), "").replaceAll(PqS.d("7B5B81C1FDA1C9CB44"), "").replaceAll(PqS.d("7B5B381D3764"), "");
                if(v15_1.indexOf(v9) >= 0) {
                    String[] v15_2 = v15_1.split(v8);
                    int v0_1 = v15_2.length;
                    int v6_1;
                    for(v6_1 = 0; v6_1 < v0_1; ++v6_1) {
                        String v8_1 = v15_2[v6_1];
                        if((!v1.equals(v8_1.split(v4)[0]) || v7_1.length() <= 0) && !v12.equals(v8_1.split(v4)[0]) && !PqS.d("361E08231F22").equals(v8_1.split(v4)[0])) {
                            String v9_1 = v8_1.split(v4)[0];
                            Object v8_2 = v8_1.split(v4)[1].equals(PqS.d("B2D8DD")) ? "" : v8_1.split(v4)[1];
                            v2_1.put(v9_1, v8_2);
                        }
                    }
                }

                return v2_1.toString();
            }
            catch(JSONException v15) {
                goto label_147;
            }
        }

        goto label_62;
    label_147:
        if(this.l) {
            Init.show(this.F + PqS.d("BDC1E4A0D9D2784F002D021739101E0013263114153B93C0EF98F3D199FBCF") + v15.toString());
        }

        SpiderApi v0_2 = this.H;
        if(v0_2 != null) {
            StringBuilder v1_1 = d.b(PqS.d("321413181A262C390229122227024F619FD3CC99C8E799FBD45C4A76"));
            v1_1.append(v15.toString());
            v0_2.log(v1_1.toString());
        }

        return "";
    }
}

