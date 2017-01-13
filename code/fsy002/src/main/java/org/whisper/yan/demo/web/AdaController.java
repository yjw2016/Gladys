package org.whisper.yan.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.whisper.yan.demo.entity.Ada;
import org.whisper.yan.demo.service.AdaService;

/**
 * Created by yjw on 2017/1/12.
 */
@RestController
public class AdaController {

    @Autowired
    AdaService adaService;


    @RequestMapping(value = "/ada",method = RequestMethod.GET)
    public Object regist() {
        System.out.println("接口开始:demo接口，路径ada，虽然这只是一个测试~");
        Ada ada = new Ada();
        ada = adaService.getAda();
        return ada;
    }

}
