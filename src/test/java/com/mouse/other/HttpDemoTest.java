package com.mouse.other;



import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by wuhao on 2016/8/22.
 */
public class HttpDemoTest {


    @Test
    public void testHttp(){

        String url = "http://112.95.152.50:8080/mbrse/cutPoint.cgi";
        String adjustCode = "10ed33ad3db7522c8bd3aeef87fb7ef8";
        String appId = "sy2016ws08u0815m2";
        String mbrId = "59123565";
        String points = "1";
        String salesTransNO = "TK16081511924";
        String type = "NC";
        String signCode = "111111";
        JSONObject object = new JSONObject();

        object.put("adjustCode",adjustCode);
        object.put("appId",appId);
        JSONObject json = new JSONObject();
        json.put("mbrId",mbrId);
        json.put("points",points);
        json.put("salesTransNO",salesTransNO);
        json.put("type",type);
        json.put("signCode",signCode);
        object.put("headMap",json);

        System.out.println(object);

        try{
                Object result = HttpUtils.sendHttpUrlForPost(url, object.toString(),"UTF-8","UTF-8");
                System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
