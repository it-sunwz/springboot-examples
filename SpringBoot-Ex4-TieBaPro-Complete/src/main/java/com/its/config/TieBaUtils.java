package com.its.config;

import org.apache.catalina.util.URLEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TieBaUtils {

    public static String dateFormat(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s = sdf.format(date);
        return s;
    }

    /**
     * 正确信息编码
     */
    public static String strEncodeSuccessInfo(String str){
        String info = new URLEncoder().encode("<font style=color:green;font-size:12px;>"+str+"</font>", Charset.defaultCharset());
        return info;
    }

    /**
     * 信息解码
     */
    public static String strDecodeAllInfo(String str) throws UnsupportedEncodingException {
        String info = URLDecoder.decode(str,"UTF-8");
        return info;
    }

    /**
     * 错误信息编码
     */
    public static String strEncodeErrorInfo(String str){
        String info = new URLEncoder().encode("<font style=color:red;font-size:12px;>"+str+"</font>", Charset.defaultCharset());
        return info;
    }

}
