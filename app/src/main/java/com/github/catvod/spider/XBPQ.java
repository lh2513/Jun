package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderApi;
import com.github.catvod.spider.merge.p014N.C0087a;
import com.github.catvod.spider.merge.p029b.C0338n;
import com.github.catvod.spider.merge.p029b.C0340p;
import com.github.catvod.spider.merge.p033d.C0374d;
import com.github.catvod.spider.merge.p038f0.C0548a;
import com.github.catvod.spider.merge.p040h.C0582b;
import com.github.catvod.spider.merge.p042i.C0595b;
import com.github.catvod.spider.merge.p044j.C0620k;
import com.github.catvod.spider.merge.p044j.C0622m;
import com.github.catvod.spider.merge.p044j.InterfaceC0619j;
import com.github.catvod.spider.merge.p046k.AbstractC0641a;
import com.github.catvod.spider.merge.p046k.AbstractC0642b;
import com.github.catvod.spider.merge.p046k.C0647g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class XBPQ extends Spider {

    
    public static String f46J = "";

    
    private static HashMap<String, String> f47K;

    
    private Context f49B;

    
    private PushAgent f50C;

    
    private String f53F;

    
    private String f58b;

    
    private int f61e;

    
    private String f70n;

    
    private boolean f57a = false;

    
    private String f59c = "";

    
    private boolean f60d = false;

    
    private String f62f = "";

    
    private boolean f63g = false;

    
    private boolean f64h = false;

    
    private boolean f65i = false;

    
    private List<String> f66j = null;

    
    private JSONObject f67k = null;

    
    private boolean f68l = false;

    
    private String f69m = "";

    
    private int f71o = 0;

    
    private boolean f72p = false;

    
    private String f73q = "";

    
    private String f74r = "";

    
    private boolean f75s = false;

    
    private int f76t = 0;

    
    private int f77u = 3;

    
    private String f78v = "";

    
    private String f79w = "";

    
    private boolean f80x = false;

    
    private String f81y = "";

    
    private String f82z = "";

    
    protected JSONObject f48A = null;

    
    private boolean f51D = true;

    
    private HashMap<String, String> f52E = null;

    
    private int f54G = 0;

    
    private SpiderApi f55H = null;

    
    private String f56I = "9978";

    
    
    
    private org.json.JSONObject m1600A(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1600A(java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    
    private String m1599B(String str) {
        return m1598C(str, "");
    }

    private java.lang.String m1598C(java.lang.String r10, java.lang.String r11) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1598C(java.lang.String, java.lang.String):java.lang.String");
    }

    
    private String m1597D(String str, String str2, String str3) {
        return m1598C(str, m1598C(str2, str3));
    }

    
    private String m1596E(String str, String str2, String str3, String str4) {
        return m1598C(str, m1598C(str2, m1598C(str3, str4)));
    }

    
    private String m1595F(String str, String str2, String str3, String str4, String str5) {
        return m1598C(str, m1598C(str2, m1598C(str3, m1598C(str4, str5))));
    }

    
    private String m1594G(String str, String str2, String str3, String str4, String str5, String str6) {
        return m1598C(str, m1598C(str2, m1598C(str3, m1598C(str4, m1598C(str5, str6)))));
    }

    
    private String m1593H(String str, String str2, String str3, String str4, String str5, String str6) {
        return m1598C(str, m1598C(str2, m1598C(str3, m1598C(str4, m1598C(str5, m1598C(str6, ""))))));
    }

    
    private String m1590K(String str) {
        Charset charset;
        if (str.indexOf("时间戳") >= 0) {
            StringBuilder m817b = C0374d.m817b("");
            m817b.append(new Date().getTime());
            str = str.replace("时间戳", m817b.toString());
        }
        if (str.indexOf(":9978/") > 0 && !"9978".equals(this.f56I)) {
            str = str.replace("9978", this.f56I);
        }
        if (str.indexOf("md5(") > 0) {
            String replaceAll = str.replaceAll("md5\\((.*?)\\)", "$1");
            if (replaceAll.indexOf(",iso") > 0) {
                replaceAll = replaceAll.split(",")[0];
                charset = C0622m.f1175c;
            } else {
                charset = C0622m.f1174b;
            }
            str = str.replaceAll("md5\\(.*?\\)", C0622m.m331a(replaceAll, charset));
        }
        if (str.indexOf("+url:") > 0) {
            String[] split = str.split("\\+url\\:");
            if (split.length > 1) {
                if (str.indexOf("$sub:") <= 0) {
                    return split[0] + m1558j(split[1]);
                }
                String[] split2 = split[1].split("\\$sub\\:");
                if (split2.length > 1) {
                    return split[0] + m1569c0(m1558j(split2[0]), split2[1], "").get(0).trim();
                }
                return split[0] + m1558j(split2[0]);
            }
            return split[0];
        }
        return str;
    }

    
    private String m1589L(String str) {
        if (str.length() < 1) {
            return str;
        }
        String replaceAll = str.replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "/").replaceAll("[><]", "").replaceAll(" ", "空空空").replaceAll("\\s+", "").replaceAll("空空空", " ").replaceAll("/+", "/");
        while (replaceAll.startsWith("/")) {
            replaceAll = replaceAll.substring(1, replaceAll.length());
        }
        while (replaceAll.endsWith("/")) {
            replaceAll = replaceAll.substring(0, replaceAll.length() - 1);
        }
        return replaceAll;
    }

    private void m1588M() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1588M():void");
    }

    
    private String m1587N(String str) {
        return str.indexOf("转义井号") >= 0 ? str.replace("转义井号", "#") : str;
    }

    
    private String m1586O(String str, String str2, String str3) {
        try {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                spiderApi.log("请求跳转播放链接源码，webUrl--> " + str);
            }
            String m1558j = m1558j(str);
            SpiderApi spiderApi2 = this.f55H;
            if (spiderApi2 != null) {
                if (m1558j == null) {
                    spiderApi2.log("未获取到跳转源码");
                    m1558j = "";
                } else {
                    spiderApi2.log(this.f68l ? "获取到跳转源码--> " + m1558j : "获取到跳转源码--> " + m1558j.split("<meta http")[0].split(",\\{")[0] + "......");
                }
            }
            if (str2.length() <= 0) {
                str2 = "\"url\"*\"&&\",";
            }
            if (m1558j != null && m1558j.startsWith("{") && m1558j.endsWith("}") && str2.indexOf("&&") < 0) {
                JSONObject jSONObject = new JSONObject(m1558j);
                if (str2.indexOf(".") < 0) {
                    jSONObject.optString(str2).getClass();
                } else {
                    m1547u(m1558j, str2);
                }
            } else if (m1558j != null && str2.indexOf("&&") >= 0) {
                ArrayList<String> m1576Y = m1576Y(m1558j, str3, "");
                for (int i = 0; i < m1576Y.size(); i++) {
                    String str4 = m1576Y.get(i);
                    if (str4.length() > 10) {
                        ArrayList<String> m1576Y2 = m1576Y(str4, str2, "");
                        for (int i2 = 0; i2 < m1576Y2.size(); i2++) {
                            String trim = m1576Y2.get(i2).trim();
                            try {
                                if (this.f74r.indexOf("u0") < 0) {
                                    trim = URLDecoder.decode(trim);
                                }
                            } catch (Exception e) {
                                if (this.f68l) {
                                    Init.show(this.f53F + "调试->跳转Url解码出错：" + e.toString());
                                }
                                SpiderApi spiderApi3 = this.f55H;
                                if (spiderApi3 != null) {
                                    spiderApi3.log("跳转Url解码错误！-->" + e.toString());
                                }
                            }
                            if (trim.length() > 10) {
                                return trim;
                            }
                        }
                        continue;
                    }
                }
            }
            return str;
        } catch (Exception e2) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->jumpCut出错：" + e2.toString());
            }
            SpiderApi spiderApi4 = this.f55H;
            if (spiderApi4 != null) {
                C0595b.m368a(e2, C0374d.m817b("jumpCut()错误！-->"), spiderApi4);
            }
            return str;
        }
    }

    
    
    
    
    
    private java.lang.String m1585P(java.lang.String r12, java.lang.String r13) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1585P(java.lang.String, java.lang.String):java.lang.String");
    }

    
    private String m1584Q(String str) {
        if (str.indexOf("转义左括号") >= 0) {
            str = str.replace("转义左括号", "[");
        }
        return str.indexOf("转义右括号") >= 0 ? str.replace("转义右括号", "]") : str;
    }

    
    private String m1583R(String str, String str2) {
        if (str2.equals("*") || str2.isEmpty()) {
            str2 = str;
        }
        String[] split = str.split("\\&");
        String[] split2 = str2.split("\\&");
        int i = 0;
        String str3 = "";
        while (i < split.length) {
            String str4 = i < split.length + (-1) ? "#" : "";
            StringBuilder m817b = C0374d.m817b(str3);
            m817b.append(split[i]);
            m817b.append("$");
            str3 = C0338n.m1036b(m817b, split2[i], str4);
            i++;
        }
        return str3;
    }

    
    private String m1582S(String str, String str2) {
        String str3;
        String str4;
        if (str.length() > 1) {
            String[] split = str.split("#");
            if (split.length == 1) {
                str3 = split[0].replaceAll(".*(http.*)", "$1");
            } else if (split.length > 1) {
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str4 = "";
                        break;
                    }
                    String str5 = split[i];
                    if (str2.equals(str5.split("\\$")[0])) {
                        str4 = str5.split("\\$")[1];
                        break;
                    }
                    i++;
                }
                str3 = str4.length() < 1 ? split[0].split("\\$")[1] : str4;
            } else {
                str3 = "";
            }
            return (str3 == null || !str3.startsWith("http")) ? "" : str3;
        }
        return "";
    }

    
    private void m1581T(Map<String, List<String>> map) {
        String[] split;
        if (map.isEmpty()) {
            return;
        }
        SpiderApi spiderApi = this.f55H;
        if (spiderApi != null) {
            StringBuilder m817b = C0374d.m817b("响应--> ");
            m817b.append(map.toString());
            spiderApi.log(m817b.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (map.get("set-cookie") != null && !map.get("set-cookie").isEmpty()) {
            for (String str : map.get("set-cookie")) {
                sb.append(str.split(";")[0]);
                sb.append(";");
            }
        }
        if (map.get("Set-cookie") != null && !map.get("Set-cookie").isEmpty()) {
            for (String str2 : map.get("Set-cookie")) {
                if (sb.indexOf(str2.split(";")[0]) < 0) {
                    sb.append(str2.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (map.get("Set-Cookie") != null && !map.get("Set-Cookie").isEmpty()) {
            for (String str3 : map.get("Set-Cookie")) {
                if (sb.indexOf(str3.split(";")[0]) < 0) {
                    sb.append(str3.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (map.get("set-Cookie") != null && !map.get("set-Cookie").isEmpty()) {
            for (String str4 : map.get("set-Cookie")) {
                if (sb.indexOf(str4.split(";")[0]) < 0) {
                    sb.append(str4.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (sb.toString().length() < 3) {
            return;
        }
        for (String str5 : sb.toString().split(";")) {
            if (this.f81y.indexOf(str5.split("=")[0]) >= 0) {
                if (!str5.endsWith("=") && !"0".equals(str5.split("=")[1])) {
                    String replaceAll = C0338n.m1036b(new StringBuilder(), this.f81y, ";").replaceAll(C0338n.m1036b(new StringBuilder(), str5.split("=")[0], "=.*?;"), str5 + ";");
                    this.f81y = replaceAll;
                    str5 = replaceAll.substring(0, replaceAll.length() - 1);
                }
            } else if (this.f81y.length() >= 1 && !"0".equals(this.f81y)) {
                str5 = this.f81y + ";" + str5;
            }
            this.f81y = str5;
        }
    }

    
    private static String m1579V(String str) {
        if (str.length() < 1) {
            return str;
        }
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            str = str.replace(group, ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str.replaceAll("\\\\", "");
    }

    
    
    private org.json.JSONObject m1578W(java.lang.String r70, java.lang.String r71, boolean r72) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1578W(java.lang.String, java.lang.String, boolean):org.json.JSONObject");
    }

    
    private void m1577X(String str) {
        if (m1599B("简介").length() > 0) {
            C0340p.f654l = m1589L(m1576Y(str, m1599B("简介"), "").get(0));
        }
        if (m1599B("导演").length() > 0) {
            C0340p.f655m = m1589L(m1576Y(str, m1599B("导演"), "").get(0));
        }
        if (m1597D("主演", "演员", "").length() > 0) {
            C0340p.f656n = m1589L(m1576Y(str, m1597D("主演", "演员", ""), "").get(0));
        }
    }

    
    
    
    
    private java.util.ArrayList<java.lang.String> m1576Y(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1576Y(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    
    
    
    
    private java.util.ArrayList<java.lang.String> m1575Z(java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1575Z(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    
    private String m1573a0(String str, String str2) {
        String str3;
        String str4;
        String m1559i;
        StringBuilder sb;
        try {
            String replaceAll = str2.replaceAll(".*<序号>(.*)", "$1");
            String replaceAll2 = str2.replaceAll("<序号>.*", "");
            if (str.indexOf("替换") >= 0) {
                String replaceAll3 = str.replaceAll(".*\\[仅?替换[:：](.*?)\\].*", "$1");
                char c = 0;
                if (replaceAll3.indexOf("##") >= 0) {
                    return m1576Y(replaceAll2, replaceAll3.replace("##", "&&"), "").get(0).trim();
                }
                String replace = m1584Q(replaceAll3).replace("<序号>", replaceAll);
                if (!replace.isEmpty()) {
                    String[] split = replace.split("#");
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String m1587N = m1587N(split[i]);
                        if (m1587N.indexOf(">>>") < 0) {
                            str3 = m1587N.split(">>")[c];
                            str4 = m1587N.split(">>")[1];
                        } else {
                            str3 = m1587N.split(">>>")[c] + ">";
                            str4 = m1587N.split(">>>")[1];
                        }
                        String m1563f0 = m1563f0(str4);
                        if (str3.indexOf("*") >= 0 && m1563f0.length() > 0) {
                            if (m1563f0.equals("空")) {
                                m1563f0 = "";
                            }
                            if (str3.startsWith("*")) {
                                String m1565e0 = m1565e0(str3.substring(1, str3.length()));
                                sb = new StringBuilder();
                                sb.append("([\\S\\s]*?)");
                                sb.append(m1559i(m1565e0));
                            } else if (str3.endsWith("*")) {
                                String m1565e02 = m1565e0(str3.substring(0, str3.length() - 1));
                                sb = new StringBuilder();
                                sb.append(m1559i(m1565e02));
                                sb.append("([\\S\\s]*?)");
                            } else {
                                String m1565e03 = m1565e0(str3.split("\\*")[0]);
                                String m1565e04 = m1565e0(str3.split("\\*")[1]);
                                m1559i = m1559i(m1565e03) + "([\\S\\s]*?)" + m1559i(m1565e04);
                            }
                            m1559i = sb.toString();
                        } else if (m1563f0.length() <= 0) {
                            continue;
                            i++;
                            c = 0;
                        } else if (str3.equals("空")) {
                            return m1563f0;
                        } else {
                            if (m1563f0.equals("空")) {
                                m1563f0 = "";
                            }
                            m1559i = m1559i(m1565e0(str3));
                        }
                        replaceAll2 = replaceAll2.replaceAll(m1559i, m1563f0);
                        i++;
                        c = 0;
                    }
                }
            }
            return replaceAll2;
        } catch (Exception e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->替换出错，请检查：" + str + "->" + e.toString());
            }
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("替换tH()错误！-->"), spiderApi);
            }
            return str2;
        }
    }

    
    
    
    
    private java.util.ArrayList<java.lang.String> m1571b0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1571b0(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    
    
    
    
    private java.util.ArrayList<java.lang.String> m1569c0(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1569c0(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    
    private JSONObject m1566e(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            this.f79w = "";
            JSONObject m1544x = m1544x(str, str2, z, hashMap);
            JSONArray jSONArray = new JSONArray();
            if (m1544x != null) {
                jSONArray = m1544x.getJSONArray("list");
            }
            if (jSONArray.length() < 1 && this.f78v.length() < 1) {
                if ("搜索".equals(this.f73q) && this.f74r.indexOf("k0") >= 0) {
                    this.f74r = this.f74r.replace("k0", "");
                }
                if (this.f74r.indexOf("c") < 0) {
                    this.f74r += "c";
                }
                SpiderApi spiderApi = this.f55H;
                if (spiderApi != null) {
                    spiderApi.log("自动模式<li>未截取到数据，尝试用<a>再截取一次");
                }
                this.f78v = "<a&&</a>";
                m1544x = m1544x(str, str2, z, hashMap);
            }
            if (m1544x != null) {
                jSONArray = m1544x.getJSONArray("list");
            }
            if (jSONArray.length() < 1 && "<a&&</a>".equals(this.f78v)) {
                SpiderApi spiderApi2 = this.f55H;
                if (spiderApi2 != null) {
                    spiderApi2.log("自动模式<a>未截取到数据，尝试用<div>再截取一次");
                }
                this.f78v = "<div&&</div>";
                m1544x = m1544x(str, str2, z, hashMap);
                if ("搜索".equals(this.f73q)) {
                    this.f78v = "";
                }
            }
            final String m1599B = m1599B("浏览器");
            if ((m1599B.length() < 1 && this.f74r.indexOf("L") >= 0) || "1".equals(m1599B)) {
                m1599B = this.f62f;
            }
            final String m1554n = m1554n(m1599B);
            if (!"搜索".equals(this.f73q) && m1599B.startsWith("http") && !"0".equals(this.f82z)) {
                try {
                    Init.run(new Runnable() {                         @Override                         public final void run() {
                            final XBPQ xbpq = XBPQ.this;
                            String str3 = m1599B;
                            String str4 = m1554n;
                            String str5 = XBPQ.f46J;
                            xbpq.getClass();
                            C0620k.m365A("内置网页浏览器", str3, str4, new InterfaceC0619j() {                                 @Override                                 public void vertifyCode(String str6) {
                                    if (str6.indexOf("$$$") > 1) {
                                        String[] split = str6.split("\\$\\$\\$");
                                        XBPQ.f46J = split[0].split("#")[0];
                                        XBPQ.this.f81y = split[0].split("#")[1];
                                        SharedPreferences.Editor edit = Init.f37d.edit();
                                        edit.putString(C0338n.m1036b(new StringBuilder(), XBPQ.this.f53F, "_ua"), split[0].split("#")[0]);
                                        edit.putString(XBPQ.this.f53F, split[0].split("#")[1]);
                                        edit.apply();
                                    }
                                    XBPQ.this.f82z = "0";
                                }
                            });
                        }
                    }, 200);
                    if (!"0".equals(this.f82z)) {
                        this.f82z = "";
                    }
                } catch (Exception e) {
                    if (this.f68l) {
                        Init.show(this.f53F + "调试->内置浏览器运行出错：" + e.toString());
                    }
                    SpiderApi spiderApi3 = this.f55H;
                    if (spiderApi3 != null) {
                        spiderApi3.log("内置浏览器运行()错误！-->" + e.toString());
                    }
                }
            }
            this.f79w = "";
            return m1544x;
        } catch (JSONException e2) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->category出错：" + e2.toString());
            }
            SpiderApi spiderApi4 = this.f55H;
            if (spiderApi4 != null) {
                StringBuilder m817b = C0374d.m817b("category()错误！-->");
                m817b.append(e2.toString());
                spiderApi4.log(m817b.toString());
            }
            this.f79w = "";
            return null;
        }
    }

    
    private String m1565e0(String str) {
        return str.indexOf("转义星号") >= 0 ? str.replace("转义星号", "*") : str;
    }

    
    private String m1563f0(String str) {
        try {
            if (str.length() < 0) {
                return "";
            }
            if (str.indexOf("*") < 0) {
                return m1565e0(str);
            }
            Matcher matcher = Pattern.compile(m1559i(m1565e0(str.split("\\*")[0])) + "([\\S\\s]*?)" + m1559i(m1565e0(str.split("\\*")[1]))).matcher(this.f79w);
            if (matcher.find()) {
                return matcher.group(1).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
            }
            if (this.f68l) {
                Init.show("替换未获取到有效截取内容");
            }
            return "";
        } catch (Exception e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->替换截取出错：" + e.toString());
            }
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("替换截取xhSubCut()错误！-->"), spiderApi);
            }
            return "";
        }
    }

    private String fixCover(String str, String str2) {
        try {
            return "proxy:proxy://do=xbpq&site=" + str2 + "&pic=" + str;
        } catch (Exception e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->fixCover出错：" + e.toString());
            }
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("fixCover()错误-->"), spiderApi);
            }
            return str;
        }
    }

    private org.json.JSONArray m1562g(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1562g(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONArray");
    }

    
    private String m1560h(String str) {
        String str2;
        String[] split;
        AbstractC0641a abstractC0641a = new AbstractC0641a() {             
            @Override             public final void onFailure(Call call, Exception exc) {
            }

            @Override             protected final   void onResponse(Response response) {
            }
        };
        String str3 = this.f74r;
        String trim = str.indexOf(";post") > 0 ? str.split(";post;")[1].trim() : "";
        String str4 = str.split(";")[0];
        if (this.f74r.indexOf("J") < 0 || str4.indexOf("outerHTML") >= 0 || str4.indexOf("innerHTML") >= 0 || this.f55H == null) {
            str2 = str4;
        } else {
            str2 = this.f55H.getAddress(true) + "webparse/" + str4 + "<<eval" + (str3.matches(".*Jb?\\d+.*") ? str3.replaceAll(".*Jb?(\\d+).*", "$1") : "") + (this.f74r.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML");
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                spiderApi.log("正在使用代理--> " + str2);
            }
        }
        HashMap<String, String> m1550r = !"搜索".equals(this.f73q) ? m1550r(str4) : m1592I(str4);
        if (trim.length() > 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str5 : trim.split("\\&")) {
                if (!str5.endsWith("=")) {
                    int indexOf = str5.indexOf("=");
                    linkedHashMap.put(str5.substring(0, indexOf), str5.substring(indexOf + 1));
                }
            }
            if (trim.isEmpty()) {
                C0647g.m310e(C0647g.m313b(), str2, null, m1550r, abstractC0641a);
            } else {
                C0647g.m310e(C0647g.m313b(), str2, linkedHashMap, m1550r, abstractC0641a);
            }
        } else {
            C0647g.m312c(C0647g.m313b(), str2, m1550r, abstractC0641a);
        }
        try {
            byte[] bytes = abstractC0641a.getResult().body().bytes();
            return bytes != null ? new String(bytes, this.f74r.indexOf("g") >= 0 ? "GBK" : m1596E("编码", "网页编码格式", "Coding_format", "UTF-8")) : "";
        } catch (IOException e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->deEnCode出错：" + e.toString());
            }
            SpiderApi spiderApi2 = this.f55H;
            if (spiderApi2 != null) {
                StringBuilder m817b = C0374d.m817b("deEnCode()错误-->");
                m817b.append(e.toString());
                spiderApi2.log(m817b.toString());
            }
            return "";
        }
    }

    
    
    
    
    
    
    
    
    
    
    private java.lang.String m1556l() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1556l():java.lang.String");
    }

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get("site");
            String str2 = map.get("pic");
            if (f47K == null) {
                HashMap<String, String> hashMap = new HashMap<>();
                f47K = hashMap;
                hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                f47K.put("referer", str);
            }
            AbstractC0641a abstractC0641a = new AbstractC0641a() {                 
                @Override                 public final void onFailure(Call call, Exception exc) {
                }

                @Override                 protected final   void onResponse(Response response) {
                }
            };
            C0647g.m312c(C0647g.m313b(), str2, f47K, abstractC0641a);
            if (abstractC0641a.getResult().code() == 200) {
                String str3 = abstractC0641a.getResult().headers().get("Content-Type");
                if (str3 == null) {
                    str3 = "application/octet-stream";
                }
                System.out.println(str2);
                System.out.println(str3);
                return new Object[]{200, str3, abstractC0641a.getResult().body().byteStream()};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    
    private JSONObject m1555m(String str, String str2) {
        String str3;
        StringBuilder sb;
        String str4;
        StringBuilder sb2;
        String str5;
        StringBuilder sb3;
        try {
            if (str2.equals("post") || str2.equals("空#post#空")) {
                str2 = "空#" + this.f62f + "/index.php/ajax/verify_check?type=show&verify={code};post;#空";
            }
            String[] split = str2.split("#");
            if (str2.length() < 1) {
                if ("搜索".equals(this.f73q)) {
                    sb3 = new StringBuilder();
                    sb3.append(this.f62f);
                    sb3.append("/index.php/ajax/verify_check?type=search&verify=");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(this.f62f);
                    sb3.append("/index.php/ajax/verify_check?type=show&verify=");
                }
                str3 = sb3.toString();
                if (this.f74r.indexOf("y") >= 0) {
                    str = this.f62f + "/index.php/verify/index.html?";
                }
            } else {
                if (this.f74r.indexOf("y") >= 0) {
                    str = this.f62f + "/index.php/verify/index.html?";
                }
                if (!"空".equals(split[0])) {
                    if (split[0].startsWith("http")) {
                        str = split[0];
                    } else {
                        if (split[0].startsWith("/")) {
                            sb2 = new StringBuilder();
                            sb2.append(this.f62f);
                            str5 = split[0];
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(this.f62f);
                            sb2.append("/");
                            str5 = split[0];
                        }
                        sb2.append(str5);
                        str = sb2.toString();
                    }
                }
                if ("搜索".equals(this.f73q)) {
                    str3 = this.f62f + "/index.php/ajax/verify_check?type=search&verify=";
                    if (!"空".equals(split[2])) {
                        if (split[2].startsWith("http")) {
                            str3 = split[2];
                        } else {
                            if (split[2].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f62f);
                                str4 = split[2];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f62f);
                                sb.append("/");
                                str4 = split[2];
                            }
                            sb.append(str4);
                            str3 = sb.toString();
                        }
                    }
                } else {
                    str3 = this.f62f + "/index.php/ajax/verify_check?type=show&verify=";
                    if (!"空".equals(split[1])) {
                        if (split[1].startsWith("http")) {
                            str3 = split[1];
                        } else {
                            if (split[1].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f62f);
                                str4 = split[1];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f62f);
                                sb.append("/");
                                str4 = split[1];
                            }
                            sb.append(str4);
                            str3 = sb.toString();
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("str", str);
            jSONObject.put("codeUrl", str3);
            return jSONObject;
        } catch (Exception e) {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("getCodeUrl()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    
    private JSONObject m1553o(String str, String str2, String str3) {
        String str4;
        try {
            Response execute = C0647g.m313b().newCall(new Request.Builder().url(str).addHeader("User-Agent", m1591J("")).build()).execute();
            String str5 = execute.headers().get("Set-Cookie");
            InputStream byteStream = execute.body().byteStream();
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = byteStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String replaceAll = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0).replaceAll("\\s", "");
            if (str3.equals("1")) {
                str4 = "{\"ocr_type\":1,\"img\":\"" + replaceAll + "\",\"backgroundlmg\":\"None\"}";
            } else {
                str4 = "";
            }
            if (str3.equals("3")) {
                str4 = "{\"ocr_type\":3,\"img\":\"" + replaceAll + "\"}";
            }
            JSONObject jSONObject = new JSONObject(C0647g.m313b().newCall(new Request.Builder().url(str2).post(RequestBody.create(MediaType.parse("application/json"), str4)).addHeader("User-Agent", m1591J("")).build()).execute().body().string());
            JSONObject jSONObject2 = new JSONObject();
            if (str3.equals("1")) {
                jSONObject2.put("cookie", str5);
                jSONObject2.put("code", jSONObject.getString("result"));
                return jSONObject2;
            } else if (str3.equals("3")) {
                jSONObject2.put("cookie", str5);
                jSONObject2.put("code", jSONObject.getJSONObject("result").getString("target").replaceAll("[\\[\\]]", ""));
                return jSONObject2;
            } else {
                return null;
            }
        } catch (Exception e) {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("getDatas()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    
    private String m1552p(String str, String str2) {
        if (str.indexOf(str2) < 0) {
            return "";
        }
        return ("#" + str + "#").replaceAll(".*" + str2 + "\\$([^#]+?)#.*", "$1");
    }

    
    
    
    
    
    
    private org.json.JSONObject m1551q() {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1551q():org.json.JSONObject");
    }

    
    private String m1549s(int i, String str, String str2) {
        String[] split;
        StringBuilder sb;
        String str3;
        String str4;
        String[] split2;
        StringBuilder sb2;
        String str5;
        String replaceAll = C0338n.m1036b(C0374d.m817b("#"), this.f59c, "#").replaceAll(".*#(.*?)\\$" + str + "#.*", "$1");
        if (str2.indexOf("||") >= 0 || str2.indexOf("--") >= 0) {
            if (str2.indexOf("--") < 0) {
                return str + "--" + str2.split("\\|\\|")[i];
            }
            if (str2.indexOf("||") < 0) {
                if (replaceAll.equals(str2.split("--")[0])) {
                    sb = new StringBuilder(str);
                    sb.append("--");
                    str3 = str2.split("--")[1];
                    sb.append(str3);
                    str4 = sb.toString();
                    break;
                }
                str4 = "0";
            } else {
                for (String str6 : str2.split("\\|\\|")) {
                    if (replaceAll.equals(str6.split("--")[0])) {
                        sb = new StringBuilder(str);
                        sb.append("--");
                        str3 = str6.split("--")[1];
                        sb.append(str3);
                        str4 = sb.toString();
                        break;
                    }
                }
                str4 = "0";
            }
            if (str4.equals("0")) {
                if (str2.indexOf("||") < 0) {
                    String str7 = str2.split("--")[0];
                    StringBuilder m817b = C0374d.m817b("");
                    m817b.append(i + 1);
                    if (str7.equals(m817b.toString())) {
                        sb2 = new StringBuilder(str);
                        sb2.append("--");
                        str5 = str2.split("--")[1];
                        sb2.append(str5);
                        return sb2.toString();
                    }
                } else {
                    for (String str8 : str2.split("\\|\\|")) {
                        String str9 = str8.split("--")[0];
                        StringBuilder m817b2 = C0374d.m817b("");
                        m817b2.append(i + 1);
                        if (str9.equals(m817b2.toString())) {
                            sb2 = new StringBuilder(str);
                            sb2.append("--");
                            str5 = str8.split("--")[1];
                            sb2.append(str5);
                            return sb2.toString();
                        }
                    }
                }
            }
            return str4;
        }
        return str2;
    }

    
    private JSONArray m1548t(String str, String str2) {
        try {
            if (str2.length() < 1) {
                return new JSONArray(str);
            }
            if (str2.indexOf("&&") >= 0) {
                str2 = "data";
            }
            JSONArray jSONArray = new JSONArray();
            String str3 = "";
            if (str2.indexOf("[") >= 0) {
                String replaceAll = str2.replaceAll(".*\\[(.*?)\\].*", "$1");
                str2 = str2.replaceAll("\\[.*", "");
                str3 = replaceAll;
            }
            String[] split = str2.split("\\.");
            int i = 0;
            for (int i2 = 0; i2 < split.length; i2++) {
                JSONObject jSONObject = new JSONObject(str);
                if (i2 == split.length - 1) {
                    if (jSONObject.get(split[i2]) instanceof JSONObject) {
                        jSONArray.put(jSONObject.getJSONObject(split[i2]));
                        return jSONArray;
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray(split[i2]);
                    int length = jSONArray2.length();
                    if (str3 == null || str3.length() <= 0) {
                        return jSONArray2;
                    }
                    if (str3.indexOf(",") >= 0 || !str3.matches("\\d+")) {
                        String replaceAll2 = str3.replaceAll("(.*),.*", "$1");
                        String replaceAll3 = str3.replaceAll(".*,(.*)", "$1");
                        if (replaceAll3 != null && replaceAll3.length() > 0 && replaceAll3.matches("\\d+") && Integer.parseInt(replaceAll3) < length) {
                            length = Integer.parseInt(replaceAll3);
                        }
                        if (replaceAll2 != null && replaceAll2.length() > 0 && replaceAll2.matches("\\d+") && Integer.parseInt(replaceAll2) <= length) {
                            i = Integer.parseInt(replaceAll2) - 1;
                        }
                    } else {
                        if (length > Integer.parseInt(str3)) {
                            length = Integer.parseInt(str3);
                        }
                        i = length - 1;
                    }
                    while (i < length) {
                        jSONArray.put(jSONArray2.getJSONObject(i));
                        i++;
                    }
                    return jSONArray;
                }
                str = jSONObject.getJSONObject(split[i2]).toString();
            }
            return null;
        } catch (JSONException e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->getJsonArray出错：" + e.toString());
            }
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                StringBuilder m817b = C0374d.m817b("getJsonArray()错误！-->");
                m817b.append(e.toString());
                spiderApi.log(m817b.toString());
            }
            return null;
        }
    }

    
    private String m1547u(String str, String str2) {
        String sb;
        String m1558j;
        String str3 = "";
        if (str2.indexOf("替换") >= 0) {
            String replaceAll = str2.replaceAll(".*(\\[仅?替换[:：][^\\]]+?\\]).*", "$1");
            str2 = str2.replaceAll("\\[仅?替换[:：]([^\\]]+?)\\]", "");
            str3 = replaceAll;
        }
        if (str2.indexOf("+") < 0) {
            sb = m1546v(str, str2);
        } else {
            String[] split = str2.split("\\+");
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                if (split[i].startsWith("url:")) {
                    String substring = split[i].substring(4);
                    if (substring.indexOf("$sub:") > 0) {
                        String[] split2 = substring.split("\\$sub\\:");
                        if (split2.length > 1) {
                            m1558j = m1546v(m1558j(split2[0]), split2[1]);
                        } else {
                            substring = split2[0];
                        }
                    }
                    m1558j = m1558j(substring);
                } else {
                    m1558j = m1546v(str, split[i]);
                }
                if (m1558j.length() > 0) {
                    if (m1558j.startsWith("http") && !sb2.toString().trim().endsWith("=") && !sb2.toString().trim().endsWith("解析")) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(m1558j);
                }
            }
            sb = sb2.toString();
        }
        return m1573a0(str3, sb);
    }

    
    private String m1546v(String str, String str2) {
        if (str2.endsWith("整页")) {
            str2 = str2.replace("整页", "");
            if (this.f79w.length() > 0) {
                str = this.f79w;
            }
        }
        try {
            if (str2.indexOf("'") >= 0) {
                return str2.replace("'", "");
            }
            str2 = (str2.indexOf("&&") >= 0 || str2.length() < 1) ? "data" : "data";
            if (str2.indexOf("].") < 0) {
                return m1545w(str, str2);
            }
            String str3 = ",";
            String[] split = str2.split("\\]\\.");
            if (split.length > 2) {
                for (int i = 0; i < split.length - 2; i++) {
                    str = m1548t(str, split[i] + "]").getJSONObject(0).toString();
                }
            }
            String str4 = split[split.length - 1];
            String str5 = split[split.length - 2] + "]";
            if (str4.indexOf("(") >= 0) {
                str3 = str4.replaceAll(".*\\((.*?)\\).*", "$1");
                str4 = str4.replaceAll("\\(.*", "");
            }
            JSONArray m1548t = m1548t(str, str5);
            StringBuilder sb = new StringBuilder();
            if (m1548t == null || m1548t.length() <= 0) {
                return "";
            }
            for (int i2 = 0; i2 < m1548t.length(); i2++) {
                String jSONObject = m1548t.getJSONObject(i2).toString();
                if (i2 == m1548t.length() - 1) {
                    str3 = "";
                }
                sb.append(m1545w(jSONObject, str4));
                sb.append(str3);
            }
            return sb.toString();
        } catch (JSONException e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->getJsonArrayStringAction出错：" + e.toString());
            }
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                StringBuilder m817b = C0374d.m817b("getJsonArrayStringAction()错误！-->");
                m817b.append(e.toString());
                spiderApi.log(m817b.toString());
            }
            return "";
        }
    }

    
    private String m1545w(String str, String str2) {
        boolean z;
        String replaceAll;
        JSONObject put;
        try {
            str2 = (str2.indexOf("&&") >= 0 || str2.length() < 1) ? "data" : "data";
            if (str2.endsWith(";json;")) {
                str2 = str2.substring(0, str2.length() - 6);
                z = true;
            } else {
                z = false;
            }
            if (str2.indexOf("[") < 0) {
                String[] split = str2.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (i == split.length - 1) {
                        if (z) {
                            Object obj = jSONObject.get(split[i]);
                            if (obj instanceof JSONObject) {
                                put = (JSONObject) obj;
                            } else if (obj instanceof JSONArray) {
                                put = new JSONObject().put(split[i], (JSONArray) obj);
                            } else {
                                replaceAll = "";
                            }
                            replaceAll = put.toString();
                        } else {
                            replaceAll = jSONObject.optString(split[i]).trim().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll("\"", "");
                        }
                        return replaceAll != null ? replaceAll : "";
                    }
                    str = jSONObject.getJSONObject(split[i]).toString();
                }
            }
            return "";
        } catch (JSONException e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->getJsonString出错：" + e.toString());
            }
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                StringBuilder m817b = C0374d.m817b("getJsonString()错误！-->");
                m817b.append(e.toString());
                spiderApi.log(m817b.toString());
            }
            return "";
        }
    }

    
    
    private org.json.JSONObject m1544x(java.lang.String r63, java.lang.String r64, boolean r65, java.util.HashMap<java.lang.String, java.lang.String> r66) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1544x(java.lang.String, java.lang.String, boolean, java.util.HashMap):org.json.JSONObject");
    }

    
    
    
    
    private org.json.JSONObject m1543y(java.lang.String r12, boolean r13) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1543y(java.lang.String, boolean):org.json.JSONObject");
    }

    
    
    
    protected final java.util.HashMap<java.lang.String, java.lang.String> m1592I(java.lang.String r13) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1592I(java.lang.String):java.util.HashMap");
    }

    
    
    
    protected final java.lang.String m1591J(java.lang.String r11) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1591J(java.lang.String):java.lang.String");
    }

    
    final String m1580U(String str) {
        return C0087a.m1426l(str).m889p0();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        SpiderApi spiderApi = this.f55H;
        if (spiderApi != null) {
            spiderApi.log("categoryContent(tid=" + str + ", pg=" + str2 + ", filter=" + z + ", extend=" + hashMap.toString() + ")");
        }
        JSONObject m1566e = m1566e(str, str2, z, hashMap);
        return m1566e != null ? m1566e.toString() : "";
    }

    
    protected final String m1567d0(String str, String str2, String str3, String str4) {
        String sb;
        HashMap<String, String> m1592I;
        if ("0".equals(this.f82z)) {
            return str3;
        }
        int i = this.f54G + 1;
        this.f54G = i;
        if (i == 2 && this.f74r.indexOf("c") < 0) {
            this.f74r = C0338n.m1036b(new StringBuilder(), this.f74r, "c");
        }
        if (this.f54G == 4) {
            this.f54G = 0;
            return str3;
        }
        String str5 = str2.split("###")[1];
        String str6 = str2.split("###")[0];
        try {
            JSONObject m1555m = m1555m(str6, str4);
            final String string = m1555m.getString("str");
            str4 = m1555m.getString("codeUrl");
            if (str3.indexOf("输入验证码") >= 0) {
                C0620k.f1166i = "请输入验证码";
            } else {
                if (str3.indexOf("滑动验证") < 0 && str3.indexOf("人机验证") < 0) {
                    C0620k.f1166i = "网页浏览";
                    string = str6;
                }
                C0620k.f1166i = "人机验证";
            }
            final String str7 = this.f81y;
            Init.run(new Runnable() {                 @Override                 public final void run() {
                    final XBPQ xbpq = XBPQ.this;
                    String str8 = string;
                    final String str9 = str7;
                    String str10 = XBPQ.f46J;
                    xbpq.getClass();
                    C0620k.m365A("本站需要验证", str8, str9, new InterfaceC0619j() {                         @Override                         public void vertifyCode(String str11) {
                            String[] split;
                            if (str11.indexOf("$$$") <= 1) {
                                XBPQ.this.f82z = "0";
                                return;
                            }
                            String[] split2 = str11.split("\\$\\$\\$");
                            XBPQ.this.f82z = split2.length > 1 ? split2[1] : "1";
                            SharedPreferences.Editor edit = Init.f37d.edit();
                            edit.putString(C0338n.m1036b(new StringBuilder(), XBPQ.this.f53F, "_ua"), split2[0].split("#")[0]);
                            XBPQ.f46J = split2[0].split("#")[0];
                            XBPQ.this.f81y = split2[0].split("#")[1];
                            if (str9.length() > 2) {
                                for (String str12 : str9.split(";")) {
                                    if (XBPQ.this.f81y.indexOf(str12.split("=")[0]) < 0) {
                                        XBPQ xbpq2 = XBPQ.this;
                                        if (xbpq2.f81y.length() >= 1 && !"0".equals(XBPQ.this.f81y)) {
                                            str12 = XBPQ.this.f81y + ";" + str12;
                                        }
                                        xbpq2.f81y = str12;
                                    } else {
                                        XBPQ.this.f81y = C0338n.m1036b(new StringBuilder(), XBPQ.this.f81y, ";").replaceAll(C0338n.m1036b(new StringBuilder(), str12.split("=")[0], "=.*?;"), str12 + ";");
                                        XBPQ xbpq3 = XBPQ.this;
                                        xbpq3.f81y = xbpq3.f81y.substring(0, XBPQ.this.f81y.length() - 1);
                                    }
                                }
                            }
                            edit.putString(XBPQ.this.f53F, XBPQ.this.f81y);
                            edit.apply();
                        }
                    });
                }
            }, 200);
            while ("".equals(this.f82z)) {
                try {
                    Thread.sleep(500L);
                } catch (Exception e) {
                    if (this.f68l) {
                        Init.show(this.f53F + "调试->webViewDialog睡眠错：" + e.toString());
                    }
                    SpiderApi spiderApi = this.f55H;
                    if (spiderApi != null) {
                        spiderApi.log("webViewDialog睡眠错误-->" + e.toString());
                    }
                }
            }
        } catch (Exception e2) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->验证出错：" + e2.toString());
            }
            SpiderApi spiderApi2 = this.f55H;
            if (spiderApi2 != null) {
                C0595b.m368a(e2, C0374d.m817b("验证错误-->"), spiderApi2);
            }
        }
        if ("1".equals(this.f82z)) {
            this.f82z = "";
        }
        if (!"".equals(this.f82z) && !"0".equals(this.f82z) && this.f74r.indexOf("Y") < 0) {
            if (str4.indexOf("{code}") > 0) {
                sb = str4.replace("{code}", this.f82z);
            } else {
                StringBuilder m817b = C0374d.m817b(str4);
                m817b.append(this.f82z);
                sb = m817b.toString();
            }
            if ("搜索".equals(this.f73q)) {
                m1592I = m1592I(str6);
            } else if (this.f74r.indexOf("c") >= 0) {
                m1592I = m1550r(str6);
            } else {
                this.f74r = C0338n.m1036b(new StringBuilder(), this.f74r, "c");
                m1592I = m1550r(str6);
                this.f74r = this.f74r.replace("c", "");
            }
            if (this.f68l) {
                Init.show(this.f81y);
            }
            try {
                if (sb.indexOf(";post;") < 0) {
                    C0582b.m435g(sb, m1592I);
                } else {
                    AbstractC0642b abstractC0642b = new AbstractC0642b() {                         
                        @Override                         public final void onFailure(Call call, Exception exc) {
                        }

                        @Override                         protected final   void onResponse(String str8) {
                        }
                    };
                    C0647g.m310e(C0647g.m313b(), sb.split(";")[0], null, m1592I, abstractC0642b);
                    String result = abstractC0642b.getResult();
                    if (this.f68l) {
                        Init.show(result != null ? result : "验证失败");
                    }
                    SpiderApi spiderApi3 = this.f55H;
                    if (spiderApi3 != null) {
                        if (("验证结果--> " + result) == null) {
                            result = "验证失败";
                        }
                        spiderApi3.log(result);
                    }
                }
            } catch (Exception e3) {
                if (this.f68l) {
                    Init.show(this.f53F + "调试->webViewDialog验证后post错：" + e3.toString());
                }
                SpiderApi spiderApi4 = this.f55H;
                if (spiderApi4 != null) {
                    C0595b.m368a(e3, C0374d.m817b("webViewDialog验证后post错误-->"), spiderApi4);
                }
            }
            if (!"0".equals(this.f82z)) {
                this.f82z = "";
            }
        }
        if ("0".equals(this.f82z)) {
            return str3;
        }
        if ("fetch".equals(str)) {
            str3 = m1558j(str5);
        }
        return "fetchPost".equals(str) ? m1557k(str5) : str3;
    }

    public String decrypt(String str, String str2, String str3, String str4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)), str2);
        } catch (Exception e) {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("decrypt()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    
    public java.lang.String detailContent(java.util.List<java.lang.String> r59) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.detailContent(java.util.List):java.lang.String");
    }

    public String encrypt(String str, String str2, String str3, String str4) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str3.getBytes(), "AES"), new IvParameterSpec(str4.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 0);
        } catch (Exception e) {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("encrypt()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    
    protected final String m1564f(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        if (str.startsWith("http")) {
            return str;
        }
        String str3 = this.f58b;
        String m1596E = m1596E("特殊分类", "特殊分类url", "特殊分类链接", "");
        String m1595F = m1595F("起始页", "分类起始页码", "qishiye", "firstpage", "1");
        if (this.f73q.length() > 0 && m1596E.indexOf("$") >= 0 && m1596E.indexOf(this.f73q) >= 0) {
            String m1037a = C0338n.m1037a(m1596E, "#");
            StringBuilder m817b = C0374d.m817b(".*");
            m817b.append(this.f73q);
            m817b.append(".*?\\$(.*?)#.*");
            str3 = m1037a.replaceAll(m817b.toString(), "$1");
        }
        if (str3.indexOf("[") >= 0 || str3.indexOf("|") >= 0) {
            str3 = str2.equals(m1595F) ? str3.replaceAll(".*[\\[|\\|].*(http[^\\]]*)\\]?.*", "$1").replace("firstPage=", "") : str3.replaceAll("\\|\\|", "\\|").replaceAll("(.*)[\\[|\\|].*", "$1");
        }
        if (z && this.f57a && hashMap != null && hashMap.size() > 0) {
            for (String str4 : hashMap.keySet()) {
                String str5 = hashMap.get(str4);
                if (str5.length() > 0) {
                    str3 = str3.replace("{" + str4 + "}", URLEncoder.encode(str5));
                }
            }
        }
        String replace = str3.replace("{cateId}", str).replace("{catePg}", str2);
        Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(replace);
        while (matcher.find()) {
            String replace2 = matcher.group(0).replace("{", "").replace("}", "");
            String replace3 = replace.replace(matcher.group(0), "");
            replace = replace3.replace("/" + replace2 + "/", "");
        }
        return replace;
    }

    
    protected final C0548a m1561g0(String str) {
        String m1558j;
        if (str.indexOf(";post") >= 0) {
            m1558j = m1557k(C0338n.m1037a("xp", str));
        } else {
            StringBuilder m817b = C0374d.m817b("xp");
            m817b.append(str.split(";")[0]);
            m1558j = m1558j(m817b.toString());
        }
        return new C0548a(C0087a.m1426l(m1558j).m912R());
    }

    public String getToken(String str, String str2, String str3, String str4) {
        return encrypt(str, str2, str3, str4);
    }

    public java.lang.String homeContent(boolean r29) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.homeContent(boolean):java.lang.String");
    }

    public String homeVideoContent() {
        String str;
        String str2;
        String replaceAll;
        try {
            String m1595F = m1595F("首页", "热门", "homeContent", "shouye", "40");
            m1595F = (m1595F.equals("1") || m1595F.equals("首页")) ? "40" : "40";
            if (m1597D("列表分类", "fenlei", "").length() < 3) {
                str = this.f59c + "#";
            } else {
                str = m1597D("列表分类", "fenlei", "") + "#";
            }
            this.f61e = 40;
            if (m1595F.indexOf("$") >= 0) {
                this.f61e = Integer.parseInt(m1595F.split("\\$")[1]);
                String str3 = m1595F.split("\\$")[0];
                if (str3.equals("首页")) {
                    replaceAll = "";
                } else {
                    str2 = ".*" + str3 + "\\$(.*?)#.*";
                    replaceAll = str.replaceAll(str2, "$1");
                }
            } else if (m1595F.matches("\\d+")) {
                this.f61e = Integer.parseInt(m1595F);
                replaceAll = "";
            } else {
                str2 = ".*" + m1595F + "\\$(.*?)#.*";
                replaceAll = str.replaceAll(str2, "$1");
            }
            if (this.f61e > 0) {
                this.f60d = true;
                this.f73q = "首页";
                JSONObject m1566e = m1566e(replaceAll, "1", false, new HashMap<>());
                this.f73q = "";
                this.f60d = false;
                return m1566e != null ? m1566e.toString() : "";
            }
        } catch (Exception e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->获取首页资源出错：" + e.toString());
            }
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                C0595b.m368a(e, C0374d.m817b("获取首页资源错误！-->"), spiderApi);
            }
        }
        return "";
    }

    
    final String m1559i(String str) {
        if (!str.isEmpty()) {
            String[] strArr = {"\\", "$", "(", ")", "*", "+", ".", "[", "]", "?", "^", "{", "}", "|"};
            for (int i = 0; i < 14; i++) {
                String str2 = strArr[i];
                if (str.indexOf(str2) >= 0) {
                    str = str.replace(str2, "\\" + str2);
                }
            }
        }
        return str;
    }

    public void init(Context context) {
        super.init(context);
    }

    public void init(Context context, String str) {
        String[] split;
        this.f49B = context;
        super.init(context, str);
        if (str != null) {
            try {
                if (str.startsWith("http")) {
                    if (str.indexOf("{cateId}") < 0) {
                        this.f48A = new JSONObject(C0582b.m434h(str, null, null));
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        this.f48A = jSONObject;
                        jSONObject.put("分类url", str);
                    }
                } else if (str.startsWith("{")) {
                    this.f48A = new JSONObject(str);
                } else {
                    this.f48A = new JSONObject();
                    String replace = str.replace("\\,", "逗号");
                    if (replace.indexOf(",") < 0) {
                        this.f48A.put(replace.substring(0, replace.indexOf(":")), replace.substring(replace.indexOf(":") + 1).replace("逗号", ","));
                    } else {
                        for (String str2 : replace.split(",")) {
                            this.f48A.put(str2.substring(0, str2.indexOf(":")), str2.substring(str2.indexOf(":") + 1).replace("逗号", ","));
                        }
                    }
                }
                m1588M();
            } catch (JSONException e) {
                if (this.f68l) {
                    Init.show("请检配 ext");
                }
                SpiderApi spiderApi = this.f55H;
                if (spiderApi != null) {
                    StringBuilder m817b = C0374d.m817b("请检配 ext-->");
                    m817b.append(e.toString());
                    spiderApi.log(m817b.toString());
                }
            }
        }
    }

    public void initApi(SpiderApi spiderApi) {
        this.f55H = spiderApi;
        super.initApi(spiderApi);
        String port = spiderApi.getPort();
        this.f56I = port;
        Init.f38e = port;
        StringBuilder m817b = C0374d.m817b("Id版端口：");
        m817b.append(this.f56I);
        spiderApi.log(m817b.toString());
    }

    public boolean isVideoFormat(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http") || lowerCase.startsWith("magnet")) {
            String[] split = m1597D("嗅探词", "VideoFormat", "m3u8#.mp4#.flv#.mp3#.m4a#magnet:#ed2k:#ftp:#thunder:#push:#tvbox-xg:").split("#");
            String[] split2 = m1597D("过滤词", "VideoFilter", "url=http#;post;#.js").split("#");
            for (String str2 : split) {
                if (lowerCase.indexOf(str2) >= 0) {
                    for (String str3 : split2) {
                        if (lowerCase.indexOf(str3) >= 0) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    
    protected final String m1558j(String str) {
        String str2;
        String m434h;
        String m1037a = C0338n.m1037a("###", str);
        String m1590K = m1590K(str);
        if (m1590K.indexOf(";post") >= 0) {
            return m1557k(m1590K);
        }
        boolean startsWith = m1590K.startsWith("xp");
        if (startsWith) {
            m1590K = m1590K.replaceAll("xp(http.*)", "$1");
        }
        String str3 = this.f74r;
        String m1596E = str3.indexOf("g") >= 0 ? "GBK" : m1596E("编码", "网页编码格式", "Coding_format", "UTF-8");
        if ("UTF-8".equals(m1596E)) {
            str2 = "";
        } else {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                spiderApi.log("编码--> " + m1596E);
            }
            str2 = m1560h(m1590K);
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        if (str2.length() < 1) {
            if (this.f74r.indexOf("J") < 0 || m1590K.indexOf("outerHTML") >= 0 || m1590K.indexOf("innerHTML") >= 0 || this.f55H == null) {
                m434h = C0582b.m434h(m1590K, !"搜索".equals(this.f73q) ? m1550r(m1590K) : m1592I(m1590K), hashMap);
            } else {
                String str4 = this.f74r.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML";
                String str5 = this.f55H.getAddress(true) + "webparse/" + m1590K + "<<eval" + (str3.matches(".*Jb?\\d+.*") ? str3.replaceAll(".*Jb?(\\d+).*", "$1") : "") + str4;
                SpiderApi spiderApi2 = this.f55H;
                if (spiderApi2 != null) {
                    spiderApi2.log("正在使用代理get--> " + str5);
                }
                m434h = this.f55H.webParse(str5, "");
            }
            str2 = m434h;
            if (str2 == null) {
                str2 = "";
            }
        }
        m1581T(hashMap);
        String m1579V = m1579V(m1585P(m1590K, str2));
        if ("0".equals(this.f82z) || ((this.f74r.indexOf("y") < 0 && this.f74r.indexOf("Y") < 0 && m1599B("验证").length() <= 0) || (m1579V.indexOf("安全验证") < 0 && m1579V.indexOf("输入验证码") < 0 && m1579V.indexOf("滑动验证") < 0 && m1579V.indexOf("人机验证") < 0))) {
            z = false;
        }
        if (z) {
            SpiderApi spiderApi3 = this.f55H;
            String m1037a2 = C0338n.m1037a(m1590K, m1037a);
            if (spiderApi3 != null) {
                spiderApi3.log("弹窗验证，源码为--> " + m1579V);
                m1037a2 = C0338n.m1037a(m1037a2, m1037a);
            }
            m1579V = m1567d0("fetch", m1037a2, m1579V, m1599B("验证"));
            if (m1579V.indexOf("安全验证") < 0 || m1579V.indexOf("输入验证码") < 0 || m1579V.indexOf("滑动验证") < 0 || m1579V.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.f82z = "0";
            }
        }
        String trim = m1579V != null ? startsWith ? m1579V : m1579V.replace(" ", "空空空").replaceAll("\\s+", "").replace("空空空", " ").trim() : "";
        this.f79w = trim;
        return trim;
    }

    
    protected final String m1557k(String str) {
        String str2;
        String str3;
        OkHttpClient m313b;
        LinkedHashMap linkedHashMap;
        String[] strArr;
        String m1037a = C0338n.m1037a("###", str);
        String m1590K = m1590K(str);
        boolean startsWith = m1590K.startsWith("xp");
        if (startsWith) {
            m1590K = m1590K.replaceAll("xp(http.*)", "$1");
        }
        String m1596E = this.f74r.indexOf("g") >= 0 ? "GBK" : m1596E("编码", "网页编码格式", "Coding_format", "UTF-8");
        if ("UTF-8".equals(m1596E)) {
            str2 = "";
        } else {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                spiderApi.log("编码--> " + m1596E);
            }
            str2 = m1560h(m1590K);
        }
        boolean z = false;
        if (str2.length() < 1) {
            String trim = m1590K.split(";post;")[1].trim();
            String str4 = m1590K.split(";")[0];
            String str5 = this.f74r;
            if (str5.indexOf("J") < 0 || str4.indexOf("outerHTML") >= 0 || str4.indexOf("innerHTML") >= 0 || this.f55H == null) {
                str3 = str4;
            } else {
                String str6 = this.f74r.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML";
                str3 = this.f55H.getAddress(true) + "webparse/" + str4 + "<<eval" + (str5.matches(".*Jb?\\d+.*") ? str5.replaceAll(".*Jb?(\\d+).*", "$1") : "") + str6;
                SpiderApi spiderApi2 = this.f55H;
                if (spiderApi2 != null) {
                    spiderApi2.log("正在post代理--> " + str3);
                }
                SpiderApi spiderApi3 = this.f55H;
                if (spiderApi3 != null) {
                    spiderApi3.log("postBody--> " + trim);
                }
            }
            HashMap<String, String> m1550r = !"搜索".equals(this.f73q) ? m1550r(str4) : m1592I(str4);
            AbstractC0642b abstractC0642b = new AbstractC0642b() {                 
                @Override                 public final void onFailure(Call call, Exception exc) {
                }

                @Override                 protected final   void onResponse(String str7) {
                }
            };
            SpiderApi spiderApi4 = this.f55H;
            if (spiderApi4 != null) {
                spiderApi4.log("发出post请求...");
            }
            if (trim.isEmpty()) {
                m313b = C0647g.m313b();
                linkedHashMap = null;
            } else if (trim.startsWith("{") && trim.endsWith("}")) {
                try {
                    C0647g.m309f(C0647g.m313b(), str3, new JSONObject(trim).toString(), m1550r, abstractC0642b);
                } catch (JSONException e) {
                    if (this.f68l) {
                        Init.show(this.f53F + "调试->fetchPost出错：" + e.toString());
                    }
                    SpiderApi spiderApi5 = this.f55H;
                    if (spiderApi5 != null) {
                        StringBuilder m817b = C0374d.m817b("fetchPost()错误-->");
                        m817b.append(e.toString());
                        spiderApi5.log(m817b.toString());
                    }
                }
                str2 = abstractC0642b.getResult();
                m1590K = str4;
            } else {
                linkedHashMap = new LinkedHashMap();
                String[] split = trim.split("\\&");
                int length = split.length;
                int i = 0;
                while (i < length) {
                    String str7 = split[i];
                    if (str7.endsWith("=")) {
                        strArr = split;
                    } else {
                        int indexOf = str7.indexOf("=");
                        strArr = split;
                        linkedHashMap.put(str7.substring(0, indexOf), str7.substring(indexOf + 1));
                    }
                    i++;
                    split = strArr;
                }
                m313b = C0647g.m313b();
            }
            C0647g.m310e(m313b, str3, linkedHashMap, m1550r, abstractC0642b);
            str2 = abstractC0642b.getResult();
            m1590K = str4;
        }
        if (str2 == null) {
            str2 = "";
        }
        String m1579V = m1579V(m1585P(m1590K, str2));
        if (!"0".equals(this.f82z) && ((this.f74r.indexOf("y") >= 0 || this.f74r.indexOf("Y") >= 0 || m1599B("验证").length() > 0) && (m1579V.indexOf("安全验证") >= 0 || m1579V.indexOf("输入验证码") >= 0 || m1579V.indexOf("滑动验证") >= 0 || m1579V.indexOf("人机验证") >= 0))) {
            z = true;
        }
        if (z) {
            SpiderApi spiderApi6 = this.f55H;
            String m1037a2 = C0338n.m1037a(m1590K, m1037a);
            if (spiderApi6 != null) {
                spiderApi6.log("需要验证，源码为--> " + m1579V);
                m1037a2 = C0338n.m1037a(m1037a2, m1037a);
            }
            m1579V = m1567d0("fetchPost", m1037a2, m1579V, m1599B("验证"));
            if (m1579V.indexOf("安全验证") < 0 || m1579V.indexOf("输入验证码") < 0 || m1579V.indexOf("滑动验证") < 0 || m1579V.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.f82z = "0";
            }
        }
        String trim2 = m1579V != null ? startsWith ? m1579V : m1579V.replace(" ", "空空空").replaceAll("\\s+", "").replace("空空空", " ").trim() : "";
        this.f79w = trim2;
        return trim2;
    }

    public Object[] mProxy(Map<String, String> map) {
        return Proxy.proxy(map);
    }

    public boolean manualVideoCheck() {
        return !m1597D("嗅探词", "过滤词", "").isEmpty() || m1598C("手动嗅探", "ManualSniffer").equals("1") || this.f74r.indexOf("x") >= 0;
    }

    
    
    
    
    
    
    
    
    protected final java.lang.String m1554n(java.lang.String r27) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1554n(java.lang.String):java.lang.String");
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public java.lang.String playerContent(java.lang.String r28, java.lang.String r29, java.util.List<java.lang.String> r30) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    
    
    
    
    protected final java.util.HashMap<java.lang.String, java.lang.String> m1550r(java.lang.String r15) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1550r(java.lang.String):java.util.HashMap");
    }

    public String searchContent(String str, boolean z) {
        String[] split;
        try {
            SpiderApi spiderApi = this.f55H;
            if (spiderApi != null) {
                spiderApi.log("searchContent(key=" + str + ", quick=" + z + ")");
            }
            this.f73q = "搜索";
            JSONObject m1578W = m1578W("", str, z);
            String replace = m1596E("特殊分类", "特殊分类url", "特殊分类链接", "").replace(this.f62f, "");
            if (m1578W == null || m1578W.getJSONArray("list") == null || m1578W.getJSONArray("list").length() <= 0 || replace.indexOf("#http") >= 0) {
                JSONArray jSONArray = m1578W != null ? m1578W.getJSONArray("list") : new JSONArray();
                for (String str2 : replace.split("#h")) {
                    if (str2.startsWith("ttp")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("h");
                        sb.append((str2 + "#").replaceAll(".*(ttp.*?)#.*", "$1"));
                        JSONObject m1578W2 = m1578W(sb.toString(), str, z);
                        JSONArray jSONArray2 = m1578W2 != null ? m1578W2.getJSONArray("list") : new JSONArray();
                        if (jSONArray2.length() > 0) {
                            for (int i = 0; i < jSONArray2.length(); i++) {
                                jSONArray.put(jSONArray2.get(i));
                            }
                        }
                    }
                }
                if (this.f74r.indexOf("k0") >= 0) {
                    this.f74r = this.f74r.replace("k0", "");
                }
                if (jSONArray.length() > 0) {
                    return new JSONObject().put("list", jSONArray).toString();
                }
                JSONObject m1578W3 = m1578W(this.f62f + "/;;搜首页", str, z);
                if (m1578W3 == null || m1578W3.getJSONArray("list") == null || m1578W3.getJSONArray("list").length() <= 0) {
                    String[] split2 = this.f59c.split("#");
                    int length = split2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str3 = split2[i2];
                        JSONObject m1578W4 = m1578W(m1564f(str3.split("\\$")[1], "1", false, null) + ";;搜首页", str, z);
                        JSONArray jSONArray3 = m1578W4 != null ? m1578W4.getJSONArray("list") : new JSONArray();
                        if (jSONArray3.length() > 0) {
                            for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                                jSONArray.put(jSONArray3.get(i3));
                            }
                        } else {
                            try {
                                Thread.sleep(1000L);
                            } catch (Exception unused) {
                            }
                            i2++;
                        }
                    }
                    return jSONArray.length() > 0 ? new JSONObject().put("list", jSONArray).toString() : "";
                }
                return m1578W3.toString();
            }
            return m1578W.toString();
        } catch (Exception e) {
            if (this.f68l) {
                Init.show(this.f53F + "调试->searchContent出错：" + e.toString());
            }
            SpiderApi spiderApi2 = this.f55H;
            if (spiderApi2 != null) {
                C0595b.m368a(e, C0374d.m817b("searchContent()错误-->"), spiderApi2);
            }
            return "";
        }
    }

    
    
    
    
    
    
    
    
    
    public java.lang.String xpDetailContent(java.util.List<java.lang.String> r19) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.xpDetailContent(java.util.List):java.lang.String");
    }

    
    
    
    protected final java.lang.String m1542z(java.lang.String r15) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m1542z(java.lang.String):java.lang.String");
    }
}
