package org.whisper.yan.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.whisper.yan.service.HttpClientService;
import org.whisper.yan.service.RestTemplateService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yjw on 2017/1/12.
 */
@RestController
public class HttpClientTestController {

    @Autowired
    HttpClientService httpClientService;

    @Autowired
    RestTemplateService restTemplateService;

    /**
     * 通过restTemplate的方式调用外部接口
     */
    public Object restTest() {

        restTemplateService.restGet();
        return null;
    }



    /**
     * 通过httpClient的方式调用其他http接口
     */
    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public Object httpTest(HttpServletRequest req) {
        System.out.println("进入街口");

        try {
            httpClientService.sentGetAda(req);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
    }


    @RequestMapping(value = "why",method = RequestMethod.GET)
    public Object s(){
        return "why?";
    }


}
