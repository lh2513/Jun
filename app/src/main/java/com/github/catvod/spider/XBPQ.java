//
// Decompiled by Jadx - 4803ms
//
/* [6772] JadxRuntimeException in pass: BlockProcessor in method: com.github.catvod.spider.XBPQ.W(java.lang.String, java.lang.String, boolean):org.json.JSONObject, file: C:\Users\ADMINI~1\AppData\Local\Temp\2\jadx_6185299886826152980.dex
jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:993:0x1801
	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:26)
	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
	at java.util.ArrayList.forEach(ArrayList.java:1259)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:72)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:380)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:328)
	at bin.decompiler.Jadx.decompile(Jadx.java:41)
	at bin.decompiler.DecompilerUtil.decompile(DecompilerUtil.java:33)
	at bin.decompiler.Jadx.main(Jadx.java:23)
[7304] JadxRuntimeException in pass: BlockProcessor in method: com.github.catvod.spider.XBPQ.x(java.lang.String, java.lang.String, boolean, java.util.HashMap<java.lang.String, java.lang.String>):org.json.JSONObject, file: C:\Users\ADMINI~1\AppData\Local\Temp\2\jadx_6185299886826152980.dex
jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:986:0x174f
	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:26)
	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
	at java.util.ArrayList.forEach(ArrayList.java:1259)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:72)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:380)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:328)
	at bin.decompiler.Jadx.decompile(Jadx.java:41)
	at bin.decompiler.DecompilerUtil.decompile(DecompilerUtil.java:33)
	at bin.decompiler.Jadx.main(Jadx.java:23)
[10589] JadxRuntimeException in pass: BlockProcessor in method: com.github.catvod.spider.XBPQ.detailContent(java.util.List<java.lang.String>):java.lang.String, file: C:\Users\ADMINI~1\AppData\Local\Temp\2\jadx_6185299886826152980.dex
jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:711:0x1094
	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:26)
	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
	at java.util.ArrayList.forEach(ArrayList.java:1259)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:72)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:380)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:328)
	at bin.decompiler.Jadx.decompile(Jadx.java:41)
	at bin.decompiler.DecompilerUtil.decompile(DecompilerUtil.java:33)
	at bin.decompiler.Jadx.main(Jadx.java:23)
[6772] Method code generation error in method: com.github.catvod.spider.XBPQ.W(java.lang.String, java.lang.String, boolean):org.json.JSONObject, file: C:\Users\ADMINI~1\AppData\Local\Temp\2\jadx_6185299886826152980.dex
java.lang.NullPointerException
	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:67)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:300)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:379)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:308)
	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:274)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
	at java.util.ArrayList.forEach(ArrayList.java:1259)
	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:390)
	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)
	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:270)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:243)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:134)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:97)
	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:32)
	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:27)
	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
	at jadx.core.ProcessClass.process(ProcessClass.java:77)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:380)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:328)
	at bin.decompiler.Jadx.decompile(Jadx.java:41)
	at bin.decompiler.DecompilerUtil.decompile(DecompilerUtil.java:33)
	at bin.decompiler.Jadx.main(Jadx.java:23)
[7304] Method code generation error in method: com.github.catvod.spider.XBPQ.x(java.lang.String, java.lang.String, boolean, java.util.HashMap<java.lang.String, java.lang.String>):org.json.JSONObject, file: C:\Users\ADMINI~1\AppData\Local\Temp\2\jadx_6185299886826152980.dex
java.lang.NullPointerException
	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:67)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:300)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:379)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:308)
	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:274)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
	at java.util.ArrayList.forEach(ArrayList.java:1259)
	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:390)
	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)
	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:270)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:243)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:134)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:97)
	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:32)
	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:27)
	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
	at jadx.core.ProcessClass.process(ProcessClass.java:77)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:380)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:328)
	at bin.decompiler.Jadx.decompile(Jadx.java:41)
	at bin.decompiler.DecompilerUtil.decompile(DecompilerUtil.java:33)
	at bin.decompiler.Jadx.main(Jadx.java:23)
[10589] Method code generation error in method: com.github.catvod.spider.XBPQ.detailContent(java.util.List<java.lang.String>):java.lang.String, file: C:\Users\ADMINI~1\AppData\Local\Temp\2\jadx_6185299886826152980.dex
java.lang.NullPointerException
	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:67)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:300)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:379)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:308)
	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:274)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
	at java.util.ArrayList.forEach(ArrayList.java:1259)
	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:390)
	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:418)
	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:270)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:259)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:243)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:134)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:97)
	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:32)
	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:27)
	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
	at jadx.core.ProcessClass.process(ProcessClass.java:77)
	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:380)
	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:328)
	at bin.decompiler.Jadx.decompile(Jadx.java:41)
	at bin.decompiler.DecompilerUtil.decompile(DecompilerUtil.java:33)
	at bin.decompiler.Jadx.main(Jadx.java:23)
*/
package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderApi;
import com.github.catvod.spider.merge.b.n;
import com.github.catvod.spider.merge.b.p;
import com.github.catvod.spider.merge.c0.l;
import com.github.catvod.spider.merge.d.d;
import com.github.catvod.spider.merge.f0.a;
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
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class XBPQ extends Spider {
    public static String J = "";
    private static HashMap<String, String> K;
    private Context B;
    private PushAgent C;
    private String F;
    private String b;
    private int e;
    private String n;
    private boolean a = false;
    private String c = "";
    private boolean d = false;
    private String f = "";
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private List<String> j = null;
    private JSONObject k = null;
    private boolean l = false;
    private String m = "";
    private int o = 0;
    private boolean p = false;
    private String q = "";
    private String r = "";
    private boolean s = false;
    private int t = 0;
    private int u = 3;
    private String v = "";
    private String w = "";
    private boolean x = false;
    private String y = "";
    private String z = "";
    protected JSONObject A = null;
    private boolean D = true;
    private HashMap<String, String> E = null;
    private int G = 0;
    private SpiderApi H = null;
    private String I = "9978";

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: Exception -> 0x010d, LOOP:1: B:34:0x00de->B:36:0x00e1, LOOP_END, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x000c, B:6:0x002b, B:8:0x0031, B:10:0x0045, B:11:0x004b, B:13:0x0052, B:15:0x006c, B:16:0x0072, B:18:0x0078, B:21:0x0080, B:23:0x0088, B:37:0x00f6, B:24:0x00a7, B:25:0x00bd, B:27:0x00c5, B:29:0x00cf, B:32:0x00d8, B:34:0x00de, B:36:0x00e1), top: B:48:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONObject A(String str, String str2, String str3, String str4) {
        String[] strArr;
        String[] split;
        String str5 = str3;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!str.equals("by") && !str.equals("cateId")) {
                jSONObject.put("n", "全部");
                jSONObject.put("v", "");
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
                if (str5.indexOf("--") >= 0) {
                    str5 = str5.split("--")[1];
                }
            }
            if (str.equals("cateId")) {
                jSONObject.put("n", "全部");
                jSONObject.put("v", str5.split("--")[0]);
                jSONArray.put(jSONObject);
                jSONObject = new JSONObject();
                if (str5.indexOf("--") >= 0) {
                    str5 = str5.split("--")[1];
                }
            }
            if (str5.indexOf("#") >= 0) {
                if (str5.indexOf("#") >= 0) {
                    for (String str6 : str5.split("#")) {
                        jSONObject.put("n", str6.split("\\$")[0]);
                        jSONObject.put("v", str6.split("\\$")[1]);
                        jSONArray.put(jSONObject);
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject.put("n", str5.split("\\$")[0]);
                    jSONObject.put("v", str5.split("\\$")[1]);
                    jSONArray.put(jSONObject);
                }
            } else if (str5.indexOf("&") >= 0) {
                String[] split2 = str5.split("\\&");
                if (!"".equals(str4) && !"*".equals(str4)) {
                    strArr = str4.split("\\&");
                    for (int i = 0; i < split2.length; i++) {
                        jSONObject.put("n", split2[i]);
                        jSONObject.put("v", strArr[i]);
                        jSONArray.put(jSONObject);
                        jSONObject = new JSONObject();
                    }
                }
                strArr = split2;
                while (i < split2.length) {
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key", str);
            jSONObject2.put("name", str2);
            jSONObject2.put("value", jSONArray);
            return jSONObject2;
        } catch (Exception e) {
            if (this.l) {
                Init.show(this.F + "调试->getRType出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("getRType()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    private String B(String str) {
        return C(str, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String C(String str, String str2) {
        String str3;
        JSONObject jSONObject;
        String str4;
        String optString = this.A.optString(str);
        String str5 = "";
        if (str.equals("主页url") && optString.isEmpty()) {
            optString = this.A.optString("首页推荐链接");
            if (optString.isEmpty()) {
                optString = this.A.optString("网站地址");
                if (optString.isEmpty()) {
                    optString = this.A.optString("url");
                    if (optString.isEmpty()) {
                        optString = this.A.optString("homeUrl");
                        if (optString.isEmpty()) {
                            String optString2 = this.A.optString("分类url");
                            if (optString2.isEmpty()) {
                                optString2 = this.A.optString("分类链接");
                                if (optString2.isEmpty() || !optString2.startsWith("http")) {
                                    optString2 = this.A.optString("分类页");
                                    if (optString2.isEmpty()) {
                                        optString2 = this.A.optString("class_url");
                                        if (optString2.isEmpty()) {
                                            optString2 = this.A.optString("cateUrl");
                                            if (optString2.isEmpty()) {
                                                optString2 = this.A.optString("搜索url");
                                                if (!optString2.startsWith("http")) {
                                                    optString2 = "";
                                                }
                                                if (optString2.isEmpty()) {
                                                    optString2 = this.A.optString("搜索链接");
                                                    if (!optString2.startsWith("http")) {
                                                        optString2 = "";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            optString = optString2.replaceAll(optString2.indexOf("/webparse/") > 0 ? ".*/webparse/(https?\\://[^/]+)/.*" : ".*(https?\\://[^/]+)/.*", "$1");
                        }
                    }
                }
            }
        }
        if (str.equals("分类")) {
            if (optString.isEmpty()) {
                optString = this.A.optString("分类名称");
                if (optString.isEmpty()) {
                    optString = this.A.optString("class_name");
                    if (!optString.isEmpty()) {
                        jSONObject = this.A;
                        str4 = "class_value";
                    }
                } else {
                    jSONObject = this.A;
                    str4 = "分类名称替换词";
                }
                optString = R(optString, jSONObject.optString(str4));
            } else if (optString.indexOf("&") >= 0) {
                jSONObject = this.A;
                str4 = "分类值";
                optString = R(optString, jSONObject.optString(str4));
            }
        }
        if (optString.isEmpty() || optString.equals("空")) {
            return (str.equals("搜索后缀") && optString.equals("空")) ? "" : str2;
        } else if (str.equals("剧情") || str.equals("地区") || str.equals("类型") || str.equals("年份") || str.equals("排序")) {
            return optString;
        } else {
            if (optString.indexOf("||") < 0 || optString.indexOf("--") < 0) {
                str5 = optString;
            } else {
                String[] split = optString.split("\\|\\|");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        String str6 = split[i];
                        if (str6.indexOf(this.q) >= 0) {
                            str3 = str6.split("--")[1];
                            break;
                        }
                        i++;
                    } else if (optString.indexOf("||") >= 0) {
                        String[] split2 = split[0].split("--");
                        str3 = split2.length > 1 ? split2[1] : split2[0];
                    }
                }
            }
            return str5;
        }
    }

    private String D(String str, String str2, String str3) {
        return C(str, C(str2, str3));
    }

    private String E(String str, String str2, String str3, String str4) {
        return C(str, C(str2, C(str3, str4)));
    }

    private String F(String str, String str2, String str3, String str4, String str5) {
        return C(str, C(str2, C(str3, C(str4, str5))));
    }

    private String G(String str, String str2, String str3, String str4, String str5, String str6) {
        return C(str, C(str2, C(str3, C(str4, C(str5, str6)))));
    }

    private String H(String str, String str2, String str3, String str4, String str5, String str6) {
        return C(str, C(str2, C(str3, C(str4, C(str5, C(str6, ""))))));
    }

    private String K(String str) {
        Charset charset;
        if (str.indexOf("时间戳") >= 0) {
            StringBuilder b = d.b("");
            b.append(new Date().getTime());
            str = str.replace("时间戳", b.toString());
        }
        if (str.indexOf(":9978/") > 0 && !"9978".equals(this.I)) {
            str = str.replace("9978", this.I);
        }
        if (str.indexOf("md5(") > 0) {
            String replaceAll = str.replaceAll("md5\\((.*?)\\)", "$1");
            if (replaceAll.indexOf(",iso") > 0) {
                replaceAll = replaceAll.split(",")[0];
                charset = m.c;
            } else {
                charset = m.b;
            }
            str = str.replaceAll("md5\\(.*?\\)", m.a(replaceAll, charset));
        }
        if (str.indexOf("+url:") > 0) {
            String[] split = str.split("\\+url\\:");
            if (split.length > 1) {
                if (str.indexOf("$sub:") <= 0) {
                    return split[0] + j(split[1]);
                }
                String[] split2 = split[1].split("\\$sub\\:");
                if (split2.length > 1) {
                    return split[0] + c0(j(split2[0]), split2[1], "").get(0).trim();
                }
                return split[0] + j(split2[0]);
            }
            return split[0];
        }
        return str;
    }

    private String L(String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101 A[Catch: Exception -> 0x01aa, TryCatch #0 {Exception -> 0x01aa, blocks: (B:3:0x0018, B:6:0x0078, B:8:0x0082, B:9:0x008c, B:16:0x00bc, B:18:0x00c6, B:19:0x00cf, B:22:0x00db, B:24:0x00e5, B:29:0x00f3, B:33:0x0109, B:35:0x0111, B:39:0x011c, B:41:0x0128, B:42:0x0143, B:44:0x0159, B:46:0x016f, B:48:0x0179, B:53:0x0187, B:55:0x0193, B:57:0x01a3, B:32:0x0101, B:10:0x0097, B:12:0x00a1, B:14:0x00ad, B:15:0x00ba), top: B:65:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128 A[Catch: Exception -> 0x01aa, TryCatch #0 {Exception -> 0x01aa, blocks: (B:3:0x0018, B:6:0x0078, B:8:0x0082, B:9:0x008c, B:16:0x00bc, B:18:0x00c6, B:19:0x00cf, B:22:0x00db, B:24:0x00e5, B:29:0x00f3, B:33:0x0109, B:35:0x0111, B:39:0x011c, B:41:0x0128, B:42:0x0143, B:44:0x0159, B:46:0x016f, B:48:0x0179, B:53:0x0187, B:55:0x0193, B:57:0x01a3, B:32:0x0101, B:10:0x0097, B:12:0x00a1, B:14:0x00ad, B:15:0x00ba), top: B:65:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193 A[Catch: Exception -> 0x01aa, TryCatch #0 {Exception -> 0x01aa, blocks: (B:3:0x0018, B:6:0x0078, B:8:0x0082, B:9:0x008c, B:16:0x00bc, B:18:0x00c6, B:19:0x00cf, B:22:0x00db, B:24:0x00e5, B:29:0x00f3, B:33:0x0109, B:35:0x0111, B:39:0x011c, B:41:0x0128, B:42:0x0143, B:44:0x0159, B:46:0x016f, B:48:0x0179, B:53:0x0187, B:55:0x0193, B:57:0x01a3, B:32:0x0101, B:10:0x0097, B:12:0x00a1, B:14:0x00ad, B:15:0x00ba), top: B:65:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M() {
        boolean z;
        boolean z2;
        try {
            String replaceAll = (B("主页url") + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1");
            this.f = replaceAll;
            this.F = replaceAll;
            this.F = replaceAll.split("://")[1].split("/")[0].replace(".", "_");
            String G = G("分类url", "分类链接", "分类页", "class_url", "cateUrl", "");
            this.b = G;
            if (G.indexOf(";;") >= 0) {
                if (this.b.split(";;").length > 1) {
                    this.r = this.b.split(";;")[1];
                }
                this.b = this.b.split(";;")[0];
            } else if (D("搜索url", "搜索链接", "").indexOf(";;") < 0) {
                this.r = "";
            } else if (D("搜索url", "搜索链接", "").split(";;").length > 1) {
                this.r = D("搜索url", "搜索链接", "").split(";;")[1];
            }
            try {
                if (this.r.indexOf("阿里") >= 0) {
                    this.A.put("跳转链接", "https://www.aliyundrive.com/s/+aliyundrive.com/s/&&\"");
                }
            } catch (JSONException unused) {
            }
            if (!E("图片代理", "图片是否需要代理", "PicNeedProxy", "0").equals("1") && !E("图片代理", "图片是否需要代理", "PicNeedProxy", "0").equals("是") && this.r.indexOf("t") < 0) {
                z = false;
                this.g = z;
                String D = this.r.indexOf("T") < 0 ? "1" : D("调试", "debug", "");
                this.n = D;
                this.l = D.length() <= 0 && !"0".equals(this.n);
                if (this.n.indexOf("$") >= 0) {
                    this.o = Integer.parseInt(this.n.split("\\$")[1]);
                    this.n = this.n.split("\\$")[0];
                }
                if (!F("倒序", "倒序播放", "是否反转选集序列", "epi_reverse", "0").equals("1") && !F("倒序", "倒序播放", "是否反转选集序列", "epi_reverse", "0").equals("是") && (this.r.indexOf("d0") >= 0 || this.r.indexOf("d") < 0)) {
                    z2 = false;
                    this.x = z2;
                    if (this.r.indexOf("o") < 0) {
                        String replaceAll2 = this.r.replaceAll(".*o(\\d+).*", "$1");
                        if (replaceAll2.length() > 0) {
                            this.u = Integer.parseInt(replaceAll2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z2 = true;
                this.x = z2;
                if (this.r.indexOf("o") < 0) {
                }
            }
            z = true;
            this.g = z;
            if (this.r.indexOf("T") < 0) {
            }
            this.n = D;
            this.l = D.length() <= 0 && !"0".equals(this.n);
            if (this.n.indexOf("$") >= 0) {
            }
            if (!F("倒序", "倒序播放", "是否反转选集序列", "epi_reverse", "0").equals("1")) {
                z2 = false;
                this.x = z2;
                if (this.r.indexOf("o") < 0) {
                }
            }
            z2 = true;
            this.x = z2;
            if (this.r.indexOf("o") < 0) {
            }
        } catch (Exception e) {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("初始化全局变量错误！-->"), spiderApi);
            }
        }
    }

    private String N(String str) {
        return str.indexOf("转义井号") >= 0 ? str.replace("转义井号", "#") : str;
    }

    private String O(String str, String str2, String str3) {
        try {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                spiderApi.log("请求跳转播放链接源码，webUrl--> " + str);
            }
            String j = j(str);
            SpiderApi spiderApi2 = this.H;
            if (spiderApi2 != null) {
                if (j == null) {
                    spiderApi2.log("未获取到跳转源码");
                    j = "";
                } else {
                    spiderApi2.log(this.l ? "获取到跳转源码--> " + j : "获取到跳转源码--> " + j.split("<meta http")[0].split(",\\{")[0] + "......");
                }
            }
            if (str2.length() <= 0) {
                str2 = "\"url\"*\"&&\",";
            }
            if (j != null && j.startsWith("{") && j.endsWith("}") && str2.indexOf("&&") < 0) {
                JSONObject jSONObject = new JSONObject(j);
                if (str2.indexOf(".") < 0) {
                    jSONObject.optString(str2).getClass();
                } else {
                    u(j, str2);
                }
            } else if (j != null && str2.indexOf("&&") >= 0) {
                ArrayList<String> Y = Y(j, str3, "");
                for (int i = 0; i < Y.size(); i++) {
                    String str4 = Y.get(i);
                    if (str4.length() > 10) {
                        ArrayList<String> Y2 = Y(str4, str2, "");
                        for (int i2 = 0; i2 < Y2.size(); i2++) {
                            String trim = Y2.get(i2).trim();
                            try {
                                if (this.r.indexOf("u0") < 0) {
                                    trim = URLDecoder.decode(trim);
                                }
                            } catch (Exception e) {
                                if (this.l) {
                                    Init.show(this.F + "调试->跳转Url解码出错：" + e.toString());
                                }
                                SpiderApi spiderApi3 = this.H;
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
            if (this.l) {
                Init.show(this.F + "调试->jumpCut出错：" + e2.toString());
            }
            SpiderApi spiderApi4 = this.H;
            if (spiderApi4 != null) {
                b.a(e2, d.b("jumpCut()错误！-->"), spiderApi4);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String P(String str, String str2) {
        SpiderApi spiderApi;
        StringBuilder sb;
        StringBuilder sb2;
        if (str2.length() < 1 || this.t >= this.u) {
            return str2;
        }
        if (str2.indexOf("检测中") >= 0 && str2.indexOf("跳转中") >= 0 && str2.indexOf("btwaf") >= 0) {
            SpiderApi spiderApi2 = this.H;
            if (spiderApi2 != null) {
                spiderApi2.log("过宝塔盾--> " + str2);
            }
            String str3 = Y(str2, "btwaf=&&\"", "").get(0);
            StringBuilder b = d.b(str);
            b.append(str.indexOf("?") >= 0 ? "&" : "?");
            b.append("btwaf=");
            b.append(str3);
            String sb3 = b.toString();
            this.t++;
            String j = j(sb3);
            this.s = true;
            return j;
        } else if (str2.contains("正在进行人机识别")) {
            SpiderApi spiderApi3 = this.H;
            if (spiderApi3 != null) {
                spiderApi3.log("人机验证--> " + str2);
            }
            String trim = Y(str2, "src=\"&&\"", "").get(0).trim();
            if (trim.length() > 0) {
                HashMap hashMap = new HashMap();
                if (!trim.startsWith("http")) {
                    if (trim.startsWith("/")) {
                        sb2 = new StringBuilder();
                        sb2.append(this.f);
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(this.f);
                        sb2.append("/");
                    }
                    sb2.append(trim);
                    trim = sb2.toString();
                }
                String h = g.h(trim, r(trim), hashMap);
                String trim2 = Y(h, "var key=\"&&\"", "").get(0).trim();
                String trim3 = Y(h, ",value=\"&&\"", "").get(0).trim();
                String str4 = "";
                for (int i = 0; i < trim3.length(); i++) {
                    StringBuilder b2 = d.b(str4);
                    b2.append(Integer.toString(trim3.charAt(i)));
                    str4 = b2.toString();
                }
                String a = m.a(str4, m.b);
                String trim4 = Y(h, "c.get(\"&&\\&", "").get(0).trim();
                if (!trim4.startsWith("http")) {
                    if (trim4.startsWith("/")) {
                        sb = new StringBuilder();
                        sb.append(this.f);
                    } else {
                        sb = new StringBuilder();
                        sb.append(this.f);
                        sb.append("/");
                    }
                    sb.append(trim4);
                    trim4 = sb.toString();
                }
                String str5 = trim4 + "&key=" + trim2 + "&value=" + a;
                g.h(str5, r(str5), hashMap);
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (((String) entry.getKey()).equals("set-cookie") || ((String) entry.getKey()).equals("Set-Cookie")) {
                        this.y = this.y.length() < 1 ? TextUtils.join(";", (Iterable) entry.getValue()) : this.y + ";" + TextUtils.join(";", (Iterable) entry.getValue());
                        this.t++;
                        return j(str);
                    }
                    while (r13.hasNext()) {
                    }
                }
                this.t++;
                return j(str);
            }
            return str2;
        } else if (str2.indexOf("输入验证码") >= 0 || str2.indexOf("滑动验证") >= 0) {
            try {
                SpiderApi spiderApi4 = this.H;
                if (spiderApi4 != null) {
                    spiderApi4.log("OCR辅助验证--> " + str2);
                }
                boolean z = str2.indexOf("输入验证码") >= 0;
                JSONObject y = y(B("验证"), z);
                String str6 = this.y;
                String string = y.getString("str");
                String string2 = y.getString("codeUrl");
                String E = E("ocr", "Ocr", "OCR", "");
                String str7 = "1";
                if (!z) {
                    E = (E.length() < 1 || !E.startsWith("http")) ? "https://ocr1.wogg.link/" : "https://ocr1.wogg.link/";
                    str7 = "3";
                } else if (E.length() < 1 || !E.startsWith("http")) {
                    E = "https://ocr.wogg.link/";
                }
                J("");
                JSONObject o = o(string, E, str7);
                String string3 = o.getString("code");
                this.y = o.getString("cookie");
                if (string3.length() <= 0 || this.y.length() <= 0) {
                    this.y = str6;
                    int i2 = this.t + 1;
                    this.t = i2;
                    if (i2 >= this.u) {
                        return str2;
                    }
                    P(str, str2);
                }
                HashMap<String, String> r = r(string);
                if (z) {
                    if (new JSONObject(com.github.catvod.spider.merge.h.b.c(string2 + string3, new HashMap(), r)).optInt("code") != 1) {
                        this.y = str6;
                        int i3 = this.t + 1;
                        this.t = i3;
                        if (i3 >= this.u) {
                            return str2;
                        }
                        P(str, str2);
                    }
                    this.t++;
                    return j(str);
                }
                if (!g.g(string2 + string3, r).contains("ok")) {
                    this.y = str6;
                    int i4 = this.t + 1;
                    this.t = i4;
                    if (i4 >= this.u) {
                        return str2;
                    }
                    P(str, str2);
                }
                this.t++;
                return j(str);
            } catch (Exception e) {
                spiderApi = this.H;
                if (spiderApi == null) {
                }
            }
            spiderApi = this.H;
            if (spiderApi == null) {
                b.a(e, d.b("jumpbtwaf()错误-->"), spiderApi);
                return str2;
            }
            return str2;
        } else {
            return str2;
        }
    }

    private String Q(String str) {
        if (str.indexOf("转义左括号") >= 0) {
            str = str.replace("转义左括号", "[");
        }
        return str.indexOf("转义右括号") >= 0 ? str.replace("转义右括号", "]") : str;
    }

    private String R(String str, String str2) {
        if (str2.equals("*") || str2.isEmpty()) {
            str2 = str;
        }
        String[] split = str.split("\\&");
        String[] split2 = str2.split("\\&");
        int i = 0;
        String str3 = "";
        while (i < split.length) {
            String str4 = i < split.length + (-1) ? "#" : "";
            StringBuilder b = d.b(str3);
            b.append(split[i]);
            b.append("$");
            str3 = n.b(b, split2[i], str4);
            i++;
        }
        return str3;
    }

    private String S(String str, String str2) {
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

    private void T(Map<String, List<String>> map) {
        String[] split;
        if (map.isEmpty()) {
            return;
        }
        SpiderApi spiderApi = this.H;
        if (spiderApi != null) {
            StringBuilder b = d.b("响应--> ");
            b.append(map.toString());
            spiderApi.log(b.toString());
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
            if (this.y.indexOf(str5.split("=")[0]) >= 0) {
                if (!str5.endsWith("=") && !"0".equals(str5.split("=")[1])) {
                    String replaceAll = n.b(new StringBuilder(), this.y, ";").replaceAll(n.b(new StringBuilder(), str5.split("=")[0], "=.*?;"), str5 + ";");
                    this.y = replaceAll;
                    str5 = replaceAll.substring(0, replaceAll.length() - 1);
                }
            } else if (this.y.length() >= 1 && !"0".equals(this.y)) {
                str5 = this.y + ";" + str5;
            }
            this.y = str5;
        }
    }

    private static String V(String str) {
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:993:0x1801
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private org.json.JSONObject W(java.lang.String r70, java.lang.String r71, boolean r72) {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:993:0x1801
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            */
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:67)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:300)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:379)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:308)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:274)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:390)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            Method dump skipped, instructions count: 6772
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.W(java.lang.String, java.lang.String, boolean):org.json.JSONObject");
    }

    private void X(String str) {
        if (B("简介").length() > 0) {
            p.l = L(Y(str, B("简介"), "").get(0));
        }
        if (B("导演").length() > 0) {
            p.m = L(Y(str, B("导演"), "").get(0));
        }
        if (D("主演", "演员", "").length() > 0) {
            p.n = L(Y(str, D("主演", "演员", ""), "").get(0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ArrayList<String> Y(String str, String str2, String str3) {
        String j;
        ArrayList<String> c0;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2.indexOf("\\+") >= 0) {
            str2 = str2.replace("\\+", "转义加号");
        }
        if (str2.indexOf("\\(") >= 0) {
            str2 = str2.replace("\\(", "转义左小括号");
        }
        if (str2.indexOf("\\)") >= 0) {
            str2 = str2.replace("\\)", "转义右小括号");
        }
        if (str2.indexOf("+") < 0) {
            return c0(str, str2, str3);
        }
        String[] split = str2.split("\\+");
        StringBuilder sb = new StringBuilder();
        for (String str4 : split) {
            if (!str4.isEmpty()) {
                if (str4.startsWith("url:")) {
                    String substring = str4.substring(4);
                    if (substring.indexOf("$sub:") > 0) {
                        String[] split2 = substring.split("\\$sub\\:");
                        if (split2.length > 1) {
                            c0 = c0(j(split2[0]), split2[1], "");
                        } else {
                            substring = split2[0];
                        }
                    }
                    j = j(substring);
                    if (!j.isEmpty()) {
                        if (j.startsWith("http") && !sb.toString().trim().endsWith("=") && !sb.toString().trim().endsWith("解析")) {
                            sb = new StringBuilder();
                        }
                        sb.append(j);
                    }
                } else {
                    c0 = c0(str, str4, "");
                }
                j = c0.get(0).trim();
                if (!j.isEmpty()) {
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x035a A[Catch: all -> 0x0462, TRY_ENTER, TryCatch #0 {all -> 0x0462, blocks: (B:11:0x003d, B:13:0x0043, B:14:0x0049, B:16:0x004f, B:17:0x0055, B:19:0x005b, B:20:0x0061, B:23:0x006c, B:25:0x0072, B:27:0x0078, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008c, B:36:0x0092, B:38:0x009e, B:39:0x00a0, B:41:0x00a6, B:42:0x00ac, B:44:0x00b2, B:45:0x00b8, B:47:0x00be, B:48:0x00c4, B:51:0x00ce, B:52:0x00d4, B:54:0x00dc, B:55:0x00e4, B:58:0x00ef, B:60:0x00f5, B:63:0x00fe, B:66:0x0107, B:68:0x010d, B:72:0x014c, B:69:0x012c, B:71:0x0132, B:73:0x0150, B:75:0x015c, B:76:0x017a, B:90:0x01ad, B:92:0x01b3, B:93:0x01b9, B:95:0x01bf, B:96:0x01c5, B:99:0x01cd, B:101:0x01db, B:103:0x01e1, B:104:0x01ed, B:107:0x01f7, B:109:0x01ff, B:111:0x0205, B:113:0x0219, B:115:0x021f, B:117:0x0232, B:119:0x023c, B:120:0x0240, B:116:0x022e, B:112:0x0213, B:122:0x0244, B:124:0x025c, B:138:0x02db, B:139:0x02fc, B:141:0x0302, B:144:0x0326, B:146:0x0336, B:148:0x033e, B:157:0x035a, B:159:0x0362, B:161:0x0372, B:163:0x037a, B:166:0x038c, B:170:0x039b, B:172:0x03a3, B:174:0x03af, B:176:0x03b8, B:178:0x03c2, B:179:0x03d2, B:183:0x03e2, B:187:0x03f1, B:184:0x03e7, B:191:0x0404, B:192:0x0408, B:194:0x0410, B:196:0x041c, B:198:0x0425, B:200:0x042d, B:201:0x0439, B:205:0x0445, B:210:0x0451, B:207:0x0449, B:214:0x0458, B:169:0x0392, B:125:0x0263, B:127:0x026b, B:128:0x027a, B:130:0x027d, B:131:0x029e, B:132:0x02a0, B:133:0x02b1, B:135:0x02b4, B:136:0x02d5, B:77:0x0181, B:79:0x0185, B:81:0x018b, B:83:0x0191, B:86:0x019a, B:87:0x01a7), top: B:229:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0408 A[Catch: all -> 0x0462, TryCatch #0 {all -> 0x0462, blocks: (B:11:0x003d, B:13:0x0043, B:14:0x0049, B:16:0x004f, B:17:0x0055, B:19:0x005b, B:20:0x0061, B:23:0x006c, B:25:0x0072, B:27:0x0078, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008c, B:36:0x0092, B:38:0x009e, B:39:0x00a0, B:41:0x00a6, B:42:0x00ac, B:44:0x00b2, B:45:0x00b8, B:47:0x00be, B:48:0x00c4, B:51:0x00ce, B:52:0x00d4, B:54:0x00dc, B:55:0x00e4, B:58:0x00ef, B:60:0x00f5, B:63:0x00fe, B:66:0x0107, B:68:0x010d, B:72:0x014c, B:69:0x012c, B:71:0x0132, B:73:0x0150, B:75:0x015c, B:76:0x017a, B:90:0x01ad, B:92:0x01b3, B:93:0x01b9, B:95:0x01bf, B:96:0x01c5, B:99:0x01cd, B:101:0x01db, B:103:0x01e1, B:104:0x01ed, B:107:0x01f7, B:109:0x01ff, B:111:0x0205, B:113:0x0219, B:115:0x021f, B:117:0x0232, B:119:0x023c, B:120:0x0240, B:116:0x022e, B:112:0x0213, B:122:0x0244, B:124:0x025c, B:138:0x02db, B:139:0x02fc, B:141:0x0302, B:144:0x0326, B:146:0x0336, B:148:0x033e, B:157:0x035a, B:159:0x0362, B:161:0x0372, B:163:0x037a, B:166:0x038c, B:170:0x039b, B:172:0x03a3, B:174:0x03af, B:176:0x03b8, B:178:0x03c2, B:179:0x03d2, B:183:0x03e2, B:187:0x03f1, B:184:0x03e7, B:191:0x0404, B:192:0x0408, B:194:0x0410, B:196:0x041c, B:198:0x0425, B:200:0x042d, B:201:0x0439, B:205:0x0445, B:210:0x0451, B:207:0x0449, B:214:0x0458, B:169:0x0392, B:125:0x0263, B:127:0x026b, B:128:0x027a, B:130:0x027d, B:131:0x029e, B:132:0x02a0, B:133:0x02b1, B:135:0x02b4, B:136:0x02d5, B:77:0x0181, B:79:0x0185, B:81:0x018b, B:83:0x0191, B:86:0x019a, B:87:0x01a7), top: B:229:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ArrayList<String> Z(String str, String str2, String str3) {
        int i;
        String str4;
        String str5;
        String i2;
        int length;
        int i3;
        String str6;
        boolean z;
        Matcher matcher;
        int i4;
        StringBuilder sb;
        String str7 = str;
        String str8 = str2;
        ArrayList<String> arrayList = new ArrayList<>();
        if ((str2.isEmpty() && str3.isEmpty()) || str8.equals("空$$空") || str8.equals("空")) {
            arrayList.add(str7);
            return arrayList;
        }
        try {
            if (str8.indexOf("转义加号") >= 0) {
                str8 = str8.replace("转义加号", "+");
            }
            if (str8.indexOf("转义左小括号") >= 0) {
                str8 = str8.replace("转义左小括号", "(");
            }
            if (str8.indexOf("转义右小括号") >= 0) {
                str8 = str8.replace("转义右小括号", ")");
            }
            i = 1;
        } catch (Throwable th) {
            if (this.l) {
                Init.show(this.F + "调试->subContentExt出错：" + th.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                StringBuilder b = d.b("subContentExt()错误-->");
                b.append(th.toString());
                spiderApi.log(b.toString());
            }
        }
        if (str8.indexOf("&&") < 0 && str8.indexOf("$$") < 0 && str8.length() > 0 && str3.length() < 1) {
            if (str8.indexOf("替换") >= 0) {
                str8 = a0(str8, str7);
            }
            arrayList.add(str8);
            return arrayList;
        }
        if (str8.endsWith("整页")) {
            str8 = str8.replace("整页", "");
            if (this.w.length() > 0) {
                str7 = this.w;
            }
        }
        if (str8.indexOf("\\[") >= 0) {
            str8 = str8.replace("\\[", "转义左括号");
        }
        if (str8.indexOf("\\]") >= 0) {
            str8 = str8.replace("\\]", "转义右括号");
        }
        if (str8.indexOf("\\*") >= 0) {
            str8 = str8.replace("\\*", "转义星号");
        }
        if (str8.indexOf("\\&") >= 0) {
            str8 = str8.replace("\\&", "转义连接符");
        }
        if (str8.indexOf("\\#") >= 0) {
            str8 = str8.replace("\\#", "转义井号");
        }
        if (str8.indexOf("&&") >= 0) {
            if (str8.split("\\&\\&") != null && str8.split("\\&\\&").length >= 1) {
                if (str8.split("\\&\\&").length == 1) {
                    if (str8.startsWith("&&")) {
                        str7 = "从头截取" + str7;
                        sb = new StringBuilder();
                        sb.append("从头截取");
                        sb.append(str8);
                    } else if (str8.endsWith("&&")) {
                        str7 = str7 + "截取到末尾";
                        sb = new StringBuilder();
                        sb.append(str8);
                        sb.append("截取到末尾");
                    }
                    str8 = sb.toString();
                }
                str4 = str8.split("\\&\\&")[1];
                if (str4.startsWith("[")) {
                    str4 = "截取到末尾" + str4;
                    str7 = str7 + "截取到末尾";
                }
                str8 = str8.split("\\&\\&")[0];
            }
            arrayList.add(str7);
            return arrayList;
        } else if (str8.indexOf("$$") >= 0) {
            if (str8.split("\\$\\$") != null && str8.split("\\&\\&").length >= 2) {
                str4 = str8.split("\\$\\$")[1];
                str8 = str8.split("\\$\\$")[0];
            }
            arrayList.add(str7);
            return arrayList;
        } else {
            str4 = str3;
        }
        if (str8.indexOf("转义连接符") >= 0) {
            str8 = str8.replace("转义连接符", "&");
        }
        if (str4.indexOf("转义连接符") >= 0) {
            str4 = str4.replace("转义连接符", "&");
        }
        if (str8.indexOf("[") >= 0) {
            str5 = str8.replaceAll(".*(\\[.*)", "$1");
            str8 = str8.replaceAll("\\[.*", "");
        } else {
            str5 = "";
        }
        if (str4.indexOf("[") >= 0) {
            str5 = str4.replaceAll(".*(\\[.*)", "$1");
            str4 = str4.replaceAll("\\[.*", "");
        }
        if (str8.matches("-?\\d+") && str4.matches("-?\\d+")) {
            String substring = str7.substring(str8.startsWith("-") ? str7.length() - Integer.parseInt(str8.replace("-", "")) : Integer.parseInt(str8) - 1, str4.startsWith("-") ? (str7.length() - Integer.parseInt(str4.replace("-", ""))) + 1 : Integer.parseInt(str4));
            if (str5.indexOf("替换") > 0) {
                substring = a0(str5, substring);
            }
            arrayList.add(substring);
            return arrayList;
        }
        String Q = Q(str8);
        String Q2 = Q(str4);
        String N = N(Q);
        String N2 = N(Q2);
        if (N.indexOf("*") < 0) {
            str6 = i(N);
            i3 = 1;
        } else {
            if (N.indexOf("**") < 0) {
                String[] split = N.split("\\*");
                i2 = i(e0(split[0]));
                for (int i5 = 1; i5 < split.length; i5++) {
                    i2 = i2 + "([^>]*?)" + i(e0(split[i5]));
                }
                length = split.length;
            } else {
                String[] split2 = N.split("\\*\\*");
                i2 = i(e0(split2[0]));
                for (int i6 = 1; i6 < split2.length; i6++) {
                    i2 = i2 + "([\\S\\s]*?)" + i(e0(split2[i6]));
                }
                length = split2.length;
            }
            String str9 = i2;
            i3 = length;
            str6 = str9;
        }
        Matcher matcher2 = Pattern.compile(str6 + "([\\S\\s]*?)" + i(N2)).matcher(str7);
        int i7 = 0;
        while (matcher2.find()) {
            i7 += i;
            String a0 = a0(str5, matcher2.group(i3) + "<序号>" + i7);
            if (str5.indexOf("[包含:") >= 0) {
                String Q3 = Q(str5.replaceAll(".*\\[包含:(.*?)\\].*", "$1"));
                if (!Q3.isEmpty()) {
                    for (String str10 : Q3.split("#")) {
                        if (a0.indexOf(e0(N(str10))) < 0) {
                        }
                    }
                    z = false;
                    if (z) {
                        if (str5.indexOf("[不包含:") >= 0) {
                            String Q4 = Q(str5.replaceAll(".*\\[不包含:(.*?)\\].*", "$1"));
                            if (!Q4.isEmpty()) {
                                String[] split3 = Q4.split("#");
                                int length2 = split3.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= length2) {
                                        z = true;
                                        break;
                                    } else if (a0.indexOf(e0(N(split3[i8]))) >= 0) {
                                        z = false;
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                        }
                        if (z) {
                            if (str5.indexOf("[含序号:") >= 0) {
                                String replaceAll = str5.replaceAll(".*\\[含序号:(.*?)\\].*", "$1");
                                if (!replaceAll.isEmpty()) {
                                    String[] split4 = replaceAll.split("#");
                                    int length3 = split4.length;
                                    boolean z2 = false;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= length3) {
                                            matcher = matcher2;
                                            i4 = i3;
                                            z = z2;
                                            break;
                                        }
                                        matcher = matcher2;
                                        String str11 = split4[i9];
                                        if (str11.indexOf("-") < 0) {
                                            i4 = i3;
                                            if (Integer.parseInt(str11) == i7) {
                                                z = true;
                                                break;
                                            }
                                        } else {
                                            String[] split5 = str11.split("-");
                                            i4 = i3;
                                            int parseInt = Integer.parseInt(split5[0]);
                                            while (true) {
                                                String[] strArr = split5;
                                                if (parseInt > Integer.parseInt(split5[1])) {
                                                    break;
                                                } else if (parseInt == i7) {
                                                    z2 = true;
                                                    break;
                                                } else {
                                                    parseInt++;
                                                    split5 = strArr;
                                                }
                                            }
                                        }
                                        i9++;
                                        matcher2 = matcher;
                                        i3 = i4;
                                    }
                                    if (z) {
                                        if (str5.indexOf("[不含序号:") >= 0) {
                                            String replaceAll2 = str5.replaceAll(".*\\[不含序号:(.*?)\\].*", "$1");
                                            if (!replaceAll2.isEmpty()) {
                                                String[] split6 = replaceAll2.split("#");
                                                int length4 = split6.length;
                                                int i10 = 0;
                                                boolean z3 = true;
                                                while (true) {
                                                    if (i10 >= length4) {
                                                        z = z3;
                                                        break;
                                                    }
                                                    String str12 = split6[i10];
                                                    if (str12.indexOf("-") >= 0) {
                                                        String[] split7 = str12.split("-");
                                                        int parseInt2 = Integer.parseInt(split7[0]);
                                                        while (true) {
                                                            if (parseInt2 > Integer.parseInt(split7[1])) {
                                                                break;
                                                            } else if (parseInt2 == i7) {
                                                                z3 = false;
                                                                break;
                                                            } else {
                                                                parseInt2++;
                                                            }
                                                        }
                                                    } else if (Integer.parseInt(str12) == i7) {
                                                        z = false;
                                                        break;
                                                    }
                                                    i10++;
                                                }
                                            }
                                        }
                                        if (z) {
                                            arrayList.add(a0);
                                            i = 1;
                                            matcher2 = matcher;
                                            i3 = i4;
                                        }
                                    }
                                    arrayList.add("不要");
                                    i = 1;
                                    matcher2 = matcher;
                                    i3 = i4;
                                }
                            }
                            matcher = matcher2;
                            i4 = i3;
                            if (z) {
                            }
                            arrayList.add("不要");
                            i = 1;
                            matcher2 = matcher;
                            i3 = i4;
                        }
                    }
                    arrayList.add("不要");
                    matcher = matcher2;
                    i4 = i3;
                    i = 1;
                    matcher2 = matcher;
                    i3 = i4;
                }
            }
            z = true;
            if (z) {
            }
            arrayList.add("不要");
            matcher = matcher2;
            i4 = i3;
            i = 1;
            matcher2 = matcher;
            i3 = i4;
        }
        if (arrayList.isEmpty()) {
            arrayList.add("");
        }
        return arrayList;
    }

    private String a0(String str, String str2) {
        String str3;
        String str4;
        String i;
        StringBuilder sb;
        try {
            String replaceAll = str2.replaceAll(".*<序号>(.*)", "$1");
            String replaceAll2 = str2.replaceAll("<序号>.*", "");
            if (str.indexOf("替换") >= 0) {
                String replaceAll3 = str.replaceAll(".*\\[仅?替换[:：](.*?)\\].*", "$1");
                char c = 0;
                if (replaceAll3.indexOf("##") >= 0) {
                    return Y(replaceAll2, replaceAll3.replace("##", "&&"), "").get(0).trim();
                }
                String replace = Q(replaceAll3).replace("<序号>", replaceAll);
                if (!replace.isEmpty()) {
                    String[] split = replace.split("#");
                    int length = split.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String N = N(split[i2]);
                        if (N.indexOf(">>>") < 0) {
                            str3 = N.split(">>")[c];
                            str4 = N.split(">>")[1];
                        } else {
                            str3 = N.split(">>>")[c] + ">";
                            str4 = N.split(">>>")[1];
                        }
                        String f0 = f0(str4);
                        if (str3.indexOf("*") >= 0 && f0.length() > 0) {
                            if (f0.equals("空")) {
                                f0 = "";
                            }
                            if (str3.startsWith("*")) {
                                String e0 = e0(str3.substring(1, str3.length()));
                                sb = new StringBuilder();
                                sb.append("([\\S\\s]*?)");
                                sb.append(i(e0));
                            } else if (str3.endsWith("*")) {
                                String e02 = e0(str3.substring(0, str3.length() - 1));
                                sb = new StringBuilder();
                                sb.append(i(e02));
                                sb.append("([\\S\\s]*?)");
                            } else {
                                String e03 = e0(str3.split("\\*")[0]);
                                String e04 = e0(str3.split("\\*")[1]);
                                i = i(e03) + "([\\S\\s]*?)" + i(e04);
                            }
                            i = sb.toString();
                        } else if (f0.length() <= 0) {
                            continue;
                            i2++;
                            c = 0;
                        } else if (str3.equals("空")) {
                            return f0;
                        } else {
                            if (f0.equals("空")) {
                                f0 = "";
                            }
                            i = i(e0(str3));
                        }
                        replaceAll2 = replaceAll2.replaceAll(i, f0);
                        i2++;
                        c = 0;
                    }
                }
            }
            return replaceAll2;
        } catch (Exception e) {
            if (this.l) {
                Init.show(this.F + "调试->替换出错，请检查：" + str + "->" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("替换tH()错误！-->"), spiderApi);
            }
            return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010c, code lost:
        if (r5.indexOf("替换") <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0162, code lost:
        if (r5.indexOf("替换") <= 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ArrayList<String> b0(String str, String str2, String str3) {
        int i;
        String str4;
        String str5;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2.indexOf("Base64") >= 0) {
            String replace = str2.indexOf("B[") >= 0 ? str2.replaceAll(".*B\\[(.*?)\\].*", "$1").replace("##", "&&") : "";
            if (replace != null && replace.indexOf("替换") > 0) {
                replace = n.a(replace, "]");
            }
            String replaceAll = str2.replaceAll(".*Base64\\((.*?)\\).*", "$1");
            if (replaceAll.matches(".*,\\d")) {
                i = Integer.parseInt(replaceAll.substring(replaceAll.length() - 1, replaceAll.length()));
                replaceAll = replaceAll.substring(0, replaceAll.length() - 2);
            } else {
                i = 1;
            }
            if (replaceAll.isEmpty()) {
                if (i == 2) {
                    str4 = new String(Base64.decode(str, 1));
                    if (this.l) {
                        Init.show("Base64.NO_PADDING模式");
                    }
                } else if (i == 3) {
                    str4 = new String(Base64.decode(str, 2));
                    if (this.l) {
                        Init.show("Base64.NO_WRAP模式");
                    }
                } else if (i == 4) {
                    str4 = new String(Base64.decode(str, 8));
                    if (this.l) {
                        Init.show("Base64.URL_SAFE模式");
                    }
                } else {
                    str4 = new String(Base64.decode(str, 0));
                }
                str5 = str4;
                if (replace.indexOf("&&") < 0) {
                }
                str5 = Z(str5, replace, "").get(0).trim();
            } else {
                if (i == 2) {
                    str5 = new String(Base64.decode(Z(str, replaceAll, str3).get(0).trim(), 1));
                    if (this.l) {
                        Init.show("Base64.NO_PADDING模式");
                    }
                } else if (i == 3) {
                    String str6 = new String(Base64.decode(Z(str, replaceAll, str3).get(0).trim(), 2));
                    if (this.l) {
                        Init.show("Base64.NO_WRAP模式");
                    }
                    str5 = str6;
                } else if (i == 4) {
                    str5 = new String(Base64.decode(Z(str, replaceAll, str3).get(0).trim(), 8));
                    if (this.l) {
                        Init.show("Base64.URL_SAFE模式");
                    }
                } else {
                    str5 = "";
                }
                if (i == 1) {
                    str5 = new String(Base64.decode(Z(str, replaceAll, str3).get(0).trim(), 0));
                }
                if (replace.indexOf("&&") < 0) {
                }
                str5 = Z(str5, replace, "").get(0).trim();
            }
            arrayList.add(str5);
            return arrayList;
        }
        return Z(str, str2, str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
        if (r4.indexOf("替换") <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
        if (r4.indexOf("替换") <= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ArrayList<String> c0(String str, String str2, String str3) {
        String decode;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str2.indexOf("urlDecode") >= 0) {
            String replaceAll = str2.indexOf("B[") >= 0 ? str2.replaceAll(".*(B\\[.*?\\]).*", "$1") : "";
            String replace = str2.indexOf("D[") >= 0 ? str2.replaceAll(".*D\\[(.*?)\\].*", "$1").replace("##", "&&") : "";
            if (replace != null && replace.indexOf("替换") > 0) {
                replace = n.a(replace, "]");
            }
            String replaceAll2 = str2.replaceAll(".*urlDecode\\((.*?)\\).*", "$1");
            if (replaceAll2.isEmpty()) {
                decode = URLDecoder.decode(str);
                if (replace.indexOf("&&") < 0) {
                }
                decode = Z(decode, replace, "").get(0).trim();
            } else {
                if (replaceAll2.indexOf("Base64") >= 0) {
                    replaceAll2 = n.a(replaceAll2, ")");
                    if (replaceAll != null) {
                        if (replaceAll.length() < 1) {
                            replaceAll2 = n.a(replaceAll2, ")");
                        } else {
                            replaceAll2 = replaceAll2 + ")" + replaceAll;
                        }
                    }
                }
                decode = URLDecoder.decode(b0(str, replaceAll2, str3).get(0).trim());
                if (replace.indexOf("&&") < 0) {
                }
                decode = Z(decode, replace, "").get(0).trim();
            }
            arrayList.add(decode);
            return arrayList;
        }
        return b0(str, str2, str3);
    }

    private JSONObject e(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        try {
            this.w = "";
            JSONObject x = x(str, str2, z, hashMap);
            JSONArray jSONArray = new JSONArray();
            if (x != null) {
                jSONArray = x.getJSONArray("list");
            }
            if (jSONArray.length() < 1 && this.v.length() < 1) {
                if ("搜索".equals(this.q) && this.r.indexOf("k0") >= 0) {
                    this.r = this.r.replace("k0", "");
                }
                if (this.r.indexOf("c") < 0) {
                    this.r += "c";
                }
                SpiderApi spiderApi = this.H;
                if (spiderApi != null) {
                    spiderApi.log("自动模式<li>未截取到数据，尝试用<a>再截取一次");
                }
                this.v = "<a&&</a>";
                x = x(str, str2, z, hashMap);
            }
            if (x != null) {
                jSONArray = x.getJSONArray("list");
            }
            if (jSONArray.length() < 1 && "<a&&</a>".equals(this.v)) {
                SpiderApi spiderApi2 = this.H;
                if (spiderApi2 != null) {
                    spiderApi2.log("自动模式<a>未截取到数据，尝试用<div>再截取一次");
                }
                this.v = "<div&&</div>";
                x = x(str, str2, z, hashMap);
                if ("搜索".equals(this.q)) {
                    this.v = "";
                }
            }
            String B = B("浏览器");
            if ((B.length() < 1 && this.r.indexOf("L") >= 0) || "1".equals(B)) {
                B = this.f;
            }
            String n = n(B);
            if (!"搜索".equals(this.q) && B.startsWith("http") && !"0".equals(this.z)) {
                try {
                    Init.run(new a(this, B, n), 200);
                    if (!"0".equals(this.z)) {
                        this.z = "";
                    }
                } catch (Exception e) {
                    if (this.l) {
                        Init.show(this.F + "调试->内置浏览器运行出错：" + e.toString());
                    }
                    SpiderApi spiderApi3 = this.H;
                    if (spiderApi3 != null) {
                        spiderApi3.log("内置浏览器运行()错误！-->" + e.toString());
                    }
                }
            }
            this.w = "";
            return x;
        } catch (JSONException e2) {
            if (this.l) {
                Init.show(this.F + "调试->category出错：" + e2.toString());
            }
            SpiderApi spiderApi4 = this.H;
            if (spiderApi4 != null) {
                StringBuilder b = d.b("category()错误！-->");
                b.append(e2.toString());
                spiderApi4.log(b.toString());
            }
            this.w = "";
            return null;
        }
    }

    private String e0(String str) {
        return str.indexOf("转义星号") >= 0 ? str.replace("转义星号", "*") : str;
    }

    private String f0(String str) {
        try {
            if (str.length() < 0) {
                return "";
            }
            if (str.indexOf("*") < 0) {
                return e0(str);
            }
            Matcher matcher = Pattern.compile(i(e0(str.split("\\*")[0])) + "([\\S\\s]*?)" + i(e0(str.split("\\*")[1]))).matcher(this.w);
            if (matcher.find()) {
                return matcher.group(1).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
            }
            if (this.l) {
                Init.show("替换未获取到有效截取内容");
            }
            return "";
        } catch (Exception e) {
            if (this.l) {
                Init.show(this.F + "调试->替换截取出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("替换截取xhSubCut()错误！-->"), spiderApi);
            }
            return "";
        }
    }

    private String fixCover(String str, String str2) {
        try {
            return "proxy://do=xbpq&site=" + str2 + "&pic=" + str + "&sourcekey=" + B("指定代理");
        } catch (Exception e) {
            if (this.l) {
                Init.show(this.F + "调试->fixCover出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("fixCover()错误-->"), spiderApi);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[Catch: Exception -> 0x012d, TRY_ENTER, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: Exception -> 0x012d, TRY_ENTER, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec A[Catch: Exception -> 0x012d, TRY_ENTER, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1 A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112 A[Catch: Exception -> 0x012d, TRY_ENTER, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117 A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:3:0x0012, B:6:0x0025, B:10:0x003c, B:11:0x003f, B:14:0x0049, B:18:0x0060, B:19:0x0063, B:22:0x006d, B:26:0x0084, B:27:0x0087, B:29:0x008d, B:31:0x0095, B:34:0x00b2, B:37:0x00bb, B:39:0x00cd, B:38:0x00c3, B:40:0x00d0, B:42:0x00d6, B:46:0x00e4, B:49:0x00ec, B:53:0x0105, B:54:0x0108, B:57:0x0112, B:61:0x0129, B:58:0x0117, B:60:0x011d, B:50:0x00f1, B:52:0x00f7, B:23:0x0072, B:25:0x0078, B:15:0x004e, B:17:0x0054, B:7:0x002a, B:9:0x0030), top: B:72:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONArray g(String str, String str2, String str3, String str4, String str5) {
        JSONObject A;
        JSONObject A2;
        JSONObject A3;
        String str6;
        JSONObject A4;
        JSONObject A5;
        String str7 = "时长";
        try {
            JSONArray jSONArray = new JSONArray();
            if (str.indexOf("$") < 0) {
                if (str.indexOf("&") >= 0) {
                    A = A("cateId", "类型", str, D("类型值", "筛选子分类替换词", ""));
                }
                if (str2.indexOf("$") >= 0) {
                    if (str2.indexOf("&") >= 0) {
                        A2 = A("class", "剧情", str2, D("剧情值", "筛选类型替换词", ""));
                    }
                    if (str3.indexOf("$") < 0) {
                        if (str3.indexOf("&") >= 0) {
                            A3 = A("area", "地区", str3, D("地区值", "筛选地区替换词", ""));
                        }
                        if (str4.indexOf("-") >= 0 || str4.indexOf("--") >= 0) {
                            str6 = str4;
                        } else {
                            int parseInt = Integer.parseInt(str4.split("-")[1]);
                            int parseInt2 = Integer.parseInt(str4.split("-")[0]);
                            if (parseInt2 > parseInt) {
                                parseInt2 = parseInt;
                                parseInt = parseInt2;
                            }
                            StringBuilder sb = new StringBuilder();
                            while (parseInt >= parseInt2) {
                                if (parseInt == parseInt2) {
                                    sb.append(String.valueOf(parseInt));
                                } else {
                                    sb.append(String.valueOf(parseInt));
                                    sb.append("&");
                                }
                                parseInt--;
                            }
                            str6 = sb.toString();
                        }
                        if (B("时长").length() > 0) {
                            str7 = "年份";
                        }
                        if (str6.indexOf("$") >= 0) {
                            if (str6.indexOf("&") >= 0) {
                                A4 = A("year", str7, str6, E("年份值", "时长值", "筛选年份替换词", ""));
                            }
                            if (str5.indexOf("$") < 0) {
                                if (str5.indexOf("&") >= 0) {
                                    A5 = A("by", "排序", str5, D("排序值", "筛选排序替换词", ""));
                                }
                                return jSONArray;
                            }
                            A5 = A("by", "排序", str5, "");
                            jSONArray.put(A5);
                            return jSONArray;
                        }
                        A4 = A("year", str7, str6, "");
                        jSONArray.put(A4);
                        if (str5.indexOf("$") < 0) {
                        }
                        jSONArray.put(A5);
                        return jSONArray;
                    }
                    A3 = A("area", "地区", str3, "");
                    jSONArray.put(A3);
                    if (str4.indexOf("-") >= 0) {
                    }
                    str6 = str4;
                    if (B("时长").length() > 0) {
                    }
                    if (str6.indexOf("$") >= 0) {
                    }
                    jSONArray.put(A4);
                    if (str5.indexOf("$") < 0) {
                    }
                    jSONArray.put(A5);
                    return jSONArray;
                }
                A2 = A("class", "剧情", str2, "");
                jSONArray.put(A2);
                if (str3.indexOf("$") < 0) {
                }
                jSONArray.put(A3);
                if (str4.indexOf("-") >= 0) {
                }
                str6 = str4;
                if (B("时长").length() > 0) {
                }
                if (str6.indexOf("$") >= 0) {
                }
                jSONArray.put(A4);
                if (str5.indexOf("$") < 0) {
                }
                jSONArray.put(A5);
                return jSONArray;
            }
            A = A("cateId", "类型", str, "");
            jSONArray.put(A);
            if (str2.indexOf("$") >= 0) {
            }
            jSONArray.put(A2);
            if (str3.indexOf("$") < 0) {
            }
            jSONArray.put(A3);
            if (str4.indexOf("-") >= 0) {
            }
            str6 = str4;
            if (B("时长").length() > 0) {
            }
            if (str6.indexOf("$") >= 0) {
            }
            jSONArray.put(A4);
            if (str5.indexOf("$") < 0) {
            }
            jSONArray.put(A5);
            return jSONArray;
        } catch (Exception e) {
            if (this.l) {
                Init.show(this.F + "调试->creatFilter出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("creatFilter()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    private String h(String str) {
        String str2;
        String[] split;
        XBPQ$3 r0 = new XBPQ$3();
        String str3 = this.r;
        String trim = str.indexOf(";post") > 0 ? str.split(";post;")[1].trim() : "";
        String str4 = str.split(";")[0];
        if (this.r.indexOf("J") < 0 || str4.indexOf("outerHTML") >= 0 || str4.indexOf("innerHTML") >= 0 || this.H == null) {
            str2 = str4;
        } else {
            str2 = this.H.getAddress(true) + "webparse/" + str4 + "<<eval" + (str3.matches(".*Jb?\\d+.*") ? str3.replaceAll(".*Jb?(\\d+).*", "$1") : "") + (this.r.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML");
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                spiderApi.log("正在使用代理--> " + str2);
            }
        }
        HashMap<String, String> r = !"搜索".equals(this.q) ? r(str4) : I(str4);
        if (trim.length() > 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str5 : trim.split("\\&")) {
                if (!str5.endsWith("=")) {
                    int indexOf = str5.indexOf("=");
                    linkedHashMap.put(str5.substring(0, indexOf), str5.substring(indexOf + 1));
                }
            }
            if (trim.isEmpty()) {
                g.e(g.b(), str2, (Map) null, r, r0);
            } else {
                g.e(g.b(), str2, linkedHashMap, r, r0);
            }
        } else {
            g.c(g.b(), str2, r, r0);
        }
        try {
            byte[] bytes = ((Response) r0.getResult()).body().bytes();
            return bytes != null ? new String(bytes, this.r.indexOf("g") >= 0 ? "GBK" : E("编码", "网页编码格式", "Coding_format", "UTF-8")) : "";
        } catch (IOException e) {
            if (this.l) {
                Init.show(this.F + "调试->deEnCode出错：" + e.toString());
            }
            SpiderApi spiderApi2 = this.H;
            if (spiderApi2 != null) {
                StringBuilder b = d.b("deEnCode()错误-->");
                b.append(e.toString());
                spiderApi2.log(b.toString());
            }
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04cc A[Catch: Exception -> 0x04e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x04e0, blocks: (B:76:0x0265, B:78:0x0274, B:79:0x0288, B:81:0x0290, B:83:0x0296, B:85:0x02a0, B:87:0x02a8, B:180:0x04ae, B:89:0x02ae, B:91:0x02b8, B:93:0x02c0, B:95:0x02c8, B:98:0x02da, B:101:0x02ef, B:104:0x0311, B:106:0x031d, B:112:0x0339, B:108:0x0329, B:110:0x0331, B:113:0x0347, B:115:0x034f, B:118:0x0359, B:120:0x035f, B:121:0x0365, B:123:0x036c, B:125:0x0374, B:127:0x037c, B:129:0x0384, B:131:0x038c, B:134:0x0396, B:136:0x039e, B:139:0x03aa, B:177:0x0495, B:141:0x03b2, B:143:0x03ba, B:144:0x03d2, B:146:0x03da, B:147:0x03e5, B:149:0x03ed, B:150:0x03f8, B:152:0x0400, B:153:0x040b, B:155:0x0413, B:156:0x041e, B:158:0x0426, B:159:0x0431, B:161:0x0439, B:162:0x0444, B:164:0x044a, B:165:0x0458, B:167:0x046c, B:168:0x0475, B:170:0x047c, B:172:0x0484, B:174:0x048a, B:181:0x04be, B:184:0x04cc), top: B:208:0x0265 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04be A[EDGE_INSN: B:216:0x04be->B:181:0x04be ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0215 A[Catch: Exception -> 0x04e2, TryCatch #3 {Exception -> 0x04e2, blocks: (B:12:0x0061, B:14:0x006b, B:16:0x007d, B:18:0x008d, B:22:0x0095, B:23:0x00a3, B:25:0x00a9, B:35:0x0128, B:28:0x00b7, B:30:0x0110, B:32:0x0116, B:34:0x011c, B:36:0x012c, B:37:0x0134, B:47:0x0183, B:38:0x013a, B:40:0x0149, B:42:0x0151, B:43:0x0155, B:45:0x015b, B:46:0x017a, B:48:0x018c, B:50:0x019b, B:52:0x01a5, B:53:0x01a9, B:67:0x020d, B:71:0x023f, B:72:0x0244, B:74:0x024d, B:70:0x0215, B:56:0x01b6, B:58:0x01bc, B:60:0x01c2, B:62:0x01d0, B:64:0x0202, B:63:0x01fb), top: B:214:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024d A[Catch: Exception -> 0x04e2, TRY_LEAVE, TryCatch #3 {Exception -> 0x04e2, blocks: (B:12:0x0061, B:14:0x006b, B:16:0x007d, B:18:0x008d, B:22:0x0095, B:23:0x00a3, B:25:0x00a9, B:35:0x0128, B:28:0x00b7, B:30:0x0110, B:32:0x0116, B:34:0x011c, B:36:0x012c, B:37:0x0134, B:47:0x0183, B:38:0x013a, B:40:0x0149, B:42:0x0151, B:43:0x0155, B:45:0x015b, B:46:0x017a, B:48:0x018c, B:50:0x019b, B:52:0x01a5, B:53:0x01a9, B:67:0x020d, B:71:0x023f, B:72:0x0244, B:74:0x024d, B:70:0x0215, B:56:0x01b6, B:58:0x01bc, B:60:0x01c2, B:62:0x01d0, B:64:0x0202, B:63:0x01fb), top: B:214:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String l() {
        String str;
        String str2;
        SpiderApi spiderApi;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String sb;
        String sb2;
        StringBuilder sb3;
        String str8;
        List a;
        int i;
        LinkedList linkedList;
        String str9;
        String str10;
        String str11;
        List list;
        String str12;
        JSONObject optJSONObject;
        if (this.c.length() < 3) {
            String str13 = "/";
            String B = B("分类");
            try {
            } catch (Exception e) {
                e = e;
                str = "\\s";
                str2 = "分类";
            }
            if (B.indexOf("$") >= 0) {
                str = "\\s";
                str2 = "分类";
            } else {
                str2 = "分类";
                try {
                    str3 = "http";
                    str4 = "/@href";
                    str5 = "分类标题";
                    str6 = "直播";
                    str7 = "\\s";
                    if (B("分类数组").indexOf("&&") >= 0) {
                        try {
                            if (!B("分类数组").startsWith("//")) {
                                String j = j(B("主页url"));
                                String str14 = !B("分类二次截取").isEmpty() ? Y(j, B("分类二次截取"), "").get(0) : j;
                                if (!str14.isEmpty()) {
                                    j = str14;
                                }
                                ArrayList<String> Y = Y(j, B("分类数组"), "");
                                StringBuilder sb4 = new StringBuilder();
                                for (int i2 = 0; i2 < Y.size(); i2++) {
                                    if (!Y.get(i2).equals("不要")) {
                                        String trim = Y(Y.get(i2) + "</a>", B("分类标题"), ">&&</a>").get(0).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
                                        String str15 = Y(Y.get(i2), B("分类ID"), "href=\"&&\"").get(0);
                                        if (!trim.equals("不要") && !trim.isEmpty() && !str15.isEmpty()) {
                                            sb4.append(trim);
                                            sb4.append("$");
                                            sb4.append(str15);
                                            sb4.append("#");
                                        }
                                    }
                                }
                                sb = sb4.toString();
                                sb2 = sb4.toString();
                                B = sb.substring(0, sb2.length() - 1);
                                str = str7;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = str7;
                        }
                    }
                    sb3 = new StringBuilder();
                } catch (Exception e3) {
                    e = e3;
                    str = "\\s";
                }
                if (B("cateManual").isEmpty() || (optJSONObject = this.A.optJSONObject("cateManual")) == null) {
                    a g0 = g0(B("主页url"));
                    if (B.length() < 1 && B("分类数组").startsWith("//")) {
                        B = B("分类数组");
                    }
                    String str16 = "ul";
                    String str17 = "a";
                    if (B.length() < 1) {
                        str8 = "";
                    } else if (B.startsWith("//") || B.indexOf("\\.") < 0) {
                        str8 = "";
                        a = g0.a(B.startsWith("//") ? "//" + str16 + "[(contains(//text(),'" + B + "') or contains(//text(),'连续剧') or contains(//@title,'連續劇') or contains(//text(),'电视剧') or contains(//@title,'電視劇') or contains(//text(),'剧集') or contains(//@title,'劇集') or contains(//text(),'电影') or contains(//@title,'電影') or contains(//text(),'无码') or contains(//@title,'无码') or contains(//text(),'無碼') or contains(//@title,'無碼') or contains(//text(),'国产') or contains(//@title,'國產') or contains(//text(),'亚洲') or contains(//@title,'亚洲') or contains(//text(),'亞洲') or contains(//@title,'亞洲')) and not(contains(//@data-original,'/') or contains(//@data-src,'/') or contains(//@src,'/') or contains(//@background,'/'))]" + str8 + "//" + str17 + "[not(contains(//text(),'页') or contains(//text(),'讯') or contains(//text(),'新') or contains(//text(),'追剧') or contains(//text(),'热搜') or contains(//text(),'榜单') or contains(//text(),'会员') or contains(//text(),'排行') or contains(//text(),'留言') or contains(//text(),'私人') or contains(//text(),'影院') or contains(//text(),'网') or contains(//text(),'影视') or contains(//text(),'联系') or contains(//text(),'专题') or contains(//text(),'明星') or contains(//text(),'角色') or contains(//text(),'图') or contains(//text(),'节目') or contains(//text(),'韩娱') or contains(//text(),'演员') or contains(//text(),'文章') or contains(//text(),'其他') or contains(//text(),'音乐') or contains(//text(),'推荐') or contains(//text(),'APP') or contains(//text(),'下载'))]" : B);
                        i = 0;
                        while (true) {
                            linkedList = (LinkedList) a;
                            if (i < linkedList.size()) {
                                break;
                            }
                            str = str7;
                            try {
                                String trim2 = ((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c(D(str5, "cateName", "//text()")).a().replaceAll(str, "").trim();
                                if (trim2.length() < 2) {
                                    trim2 = ((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c("/@title").a().trim();
                                }
                                if (trim2.length() > 9 || trim2.length() < 2 || sb3.toString().indexOf(trim2) >= 0) {
                                    str9 = str3;
                                    str10 = str6;
                                    str11 = str5;
                                    list = a;
                                } else {
                                    str10 = str6;
                                    if ((trim2.indexOf(str10) < 0 || B.indexOf(str10) >= 0) && (this.r.indexOf("!") < 0 || (trim2.indexOf("理") < 0 && trim2.indexOf("福") < 0 && trim2.indexOf("美女") < 0))) {
                                        str11 = str5;
                                        String str18 = str4;
                                        String E = E("分类ID", "分类链接", "cateId", str18);
                                        str9 = str3;
                                        if (E.startsWith(str9)) {
                                            E = str18;
                                        }
                                        String trim3 = ((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c(E).a().trim();
                                        str4 = str18;
                                        list = a;
                                        if (trim3.indexOf("search") >= 0) {
                                            if ((sb3.toString().indexOf("剧") < 0 && sb3.toString().indexOf("劇") < 0) || (this.r.indexOf("s0") < 0 && this.r.indexOf("s") >= 0)) {
                                                sb3.append(trim2);
                                                sb3.append("$");
                                                sb3.append(trim2);
                                                sb3.append("#");
                                            }
                                        } else if (this.r.indexOf("s0") >= 0 || this.r.indexOf("s") < 0) {
                                            if (trim3.startsWith(str9)) {
                                                trim3 = trim3.replace(this.f, "");
                                            }
                                            if (trim3.length() >= 2) {
                                                str12 = str13;
                                                if (trim3.indexOf(str12) >= 0 && trim3.indexOf("detail") < 0 && trim3.indexOf("Detail") < 0 && trim3.indexOf("show") < 0 && trim3.indexOf("play") < 0) {
                                                    String replaceAll = trim3.matches("/.*?[-_~/]\\d+[-_~/][10].*") ? trim3.replaceAll("/.*?[/-_~/](\\d+)[[-_~/]][10].*", "$1") : trim3;
                                                    if (replaceAll == null || !replaceAll.matches("\\d+")) {
                                                        if (trim3.matches(".*id[-_~/=].*")) {
                                                            trim3 = str12 + trim3.split("id[-_~/=]")[1];
                                                        }
                                                        if (trim3.endsWith(".html")) {
                                                            trim3 = trim3.substring(0, trim3.length() - 5);
                                                        }
                                                        if (trim3.endsWith("K")) {
                                                            trim3 = trim3.substring(0, trim3.length() - 1);
                                                        }
                                                        if (trim3.endsWith("/1/index")) {
                                                            trim3 = trim3.substring(0, trim3.length() - 6);
                                                        }
                                                        if (trim3.endsWith("/index")) {
                                                            trim3 = trim3.substring(0, trim3.length() - 6);
                                                        }
                                                        if (trim3.endsWith("-1")) {
                                                            trim3 = trim3.substring(0, trim3.length() - 2);
                                                        }
                                                        if (trim3.endsWith("~1")) {
                                                            trim3 = trim3.substring(0, trim3.length() - 2);
                                                        }
                                                        if (!trim3.startsWith(str9)) {
                                                            trim3 = trim3.substring(trim3.lastIndexOf(str12) + 1, trim3.length());
                                                        }
                                                        replaceAll = trim3.replace("index", "").replace("-----------", "");
                                                        if (replaceAll.startsWith("m-")) {
                                                            replaceAll = replaceAll.substring(2, replaceAll.length());
                                                        }
                                                        if (replaceAll.length() >= 1) {
                                                            if (replaceAll.length() <= 21) {
                                                                if (!replaceAll.startsWith(str9)) {
                                                                    if (sb3.toString().indexOf(replaceAll) >= 0) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    sb3.append(trim2);
                                                    sb3.append("$");
                                                    sb3.append(replaceAll);
                                                    sb3.append("#");
                                                }
                                            }
                                        }
                                    } else {
                                        str11 = str5;
                                        str12 = str13;
                                        str9 = str3;
                                        list = a;
                                    }
                                    i++;
                                    str13 = str12;
                                    str7 = str;
                                    a = list;
                                    str5 = str11;
                                    str6 = str10;
                                    str3 = str9;
                                }
                                str12 = str13;
                                i++;
                                str13 = str12;
                                str7 = str;
                                a = list;
                                str5 = str11;
                                str6 = str10;
                                str3 = str9;
                            } catch (Exception e4) {
                                e = e4;
                            }
                            e = e4;
                            if (this.l) {
                                Init.show(this.F + "调试->createCate出错：" + e.toString());
                            }
                            spiderApi = this.H;
                            if (spiderApi != null) {
                                b.a(e, d.b("createCate()错误-->"), spiderApi);
                            }
                        }
                        str = str7;
                        B = sb3.toString().length() >= 6 ? "电影$1#连续剧$2#综艺$3#动漫$4" : sb3.toString().substring(0, sb3.toString().length() - 1);
                    } else {
                        if (B.split("\\.")[0].indexOf("[") >= 0) {
                            str16 = B.split("\\.")[0].split("\\[")[0];
                            str8 = "[" + B.split("\\.")[0].split("\\[")[1];
                        } else {
                            str16 = B.split("\\.")[0];
                            str8 = "";
                        }
                        str17 = B.split("\\.")[1];
                    }
                    B = "萝莉";
                    if (B.startsWith("//")) {
                    }
                    a = g0.a(B.startsWith("//") ? "//" + str16 + "[(contains(//text(),'" + B + "') or contains(//text(),'连续剧') or contains(//@title,'連續劇') or contains(//text(),'电视剧') or contains(//@title,'電視劇') or contains(//text(),'剧集') or contains(//@title,'劇集') or contains(//text(),'电影') or contains(//@title,'電影') or contains(//text(),'无码') or contains(//@title,'无码') or contains(//text(),'無碼') or contains(//@title,'無碼') or contains(//text(),'国产') or contains(//@title,'國產') or contains(//text(),'亚洲') or contains(//@title,'亚洲') or contains(//text(),'亞洲') or contains(//@title,'亞洲')) and not(contains(//@data-original,'/') or contains(//@data-src,'/') or contains(//@src,'/') or contains(//@background,'/'))]" + str8 + "//" + str17 + "[not(contains(//text(),'页') or contains(//text(),'讯') or contains(//text(),'新') or contains(//text(),'追剧') or contains(//text(),'热搜') or contains(//text(),'榜单') or contains(//text(),'会员') or contains(//text(),'排行') or contains(//text(),'留言') or contains(//text(),'私人') or contains(//text(),'影院') or contains(//text(),'网') or contains(//text(),'影视') or contains(//text(),'联系') or contains(//text(),'专题') or contains(//text(),'明星') or contains(//text(),'角色') or contains(//text(),'图') or contains(//text(),'节目') or contains(//text(),'韩娱') or contains(//text(),'演员') or contains(//text(),'文章') or contains(//text(),'其他') or contains(//text(),'音乐') or contains(//text(),'推荐') or contains(//text(),'APP') or contains(//text(),'下载'))]" : B);
                    i = 0;
                    while (true) {
                        linkedList = (LinkedList) a;
                        if (i < linkedList.size()) {
                        }
                        e = e4;
                        if (this.l) {
                        }
                        spiderApi = this.H;
                        if (spiderApi != null) {
                        }
                        i++;
                        str13 = str12;
                        str7 = str;
                        a = list;
                        str5 = str11;
                        str6 = str10;
                        str3 = str9;
                    }
                    str = str7;
                    if (sb3.toString().length() >= 6) {
                    }
                } else {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        sb3.append(next.trim());
                        sb3.append("$");
                        sb3.append(optJSONObject.getString(next).trim());
                        sb3.append("#");
                    }
                    sb = sb3.toString();
                    sb2 = sb3.toString();
                    B = sb.substring(0, sb2.length() - 1);
                    str = str7;
                }
            }
            this.c = B.replace("電影", "电影").replace("連續劇", "连续剧").replace("電視劇", "电视剧").replace("劇集", "剧集").replace("動漫", "动漫").replace("綜藝", "综艺").replaceAll(str, "");
            if (this.H != null && B(str2).length() < 1) {
                SpiderApi spiderApi2 = this.H;
                StringBuilder b = d.b("自动获取分类--> ");
                b.append(this.c);
                spiderApi2.log(b.toString());
            }
        }
        return this.c;
    }

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get("site");
            String str2 = map.get("pic");
            if (K == null) {
                HashMap<String, String> hashMap = new HashMap<>();
                K = hashMap;
                hashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                K.put("referer", str);
            }
            XBPQ$7 r0 = new XBPQ$7();
            g.c(g.b(), str2, K, r0);
            if (((Response) r0.getResult()).code() == 200) {
                String str3 = ((Response) r0.getResult()).headers().get("Content-Type");
                if (str3 == null) {
                    str3 = "application/octet-stream";
                }
                System.out.println(str2);
                System.out.println(str3);
                return new Object[]{200, str3, ((Response) r0.getResult()).body().byteStream()};
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject m(String str, String str2) {
        String str3;
        StringBuilder sb;
        String str4;
        StringBuilder sb2;
        String str5;
        StringBuilder sb3;
        try {
            if (str2.equals("post") || str2.equals("空#post#空")) {
                str2 = "空#" + this.f + "/index.php/ajax/verify_check?type=show&verify={code};post;#空";
            }
            String[] split = str2.split("#");
            if (str2.length() < 1) {
                if ("搜索".equals(this.q)) {
                    sb3 = new StringBuilder();
                    sb3.append(this.f);
                    sb3.append("/index.php/ajax/verify_check?type=search&verify=");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(this.f);
                    sb3.append("/index.php/ajax/verify_check?type=show&verify=");
                }
                str3 = sb3.toString();
                if (this.r.indexOf("y") >= 0) {
                    str = this.f + "/index.php/verify/index.html?";
                }
            } else {
                if (this.r.indexOf("y") >= 0) {
                    str = this.f + "/index.php/verify/index.html?";
                }
                if (!"空".equals(split[0])) {
                    if (split[0].startsWith("http")) {
                        str = split[0];
                    } else {
                        if (split[0].startsWith("/")) {
                            sb2 = new StringBuilder();
                            sb2.append(this.f);
                            str5 = split[0];
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(this.f);
                            sb2.append("/");
                            str5 = split[0];
                        }
                        sb2.append(str5);
                        str = sb2.toString();
                    }
                }
                if ("搜索".equals(this.q)) {
                    str3 = this.f + "/index.php/ajax/verify_check?type=search&verify=";
                    if (!"空".equals(split[2])) {
                        if (split[2].startsWith("http")) {
                            str3 = split[2];
                        } else {
                            if (split[2].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                str4 = split[2];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                sb.append("/");
                                str4 = split[2];
                            }
                            sb.append(str4);
                            str3 = sb.toString();
                        }
                    }
                } else {
                    str3 = this.f + "/index.php/ajax/verify_check?type=show&verify=";
                    if (!"空".equals(split[1])) {
                        if (split[1].startsWith("http")) {
                            str3 = split[1];
                        } else {
                            if (split[1].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                str4 = split[1];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f);
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
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("getCodeUrl()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    private JSONObject o(String str, String str2, String str3) {
        String str4;
        try {
            Response execute = g.b().newCall(new Request.Builder().url(str).addHeader("User-Agent", J("")).build()).execute();
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
            JSONObject jSONObject = new JSONObject(g.b().newCall(new Request.Builder().url(str2).post(RequestBody.create(MediaType.parse("application/json"), str4)).addHeader("User-Agent", J("")).build()).execute().body().string());
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
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("getDatas()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    private String p(String str, String str2) {
        if (str.indexOf(str2) < 0) {
            return "";
        }
        return ("#" + str + "#").replaceAll(".*" + str2 + "\\$([^#]+?)#.*", "$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015a A[Catch: Exception -> 0x0342, TryCatch #0 {Exception -> 0x0342, blocks: (B:3:0x000e, B:8:0x002f, B:11:0x0054, B:29:0x00cf, B:12:0x0062, B:14:0x0070, B:17:0x007c, B:19:0x0089, B:20:0x0091, B:22:0x009e, B:23:0x00a5, B:25:0x00b2, B:26:0x00b9, B:28:0x00c8, B:30:0x00db, B:33:0x010b, B:37:0x0117, B:39:0x011f, B:40:0x0123, B:42:0x0129, B:44:0x0136, B:46:0x0146, B:50:0x0152, B:52:0x015a, B:53:0x015e, B:55:0x0164, B:58:0x0174, B:60:0x0184, B:62:0x018a, B:63:0x01ab, B:65:0x01ba, B:68:0x01c2, B:69:0x01dc, B:71:0x01e2, B:73:0x01fc, B:97:0x0251, B:99:0x0257, B:101:0x0261, B:103:0x0267, B:105:0x02a0, B:107:0x02a7, B:109:0x02ad, B:111:0x02b8, B:113:0x02be, B:115:0x02cd, B:117:0x02d5, B:119:0x02e0, B:127:0x031b, B:126:0x0303, B:76:0x0208, B:78:0x0210, B:82:0x021b, B:84:0x0223, B:87:0x0231, B:89:0x0239, B:91:0x0241, B:48:0x014c, B:35:0x0111), top: B:139:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164 A[Catch: Exception -> 0x0342, TryCatch #0 {Exception -> 0x0342, blocks: (B:3:0x000e, B:8:0x002f, B:11:0x0054, B:29:0x00cf, B:12:0x0062, B:14:0x0070, B:17:0x007c, B:19:0x0089, B:20:0x0091, B:22:0x009e, B:23:0x00a5, B:25:0x00b2, B:26:0x00b9, B:28:0x00c8, B:30:0x00db, B:33:0x010b, B:37:0x0117, B:39:0x011f, B:40:0x0123, B:42:0x0129, B:44:0x0136, B:46:0x0146, B:50:0x0152, B:52:0x015a, B:53:0x015e, B:55:0x0164, B:58:0x0174, B:60:0x0184, B:62:0x018a, B:63:0x01ab, B:65:0x01ba, B:68:0x01c2, B:69:0x01dc, B:71:0x01e2, B:73:0x01fc, B:97:0x0251, B:99:0x0257, B:101:0x0261, B:103:0x0267, B:105:0x02a0, B:107:0x02a7, B:109:0x02ad, B:111:0x02b8, B:113:0x02be, B:115:0x02cd, B:117:0x02d5, B:119:0x02e0, B:127:0x031b, B:126:0x0303, B:76:0x0208, B:78:0x0210, B:82:0x021b, B:84:0x0223, B:87:0x0231, B:89:0x0239, B:91:0x0241, B:48:0x014c, B:35:0x0111), top: B:139:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e2 A[Catch: Exception -> 0x0342, TryCatch #0 {Exception -> 0x0342, blocks: (B:3:0x000e, B:8:0x002f, B:11:0x0054, B:29:0x00cf, B:12:0x0062, B:14:0x0070, B:17:0x007c, B:19:0x0089, B:20:0x0091, B:22:0x009e, B:23:0x00a5, B:25:0x00b2, B:26:0x00b9, B:28:0x00c8, B:30:0x00db, B:33:0x010b, B:37:0x0117, B:39:0x011f, B:40:0x0123, B:42:0x0129, B:44:0x0136, B:46:0x0146, B:50:0x0152, B:52:0x015a, B:53:0x015e, B:55:0x0164, B:58:0x0174, B:60:0x0184, B:62:0x018a, B:63:0x01ab, B:65:0x01ba, B:68:0x01c2, B:69:0x01dc, B:71:0x01e2, B:73:0x01fc, B:97:0x0251, B:99:0x0257, B:101:0x0261, B:103:0x0267, B:105:0x02a0, B:107:0x02a7, B:109:0x02ad, B:111:0x02b8, B:113:0x02be, B:115:0x02cd, B:117:0x02d5, B:119:0x02e0, B:127:0x031b, B:126:0x0303, B:76:0x0208, B:78:0x0210, B:82:0x021b, B:84:0x0223, B:87:0x0231, B:89:0x0239, B:91:0x0241, B:48:0x014c, B:35:0x0111), top: B:139:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONObject q() {
        String str;
        String str2;
        String D;
        String str3;
        String E;
        String D2;
        Iterator it;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String s;
        String str12;
        String s2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19 = "{by}";
        String str20 = "电视剧";
        String str21 = "#";
        try {
            String str22 = this.c;
            ArrayList arrayList = new ArrayList();
            String[] split = str22.split("#");
            int length = split.length;
            String str23 = "";
            int i = 0;
            String str24 = "连续剧";
            String str25 = "";
            String str26 = str25;
            String str27 = str26;
            while (true) {
                str = str25;
                if (i >= length) {
                    break;
                }
                int i2 = length;
                String str28 = split[i];
                String str29 = str21;
                arrayList.add(str28.split("\\$")[1]);
                String str30 = str20;
                String[] strArr = split;
                if (str20.equals(str28.split("\\$")[0])) {
                    str27 = str28.split("\\$")[1];
                    str25 = str;
                    str24 = str30;
                } else {
                    if ("电视".equals(str28.split("\\$")[0])) {
                        str18 = str28.split("\\$")[1];
                        str24 = "电视";
                    } else if ("剧集".equals(str28.split("\\$")[0])) {
                        str18 = str28.split("\\$")[1];
                        str24 = "剧集";
                    } else if ("连续剧".equals(str28.split("\\$")[0])) {
                        str18 = str28.split("\\$")[1];
                    } else if ("电影".equals(str28.split("\\$")[0])) {
                        str25 = str28.split("\\$")[1];
                    } else {
                        if ("动漫".equals(str28.split("\\$")[0])) {
                            str26 = str28.split("\\$")[1];
                        }
                        str25 = str;
                    }
                    str27 = str18;
                    str25 = str;
                }
                i++;
                length = i2;
                str20 = str30;
                str21 = str29;
                split = strArr;
            }
            String str31 = str21;
            String[] strArr2 = split;
            String D3 = D("类型", "筛选子分类名称", "0");
            String str32 = this.b;
            String D4 = D("剧情", "筛选类型名称", "");
            String str33 = D3;
            String str34 = "{class}";
            String str35 = "电影";
            String str36 = "\\$";
            if ((str32.indexOf("{class}") >= 0 && D4.isEmpty()) || D4.indexOf("[替换") >= 0) {
                str2 = "连续剧".equals(str24) ? "电影--喜剧&爱情&动作&科幻&剧情&战争&警匪&犯罪&动画&奇幻&武侠&冒险&枪战&恐怖&悬疑&青春&古装&历史&运动&儿童&伦理||连续剧--古装&神话&战争&偶像&爱情&喜剧&家庭&犯罪&悬疑&恐怖&武侠&动作&奇幻&剧情&伦理&历史||综艺--脱口秀&真人秀&情感&旅游&音乐&舞蹈&美食&纪实&生活||动漫--科幻&热血&搞笑&冒险&校园&动作&运动||纪录片--纪录&历史&传记&音乐&歌舞&短片&科幻" : "电影--喜剧&爱情&动作&科幻&剧情&战争&警匪&犯罪&动画&奇幻&武侠&冒险&枪战&恐怖&悬疑&青春&古装&历史&运动&儿童&伦理||连续剧--古装&神话&战争&偶像&爱情&喜剧&家庭&犯罪&悬疑&恐怖&武侠&动作&奇幻&剧情&伦理&历史||综艺--脱口秀&真人秀&情感&旅游&音乐&舞蹈&美食&纪实&生活||动漫--科幻&热血&搞笑&冒险&校园&动作&运动||纪录片--纪录&历史&传记&音乐&歌舞&短片&科幻".replace("连续剧", str24);
                if (D4.indexOf("[替换") >= 0) {
                    D4 = a0(D4, str2).replaceAll("\\&+", "&").replace("--&", "--");
                }
                String str37 = str2;
                D = D("地区", "筛选地区名称", "");
                if ((str32.indexOf("{area}") >= 0 && D.isEmpty()) || D.indexOf("[替换") >= 0) {
                    String replace = "连续剧".equals(str24) ? "电影--大陆&香港&台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大||连续剧--大陆&香港&台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大||综艺--大陆&香港&台湾&日本&韩国&美国&英国||动漫--大陆&日本&韩国&美国&英国&法国||纪录片--大陆&香港&台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大" : "电影--大陆&香港&台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大||连续剧--大陆&香港&台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大||综艺--大陆&香港&台湾&日本&韩国&美国&英国||动漫--大陆&日本&韩国&美国&英国&法国||纪录片--大陆&香港&台湾&美国&法国&英国&日本&韩国&德国&泰国&印度&俄罗斯&意大利&西班牙&加拿大".replace("连续剧", str24);
                    if (D.indexOf("[替换") < 0) {
                        str3 = replace;
                        E = E("年份", "时长", "筛选年份名称", "");
                        if (str32.indexOf("{year}") >= 0 && E.isEmpty()) {
                            int year = new Date().getYear() + 1900;
                            StringBuilder sb = new StringBuilder();
                            sb.append(year - 15);
                            sb.append("-");
                            sb.append(year);
                            E = sb.toString();
                        }
                        String str38 = E;
                        D2 = D("排序", "筛选排序名称", "");
                        if (str32.indexOf("{by}") >= 0 && D2.isEmpty()) {
                            D2 = "时间$time#人气$hits#评分$score";
                        }
                        String str39 = D2;
                        JSONObject jSONObject = new JSONObject();
                        new JSONArray();
                        String E2 = E("特殊分类", "特殊分类url", "特殊分类链接", "");
                        it = arrayList.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str40 = (String) it.next();
                            String str41 = str36;
                            String str42 = strArr2[i3].split(str41)[0];
                            if (str42.indexOf("剧") < 0 || str42.indexOf("番剧") >= 0) {
                                if (str42.indexOf("片") < 0) {
                                    str4 = str35;
                                    if (str42.indexOf(str4) >= 0) {
                                    }
                                    if (str42.indexOf("番") < 0 && str42.indexOf("动画") < 0 && str42.indexOf("哔哩") < 0) {
                                        str5 = str40;
                                        str35 = str4;
                                        str6 = str5;
                                    }
                                    str5 = str26;
                                    str35 = str4;
                                    str6 = str5;
                                } else {
                                    str4 = str35;
                                }
                                if (str42.indexOf("纪录片") < 0 && str42.indexOf("动画片") < 0) {
                                    str35 = str4;
                                    str6 = str40;
                                    str5 = str;
                                }
                                if (str42.indexOf("番") < 0) {
                                    str5 = str40;
                                    str35 = str4;
                                    str6 = str5;
                                }
                                str5 = str26;
                                str35 = str4;
                                str6 = str5;
                            } else {
                                str5 = str40;
                                str6 = str27;
                            }
                            if (E2.length() > 0) {
                                str36 = str41;
                                if (E2.indexOf("$") >= 0 && E2.indexOf(str42) >= 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(E2);
                                    str7 = str39;
                                    String str43 = str31;
                                    sb2.append(str43);
                                    String sb3 = sb2.toString();
                                    str31 = str43;
                                    StringBuilder sb4 = new StringBuilder();
                                    str8 = str23;
                                    sb4.append(".*");
                                    sb4.append(str42);
                                    sb4.append(".*?\\$(.*?)#.*");
                                    String replaceAll = sb3.replaceAll(sb4.toString(), "$1");
                                    String s3 = replaceAll.indexOf("{year}") > 0 ? s(i3, str40, str38) : str8;
                                    if (replaceAll.indexOf("{area}") > 0) {
                                        str15 = s(i3, str5, str3);
                                        str10 = str34;
                                    } else {
                                        str10 = str34;
                                        str15 = str8;
                                    }
                                    if (replaceAll.indexOf(str10) > 0) {
                                        str11 = str37;
                                        s = s(i3, str6, str11);
                                        str12 = str15;
                                    } else {
                                        str11 = str37;
                                        str12 = str15;
                                        s = str8;
                                    }
                                    if (replaceAll.indexOf("{cateId}") > 0) {
                                        str16 = str33;
                                        str17 = s(i3, str40, str16);
                                    } else {
                                        str16 = str33;
                                        str17 = str8;
                                    }
                                    str13 = replaceAll.indexOf(str19) < 0 ? str8 : str7;
                                    String str44 = s3;
                                    str9 = str16;
                                    s2 = str17;
                                    str14 = str44;
                                    String str45 = str9;
                                    String str46 = str12;
                                    String str47 = str19;
                                    String str48 = str14;
                                    int i4 = i3;
                                    jSONObject.put(str40, g(s2, s, str46, str48, str13));
                                    i3 = i4 + 1;
                                    str37 = str11;
                                    str19 = str47;
                                    str23 = str8;
                                    str33 = str45;
                                    str34 = str10;
                                    str39 = str7;
                                }
                            } else {
                                str36 = str41;
                            }
                            str7 = str39;
                            str8 = str23;
                            str9 = str33;
                            str10 = str34;
                            str11 = str37;
                            String s4 = s(i3, str40, str38);
                            String s5 = s(i3, str5, str3);
                            s = s(i3, str6, str11);
                            str12 = s5;
                            s2 = s(i3, str40, str9);
                            str13 = str7;
                            str14 = s4;
                            String str452 = str9;
                            String str462 = str12;
                            String str472 = str19;
                            String str482 = str14;
                            int i42 = i3;
                            jSONObject.put(str40, g(s2, s, str462, str482, str13));
                            i3 = i42 + 1;
                            str37 = str11;
                            str19 = str472;
                            str23 = str8;
                            str33 = str452;
                            str34 = str10;
                            str39 = str7;
                        }
                        return jSONObject;
                    }
                    D = a0(D, replace).replaceAll("\\&+", "&").replace("--&", "--");
                }
                str3 = D;
                E = E("年份", "时长", "筛选年份名称", "");
                if (str32.indexOf("{year}") >= 0) {
                    int year2 = new Date().getYear() + 1900;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(year2 - 15);
                    sb5.append("-");
                    sb5.append(year2);
                    E = sb5.toString();
                }
                String str382 = E;
                D2 = D("排序", "筛选排序名称", "");
                if (str32.indexOf("{by}") >= 0) {
                    D2 = "时间$time#人气$hits#评分$score";
                }
                String str392 = D2;
                JSONObject jSONObject2 = new JSONObject();
                new JSONArray();
                String E22 = E("特殊分类", "特殊分类url", "特殊分类链接", "");
                it = arrayList.iterator();
                int i32 = 0;
                while (it.hasNext()) {
                }
                return jSONObject2;
            }
            str2 = D4;
            String str372 = str2;
            D = D("地区", "筛选地区名称", "");
            if (str32.indexOf("{area}") >= 0) {
                if ("连续剧".equals(str24)) {
                }
                if (D.indexOf("[替换") < 0) {
                }
            }
            if ("连续剧".equals(str24)) {
            }
            if (D.indexOf("[替换") < 0) {
            }
        } catch (Exception e) {
            if (this.l) {
                Init.show(this.F + "调试->getFilterData出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("getFilterData()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    private String s(int i, String str, String str2) {
        String[] split;
        StringBuilder sb;
        String str3;
        String str4;
        String[] split2;
        StringBuilder sb2;
        String str5;
        String replaceAll = n.b(d.b("#"), this.c, "#").replaceAll(".*#(.*?)\\$" + str + "#.*", "$1");
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
                    StringBuilder b = d.b("");
                    b.append(i + 1);
                    if (str7.equals(b.toString())) {
                        sb2 = new StringBuilder(str);
                        sb2.append("--");
                        str5 = str2.split("--")[1];
                        sb2.append(str5);
                        return sb2.toString();
                    }
                } else {
                    for (String str8 : str2.split("\\|\\|")) {
                        String str9 = str8.split("--")[0];
                        StringBuilder b2 = d.b("");
                        b2.append(i + 1);
                        if (str9.equals(b2.toString())) {
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

    private JSONArray t(String str, String str2) {
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
            if (this.l) {
                Init.show(this.F + "调试->getJsonArray出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                StringBuilder b = d.b("getJsonArray()错误！-->");
                b.append(e.toString());
                spiderApi.log(b.toString());
            }
            return null;
        }
    }

    private String u(String str, String str2) {
        String sb;
        String j;
        String str3 = "";
        if (str2.indexOf("替换") >= 0) {
            String replaceAll = str2.replaceAll(".*(\\[仅?替换[:：][^\\]]+?\\]).*", "$1");
            str2 = str2.replaceAll("\\[仅?替换[:：]([^\\]]+?)\\]", "");
            str3 = replaceAll;
        }
        if (str2.indexOf("+") < 0) {
            sb = v(str, str2);
        } else {
            String[] split = str2.split("\\+");
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < split.length; i++) {
                if (split[i].startsWith("url:")) {
                    String substring = split[i].substring(4);
                    if (substring.indexOf("$sub:") > 0) {
                        String[] split2 = substring.split("\\$sub\\:");
                        if (split2.length > 1) {
                            j = v(j(split2[0]), split2[1]);
                        } else {
                            substring = split2[0];
                        }
                    }
                    j = j(substring);
                } else {
                    j = v(str, split[i]);
                }
                if (j.length() > 0) {
                    if (j.startsWith("http") && !sb2.toString().trim().endsWith("=") && !sb2.toString().trim().endsWith("解析")) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(j);
                }
            }
            sb = sb2.toString();
        }
        return a0(str3, sb);
    }

    private String v(String str, String str2) {
        if (str2.endsWith("整页")) {
            str2 = str2.replace("整页", "");
            if (this.w.length() > 0) {
                str = this.w;
            }
        }
        try {
            if (str2.indexOf("'") >= 0) {
                return str2.replace("'", "");
            }
            str2 = (str2.indexOf("&&") >= 0 || str2.length() < 1) ? "data" : "data";
            if (str2.indexOf("].") < 0) {
                return w(str, str2);
            }
            String str3 = ",";
            String[] split = str2.split("\\]\\.");
            if (split.length > 2) {
                for (int i = 0; i < split.length - 2; i++) {
                    str = t(str, split[i] + "]").getJSONObject(0).toString();
                }
            }
            String str4 = split[split.length - 1];
            String str5 = split[split.length - 2] + "]";
            if (str4.indexOf("(") >= 0) {
                str3 = str4.replaceAll(".*\\((.*?)\\).*", "$1");
                str4 = str4.replaceAll("\\(.*", "");
            }
            JSONArray t = t(str, str5);
            StringBuilder sb = new StringBuilder();
            if (t == null || t.length() <= 0) {
                return "";
            }
            for (int i2 = 0; i2 < t.length(); i2++) {
                String jSONObject = t.getJSONObject(i2).toString();
                if (i2 == t.length() - 1) {
                    str3 = "";
                }
                sb.append(w(jSONObject, str4));
                sb.append(str3);
            }
            return sb.toString();
        } catch (JSONException e) {
            if (this.l) {
                Init.show(this.F + "调试->getJsonArrayStringAction出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                StringBuilder b = d.b("getJsonArrayStringAction()错误！-->");
                b.append(e.toString());
                spiderApi.log(b.toString());
            }
            return "";
        }
    }

    private String w(String str, String str2) {
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
            if (this.l) {
                Init.show(this.F + "调试->getJsonString出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                StringBuilder b = d.b("getJsonString()错误！-->");
                b.append(e.toString());
                spiderApi.log(b.toString());
            }
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:986:0x174f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private org.json.JSONObject x(java.lang.String r63, java.lang.String r64, boolean r65, java.util.HashMap<java.lang.String, java.lang.String> r66) {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:986:0x174f
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            */
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:67)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:300)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:379)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:308)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:274)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:390)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            Method dump skipped, instructions count: 7304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.x(java.lang.String, java.lang.String, boolean, java.util.HashMap):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1 A[Catch: Exception -> 0x022a, TryCatch #0 {Exception -> 0x022a, blocks: (B:2:0x0000, B:6:0x001b, B:8:0x0023, B:10:0x003e, B:12:0x006e, B:76:0x021a, B:9:0x0031, B:11:0x0050, B:16:0x007d, B:18:0x0096, B:62:0x01d7, B:65:0x01e1, B:67:0x01e9, B:68:0x01ec, B:70:0x01f4, B:71:0x0200, B:73:0x0214, B:72:0x0204, B:21:0x00b1, B:23:0x00b9, B:24:0x00bd, B:26:0x00c5, B:27:0x00d1, B:61:0x01d3, B:28:0x00d6, B:29:0x00e6, B:32:0x0101, B:34:0x0109, B:35:0x010d, B:37:0x0115, B:38:0x0122, B:39:0x0132, B:41:0x015c, B:44:0x0166, B:46:0x016e, B:47:0x0171, B:49:0x0179, B:50:0x0187, B:51:0x0198, B:54:0x01a1, B:56:0x01a9, B:57:0x01ac, B:59:0x01b4, B:60:0x01c2), top: B:84:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONObject y(String str, boolean z) {
        String str2;
        String str3;
        StringBuilder sb;
        String str4;
        StringBuilder sb2;
        String str5;
        String sb3;
        String str6;
        StringBuilder sb4;
        StringBuilder sb5;
        try {
            String[] split = str.split("#");
            if (str.length() < 1) {
                if (z) {
                    if ("搜索".equals(this.q)) {
                        sb5 = new StringBuilder();
                        sb5.append(this.f);
                        sb5.append("/index.php/ajax/verify_check?type=search&verify=");
                    } else {
                        sb5 = new StringBuilder();
                        sb5.append(this.f);
                        sb5.append("/index.php/ajax/verify_check?type=show&verify=");
                    }
                    str6 = sb5.toString();
                    sb4 = new StringBuilder();
                    sb4.append(this.f);
                    sb4.append("/index.php/verify/index.html?");
                } else {
                    str6 = this.f + "/extend/vercode/check.php?tn_r=";
                    sb4 = new StringBuilder();
                    sb4.append(this.f);
                    sb4.append("/extend/vercode/tncode.php?");
                }
                str2 = sb4.toString();
            } else if (z) {
                str2 = this.f + "/index.php/verify/index.html?";
                if ("搜索".equals(this.q)) {
                    str3 = this.f + "/index.php/ajax/verify_check?type=search&verify=";
                    if (!"空".equals(split[2])) {
                        if (split[2].startsWith("http")) {
                            str3 = split[2];
                        } else {
                            if (split[2].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                str4 = split[2];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                sb.append("/");
                                str4 = split[2];
                            }
                            sb.append(str4);
                            str3 = sb.toString();
                        }
                    }
                    if (!"空".equals(split[0])) {
                        if (split[0].startsWith("http")) {
                            sb3 = split[0];
                        } else {
                            if (split[0].startsWith("/")) {
                                sb2 = new StringBuilder();
                                sb2.append(this.f);
                                str5 = split[0];
                            } else {
                                sb2 = new StringBuilder();
                                sb2.append(this.f);
                                sb2.append("/");
                                str5 = split[0];
                            }
                            sb2.append(str5);
                            sb3 = sb2.toString();
                        }
                        str2 = sb3;
                    }
                    str6 = str3;
                } else {
                    str3 = this.f + "/index.php/ajax/verify_check?type=show&verify=";
                    if (!"空".equals(split[1])) {
                        if (split[1].startsWith("http")) {
                            str3 = split[1];
                        } else {
                            if (split[1].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                str4 = split[1];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                sb.append("/");
                                str4 = split[1];
                            }
                            sb.append(str4);
                            str3 = sb.toString();
                        }
                    }
                    if (!"空".equals(split[0])) {
                    }
                    str6 = str3;
                }
            } else {
                str2 = this.f + "/extend/vercode/tncode.php?";
                str3 = this.f + "/extend/vercode/check.php?tn_r=";
                if ("搜索".equals(this.q)) {
                    if (!"空".equals(split[2])) {
                        if (split[2].startsWith("http")) {
                            str3 = split[2];
                        } else {
                            if (split[2].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                str4 = split[2];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                sb.append("/");
                                str4 = split[2];
                            }
                            sb.append(str4);
                            str3 = sb.toString();
                        }
                    }
                    if (!"空".equals(split[0])) {
                    }
                    str6 = str3;
                } else {
                    if (!"空".equals(split[1])) {
                        if (split[1].startsWith("http")) {
                            str3 = split[1];
                        } else {
                            if (split[1].startsWith("/")) {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                str4 = split[1];
                            } else {
                                sb = new StringBuilder();
                                sb.append(this.f);
                                sb.append("/");
                                str4 = split[1];
                            }
                            sb.append(str4);
                            str3 = sb.toString();
                        }
                    }
                    if (!"空".equals(split[0])) {
                    }
                    str6 = str3;
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("str", str2);
            jSONObject.put("codeUrl", str6);
            return jSONObject;
        } catch (Exception e) {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("getOcrUrl()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final HashMap<String, String> I(String str) {
        String sb;
        String replaceAll;
        String[] split;
        HashMap<String, String> hashMap = new HashMap<>();
        String F = F("搜索请求头", "搜索请求头参数", "search_header", "SHeaders", "");
        if (!"搜索".equals(this.q) || F.length() <= 1) {
            F = G("请求头", "请求头参数", "ua", "Headers", "UserAgent", "");
        }
        if (F.length() > 1 && F.indexOf("@") > 0) {
            F = F.replace("@", "$").replace("&&", "#").replace("；；", ";");
        }
        hashMap.put("User-Agent", J(F));
        String n = n(str);
        if (this.r.indexOf("c0") < 0 && n.length() > 1) {
            hashMap.put("Cookie", n);
        }
        if (F.indexOf("Referer") >= 0 || this.r.indexOf("r1") < 0) {
            if (F.indexOf("Referer") < 0 && this.r.indexOf("r") >= 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((str + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                sb2.append("/");
                sb = sb2.toString();
            }
            replaceAll = F.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
            if (replaceAll.indexOf("$") >= 0) {
                for (String str2 : replaceAll.split("#")) {
                    if (!"Cookie".equals(str2.split("\\$")[0]) && !"cookie".equals(str2.split("\\$")[0])) {
                        hashMap.put(str2.split("\\$")[0], str2.split("\\$")[1].equals("空") ? "" : str2.split("\\$")[1]);
                    }
                }
            }
            return hashMap;
        }
        sb = str.split(";")[0];
        hashMap.put("Referer", sb);
        replaceAll = F.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
        if (replaceAll.indexOf("$") >= 0) {
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
        if (r11.indexOf("$") < 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final String J(String str) {
        String B = B("登录");
        if (!"搜索".equals(this.q)) {
            if (J.length() > 1) {
                return J;
            }
            if (this.r.indexOf("c") < 0 && (B.length() > 1 || this.r.indexOf("y") >= 0 || this.r.indexOf("Y") >= 0 || this.r.indexOf("L") >= 0 || this.r.indexOf("点击") >= 0 || B("验证").length() > 0 || B("浏览器").length() > 0)) {
                SharedPreferences sharedPreferences = Init.d;
                String string = sharedPreferences.getString(this.F + "_ua", "");
                if (string.length() > 1) {
                    J = string;
                    return string;
                }
            }
        }
        if (str.length() < 1) {
            str = G("请求头", "请求头参数", "ua", "Headers", "UserAgent", "");
        }
        String trim = str.replace("@", "$").replace("&&", "#").replace("；；", ";").trim();
        if (trim.isEmpty() || trim.indexOf("手机") >= 0 || trim.indexOf("MOBILE_UA") >= 0 || trim.indexOf("电脑") >= 0 || trim.indexOf("PC_UA") >= 0 || (trim.indexOf("User-Agent") < 0 && (this.r.indexOf("a") >= 0 || this.r.indexOf("A") >= 0 || this.r.indexOf("W") >= 0))) {
            if (trim.indexOf("手机") < 0 && trim.indexOf("MOBILE_UA") < 0 && this.r.indexOf("a") < 0 && this.r.indexOf("A") < 0) {
                trim = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36";
            }
            trim = "Mozilla/5.0 (Linux; Android 11; Ghxi Build/RKQ1.200826.002; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/76.0.3809.89 Mobile Safari/537.36";
        } else if (trim.indexOf("User-Agent$") >= 0) {
            trim = (trim + "#").replaceAll(".*User-Agent\\$(.*?)#.*", "$1");
        }
        J = trim;
        return trim;
    }

    final String U(String str) {
        return com.github.catvod.spider.merge.N.a.l(str).p0();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        SpiderApi spiderApi = this.H;
        if (spiderApi != null) {
            spiderApi.log("categoryContent(tid=" + str + ", pg=" + str2 + ", filter=" + z + ", extend=" + hashMap.toString() + ")");
        }
        JSONObject e = e(str, str2, z, hashMap);
        return e != null ? e.toString() : "";
    }

    protected final String d0(String str, String str2, String str3, String str4) {
        String sb;
        HashMap<String, String> I;
        if ("0".equals(this.z)) {
            return str3;
        }
        int i = this.G + 1;
        this.G = i;
        if (i == 2 && this.r.indexOf("c") < 0) {
            this.r = n.b(new StringBuilder(), this.r, "c");
        }
        if (this.G == 4) {
            this.G = 0;
            return str3;
        }
        String str5 = str2.split("###")[1];
        String str6 = str2.split("###")[0];
        try {
            JSONObject m = m(str6, str4);
            String string = m.getString("str");
            str4 = m.getString("codeUrl");
            if (str3.indexOf("输入验证码") >= 0) {
                k.i = "请输入验证码";
            } else {
                if (str3.indexOf("滑动验证") < 0 && str3.indexOf("人机验证") < 0) {
                    k.i = "网页浏览";
                    string = str6;
                }
                k.i = "人机验证";
            }
            Init.run(new c(this, string, this.y), 200);
            while ("".equals(this.z)) {
                try {
                    Thread.sleep(500L);
                } catch (Exception e) {
                    if (this.l) {
                        Init.show(this.F + "调试->webViewDialog睡眠错：" + e.toString());
                    }
                    SpiderApi spiderApi = this.H;
                    if (spiderApi != null) {
                        spiderApi.log("webViewDialog睡眠错误-->" + e.toString());
                    }
                }
            }
        } catch (Exception e2) {
            if (this.l) {
                Init.show(this.F + "调试->验证出错：" + e2.toString());
            }
            SpiderApi spiderApi2 = this.H;
            if (spiderApi2 != null) {
                b.a(e2, d.b("验证错误-->"), spiderApi2);
            }
        }
        if ("1".equals(this.z)) {
            this.z = "";
        }
        if (!"".equals(this.z) && !"0".equals(this.z) && this.r.indexOf("Y") < 0) {
            if (str4.indexOf("{code}") > 0) {
                sb = str4.replace("{code}", this.z);
            } else {
                StringBuilder b = d.b(str4);
                b.append(this.z);
                sb = b.toString();
            }
            if ("搜索".equals(this.q)) {
                I = I(str6);
            } else if (this.r.indexOf("c") >= 0) {
                I = r(str6);
            } else {
                this.r = n.b(new StringBuilder(), this.r, "c");
                I = r(str6);
                this.r = this.r.replace("c", "");
            }
            if (this.l) {
                Init.show(this.y);
            }
            try {
                if (sb.indexOf(";post;") < 0) {
                    com.github.catvod.spider.merge.h.b.g(sb, I);
                } else {
                    XBPQ$5 r1 = new XBPQ$5();
                    g.e(g.b(), sb.split(";")[0], (Map) null, I, r1);
                    String str7 = (String) r1.getResult();
                    if (this.l) {
                        Init.show(str7 != null ? str7 : "验证失败");
                    }
                    SpiderApi spiderApi3 = this.H;
                    if (spiderApi3 != null) {
                        if (("验证结果--> " + str7) == null) {
                            str7 = "验证失败";
                        }
                        spiderApi3.log(str7);
                    }
                }
            } catch (Exception e3) {
                if (this.l) {
                    Init.show(this.F + "调试->webViewDialog验证后post错：" + e3.toString());
                }
                SpiderApi spiderApi4 = this.H;
                if (spiderApi4 != null) {
                    b.a(e3, d.b("webViewDialog验证后post错误-->"), spiderApi4);
                }
            }
            if (!"0".equals(this.z)) {
                this.z = "";
            }
        }
        if ("0".equals(this.z)) {
            return str3;
        }
        if ("fetch".equals(str)) {
            str3 = j(str5);
        }
        return "fetchPost".equals(str) ? k(str5) : str3;
    }

    public String decrypt(String str, String str2, String str3, String str4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)), str2);
        } catch (Exception e) {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("decrypt()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:711:0x1094
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r59) {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:711:0x1094
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            */
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException
            	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:67)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:300)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:379)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:308)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:274)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:390)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            Method dump skipped, instructions count: 10589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.detailContent(java.util.List):java.lang.String");
    }

    public String encrypt(String str, String str2, String str3, String str4) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str3.getBytes(), "AES"), new IvParameterSpec(str4.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 0);
        } catch (Exception e) {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e, d.b("encrypt()错误-->"), spiderApi);
                return null;
            }
            return null;
        }
    }

    protected final String f(String str, String str2, boolean z, HashMap<String, String> hashMap) {
        if (str.startsWith("http")) {
            return str;
        }
        String str3 = this.b;
        String E = E("特殊分类", "特殊分类url", "特殊分类链接", "");
        String F = F("起始页", "分类起始页码", "qishiye", "firstpage", "1");
        if (this.q.length() > 0 && E.indexOf("$") >= 0 && E.indexOf(this.q) >= 0) {
            String a = n.a(E, "#");
            StringBuilder b = d.b(".*");
            b.append(this.q);
            b.append(".*?\\$(.*?)#.*");
            str3 = a.replaceAll(b.toString(), "$1");
        }
        if (str3.indexOf("[") >= 0 || str3.indexOf("|") >= 0) {
            str3 = str2.equals(F) ? str3.replaceAll(".*[\\[|\\|].*(http[^\\]]*)\\]?.*", "$1").replace("firstPage=", "") : str3.replaceAll("\\|\\|", "\\|").replaceAll("(.*)[\\[|\\|].*", "$1");
        }
        if (z && this.a && hashMap != null && hashMap.size() > 0) {
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

    protected final a g0(String str) {
        String j;
        if (str.indexOf(";post") >= 0) {
            j = k(n.a("xp", str));
        } else {
            StringBuilder b = d.b("xp");
            b.append(str.split(";")[0]);
            j = j(b.toString());
        }
        return new a(com.github.catvod.spider.merge.N.a.l(j).R());
    }

    public String getToken(String str, String str2, String str3, String str4) {
        return encrypt(str, str2, str3, str4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:2|3|(31:16|17|18|(23:(5:28|(1:150)|32|(1:34)(2:147|(1:149))|35)(1:151)|36|(1:38)|39|40|(8:42|43|44|(1:(4:54|55|56|57)(2:58|57))|59|55|56|57)|70|71|72|73|74|(11:79|(1:81)(2:139|(1:141)(1:142))|82|83|84|85|(1:130)(1:102)|103|(7:106|(2:(1:117)|(1:115))|118|(2:120|(1:122)(1:123))|124|(1:126)|(0))|127|128)|143|82|83|84|85|(6:87|89|91|93|95|100)|130|103|(7:106|(4:108|(1:112)|117|(0))|118|(0)|124|(0)|(0))|127|128)|152|(1:163)|156|(1:158)(2:160|(1:162))|159|36|(0)|39|40|(0)|70|71|72|73|74|(13:76|79|(0)(0)|82|83|84|85|(0)|130|103|(0)|127|128)|143|82|83|84|85|(0)|130|103|(0)|127|128)|164|17|18|(26:20|22|24|(0)(0)|36|(0)|39|40|(0)|70|71|72|73|74|(0)|143|82|83|84|85|(0)|130|103|(0)|127|128)|152|(1:154)|163|156|(0)(0)|159|36|(0)|39|40|(0)|70|71|72|73|74|(0)|143|82|83|84|85|(0)|130|103|(0)|127|128) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ca, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cc, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cd, code lost:
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d1, code lost:
        if (r28.l != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d3, code lost:
        com.github.catvod.spider.Init.show(r28.F + "调试->获取筛选出错：" + r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f0, code lost:
        r3 = r28.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02f2, code lost:
        if (r3 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f4, code lost:
        r3.log("获取筛选错误！-->" + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029d A[Catch: Exception -> 0x02ca, TryCatch #1 {Exception -> 0x02ca, blocks: (B:92:0x01fb, B:94:0x020d, B:96:0x0215, B:98:0x021d, B:100:0x0225, B:102:0x022d, B:105:0x023e, B:107:0x0244, B:111:0x024e, B:114:0x0254, B:116:0x025c, B:120:0x0267, B:133:0x02c4, B:122:0x026f, B:123:0x0274, B:125:0x029d, B:127:0x02a5, B:128:0x02ae, B:129:0x02b6, B:131:0x02bd), top: B:160:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bd A[Catch: Exception -> 0x02ca, TryCatch #1 {Exception -> 0x02ca, blocks: (B:92:0x01fb, B:94:0x020d, B:96:0x0215, B:98:0x021d, B:100:0x0225, B:102:0x022d, B:105:0x023e, B:107:0x0244, B:111:0x024e, B:114:0x0254, B:116:0x025c, B:120:0x0267, B:133:0x02c4, B:122:0x026f, B:123:0x0274, B:125:0x029d, B:127:0x02a5, B:128:0x02ae, B:129:0x02b6, B:131:0x02bd), top: B:160:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c4 A[Catch: Exception -> 0x02ca, TRY_LEAVE, TryCatch #1 {Exception -> 0x02ca, blocks: (B:92:0x01fb, B:94:0x020d, B:96:0x0215, B:98:0x021d, B:100:0x0225, B:102:0x022d, B:105:0x023e, B:107:0x0244, B:111:0x024e, B:114:0x0254, B:116:0x025c, B:120:0x0267, B:133:0x02c4, B:122:0x026f, B:123:0x0274, B:125:0x029d, B:127:0x02a5, B:128:0x02ae, B:129:0x02b6, B:131:0x02bd), top: B:160:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: Exception -> 0x0311, TryCatch #3 {Exception -> 0x0311, blocks: (B:3:0x000e, B:5:0x002c, B:7:0x0034, B:9:0x003c, B:11:0x0044, B:13:0x004c, B:18:0x0058, B:21:0x0082, B:23:0x0088, B:25:0x008e, B:29:0x0099, B:31:0x00a3, B:34:0x00ab, B:40:0x00be, B:54:0x0117, B:56:0x012b, B:57:0x012d, B:145:0x030c, B:139:0x02cf, B:141:0x02d3, B:142:0x02f0, B:144:0x02f4, B:37:0x00b6, B:42:0x00d6, B:44:0x00e0, B:47:0x00e8, B:53:0x0101, B:50:0x00f5), top: B:164:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5 A[Catch: Exception -> 0x0311, TryCatch #3 {Exception -> 0x0311, blocks: (B:3:0x000e, B:5:0x002c, B:7:0x0034, B:9:0x003c, B:11:0x0044, B:13:0x004c, B:18:0x0058, B:21:0x0082, B:23:0x0088, B:25:0x008e, B:29:0x0099, B:31:0x00a3, B:34:0x00ab, B:40:0x00be, B:54:0x0117, B:56:0x012b, B:57:0x012d, B:145:0x030c, B:139:0x02cf, B:141:0x02d3, B:142:0x02f0, B:144:0x02f4, B:37:0x00b6, B:42:0x00d6, B:44:0x00e0, B:47:0x00e8, B:53:0x0101, B:50:0x00f5), top: B:164:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b A[Catch: Exception -> 0x0311, TryCatch #3 {Exception -> 0x0311, blocks: (B:3:0x000e, B:5:0x002c, B:7:0x0034, B:9:0x003c, B:11:0x0044, B:13:0x004c, B:18:0x0058, B:21:0x0082, B:23:0x0088, B:25:0x008e, B:29:0x0099, B:31:0x00a3, B:34:0x00ab, B:40:0x00be, B:54:0x0117, B:56:0x012b, B:57:0x012d, B:145:0x030c, B:139:0x02cf, B:141:0x02d3, B:142:0x02f0, B:144:0x02f4, B:37:0x00b6, B:42:0x00d6, B:44:0x00e0, B:47:0x00e8, B:53:0x0101, B:50:0x00f5), top: B:164:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cf A[Catch: Exception -> 0x02cc, TRY_ENTER, TryCatch #0 {Exception -> 0x02cc, blocks: (B:76:0x01c1, B:79:0x01cf, B:82:0x01da, B:90:0x01f1, B:85:0x01e4), top: B:158:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e4 A[Catch: Exception -> 0x02cc, TryCatch #0 {Exception -> 0x02cc, blocks: (B:76:0x01c1, B:79:0x01cf, B:82:0x01da, B:90:0x01f1, B:85:0x01e4), top: B:158:0x01c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d A[Catch: Exception -> 0x02ca, TryCatch #1 {Exception -> 0x02ca, blocks: (B:92:0x01fb, B:94:0x020d, B:96:0x0215, B:98:0x021d, B:100:0x0225, B:102:0x022d, B:105:0x023e, B:107:0x0244, B:111:0x024e, B:114:0x0254, B:116:0x025c, B:120:0x0267, B:133:0x02c4, B:122:0x026f, B:123:0x0274, B:125:0x029d, B:127:0x02a5, B:128:0x02ae, B:129:0x02b6, B:131:0x02bd), top: B:160:0x01fb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String homeContent(boolean z) {
        boolean z2;
        String p;
        String str;
        String D;
        int length;
        int i;
        JSONObject optJSONObject;
        String D2;
        String h;
        String str2;
        String str3 = "";
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String D3 = D("横图", "横图模式", "");
            String B = B("分类详情");
            if (B.indexOf("类型") < 0 && B.indexOf("年份") < 0 && B.indexOf("地区") < 0 && B.indexOf("导演") < 0 && B.indexOf("主演") < 0 && B.indexOf("简介") < 0) {
                z2 = false;
                JSONArray jSONArray2 = jSONArray;
                if (this.r.indexOf("h") < 0 && !"1".equals(D3) && !"全部".equals(D3) && D3.indexOf("首页") < 0) {
                    if (z2) {
                        str = "";
                        p = str;
                    } else {
                        String p2 = p(B, "列数");
                        p2 = (p2.length() <= 0 || !p2.matches("\\d")) ? "0" : "0";
                        if ("2".equals(p2)) {
                            p2 = "32";
                        } else if ("1".equals(p2)) {
                            p2 = "21";
                        }
                        jSONObject.put("type_flag", "3-" + p2);
                        str = p2;
                        p = "";
                    }
                    this.c = l();
                    D = D("列表分类", "fenlei", "");
                    if (D.isEmpty()) {
                        D = this.c;
                    }
                    String[] split = D.split("#");
                    length = split.length;
                    i = 0;
                    while (i < length) {
                        int i2 = length;
                        try {
                            String[] strArr = split;
                            String[] split2 = split[i].split("\\$");
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = jSONObject;
                            int i3 = i;
                            jSONObject2.put("type_name", split2[0]);
                            jSONObject2.put("type_id", split2[1]);
                            if (this.r.indexOf("h") < 0 && !"1".equals(D3) && !"全部".equals(D3) && D3.indexOf(split2[0]) < 0) {
                                if (z2) {
                                    str2 = "3-" + str;
                                    jSONObject2.put("type_flag", str2);
                                    JSONArray jSONArray3 = jSONArray2;
                                    jSONArray3.put(jSONObject2);
                                    jSONArray2 = jSONArray3;
                                    i = i3 + 1;
                                    length = i2;
                                    split = strArr;
                                    jSONObject = jSONObject3;
                                } else {
                                    JSONArray jSONArray32 = jSONArray2;
                                    jSONArray32.put(jSONObject2);
                                    jSONArray2 = jSONArray32;
                                    i = i3 + 1;
                                    length = i2;
                                    split = strArr;
                                    jSONObject = jSONObject3;
                                }
                            }
                            str2 = "2-" + p + "-H";
                            jSONObject2.put("type_flag", str2);
                            JSONArray jSONArray322 = jSONArray2;
                            jSONArray322.put(jSONObject2);
                            jSONArray2 = jSONArray322;
                            i = i3 + 1;
                            length = i2;
                            split = strArr;
                            jSONObject = jSONObject3;
                        } catch (Exception e) {
                            e = e;
                            str3 = "";
                            if (this.l) {
                                Init.show(this.F + "调试->homeContent出错：" + e.toString());
                            }
                            SpiderApi spiderApi = this.H;
                            if (spiderApi != null) {
                                b.a(e, d.b("homeContent()错误！-->"), spiderApi);
                            }
                            return str3;
                        }
                    }
                    JSONObject jSONObject4 = jSONObject;
                    jSONObject4.put("class", jSONArray2);
                    String str4 = "filterdata";
                    if (this.A.optJSONObject("筛选") == null && B("筛选").isEmpty()) {
                        if (this.A.optJSONObject("filter") == null) {
                            str4 = "filter";
                        } else if (this.A.optJSONObject("filterdata") == null) {
                            str4 = "";
                        }
                        optJSONObject = this.A.optJSONObject(str4);
                        str3 = "";
                        D2 = D(str4, "筛选数据", str3);
                        String str5 = this.b;
                        boolean z3 = "0".equals(B("筛选")) && (str5.indexOf("{class}") >= 0 || str5.indexOf("{area}") >= 0 || str5.indexOf("{year}") >= 0 || str5.indexOf("{by}") >= 0 || D("类型", "筛选子分类名称", str3).length() > 1 || ((optJSONObject != null && optJSONObject.length() > 0) || D2.length() > 1));
                        this.a = z3;
                        if (z && z3) {
                            if (!D2.startsWith("http") && !D2.startsWith("clan")) {
                                if (optJSONObject != null || D2.equals("ext")) {
                                    optJSONObject = q();
                                }
                                if (optJSONObject != null) {
                                    jSONObject4.put("filters", optJSONObject);
                                }
                            }
                            InetAddress localHost = InetAddress.getLocalHost();
                            StringBuilder sb = new StringBuilder("http://");
                            sb.append(localHost.getHostAddress());
                            sb.append(":");
                            sb.append(this.I);
                            sb.append("/file/");
                            if (D2.startsWith("clan://")) {
                                D2 = D2.startsWith("clan://localhost/") ? D2.replace("clan://localhost/", sb.toString()) : D2.replace("clan://", sb.toString());
                            }
                            h = com.github.catvod.spider.merge.h.b.h(D2, (Map) null, (Map) null);
                            if (h != null) {
                                optJSONObject = new JSONObject(h);
                            }
                            if (optJSONObject != null) {
                            }
                        }
                        return jSONObject4.toString();
                    }
                    str4 = "筛选";
                    optJSONObject = this.A.optJSONObject(str4);
                    str3 = "";
                    D2 = D(str4, "筛选数据", str3);
                    String str52 = this.b;
                    if ("0".equals(B("筛选"))) {
                    }
                    this.a = z3;
                    if (z) {
                        if (!D2.startsWith("http")) {
                            if (optJSONObject != null) {
                            }
                            optJSONObject = q();
                            if (optJSONObject != null) {
                            }
                        }
                        InetAddress localHost2 = InetAddress.getLocalHost();
                        StringBuilder sb2 = new StringBuilder("http://");
                        sb2.append(localHost2.getHostAddress());
                        sb2.append(":");
                        sb2.append(this.I);
                        sb2.append("/file/");
                        if (D2.startsWith("clan://")) {
                        }
                        h = com.github.catvod.spider.merge.h.b.h(D2, (Map) null, (Map) null);
                        if (h != null) {
                        }
                        if (optJSONObject != null) {
                        }
                    }
                    return jSONObject4.toString();
                }
                p = p(D3, "列数");
                p = (p.length() > 0 || !p.matches("\\d")) ? "0" : "0";
                if (this.r.indexOf("h2") < 0) {
                    p = "32";
                } else if (this.r.indexOf("h1") >= 0) {
                    p = "21";
                }
                jSONObject.put("type_flag", "2-" + p + "-H");
                str = "";
                this.c = l();
                D = D("列表分类", "fenlei", "");
                if (D.isEmpty()) {
                }
                String[] split3 = D.split("#");
                length = split3.length;
                i = 0;
                while (i < length) {
                }
                JSONObject jSONObject42 = jSONObject;
                jSONObject42.put("class", jSONArray2);
                String str42 = "filterdata";
                if (this.A.optJSONObject("筛选") == null) {
                    if (this.A.optJSONObject("filter") == null) {
                    }
                    optJSONObject = this.A.optJSONObject(str42);
                    str3 = "";
                    D2 = D(str42, "筛选数据", str3);
                    String str522 = this.b;
                    if ("0".equals(B("筛选"))) {
                    }
                    this.a = z3;
                    if (z) {
                    }
                    return jSONObject42.toString();
                }
                str42 = "筛选";
                optJSONObject = this.A.optJSONObject(str42);
                str3 = "";
                D2 = D(str42, "筛选数据", str3);
                String str5222 = this.b;
                if ("0".equals(B("筛选"))) {
                }
                this.a = z3;
                if (z) {
                }
                return jSONObject42.toString();
            }
            z2 = true;
            JSONArray jSONArray22 = jSONArray;
            if (this.r.indexOf("h") < 0) {
                if (z2) {
                }
                this.c = l();
                D = D("列表分类", "fenlei", "");
                if (D.isEmpty()) {
                }
                String[] split32 = D.split("#");
                length = split32.length;
                i = 0;
                while (i < length) {
                }
                JSONObject jSONObject422 = jSONObject;
                jSONObject422.put("class", jSONArray22);
                String str422 = "filterdata";
                if (this.A.optJSONObject("筛选") == null) {
                }
                str422 = "筛选";
                optJSONObject = this.A.optJSONObject(str422);
                str3 = "";
                D2 = D(str422, "筛选数据", str3);
                String str52222 = this.b;
                if ("0".equals(B("筛选"))) {
                }
                this.a = z3;
                if (z) {
                }
                return jSONObject422.toString();
            }
            p = p(D3, "列数");
            if (p.length() > 0) {
            }
            if (this.r.indexOf("h2") < 0) {
            }
            jSONObject.put("type_flag", "2-" + p + "-H");
            str = "";
            this.c = l();
            D = D("列表分类", "fenlei", "");
            if (D.isEmpty()) {
            }
            String[] split322 = D.split("#");
            length = split322.length;
            i = 0;
            while (i < length) {
            }
            JSONObject jSONObject4222 = jSONObject;
            jSONObject4222.put("class", jSONArray22);
            String str4222 = "filterdata";
            if (this.A.optJSONObject("筛选") == null) {
            }
            str4222 = "筛选";
            optJSONObject = this.A.optJSONObject(str4222);
            str3 = "";
            D2 = D(str4222, "筛选数据", str3);
            String str522222 = this.b;
            if ("0".equals(B("筛选"))) {
            }
            this.a = z3;
            if (z) {
            }
            return jSONObject4222.toString();
        } catch (Exception e2) {
            e = e2;
        }
    }

    public String homeVideoContent() {
        String str;
        String str2;
        String replaceAll;
        try {
            String F = F("首页", "热门", "homeContent", "shouye", "40");
            F = (F.equals("1") || F.equals("首页")) ? "40" : "40";
            if (D("列表分类", "fenlei", "").length() < 3) {
                str = this.c + "#";
            } else {
                str = D("列表分类", "fenlei", "") + "#";
            }
            this.e = 40;
            if (F.indexOf("$") >= 0) {
                this.e = Integer.parseInt(F.split("\\$")[1]);
                String str3 = F.split("\\$")[0];
                if (str3.equals("首页")) {
                    replaceAll = "";
                } else {
                    str2 = ".*" + str3 + "\\$(.*?)#.*";
                    replaceAll = str.replaceAll(str2, "$1");
                }
            } else if (F.matches("\\d+")) {
                this.e = Integer.parseInt(F);
                replaceAll = "";
            } else {
                str2 = ".*" + F + "\\$(.*?)#.*";
                replaceAll = str.replaceAll(str2, "$1");
            }
            if (this.e > 0) {
                this.d = true;
                this.q = "首页";
                JSONObject e = e(replaceAll, "1", false, new HashMap<>());
                this.q = "";
                this.d = false;
                return e != null ? e.toString() : "";
            }
        } catch (Exception e2) {
            if (this.l) {
                Init.show(this.F + "调试->获取首页资源出错：" + e2.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                b.a(e2, d.b("获取首页资源错误！-->"), spiderApi);
            }
        }
        return "";
    }

    final String i(String str) {
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
        this.B = context;
        super.init(context, str);
        if (str != null) {
            try {
                if (str.startsWith("http")) {
                    if (str.indexOf("{cateId}") < 0) {
                        this.A = new JSONObject(com.github.catvod.spider.merge.h.b.h(str, (Map) null, (Map) null));
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        this.A = jSONObject;
                        jSONObject.put("分类url", str);
                    }
                } else if (str.startsWith("{")) {
                    this.A = new JSONObject(str);
                } else {
                    this.A = new JSONObject();
                    String replace = str.replace("\\,", "逗号");
                    if (replace.indexOf(",") < 0) {
                        this.A.put(replace.substring(0, replace.indexOf(":")), replace.substring(replace.indexOf(":") + 1).replace("逗号", ","));
                    } else {
                        for (String str2 : replace.split(",")) {
                            this.A.put(str2.substring(0, str2.indexOf(":")), str2.substring(str2.indexOf(":") + 1).replace("逗号", ","));
                        }
                    }
                }
                M();
            } catch (JSONException e) {
                if (this.l) {
                    Init.show("请检配置ext");
                }
                SpiderApi spiderApi = this.H;
                if (spiderApi != null) {
                    StringBuilder b = d.b("请检配置ext-->");
                    b.append(e.toString());
                    spiderApi.log(b.toString());
                }
            }
        }
    }

    public void initApi(SpiderApi spiderApi) {
        this.H = spiderApi;
        super.initApi(spiderApi);
        String port = spiderApi.getPort();
        this.I = port;
        Init.e = port;
        StringBuilder b = d.b("Id版端口：");
        b.append(this.I);
        spiderApi.log(b.toString());
    }

    public boolean isVideoFormat(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http") || lowerCase.startsWith("magnet")) {
            String[] split = D("嗅探词", "VideoFormat", "m3u8#.mp4#.flv#.mp3#.m4a#magnet:#ed2k:#ftp:#thunder:#push:#tvbox-xg:").split("#");
            String[] split2 = D("过滤词", "VideoFilter", "url=http#;post;#.js").split("#");
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

    protected final String j(String str) {
        String str2;
        String h;
        String a = n.a("###", str);
        String K2 = K(str);
        if (K2.indexOf(";post") >= 0) {
            return k(K2);
        }
        boolean startsWith = K2.startsWith("xp");
        if (startsWith) {
            K2 = K2.replaceAll("xp(http.*)", "$1");
        }
        String str3 = this.r;
        String E = str3.indexOf("g") >= 0 ? "GBK" : E("编码", "网页编码格式", "Coding_format", "UTF-8");
        if ("UTF-8".equals(E)) {
            str2 = "";
        } else {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                spiderApi.log("编码--> " + E);
            }
            str2 = h(K2);
        }
        HashMap hashMap = new HashMap();
        boolean z = true;
        if (str2.length() < 1) {
            if (this.r.indexOf("J") < 0 || K2.indexOf("outerHTML") >= 0 || K2.indexOf("innerHTML") >= 0 || this.H == null) {
                h = com.github.catvod.spider.merge.h.b.h(K2, !"搜索".equals(this.q) ? r(K2) : I(K2), hashMap);
            } else {
                String str4 = this.r.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML";
                String str5 = this.H.getAddress(true) + "webparse/" + K2 + "<<eval" + (str3.matches(".*Jb?\\d+.*") ? str3.replaceAll(".*Jb?(\\d+).*", "$1") : "") + str4;
                SpiderApi spiderApi2 = this.H;
                if (spiderApi2 != null) {
                    spiderApi2.log("正在使用代理get--> " + str5);
                }
                h = this.H.webParse(str5, "");
            }
            str2 = h;
            if (str2 == null) {
                str2 = "";
            }
        }
        T(hashMap);
        String V = V(P(K2, str2));
        if ("0".equals(this.z) || ((this.r.indexOf("y") < 0 && this.r.indexOf("Y") < 0 && B("验证").length() <= 0) || (V.indexOf("安全验证") < 0 && V.indexOf("输入验证码") < 0 && V.indexOf("滑动验证") < 0 && V.indexOf("人机验证") < 0))) {
            z = false;
        }
        if (z) {
            SpiderApi spiderApi3 = this.H;
            String a2 = n.a(K2, a);
            if (spiderApi3 != null) {
                spiderApi3.log("弹窗验证，源码为--> " + V);
                a2 = n.a(a2, a);
            }
            V = d0("fetch", a2, V, B("验证"));
            if (V.indexOf("安全验证") < 0 || V.indexOf("输入验证码") < 0 || V.indexOf("滑动验证") < 0 || V.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.z = "0";
            }
        }
        String trim = V != null ? startsWith ? V : V.replace(" ", "空空空").replaceAll("\\s+", "").replace("空空空", " ").trim() : "";
        this.w = trim;
        return trim;
    }

    protected final String k(String str) {
        String str2;
        String str3;
        OkHttpClient b;
        LinkedHashMap linkedHashMap;
        String[] strArr;
        String a = n.a("###", str);
        String K2 = K(str);
        boolean startsWith = K2.startsWith("xp");
        if (startsWith) {
            K2 = K2.replaceAll("xp(http.*)", "$1");
        }
        String E = this.r.indexOf("g") >= 0 ? "GBK" : E("编码", "网页编码格式", "Coding_format", "UTF-8");
        if ("UTF-8".equals(E)) {
            str2 = "";
        } else {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                spiderApi.log("编码--> " + E);
            }
            str2 = h(K2);
        }
        boolean z = false;
        if (str2.length() < 1) {
            String trim = K2.split(";post;")[1].trim();
            String str4 = K2.split(";")[0];
            String str5 = this.r;
            if (str5.indexOf("J") < 0 || str4.indexOf("outerHTML") >= 0 || str4.indexOf("innerHTML") >= 0 || this.H == null) {
                str3 = str4;
            } else {
                String str6 = this.r.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML";
                str3 = this.H.getAddress(true) + "webparse/" + str4 + "<<eval" + (str5.matches(".*Jb?\\d+.*") ? str5.replaceAll(".*Jb?(\\d+).*", "$1") : "") + str6;
                SpiderApi spiderApi2 = this.H;
                if (spiderApi2 != null) {
                    spiderApi2.log("正在post代理--> " + str3);
                }
                SpiderApi spiderApi3 = this.H;
                if (spiderApi3 != null) {
                    spiderApi3.log("postBody--> " + trim);
                }
            }
            HashMap<String, String> r = !"搜索".equals(this.q) ? r(str4) : I(str4);
            XBPQ$6 r10 = new XBPQ$6();
            SpiderApi spiderApi4 = this.H;
            if (spiderApi4 != null) {
                spiderApi4.log("发出post请求...");
            }
            if (trim.isEmpty()) {
                b = g.b();
                linkedHashMap = null;
            } else if (trim.startsWith("{") && trim.endsWith("}")) {
                try {
                    g.f(g.b(), str3, new JSONObject(trim).toString(), r, r10);
                } catch (JSONException e) {
                    if (this.l) {
                        Init.show(this.F + "调试->fetchPost出错：" + e.toString());
                    }
                    SpiderApi spiderApi5 = this.H;
                    if (spiderApi5 != null) {
                        StringBuilder b2 = d.b("fetchPost()错误-->");
                        b2.append(e.toString());
                        spiderApi5.log(b2.toString());
                    }
                }
                str2 = (String) r10.getResult();
                K2 = str4;
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
                b = g.b();
            }
            g.e(b, str3, linkedHashMap, r, r10);
            str2 = (String) r10.getResult();
            K2 = str4;
        }
        if (str2 == null) {
            str2 = "";
        }
        String V = V(P(K2, str2));
        if (!"0".equals(this.z) && ((this.r.indexOf("y") >= 0 || this.r.indexOf("Y") >= 0 || B("验证").length() > 0) && (V.indexOf("安全验证") >= 0 || V.indexOf("输入验证码") >= 0 || V.indexOf("滑动验证") >= 0 || V.indexOf("人机验证") >= 0))) {
            z = true;
        }
        if (z) {
            SpiderApi spiderApi6 = this.H;
            String a2 = n.a(K2, a);
            if (spiderApi6 != null) {
                spiderApi6.log("需要验证，源码为--> " + V);
                a2 = n.a(a2, a);
            }
            V = d0("fetchPost", a2, V, B("验证"));
            if (V.indexOf("安全验证") < 0 || V.indexOf("输入验证码") < 0 || V.indexOf("滑动验证") < 0 || V.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.z = "0";
            }
        }
        String trim2 = V != null ? startsWith ? V : V.replace(" ", "空空空").replaceAll("\\s+", "").replace("空空空", " ").trim() : "";
        this.w = trim2;
        return trim2;
    }

    public Object[] mProxy(Map<String, String> map) {
        return Proxy.proxy(map);
    }

    public boolean manualVideoCheck() {
        return !D("嗅探词", "过滤词", "").isEmpty() || C("手动嗅探", "ManualSniffer").equals("1") || this.r.indexOf("x") >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final String n(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String trim;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        XBPQ xbpq;
        CharSequence charSequence;
        StringBuilder sb;
        String str12;
        String D;
        String[] split;
        String str13;
        String str14;
        if ("0".equals(this.y)) {
            return "";
        }
        String B = B("登录");
        if ("搜索".equals(this.q)) {
            str2 = "0";
            str3 = "";
            str4 = ";";
            str5 = "#";
            trim = F("搜索请求头", "搜索请求头参数", "search_header", "SHeaders", "").replace("@", "$").replace("&&", str5).replace("；；", str4).trim();
            if (trim.length() < 1) {
                str6 = "请求头";
                str7 = "请求头参数";
                str8 = "ua";
                str9 = "Headers";
                str10 = "UserAgent";
                str11 = "";
                xbpq = this;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", J(trim));
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            if ((B.length() > 0 || B.indexOf(";post;") < 0) && str.indexOf(";post;") < 0) {
                charSequence = "&&";
            } else {
                if (B.length() > 0) {
                    String str15 = B.split(";post;")[0];
                    charSequence = "&&";
                    B = B.split(";post;").length > 1 ? B.split(";post;")[1] : str3;
                    str13 = str15;
                } else {
                    charSequence = "&&";
                    if (str.indexOf(";post;") >= 0) {
                        str13 = str.split(";post;")[0];
                        B = str.split(";post;").length > 1 ? str.split(";post;")[1] : str3;
                    } else {
                        str13 = str3;
                    }
                }
                if (B.length() > 0) {
                    String[] split2 = B.split("\\&");
                    int length = split2.length;
                    str14 = B;
                    int i = 0;
                    while (i < length) {
                        int i2 = length;
                        String str16 = split2[i];
                        hashMap2.put(str16.split("=")[0], str16.split("=")[1]);
                        i++;
                        length = i2;
                        split2 = split2;
                    }
                } else {
                    str14 = B;
                }
                hashMap.put("Referer", str13);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((str + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                sb2.append("/");
                hashMap.put("Origin", sb2.toString());
                com.github.catvod.spider.merge.h.b.d(str13, hashMap2, hashMap, hashMap3);
                B = str14;
            }
            T(hashMap3);
            sb = new StringBuilder(this.y);
            str12 = str3;
            D = D("播放请求头", "直接播放直链视频请求头", str12);
            if (trim.indexOf("ookie") < 0 || D.indexOf("ookie") >= 0) {
                String replaceAll = trim.indexOf("ookie") < 0 ? (trim + str5).replaceAll(".*ookie\\$([^#]+?)#.*", "$1") : str12;
                if (D.indexOf("ookie") >= 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(replaceAll);
                    sb3.append(str4);
                    sb3.append((D.replace("@", "$").replace(charSequence, str5) + str5).replace("；；", str4).replaceAll(".*ookie\\$([^#]+?)#.*", "$1"));
                    replaceAll = sb3.toString();
                }
                for (String str17 : replaceAll.replaceAll(";+", str4).split(str4)) {
                    if (sb.indexOf(str17.split("=")[0]) < 0) {
                        sb.append(str17);
                        sb.append(str4);
                    }
                }
            }
            if (sb.toString().length() >= 2) {
                this.y = str2;
                return str12;
            }
            if (B.length() > 1) {
                SharedPreferences.Editor edit = Init.d.edit();
                String sb4 = sb.toString();
                this.y = sb4;
                edit.putString(this.F, sb4);
                edit.apply();
            }
            if ("cookie".equals(this.n)) {
                Init.show(sb.toString());
            }
            return sb.toString();
        } else if (this.y.length() > 1) {
            return this.y;
        } else {
            if (this.r.indexOf("c") < 0 && (B.length() > 1 || this.r.indexOf("y") >= 0 || this.r.indexOf("Y") >= 0 || this.r.indexOf("L") >= 0 || this.r.indexOf("点击") >= 0 || B("验证").length() > 0 || B("浏览器").length() > 0)) {
                String string = Init.d.getString(this.F, "");
                if (string.length() > 1) {
                    this.y = string;
                    return string;
                }
            }
            str6 = "请求头";
            str7 = "请求头参数";
            str8 = "ua";
            xbpq = this;
            str2 = "0";
            str9 = "Headers";
            str4 = ";";
            str10 = "UserAgent";
            str3 = "";
            str5 = "#";
            str11 = "";
        }
        trim = xbpq.G(str6, str7, str8, str9, str10, str11).replace("@", "$").replace("&&", str5).replace("；；", str4).trim();
        HashMap hashMap4 = new HashMap();
        hashMap4.put("User-Agent", J(trim));
        HashMap hashMap22 = new HashMap();
        HashMap hashMap32 = new HashMap();
        if (B.length() > 0) {
        }
        charSequence = "&&";
        T(hashMap32);
        sb = new StringBuilder(this.y);
        str12 = str3;
        D = D("播放请求头", "直接播放直链视频请求头", str12);
        if (trim.indexOf("ookie") < 0) {
        }
        if (trim.indexOf("ookie") < 0) {
        }
        if (D.indexOf("ookie") >= 0) {
        }
        while (r3 < r2) {
        }
        if (sb.toString().length() >= 2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:160|161|(1:407)(2:171|(1:173)(12:(2:388|(2:401|(2:406|88)(1:405))(1:400))(16:309|(1:311)(1:387)|312|313|314|(4:317|(4:319|(2:321|(2:323|(1:325))(2:326|(2:328|(1:330)(1:331))))|332|(2:336|(2:338|339)(1:380)))(1:384)|381|315)|385|340|(1:379)|344|345|(2:350|(3:360|(1:362)|363)(3:356|357|358))|365|(1:367)(1:369)|368|358)|89|90|(1:92)|93|(1:114)|103|(1:113)|107|(1:109)|110|111))|174|175|176|177|178|179|180|181|(5:261|262|(4:264|265|266|267)(1:294)|268|(1:(7:270|271|272|273|274|275|(2:282|283)(2:277|(2:280|281)(1:279)))(2:287|288)))(1:183)|184|(2:248|(1:250)(2:251|(1:253)(2:254|(1:256)(2:257|(1:259)(1:260)))))(1:186)|187|(2:189|(4:193|(2:195|(2:197|198))|199|(2:202|203)(1:201))(0))|204|(20:209|(1:211)|212|(17:217|(2:221|(14:223|224|90|(0)|93|(1:95)|114|103|(1:105)|113|107|(0)|110|111))|237|238|239|90|(0)|93|(0)|114|103|(0)|113|107|(0)|110|111)|240|(14:242|239|90|(0)|93|(0)|114|103|(0)|113|107|(0)|110|111)|238|239|90|(0)|93|(0)|114|103|(0)|113|107|(0)|110|111)|243|(1:245)|90|(0)|93|(0)|114|103|(0)|113|107|(0)|110|111) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0296, code lost:
        if (r0 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x06e5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x06e6, code lost:
        r2 = r2;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x070d, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x070e, code lost:
        r4 = "parse";
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0715, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0716, code lost:
        r2 = r6;
        r4 = "parse";
        r10 = r17;
        r15 = r19;
        r6 = "跳转post";
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x071f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0720, code lost:
        r23 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x072b, code lost:
        com.github.catvod.spider.Init.show(r27.F + "调试->跳转播放链接出错：" + r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x074c, code lost:
        r4.log("playerContent跳转播放链接错误！-->" + r0.toString());
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:341:0x072b A[Catch: Exception -> 0x0830, TryCatch #0 {Exception -> 0x0830, blocks: (B:345:0x0764, B:347:0x0775, B:348:0x077a, B:350:0x0793, B:352:0x079d, B:354:0x07a7, B:356:0x07b1, B:359:0x07c4, B:361:0x07ce, B:364:0x07d8, B:366:0x07dc, B:367:0x07fa, B:363:0x07d2, B:358:0x07bb, B:339:0x0724, B:341:0x072b, B:342:0x0748, B:344:0x074c, B:371:0x0803, B:373:0x0811, B:374:0x0829), top: B:387:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x074c A[Catch: Exception -> 0x0830, TryCatch #0 {Exception -> 0x0830, blocks: (B:345:0x0764, B:347:0x0775, B:348:0x077a, B:350:0x0793, B:352:0x079d, B:354:0x07a7, B:356:0x07b1, B:359:0x07c4, B:361:0x07ce, B:364:0x07d8, B:366:0x07dc, B:367:0x07fa, B:363:0x07d2, B:358:0x07bb, B:339:0x0724, B:341:0x072b, B:342:0x0748, B:344:0x074c, B:371:0x0803, B:373:0x0811, B:374:0x0829), top: B:387:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0775 A[Catch: Exception -> 0x0830, TryCatch #0 {Exception -> 0x0830, blocks: (B:345:0x0764, B:347:0x0775, B:348:0x077a, B:350:0x0793, B:352:0x079d, B:354:0x07a7, B:356:0x07b1, B:359:0x07c4, B:361:0x07ce, B:364:0x07d8, B:366:0x07dc, B:367:0x07fa, B:363:0x07d2, B:358:0x07bb, B:339:0x0724, B:341:0x072b, B:342:0x0748, B:344:0x074c, B:371:0x0803, B:373:0x0811, B:374:0x0829), top: B:387:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0793 A[Catch: Exception -> 0x0830, TryCatch #0 {Exception -> 0x0830, blocks: (B:345:0x0764, B:347:0x0775, B:348:0x077a, B:350:0x0793, B:352:0x079d, B:354:0x07a7, B:356:0x07b1, B:359:0x07c4, B:361:0x07ce, B:364:0x07d8, B:366:0x07dc, B:367:0x07fa, B:363:0x07d2, B:358:0x07bb, B:339:0x0724, B:341:0x072b, B:342:0x0748, B:344:0x074c, B:371:0x0803, B:373:0x0811, B:374:0x0829), top: B:387:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07ce A[Catch: Exception -> 0x0830, TryCatch #0 {Exception -> 0x0830, blocks: (B:345:0x0764, B:347:0x0775, B:348:0x077a, B:350:0x0793, B:352:0x079d, B:354:0x07a7, B:356:0x07b1, B:359:0x07c4, B:361:0x07ce, B:364:0x07d8, B:366:0x07dc, B:367:0x07fa, B:363:0x07d2, B:358:0x07bb, B:339:0x0724, B:341:0x072b, B:342:0x0748, B:344:0x074c, B:371:0x0803, B:373:0x0811, B:374:0x0829), top: B:387:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07dc A[Catch: Exception -> 0x0830, TryCatch #0 {Exception -> 0x0830, blocks: (B:345:0x0764, B:347:0x0775, B:348:0x077a, B:350:0x0793, B:352:0x079d, B:354:0x07a7, B:356:0x07b1, B:359:0x07c4, B:361:0x07ce, B:364:0x07d8, B:366:0x07dc, B:367:0x07fa, B:363:0x07d2, B:358:0x07bb, B:339:0x0724, B:341:0x072b, B:342:0x0748, B:344:0x074c, B:371:0x0803, B:373:0x0811, B:374:0x0829), top: B:387:0x0049 }] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v0, types: [com.github.catvod.spider.XBPQ] */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String playerContent(String str, String str2, List<String> list) {
        String str3;
        Object obj;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        SpiderApi spiderApi;
        String str10;
        String str11;
        int i;
        int i2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        JSONObject jSONObject;
        int i3;
        int i4;
        int i5;
        SpiderApi spiderApi2;
        StringBuilder sb;
        JSONObject jSONObject2;
        String S;
        SpiderApi spiderApi3;
        String str17 = str2;
        SpiderApi spiderApi4 = this.H;
        if (spiderApi4 != null) {
            str3 = "playerContent(flag=" + str + ", id=" + str17 + ", vipFlags=" + list.toString() + ")";
            spiderApi4.log(str3);
        }
        try {
            try {
                if (!str.equals(">超清<") && !str.equals(">2K<") && !str.equals(">原画<")) {
                    JSONObject jSONObject3 = new JSONObject();
                    if (str17.startsWith("/") && !str17.startsWith("//")) {
                        str17 = this.f + str17;
                    }
                    if (this.s && !isVideoFormat(str17)) {
                        String g = com.github.catvod.spider.merge.h.b.g(str17, r(str17));
                        if (g.indexOf("检测中") >= 0 && g.indexOf("跳转中") >= 0 && g.indexOf("btwaf") >= 0) {
                            String str18 = Y(g, "btwaf=&&\"", "").get(0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str17);
                            sb2.append(str17.indexOf("?") >= 0 ? "&" : "?");
                            sb2.append("btwaf=");
                            sb2.append(str18);
                            str17 = sb2.toString();
                        }
                    }
                    String str19 = str17;
                    String n = n(str19);
                    if (this.r.indexOf("点击") >= 0 && !"0".equals(this.z)) {
                        try {
                            Init.run(new b((XBPQ) this, str19, n), 200);
                            while ("".equals(this.z)) {
                                try {
                                    Thread.sleep(500L);
                                } catch (Exception e) {
                                    if (this.l) {
                                        Init.show(this.F + "调试->playerContent线程睡眠错：" + e.toString());
                                    }
                                    SpiderApi spiderApi5 = this.H;
                                    if (spiderApi5 != null) {
                                        spiderApi5.log("playerContent线程睡眠错误！-->" + e.toString());
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            if (this.l) {
                                Init.show(this.F + "调试->点击播放弹窗出错：" + e2.toString());
                            }
                            SpiderApi spiderApi6 = this.H;
                            if (spiderApi6 != null) {
                                spiderApi6.log("点击播放弹窗错误！-->" + e2.toString());
                            }
                        }
                        if (!"0".equals(this.z)) {
                            this.z = "";
                        }
                    }
                    boolean z = E("免嗅", "mac", "Anal_MacPlayer", "1").equals("1") && this.r.indexOf("m0") < 0 && this.r.indexOf("j") < 0 && !B("强制解析").equals("1") && this.r.indexOf("x") < 0;
                    String D = D("跳转播放链接", "播放链接二次截取", "");
                    String B = B("二次跳转播放链接");
                    String B2 = B("三次跳转播放链接");
                    String B3 = B("四次跳转播放链接");
                    String B4 = B("五次跳转播放链接");
                    String str20 = "跳转播放链接";
                    String C = C("CODE", "UTF-8");
                    String B5 = B("KEY");
                    String str21 = "";
                    try {
                        String B6 = B("IV");
                        String str22 = "解析";
                        if (!isVideoFormat(str19)) {
                            if (B5.length() > 0 && B6.length() > 0) {
                                try {
                                    if (!isVideoFormat(str19)) {
                                        String token = getToken(Long.valueOf(new Date().getTime()).toString(), C, B5, B6);
                                        if (token != null && token.length() > 0) {
                                            String replace = str19.indexOf("{tk}") > 0 ? str19.replace("{tk}", token) : str19 + token;
                                            String string = new JSONObject(decrypt(com.github.catvod.spider.merge.h.b.g(replace, r(replace)), C, B5, B6)).getString("url");
                                            if (string == null || !string.startsWith("http")) {
                                                boolean z2 = this.l;
                                                if (z2) {
                                                }
                                            } else {
                                                try {
                                                    jSONObject3.put("parse", 0);
                                                    str19 = string;
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    str19 = string;
                                                    if (this.l) {
                                                        Init.show(this.F + "调试->解密网址token出错：" + e.toString());
                                                    }
                                                    spiderApi2 = this.H;
                                                    if (spiderApi2 != null) {
                                                        sb = new StringBuilder();
                                                        sb.append("解密网址token错误！-->");
                                                        sb.append(e.toString());
                                                        spiderApi2.log(sb.toString());
                                                    }
                                                    str6 = "url";
                                                    jSONObject2 = jSONObject3;
                                                    str7 = str21;
                                                    str8 = str22;
                                                    str9 = "跳转post";
                                                    S = S(B(str8), str);
                                                    if (S.length() > 1) {
                                                    }
                                                    jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                                    if (B("播放请求头").length() <= 0) {
                                                    }
                                                    jSONObject2.put("header", z(str19));
                                                    if (!this.n.equals("playResult")) {
                                                    }
                                                    this.m = jSONObject2.toString();
                                                    spiderApi3 = this.H;
                                                    if (spiderApi3 != null) {
                                                    }
                                                    return jSONObject2.toString();
                                                }
                                            }
                                        } else if (this.l) {
                                            Init.show("解密失败！");
                                        }
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                }
                                str6 = "url";
                                jSONObject2 = jSONObject3;
                                str7 = str21;
                                str8 = str22;
                                str9 = "跳转post";
                                S = S(B(str8), str);
                                if (S.length() > 1) {
                                }
                                jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                if (B("播放请求头").length() <= 0) {
                                }
                                jSONObject2.put("header", z(str19));
                                if (!this.n.equals("playResult")) {
                                }
                                this.m = jSONObject2.toString();
                                spiderApi3 = this.H;
                                if (spiderApi3 != null) {
                                }
                                return jSONObject2.toString();
                            }
                            int length = D.length();
                            String str23 = "v";
                            String str24 = "j0";
                            String str25 = "url=http";
                            if (length > 0 || B.length() > 0 || B2.length() > 0 || B3.length() > 0 || B4.length() > 0) {
                                obj = "1";
                                str4 = "jx";
                                str5 = "url";
                            } else if (this.r.indexOf("e") < 0) {
                                if (z && !str19.startsWith("magnet")) {
                                    try {
                                        com.github.catvod.spider.merge.e0.g j0 = com.github.catvod.spider.merge.N.a.l(com.github.catvod.spider.merge.h.b.g(str19, !"搜索".equals(this.q) ? r(str19) : I(str19))).j0("script");
                                        String str26 = str21;
                                        for (int i6 = 0; i6 < j0.size(); i6++) {
                                            String trim = ((l) j0.get(i6)).X().trim();
                                            if (trim.startsWith("var player_")) {
                                                JSONObject jSONObject4 = new JSONObject(trim.substring(trim.indexOf(123), trim.lastIndexOf(125) + 1));
                                                String string2 = jSONObject4.getString("url");
                                                if (jSONObject4.has("encrypt")) {
                                                    int i7 = jSONObject4.getInt("encrypt");
                                                    if (i7 == 1) {
                                                        if (this.r.indexOf("u0") < 0) {
                                                            string2 = URLDecoder.decode(string2);
                                                        }
                                                    } else if (i7 == 2) {
                                                        String str27 = new String(Base64.decode(string2, 0));
                                                        string2 = this.r.indexOf("u0") < 0 ? URLDecoder.decode(str27) : str27;
                                                    }
                                                }
                                                if (string2.length() > 6 && !m.d(string2)) {
                                                    str26 = m.b(str19, string2);
                                                    if (str26.startsWith("http")) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (str26.length() < 1 || !str26.startsWith("http")) {
                                            str26 = str19;
                                        }
                                        try {
                                            if (!isVideoFormat(str26) && this.r.indexOf("v") < 0) {
                                                if (!m.d(str26) || this.r.indexOf("j0") >= 0 || str26.indexOf("url=http") >= 0) {
                                                    if (str26.startsWith("http")) {
                                                        str19 = str26;
                                                    }
                                                    jSONObject3.put("parse", 1);
                                                } else {
                                                    jSONObject3.put("parse", 1);
                                                    jSONObject3.put("jx", "1");
                                                    str19 = str26;
                                                }
                                            }
                                            jSONObject3.put("parse", str26.indexOf("url=http") >= 0 ? 1 : 0);
                                            str19 = str26;
                                        } catch (Exception e5) {
                                            e = e5;
                                            str19 = str26;
                                            jSONObject3.put("parse", 1);
                                            if (this.l) {
                                                Init.show(this.F + "调试->免嗅出错：" + e.toString());
                                            }
                                            spiderApi2 = this.H;
                                            if (spiderApi2 != null) {
                                                sb = new StringBuilder();
                                                sb.append("免嗅错误！-->");
                                                sb.append(e.toString());
                                                spiderApi2.log(sb.toString());
                                            }
                                            str6 = "url";
                                            jSONObject2 = jSONObject3;
                                            str7 = str21;
                                            str8 = str22;
                                            str9 = "跳转post";
                                            S = S(B(str8), str);
                                            if (S.length() > 1) {
                                            }
                                            jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                            if (B("播放请求头").length() <= 0) {
                                            }
                                            jSONObject2.put("header", z(str19));
                                            if (!this.n.equals("playResult")) {
                                            }
                                            this.m = jSONObject2.toString();
                                            spiderApi3 = this.H;
                                            if (spiderApi3 != null) {
                                            }
                                            return jSONObject2.toString();
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                    }
                                } else if (str19.indexOf("url=http") < 0 && (B("强制解析").equals("1") || ((m.d(str19) && this.r.indexOf("j0") < 0) || (this.r.indexOf("j") >= 0 && this.r.indexOf("j0") < 0)))) {
                                    jSONObject3.put("parse", 1);
                                    jSONObject3.put("jx", "1");
                                } else if (this.r.indexOf("v") < 0 || str19.indexOf("url=http") >= 0) {
                                    i5 = 1;
                                    jSONObject3.put("parse", i5);
                                }
                                str6 = "url";
                                jSONObject2 = jSONObject3;
                                str7 = str21;
                                str8 = str22;
                                str9 = "跳转post";
                                S = S(B(str8), str);
                                if (S.length() > 1) {
                                    jSONObject2.put("playUrl", S);
                                }
                                jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                if (B("播放请求头").length() <= 0 || this.r.indexOf("W") >= 0 || this.r.indexOf("A") >= 0 || this.r.indexOf("C") >= 0 || this.r.indexOf("R") >= 0) {
                                    jSONObject2.put("header", z(str19));
                                }
                                if (!this.n.equals("playResult") || this.l) {
                                    this.m = jSONObject2.toString();
                                }
                                spiderApi3 = this.H;
                                if (spiderApi3 != null) {
                                    spiderApi3.log("正在播放--> " + jSONObject2.toString().replaceAll("\\\\", str7));
                                }
                                return jSONObject2.toString();
                            } else {
                                str5 = "url";
                                obj = "1";
                                str4 = "jx";
                            }
                            str6 = str5;
                            Object obj2 = obj;
                            CharSequence S2 = S(B("跳转解析"), str);
                            String str28 = str4;
                            str9 = "跳转post";
                            String S3 = S(B(str9), str);
                            if (this.r.indexOf("e") >= 0) {
                                try {
                                    if (this.r.matches(".*e\\d.*")) {
                                        str11 = "parse";
                                        try {
                                            i = Integer.parseInt(this.r.replaceAll(".*e(\\d)).*", "$1"));
                                        } catch (Exception e7) {
                                            e = e7;
                                            String str29 = str11;
                                            str7 = str21;
                                            str8 = str22;
                                            str10 = str29;
                                            JSONObject jSONObject5 = jSONObject3;
                                            String str30 = str10;
                                            jSONObject5.put(str30, 1);
                                            if (this.l) {
                                            }
                                            spiderApi = this.H;
                                            jSONObject2 = jSONObject5;
                                            if (spiderApi != null) {
                                            }
                                            S = S(B(str8), str);
                                            if (S.length() > 1) {
                                            }
                                            jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                            if (B("播放请求头").length() <= 0) {
                                            }
                                            jSONObject2.put("header", z(str19));
                                            if (!this.n.equals("playResult")) {
                                            }
                                            this.m = jSONObject2.toString();
                                            spiderApi3 = this.H;
                                            if (spiderApi3 != null) {
                                            }
                                            return jSONObject2.toString();
                                        }
                                    } else {
                                        str11 = "parse";
                                        i = 1;
                                    }
                                    i2 = 0;
                                    String str31 = str19;
                                    while (true) {
                                        if (i <= 0) {
                                            str12 = str23;
                                            str13 = str25;
                                            str7 = str21;
                                            str8 = str22;
                                            str14 = str24;
                                            str15 = str31;
                                            break;
                                        }
                                        str13 = str25;
                                        str8 = str22;
                                        try {
                                            str31 = str31.replace(str8, S2).replace(str9, S3);
                                            str14 = str24;
                                            str12 = str23;
                                            str7 = str21;
                                        } catch (Exception e8) {
                                            e = e8;
                                            str7 = str21;
                                            str10 = str11;
                                            JSONObject jSONObject52 = jSONObject3;
                                            String str302 = str10;
                                            jSONObject52.put(str302, 1);
                                            if (this.l) {
                                            }
                                            spiderApi = this.H;
                                            jSONObject2 = jSONObject52;
                                            if (spiderApi != null) {
                                            }
                                            S = S(B(str8), str);
                                            if (S.length() > 1) {
                                            }
                                            jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                            if (B("播放请求头").length() <= 0) {
                                            }
                                            jSONObject2.put("header", z(str19));
                                            if (!this.n.equals("playResult")) {
                                            }
                                            this.m = jSONObject2.toString();
                                            spiderApi3 = this.H;
                                            if (spiderApi3 != null) {
                                            }
                                            return jSONObject2.toString();
                                        }
                                        try {
                                            String O = O(str31, "\"url\"*\"&&\",", str7);
                                            if (str31.equals(O)) {
                                                str15 = str31;
                                                break;
                                            }
                                            i2++;
                                            if (!O.startsWith("http")) {
                                                str15 = str31;
                                                break;
                                            }
                                            i--;
                                            str21 = str7;
                                            str24 = str14;
                                            str23 = str12;
                                            str22 = str8;
                                            str25 = str13;
                                        } catch (Exception e9) {
                                            e = e9;
                                            str10 = str11;
                                            JSONObject jSONObject522 = jSONObject3;
                                            String str3022 = str10;
                                            jSONObject522.put(str3022, 1);
                                            if (this.l) {
                                            }
                                            spiderApi = this.H;
                                            jSONObject2 = jSONObject522;
                                            if (spiderApi != null) {
                                            }
                                            S = S(B(str8), str);
                                            if (S.length() > 1) {
                                            }
                                            jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                            if (B("播放请求头").length() <= 0) {
                                            }
                                            jSONObject2.put("header", z(str19));
                                            if (!this.n.equals("playResult")) {
                                            }
                                            this.m = jSONObject2.toString();
                                            spiderApi3 = this.H;
                                            if (spiderApi3 != null) {
                                            }
                                            return jSONObject2.toString();
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    str11 = "parse";
                                    str7 = str21;
                                    str8 = str22;
                                }
                            } else {
                                str11 = "parse";
                                str12 = "v";
                                str13 = "url=http";
                                str7 = str21;
                                str8 = str22;
                                str14 = "j0";
                                i = 1;
                                i2 = 0;
                                str15 = str19;
                            }
                            int i8 = 5;
                            int i9 = i;
                            ?? r4 = {str7, "二次", "三次", "四次", "五次"};
                            if (B4.length() <= 0) {
                                i8 = B3.length() > 0 ? 4 : B2.length() > 0 ? 3 : B.length() > 0 ? 2 : D.length() > 0 ? 1 : i9;
                            }
                            int i10 = i8;
                            String str32 = str15;
                            while (i10 > 0) {
                                str32 = str32.replace(str8, S2).replace(str9, S3);
                                ?? sb3 = new StringBuilder();
                                sb3.append(r4[i8 - i10]);
                                String str33 = str20;
                                sb3.append(str33);
                                int i11 = i8;
                                String replace2 = C(sb3.toString(), "\"url\"*\"&&\",").replace(str8, S2).replace(str9, S3);
                                String O2 = O(str32, replace2, C(r4[i4] + "跳转播放链接数组", str7));
                                if (!str32.equals(O2) && !str32.endsWith("url=")) {
                                    int indexOf = replace2.indexOf("url=+");
                                    str32 = m.b(str19, O2);
                                    if (indexOf > 0) {
                                        int indexOf2 = O2.indexOf("url=&");
                                        str32 = m.b(str19, O2);
                                        str32 = str32;
                                        if (indexOf2 > 0) {
                                            break;
                                        }
                                    }
                                    if (!O2.startsWith("http")) {
                                        break;
                                    }
                                    i2++;
                                    i10--;
                                    i8 = i11;
                                    str20 = str33;
                                    str32 = str32;
                                }
                            }
                            if (i2 != 0 && str32.length() >= 10) {
                                if (this.l) {
                                    Init.show(this.F + "调试->播放链接成功跳转" + i2 + "次");
                                }
                                str19 = str32.replace(str8, str7).replace(str9, str7);
                                if (!isVideoFormat(str19) && this.r.indexOf(str12) < 0) {
                                    if (m.d(str19) && this.r.indexOf(str14) < 0) {
                                        if (str19.indexOf(str13) < 0) {
                                            JSONObject jSONObject6 = jSONObject3;
                                            jSONObject6.put(str11, 1);
                                            jSONObject6.put(str28, obj2);
                                            jSONObject2 = jSONObject6;
                                            S = S(B(str8), str);
                                            if (S.length() > 1) {
                                            }
                                            jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                            if (B("播放请求头").length() <= 0) {
                                            }
                                            jSONObject2.put("header", z(str19));
                                            if (!this.n.equals("playResult")) {
                                            }
                                            this.m = jSONObject2.toString();
                                            spiderApi3 = this.H;
                                            if (spiderApi3 != null) {
                                            }
                                            return jSONObject2.toString();
                                        }
                                    }
                                    str16 = str11;
                                    jSONObject = jSONObject3;
                                    i3 = 1;
                                    jSONObject.put(str16, i3);
                                    jSONObject2 = jSONObject;
                                    S = S(B(str8), str);
                                    if (S.length() > 1) {
                                    }
                                    jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                    if (B("播放请求头").length() <= 0) {
                                    }
                                    jSONObject2.put("header", z(str19));
                                    if (!this.n.equals("playResult")) {
                                    }
                                    this.m = jSONObject2.toString();
                                    spiderApi3 = this.H;
                                    if (spiderApi3 != null) {
                                    }
                                    return jSONObject2.toString();
                                }
                                str16 = str11;
                                jSONObject = jSONObject3;
                                if (str19.indexOf(str13) < 0) {
                                    i3 = 0;
                                    jSONObject.put(str16, i3);
                                    jSONObject2 = jSONObject;
                                    S = S(B(str8), str);
                                    if (S.length() > 1) {
                                    }
                                    jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                    if (B("播放请求头").length() <= 0) {
                                    }
                                    jSONObject2.put("header", z(str19));
                                    if (!this.n.equals("playResult")) {
                                    }
                                    this.m = jSONObject2.toString();
                                    spiderApi3 = this.H;
                                    if (spiderApi3 != null) {
                                    }
                                    return jSONObject2.toString();
                                }
                                i3 = 1;
                                jSONObject.put(str16, i3);
                                jSONObject2 = jSONObject;
                                S = S(B(str8), str);
                                if (S.length() > 1) {
                                }
                                jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                                if (B("播放请求头").length() <= 0) {
                                }
                                jSONObject2.put("header", z(str19));
                                if (!this.n.equals("playResult")) {
                                }
                                this.m = jSONObject2.toString();
                                spiderApi3 = this.H;
                                if (spiderApi3 != null) {
                                }
                                return jSONObject2.toString();
                            }
                            JSONObject jSONObject7 = jSONObject3;
                            jSONObject7.put(str11, 1);
                            jSONObject2 = jSONObject7;
                            if (this.l) {
                                Init.show(this.F + "调试->播放链接跳转未成功");
                                jSONObject2 = jSONObject7;
                            }
                            S = S(B(str8), str);
                            if (S.length() > 1) {
                            }
                            jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                            if (B("播放请求头").length() <= 0) {
                            }
                            jSONObject2.put("header", z(str19));
                            if (!this.n.equals("playResult")) {
                            }
                            this.m = jSONObject2.toString();
                            spiderApi3 = this.H;
                            if (spiderApi3 != null) {
                            }
                            return jSONObject2.toString();
                        }
                        i5 = 0;
                        jSONObject3.put("parse", i5);
                        str6 = "url";
                        jSONObject2 = jSONObject3;
                        str7 = str21;
                        str8 = str22;
                        str9 = "跳转post";
                        S = S(B(str8), str);
                        if (S.length() > 1) {
                        }
                        jSONObject2.put(str6, str19.replace(str8, str7).replace(str9, str7));
                        if (B("播放请求头").length() <= 0) {
                        }
                        jSONObject2.put("header", z(str19));
                        if (!this.n.equals("playResult")) {
                        }
                        this.m = jSONObject2.toString();
                        spiderApi3 = this.H;
                        if (spiderApi3 != null) {
                        }
                        return jSONObject2.toString();
                    } catch (Exception e11) {
                        e = e11;
                        str3 = str21;
                        if (this.l) {
                            Init.show(this.F + "调试->playerContent出错：" + e.toString());
                        }
                        SpiderApi spiderApi7 = this.H;
                        if (spiderApi7 != null) {
                            b.a(e, d.b("playerContent()错误！-->"), spiderApi7);
                        }
                        return str3;
                    }
                }
                PushAgent pushAgent = this.C;
                if (B("指定代理").length() > 0) {
                    str17 = str17 + "sourcekey" + B("指定代理");
                }
                return pushAgent.playerContent(str, str17, list);
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e = e13;
            str3 = "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final HashMap<String, String> r(String str) {
        HashMap<String, String> hashMap;
        String sb;
        String replaceAll;
        SpiderApi spiderApi;
        String[] split;
        HashMap<String, String> hashMap2 = this.E;
        if (hashMap2 == null || hashMap2.isEmpty() || this.r.indexOf("r1") >= 0 || this.r.indexOf("c") >= 0) {
            this.E = new HashMap<>();
            String trim = G("请求头", "请求头参数", "ua", "Headers", "UserAgent", "").trim();
            if (trim.length() > 1 && trim.indexOf("@") > 0) {
                trim = trim.replace("@", "$").replace("&&", "#").replace("；；", ";");
            }
            String J2 = J(trim);
            this.E.put("User-Agent", J2);
            String n = n(str);
            if (this.r.indexOf("c0") < 0 && n.length() > 1) {
                this.E.put("Cookie", n);
            }
            if (trim.indexOf("Referer") >= 0 || this.r.indexOf("r1") < 0) {
                if (trim.indexOf("Referer") < 0 && this.r.indexOf("r") >= 0) {
                    hashMap = this.E;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((str + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                    sb2.append("/");
                    sb = sb2.toString();
                }
                replaceAll = trim.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
                if (replaceAll.indexOf("$") >= 0) {
                    for (String str2 : replaceAll.split("#")) {
                        if ((!"User-Agent".equals(str2.split("\\$")[0]) || J2.length() <= 0) && !"Cookie".equals(str2.split("\\$")[0]) && !"cookie".equals(str2.split("\\$")[0])) {
                            this.E.put(str2.split("\\$")[0], str2.split("\\$")[1].equals("空") ? "" : str2.split("\\$")[1]);
                        }
                    }
                }
                spiderApi = this.H;
                if (spiderApi != null) {
                    StringBuilder b = d.b("请求头--> ");
                    b.append(this.E.toString());
                    spiderApi.log(b.toString());
                }
                return this.E;
            }
            hashMap = this.E;
            sb = str.split(";")[0];
            hashMap.put("Referer", sb);
            replaceAll = trim.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
            if (replaceAll.indexOf("$") >= 0) {
            }
            spiderApi = this.H;
            if (spiderApi != null) {
            }
            return this.E;
        }
        return this.E;
    }

    public String searchContent(String str, boolean z) {
        String[] split;
        try {
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                spiderApi.log("searchContent(key=" + str + ", quick=" + z + ")");
            }
            this.q = "搜索";
            JSONObject W = W("", str, z);
            String replace = E("特殊分类", "特殊分类url", "特殊分类链接", "").replace(this.f, "");
            if (W == null || W.getJSONArray("list") == null || W.getJSONArray("list").length() <= 0 || replace.indexOf("#http") >= 0) {
                JSONArray jSONArray = W != null ? W.getJSONArray("list") : new JSONArray();
                for (String str2 : replace.split("#h")) {
                    if (str2.startsWith("ttp")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("h");
                        sb.append((str2 + "#").replaceAll(".*(ttp.*?)#.*", "$1"));
                        JSONObject W2 = W(sb.toString(), str, z);
                        JSONArray jSONArray2 = W2 != null ? W2.getJSONArray("list") : new JSONArray();
                        if (jSONArray2.length() > 0) {
                            for (int i = 0; i < jSONArray2.length(); i++) {
                                jSONArray.put(jSONArray2.get(i));
                            }
                        }
                    }
                }
                if (this.r.indexOf("k0") >= 0) {
                    this.r = this.r.replace("k0", "");
                }
                if (jSONArray.length() > 0) {
                    return new JSONObject().put("list", jSONArray).toString();
                }
                JSONObject W3 = W(this.f + "/;;搜首页", str, z);
                if (W3 == null || W3.getJSONArray("list") == null || W3.getJSONArray("list").length() <= 0) {
                    String[] split2 = this.c.split("#");
                    int length = split2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str3 = split2[i2];
                        JSONObject W4 = W(f(str3.split("\\$")[1], "1", false, null) + ";;搜首页", str, z);
                        JSONArray jSONArray3 = W4 != null ? W4.getJSONArray("list") : new JSONArray();
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
                return W3.toString();
            }
            return W.toString();
        } catch (Exception e) {
            if (this.l) {
                Init.show(this.F + "调试->searchContent出错：" + e.toString());
            }
            SpiderApi spiderApi2 = this.H;
            if (spiderApi2 != null) {
                b.a(e, d.b("searchContent()错误-->"), spiderApi2);
            }
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01d0 A[EDGE_INSN: B:122:0x01d0->B:54:0x01d0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0299 A[EDGE_INSN: B:123:0x0299->B:78:0x0299 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d A[Catch: Exception -> 0x0325, TryCatch #4 {Exception -> 0x0325, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x002a, B:9:0x0040, B:11:0x0055, B:12:0x0059, B:49:0x0157, B:50:0x01a5, B:53:0x01b0, B:54:0x01d0, B:55:0x01fe, B:57:0x0207, B:58:0x0217, B:60:0x0220, B:62:0x0224, B:64:0x022d, B:66:0x0253, B:71:0x0274, B:69:0x025d, B:72:0x0279, B:74:0x0281, B:76:0x0287, B:77:0x028a, B:78:0x0299, B:80:0x02a1, B:82:0x02ad, B:83:0x02b0, B:84:0x02b3, B:86:0x02c1, B:88:0x02c8, B:95:0x0301, B:89:0x02cd, B:92:0x02d3, B:93:0x02e0, B:94:0x02e5, B:96:0x0304, B:42:0x0119, B:44:0x011d, B:45:0x013a, B:47:0x013e, B:8:0x003e), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e A[Catch: Exception -> 0x0325, TryCatch #4 {Exception -> 0x0325, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x002a, B:9:0x0040, B:11:0x0055, B:12:0x0059, B:49:0x0157, B:50:0x01a5, B:53:0x01b0, B:54:0x01d0, B:55:0x01fe, B:57:0x0207, B:58:0x0217, B:60:0x0220, B:62:0x0224, B:64:0x022d, B:66:0x0253, B:71:0x0274, B:69:0x025d, B:72:0x0279, B:74:0x0281, B:76:0x0287, B:77:0x028a, B:78:0x0299, B:80:0x02a1, B:82:0x02ad, B:83:0x02b0, B:84:0x02b3, B:86:0x02c1, B:88:0x02c8, B:95:0x0301, B:89:0x02cd, B:92:0x02d3, B:93:0x02e0, B:94:0x02e5, B:96:0x0304, B:42:0x0119, B:44:0x011d, B:45:0x013a, B:47:0x013e, B:8:0x003e), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b0 A[Catch: Exception -> 0x0325, LOOP:0: B:50:0x01a5->B:53:0x01b0, LOOP_END, TRY_ENTER, TryCatch #4 {Exception -> 0x0325, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x002a, B:9:0x0040, B:11:0x0055, B:12:0x0059, B:49:0x0157, B:50:0x01a5, B:53:0x01b0, B:54:0x01d0, B:55:0x01fe, B:57:0x0207, B:58:0x0217, B:60:0x0220, B:62:0x0224, B:64:0x022d, B:66:0x0253, B:71:0x0274, B:69:0x025d, B:72:0x0279, B:74:0x0281, B:76:0x0287, B:77:0x028a, B:78:0x0299, B:80:0x02a1, B:82:0x02ad, B:83:0x02b0, B:84:0x02b3, B:86:0x02c1, B:88:0x02c8, B:95:0x0301, B:89:0x02cd, B:92:0x02d3, B:93:0x02e0, B:94:0x02e5, B:96:0x0304, B:42:0x0119, B:44:0x011d, B:45:0x013a, B:47:0x013e, B:8:0x003e), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0207 A[Catch: Exception -> 0x0325, TryCatch #4 {Exception -> 0x0325, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x002a, B:9:0x0040, B:11:0x0055, B:12:0x0059, B:49:0x0157, B:50:0x01a5, B:53:0x01b0, B:54:0x01d0, B:55:0x01fe, B:57:0x0207, B:58:0x0217, B:60:0x0220, B:62:0x0224, B:64:0x022d, B:66:0x0253, B:71:0x0274, B:69:0x025d, B:72:0x0279, B:74:0x0281, B:76:0x0287, B:77:0x028a, B:78:0x0299, B:80:0x02a1, B:82:0x02ad, B:83:0x02b0, B:84:0x02b3, B:86:0x02c1, B:88:0x02c8, B:95:0x0301, B:89:0x02cd, B:92:0x02d3, B:93:0x02e0, B:94:0x02e5, B:96:0x0304, B:42:0x0119, B:44:0x011d, B:45:0x013a, B:47:0x013e, B:8:0x003e), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a1 A[Catch: Exception -> 0x0325, TryCatch #4 {Exception -> 0x0325, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x002a, B:9:0x0040, B:11:0x0055, B:12:0x0059, B:49:0x0157, B:50:0x01a5, B:53:0x01b0, B:54:0x01d0, B:55:0x01fe, B:57:0x0207, B:58:0x0217, B:60:0x0220, B:62:0x0224, B:64:0x022d, B:66:0x0253, B:71:0x0274, B:69:0x025d, B:72:0x0279, B:74:0x0281, B:76:0x0287, B:77:0x028a, B:78:0x0299, B:80:0x02a1, B:82:0x02ad, B:83:0x02b0, B:84:0x02b3, B:86:0x02c1, B:88:0x02c8, B:95:0x0301, B:89:0x02cd, B:92:0x02d3, B:93:0x02e0, B:94:0x02e5, B:96:0x0304, B:42:0x0119, B:44:0x011d, B:45:0x013a, B:47:0x013e, B:8:0x003e), top: B:114:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c1 A[Catch: Exception -> 0x0325, TryCatch #4 {Exception -> 0x0325, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x002a, B:9:0x0040, B:11:0x0055, B:12:0x0059, B:49:0x0157, B:50:0x01a5, B:53:0x01b0, B:54:0x01d0, B:55:0x01fe, B:57:0x0207, B:58:0x0217, B:60:0x0220, B:62:0x0224, B:64:0x022d, B:66:0x0253, B:71:0x0274, B:69:0x025d, B:72:0x0279, B:74:0x0281, B:76:0x0287, B:77:0x028a, B:78:0x0299, B:80:0x02a1, B:82:0x02ad, B:83:0x02b0, B:84:0x02b3, B:86:0x02c1, B:88:0x02c8, B:95:0x0301, B:89:0x02cd, B:92:0x02d3, B:93:0x02e0, B:94:0x02e5, B:96:0x0304, B:42:0x0119, B:44:0x011d, B:45:0x013a, B:47:0x013e, B:8:0x003e), top: B:114:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String xpDetailContent(List<String> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        SpiderApi spiderApi;
        String str7;
        ArrayList arrayList;
        List a;
        int i;
        LinkedList linkedList;
        ArrayList arrayList2;
        List a2;
        int i2;
        LinkedList linkedList2;
        int size;
        SpiderApi spiderApi2;
        StringBuilder sb;
        String sb2;
        List list2;
        com.github.catvod.spider.merge.f0.b bVar;
        try {
            String[] split = list.get(0).split("\\$\\$\\$");
            String str8 = (!split[2].startsWith("/") || split[2].startsWith("//")) ? split[2] : this.f + split[2];
            a g0 = g0(str8);
            String D = D("播放二次截取", "dtNode", "");
            String str9 = split[1];
            String str10 = split[0];
            if (this.g) {
                str9 = fixCover(str9, str8);
            }
            String D2 = D("简介", "dtDesc", "");
            String D3 = D("影片类型", "dtCate", "");
            String D4 = D("影片地区", "dtArea", "");
            String D5 = D("影片年代", "dtYear", "");
            String D6 = D("影片状态", "dtMark", "");
            String D7 = D("导演", "dtDirector", "");
            String E = E("主演", "演员", "dtActor", "");
            try {
                LinkedList linkedList3 = (LinkedList) g0.a(D);
                bVar = linkedList3.size() > 0 ? (com.github.catvod.spider.merge.f0.b) linkedList3.get(0) : null;
                str = bVar.c(D3).a().trim();
                try {
                    str2 = bVar.c(D5).a().trim();
                } catch (Exception e) {
                    e = e;
                    str2 = "";
                    str3 = "";
                    str4 = str3;
                    str5 = str4;
                    str6 = str5;
                    if (this.l) {
                        Init.show(this.F + "调试->xpDetailContent获取列表错：" + e.toString());
                    }
                    spiderApi = this.H;
                    if (spiderApi != null) {
                        spiderApi.log("xpDetailContent获取列表错误！-->" + e.toString());
                    }
                    str7 = "";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("vod_id", list.get(0));
                    jSONObject.put("vod_name", str10);
                    jSONObject.put("vod_pic", str9);
                    jSONObject.put("type_name", str);
                    jSONObject.put("vod_year", str2);
                    jSONObject.put("vod_area", str4);
                    jSONObject.put("vod_remarks", str5);
                    jSONObject.put("vod_actor", str3);
                    jSONObject.put("vod_director", str6);
                    jSONObject.put("vod_content", str7);
                    arrayList = new ArrayList();
                    a = g0.a(D("线路数组", "dtFromNode", ""));
                    i = 0;
                    while (true) {
                        linkedList = (LinkedList) a;
                        if (i >= linkedList.size()) {
                        }
                        arrayList.add(((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c(D("线路标题", "dtFromName", "/text()")).a().trim());
                        i++;
                    }
                    arrayList2 = new ArrayList();
                    String D8 = D("播放数组", "dtUrlNode", "");
                    String D9 = D("播放列表", "dtUrlSubNode", "//a");
                    String D10 = D("播放标题", "dtUrlName", "/text()");
                    String D11 = D("播放链接", "dtUrlId", "/@href");
                    a2 = g0.a(D8);
                    i2 = 0;
                    while (true) {
                        linkedList2 = (LinkedList) a2;
                        if (i2 >= linkedList2.size()) {
                        }
                        arrayList2.add(TextUtils.join("#", r11));
                        i2++;
                        a2 = r19;
                    }
                    while (size >= 0) {
                    }
                    String join = TextUtils.join("$$$", arrayList);
                    String join2 = TextUtils.join("$$$", arrayList2);
                    if (this.H != null) {
                    }
                    jSONObject.put("vod_play_from", join);
                    jSONObject.put("vod_play_url", join2);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    jSONObject2.put("list", jSONArray);
                    return jSONObject2.toString();
                }
                try {
                    str4 = bVar.c(D4).a().trim();
                } catch (Exception e2) {
                    e = e2;
                    str3 = "";
                    str4 = str3;
                    str5 = str4;
                    str6 = str5;
                    if (this.l) {
                    }
                    spiderApi = this.H;
                    if (spiderApi != null) {
                    }
                    str7 = "";
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", list.get(0));
                    jSONObject3.put("vod_name", str10);
                    jSONObject3.put("vod_pic", str9);
                    jSONObject3.put("type_name", str);
                    jSONObject3.put("vod_year", str2);
                    jSONObject3.put("vod_area", str4);
                    jSONObject3.put("vod_remarks", str5);
                    jSONObject3.put("vod_actor", str3);
                    jSONObject3.put("vod_director", str6);
                    jSONObject3.put("vod_content", str7);
                    arrayList = new ArrayList();
                    a = g0.a(D("线路数组", "dtFromNode", ""));
                    i = 0;
                    while (true) {
                        linkedList = (LinkedList) a;
                        if (i >= linkedList.size()) {
                        }
                        arrayList.add(((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c(D("线路标题", "dtFromName", "/text()")).a().trim());
                        i++;
                    }
                    arrayList2 = new ArrayList();
                    String D82 = D("播放数组", "dtUrlNode", "");
                    String D92 = D("播放列表", "dtUrlSubNode", "//a");
                    String D102 = D("播放标题", "dtUrlName", "/text()");
                    String D112 = D("播放链接", "dtUrlId", "/@href");
                    a2 = g0.a(D82);
                    i2 = 0;
                    while (true) {
                        linkedList2 = (LinkedList) a2;
                        if (i2 >= linkedList2.size()) {
                        }
                        arrayList2.add(TextUtils.join("#", r11));
                        i2++;
                        a2 = r19;
                    }
                    while (size >= 0) {
                    }
                    String join3 = TextUtils.join("$$$", arrayList);
                    String join22 = TextUtils.join("$$$", arrayList2);
                    if (this.H != null) {
                    }
                    jSONObject3.put("vod_play_from", join3);
                    jSONObject3.put("vod_play_url", join22);
                    JSONObject jSONObject22 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject3);
                    jSONObject22.put("list", jSONArray2);
                    return jSONObject22.toString();
                }
                try {
                    str5 = bVar.c(D6).a().trim();
                    try {
                        str3 = bVar.c(E).a().trim();
                        try {
                            str6 = bVar.c(D7).a().trim();
                        } catch (Exception e3) {
                            e = e3;
                            str6 = "";
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str3 = "";
                        str6 = str3;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str3 = "";
                    str5 = str3;
                    str6 = str5;
                    if (this.l) {
                    }
                    spiderApi = this.H;
                    if (spiderApi != null) {
                    }
                    str7 = "";
                    JSONObject jSONObject32 = new JSONObject();
                    jSONObject32.put("vod_id", list.get(0));
                    jSONObject32.put("vod_name", str10);
                    jSONObject32.put("vod_pic", str9);
                    jSONObject32.put("type_name", str);
                    jSONObject32.put("vod_year", str2);
                    jSONObject32.put("vod_area", str4);
                    jSONObject32.put("vod_remarks", str5);
                    jSONObject32.put("vod_actor", str3);
                    jSONObject32.put("vod_director", str6);
                    jSONObject32.put("vod_content", str7);
                    arrayList = new ArrayList();
                    a = g0.a(D("线路数组", "dtFromNode", ""));
                    i = 0;
                    while (true) {
                        linkedList = (LinkedList) a;
                        if (i >= linkedList.size()) {
                        }
                        arrayList.add(((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c(D("线路标题", "dtFromName", "/text()")).a().trim());
                        i++;
                    }
                    arrayList2 = new ArrayList();
                    String D822 = D("播放数组", "dtUrlNode", "");
                    String D922 = D("播放列表", "dtUrlSubNode", "//a");
                    String D1022 = D("播放标题", "dtUrlName", "/text()");
                    String D1122 = D("播放链接", "dtUrlId", "/@href");
                    a2 = g0.a(D822);
                    i2 = 0;
                    while (true) {
                        linkedList2 = (LinkedList) a2;
                        if (i2 >= linkedList2.size()) {
                        }
                        arrayList2.add(TextUtils.join("#", r11));
                        i2++;
                        a2 = r19;
                    }
                    while (size >= 0) {
                    }
                    String join32 = TextUtils.join("$$$", arrayList);
                    String join222 = TextUtils.join("$$$", arrayList2);
                    if (this.H != null) {
                    }
                    jSONObject32.put("vod_play_from", join32);
                    jSONObject32.put("vod_play_url", join222);
                    JSONObject jSONObject222 = new JSONObject();
                    JSONArray jSONArray22 = new JSONArray();
                    jSONArray22.put(jSONObject32);
                    jSONObject222.put("list", jSONArray22);
                    return jSONObject222.toString();
                }
            } catch (Exception e6) {
                e = e6;
                str = "";
            }
            try {
                str7 = bVar.c(D2).a().trim();
            } catch (Exception e7) {
                e = e7;
                if (this.l) {
                }
                spiderApi = this.H;
                if (spiderApi != null) {
                }
                str7 = "";
                JSONObject jSONObject322 = new JSONObject();
                jSONObject322.put("vod_id", list.get(0));
                jSONObject322.put("vod_name", str10);
                jSONObject322.put("vod_pic", str9);
                jSONObject322.put("type_name", str);
                jSONObject322.put("vod_year", str2);
                jSONObject322.put("vod_area", str4);
                jSONObject322.put("vod_remarks", str5);
                jSONObject322.put("vod_actor", str3);
                jSONObject322.put("vod_director", str6);
                jSONObject322.put("vod_content", str7);
                arrayList = new ArrayList();
                a = g0.a(D("线路数组", "dtFromNode", ""));
                i = 0;
                while (true) {
                    linkedList = (LinkedList) a;
                    if (i >= linkedList.size()) {
                    }
                    arrayList.add(((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c(D("线路标题", "dtFromName", "/text()")).a().trim());
                    i++;
                }
                arrayList2 = new ArrayList();
                String D8222 = D("播放数组", "dtUrlNode", "");
                String D9222 = D("播放列表", "dtUrlSubNode", "//a");
                String D10222 = D("播放标题", "dtUrlName", "/text()");
                String D11222 = D("播放链接", "dtUrlId", "/@href");
                a2 = g0.a(D8222);
                i2 = 0;
                while (true) {
                    linkedList2 = (LinkedList) a2;
                    if (i2 >= linkedList2.size()) {
                    }
                    arrayList2.add(TextUtils.join("#", r11));
                    i2++;
                    a2 = r19;
                }
                while (size >= 0) {
                }
                String join322 = TextUtils.join("$$$", arrayList);
                String join2222 = TextUtils.join("$$$", arrayList2);
                if (this.H != null) {
                }
                jSONObject322.put("vod_play_from", join322);
                jSONObject322.put("vod_play_url", join2222);
                JSONObject jSONObject2222 = new JSONObject();
                JSONArray jSONArray222 = new JSONArray();
                jSONArray222.put(jSONObject322);
                jSONObject2222.put("list", jSONArray222);
                return jSONObject2222.toString();
            }
            JSONObject jSONObject3222 = new JSONObject();
            jSONObject3222.put("vod_id", list.get(0));
            jSONObject3222.put("vod_name", str10);
            jSONObject3222.put("vod_pic", str9);
            jSONObject3222.put("type_name", str);
            jSONObject3222.put("vod_year", str2);
            jSONObject3222.put("vod_area", str4);
            jSONObject3222.put("vod_remarks", str5);
            jSONObject3222.put("vod_actor", str3);
            jSONObject3222.put("vod_director", str6);
            jSONObject3222.put("vod_content", str7);
            arrayList = new ArrayList();
            a = g0.a(D("线路数组", "dtFromNode", ""));
            i = 0;
            while (true) {
                linkedList = (LinkedList) a;
                if (i >= linkedList.size()) {
                    break;
                }
                arrayList.add(((com.github.catvod.spider.merge.f0.b) linkedList.get(i)).c(D("线路标题", "dtFromName", "/text()")).a().trim());
                i++;
            }
            arrayList2 = new ArrayList();
            String D82222 = D("播放数组", "dtUrlNode", "");
            String D92222 = D("播放列表", "dtUrlSubNode", "//a");
            String D102222 = D("播放标题", "dtUrlName", "/text()");
            String D112222 = D("播放链接", "dtUrlId", "/@href");
            a2 = g0.a(D82222);
            i2 = 0;
            while (true) {
                linkedList2 = (LinkedList) a2;
                if (i2 >= linkedList2.size()) {
                    break;
                }
                List b = ((com.github.catvod.spider.merge.f0.b) linkedList2.get(i2)).b(D92222);
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                while (true) {
                    LinkedList linkedList4 = (LinkedList) b;
                    if (i3 >= linkedList4.size()) {
                        break;
                    }
                    int size2 = this.x ? (linkedList4.size() - 1) - i3 : i3;
                    String trim = ((com.github.catvod.spider.merge.f0.b) linkedList4.get(size2)).c(D102222).a().trim();
                    String trim2 = ((com.github.catvod.spider.merge.f0.b) linkedList4.get(size2)).c(D112222).a().trim();
                    if (trim2 != null) {
                        list2 = a2;
                        if (trim2.length() >= 1) {
                            arrayList3.add(trim + "$" + trim2);
                        }
                    } else {
                        list2 = a2;
                    }
                    i3++;
                    a2 = list2;
                }
                List list3 = a2;
                if (arrayList3.size() == 0 && arrayList.size() > i2) {
                    arrayList.set(i2, "");
                }
                arrayList2.add(TextUtils.join("#", arrayList3));
                i2++;
                a2 = list3;
            }
            for (size = arrayList.size() - 1; size >= 0; size--) {
                if (((String) arrayList.get(size)).isEmpty()) {
                    arrayList.remove(size);
                }
            }
            String join3222 = TextUtils.join("$$$", arrayList);
            String join22222 = TextUtils.join("$$$", arrayList2);
            if (this.H != null) {
                if (arrayList2.size() < 1) {
                    spiderApi2 = this.H;
                    sb2 = "Xpath方式未获取到播放列表！";
                } else {
                    if (this.l) {
                        spiderApi2 = this.H;
                        sb = new StringBuilder();
                        sb.append("Xpath方式获取播放到列表--> ");
                        sb.append(join22222);
                    } else {
                        spiderApi2 = this.H;
                        sb = new StringBuilder();
                        sb.append("Xpath方式获取播放到列表--> ");
                        sb.append(join22222.split("\\$\\$\\$")[0]);
                        sb.append("......");
                    }
                    sb2 = sb.toString();
                }
                spiderApi2.log(sb2);
            }
            jSONObject3222.put("vod_play_from", join3222);
            jSONObject3222.put("vod_play_url", join22222);
            JSONObject jSONObject22222 = new JSONObject();
            JSONArray jSONArray2222 = new JSONArray();
            jSONArray2222.put(jSONObject3222);
            jSONObject22222.put("list", jSONArray2222);
            return jSONObject22222.toString();
        } catch (Exception e8) {
            if (this.l) {
                Init.show(this.F + "调试->xpDetailContent出错：" + e8.toString());
            }
            SpiderApi spiderApi3 = this.H;
            if (spiderApi3 != null) {
                b.a(e8, d.b("xpDetailContent()错误！-->"), spiderApi3);
            }
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9 A[Catch: JSONException -> 0x0139, TryCatch #0 {JSONException -> 0x0139, blocks: (B:3:0x000c, B:6:0x0025, B:8:0x002b, B:9:0x003d, B:11:0x0045, B:14:0x004e, B:17:0x0066, B:19:0x0070, B:20:0x0077, B:22:0x007d, B:30:0x00be, B:31:0x00c1, B:33:0x00d9, B:35:0x00e2, B:37:0x00f0, B:49:0x0131, B:39:0x00f6, B:41:0x0102, B:44:0x0111, B:48:0x012e, B:47:0x0128, B:50:0x0134, B:25:0x0088, B:27:0x008e, B:29:0x0098), top: B:60:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final String z(String str) {
        String replaceAll;
        String[] split;
        try {
            String trim = E("播放请求头", "直接播放直链视频请求头", "play_header", "").trim();
            if (trim.length() > 1 && trim.indexOf("@") > 0) {
                trim = trim.replace("@", "$").replace("&&", "#").replace("；；", ";");
            }
            if (trim.startsWith("{") && trim.endsWith("}")) {
                return trim;
            }
            JSONObject jSONObject = new JSONObject();
            String J2 = J(trim);
            jSONObject.put("User-Agent", J2);
            if (this.r.indexOf("C") >= 0 && n(str).length() > 1) {
                jSONObject.put("Cookie", n(str));
            }
            if (trim.indexOf("Referer") >= 0 || this.r.indexOf("R1") < 0) {
                if (trim.indexOf("Referer") < 0 && this.r.indexOf("R") >= 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((str + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                    sb.append("/");
                    str = sb.toString();
                }
                replaceAll = trim.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
                if (replaceAll.indexOf("$") >= 0) {
                    for (String str2 : replaceAll.split("#")) {
                        if ((!"User-Agent".equals(str2.split("\\$")[0]) || J2.length() <= 0) && !"Cookie".equals(str2.split("\\$")[0]) && !"cookie".equals(str2.split("\\$")[0])) {
                            jSONObject.put(str2.split("\\$")[0], str2.split("\\$")[1].equals("空") ? "" : str2.split("\\$")[1]);
                        }
                    }
                }
                return jSONObject.toString();
            }
            jSONObject.put("Referer", str);
            replaceAll = trim.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
            if (replaceAll.indexOf("$") >= 0) {
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            if (this.l) {
                Init.show(this.F + "调试->getPlayHeaders出错：" + e.toString());
            }
            SpiderApi spiderApi = this.H;
            if (spiderApi != null) {
                StringBuilder b = d.b("getPlayHeaders()错误！-->");
                b.append(e.toString());
                spiderApi.log(b.toString());
            }
            return "";
        }
    }
}
