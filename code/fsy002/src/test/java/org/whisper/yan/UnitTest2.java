package org.whisper.yan;

/**
 * Created by yjw on 2017/1/12.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.whisper.yan.demo.entity.Ada;
import org.whisper.yan.demo.service.AdaService;
import org.whisper.yan.service.RestTemplateService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTest2 {

    @Autowired
    AdaService adaService;

    @Autowired
    RestTemplateService restTemplateService;

    @Test
    public void contextLoads() {
        Ada ada = new Ada();
        ada.setAge(100);
        ada.setName("你又是谁");

        System.out.println("保存用你又是谁");
        adaService.saveAda(ada);

    }

    @Test
    public void test () {

        restTemplateService.restGet();


    }

}
