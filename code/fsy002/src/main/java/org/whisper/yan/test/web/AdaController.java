package org.whisper.yan.test.web;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.whisper.yan.test.entity.Ada;
import org.whisper.yan.test.service.AdaService;

/**
 * Created by yjw on 2017/1/12.
 */
@RestController
public class AdaController {

    @Autowired
    AdaService adaService;


    @RequestMapping(value = "/ada",method = RequestMethod.GET)
    public Object regist() {
        System.out.println("查询用户接口开始");
        Ada ada = new Ada();
        ada = adaService.getAda();
        return ada;
    }

}
