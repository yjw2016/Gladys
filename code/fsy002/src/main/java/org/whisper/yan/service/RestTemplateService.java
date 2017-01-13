package org.whisper.yan.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;


/**
 * Created by yjw on 2017/1/13.
 */
@Service
public class RestTemplateService {

    @Value("${demo.url}")
    String url;

    /* RestTemplate 其实是对http的封装，详情看源码*/
    private RestTemplate restTemplate = new RestTemplate();

    public Object restGet() {

        Map map = restTemplate.getForObject(url, Map.class);
        return map;
    }




}
