package org.whisper.yan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.whisper.yan.demo.entity.Ada;
import org.whisper.yan.demo.service.AdaService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Fsy002ApplicationTests {

	@Autowired
	AdaService adaService;

	@Test
	public void contextLoads() {
		Ada ada = new Ada();
		ada.setAge(100);
		ada.setName("我是谁");

		System.out.println("保存用户我是谁");
		adaService.saveAda(ada);

	}

}
