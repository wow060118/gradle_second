package com.example.gradle.gradle_second;

import com.baidu.aip.ocr.AipOcr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.HashMap;

/**
 * @author fengrui.yang@11bee.com
 * @date 2018/4/26 22:38
 * Not to force yourself to know how powerful you are
 */
@Service
public class BaiduApi {

        private final static Logger LOGGER = LoggerFactory.getLogger(BaiduApi.class);

        private BaiduApi() {
        }

        public static BaiduApi getInstance() {
            return BaiduApi.getSingleBaiduApi.Instance;
        }

        private static class getSingleBaiduApi {
            private static final BaiduApi Instance = new BaiduApi();
        }

        /**
         * 为每个账户提供的API_KEY SECRET_KEY最多20个
         */
        public static final String APP_ID = "eeeee";
        public static final String API_KEY = "8251e3a27d4246c4833ac3ef818b1dd3";
        public static final String SECRET_KEY = "9a64f43b16b4456881edd3af305bef1f";
    //    static AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        public String getAuthCode(byte[] images) {
//            Long startTime = System.currentTimeMillis();
//    //        String API_KEY = QconfigService.getProperties("OCR_API_KEY", "");
//    //        String SECRET_KEY = QconfigService.getProperties("OCR_SECRET_KEY", "");
//            AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
//            String authCode = "";
//            try {
//                // 可选：设置网络连接参数
//                client.setConnectionTimeoutInMillis(2000);
//                client.setSocketTimeoutInMillis(60000);
//
//                HashMap<String, String> options = new HashMap<String, String>();
//    //            JsonNode res = JacksonUtil.readTree(client.basicGeneral(images, options).toString());
//
//    //            if (res.get("error_msg") == null) {//成功
//    //                JSONArray arr = new JSONArray(res.get("words_result").toString());
//    //                authCode = arr.getJSONObject(0).getString("words");
//    //                LOGGER.info("authCode :{}", authCode);
//    //                return StringUtils.deleteWhitespace(authCode);
//    //            } else {
//    //                LOGGER.info("get authCode error:{}", res.get("error_msg").toString());
//    //                return res.get("error_code").toString();//返回错误代码 17请求次数超过500
//    //            }
//            } catch (Exception e) {
//                LOGGER.error("getAuthCode error:{}", e);
//
//            }finally {
//
//            }
//            return "";
            return "hello";
        }

    public static void main(String[] args) {
        AipOcr client = new AipOcr("63660910530d41749da49324ae53c08c", "8251e3a27d4246c4833ac3ef818b1dd3", "9a64f43b16b4456881edd3af305bef1f");
//        AipOcr client = new AipOcr("", API_KEY, SECRET_KEY);
        String url = "";
        HashMap<String, String> options = new HashMap<String, String>();
        System.out.println(client.basicGeneralUrl(url, options).toString());
    }
}
