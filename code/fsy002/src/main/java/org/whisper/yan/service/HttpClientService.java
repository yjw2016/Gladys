package org.whisper.yan.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.whisper.yan.test.entity.Ada;
import org.whisper.yan.test.web.AdaController;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

/**
 * Created by yjw on 2017/1/12.
 */
@Service
public class HttpClientService {

    @Autowired
    AdaController adaController;


    public void sentGetAda(HttpServletRequest req) throws Exception {

        String s = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/ada";


        CloseableHttpClient client = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(s);

        CloseableHttpResponse res = client.execute(httpGet);

        if (res == null) {
            throw new NullPointerException("the response is null,maybe the request is failed !");
        }

        int statusCode = res.getStatusLine().getStatusCode();

        System.out.println(statusCode);

        HttpEntity entity = res.getEntity();

        InputStream content = entity.getContent();

        ObjectMapper om = new ObjectMapper();

//        JsonNode jsonNode2 = om.readValue(content, JsonNode.class);
        Ada ada = om.readValue(content, Ada.class);
//        Object obj = om.readTree(content);

        System.out.println("obj is :"  + "jsonNode2 is :" + /*jsonNode2 + */"ada is :" + ada);

        HttpClientUtils.closeQuietly(res);

    }



}
