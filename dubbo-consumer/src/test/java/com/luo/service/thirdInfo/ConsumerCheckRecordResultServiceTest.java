package com.luo.service.thirdInfo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhht.cop.entity.CheckTaskRecord;
import com.zhht.cop.service.CheckTaskRecordService;

public class ConsumerCheckRecordResultServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		CheckTaskRecordService testService = (CheckTaskRecordService) context.getBean("checkTaskRecordService");
		try {
			CheckTaskRecord c = new CheckTaskRecord();
			c.setMsRecordCode("e94c2939-4fb3-4500-b672-d6b4bbb9822");
			c.setDataType(1);
			Boolean f = testService.findRecordExists(c);
			System.out.println(f);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
