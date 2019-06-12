package com.luo.service.thirdInfo;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.zhht.cop.vo.CopParkVO;
import com.zhht.park.service.ParkService;

public class ConsumerParkServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
        ParkService testService = (ParkService) context.getBean("parkService");
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("parkName", "");
        List<String> parkIdList = new ArrayList<String>();
		parkIdList.add("0024cdaf_7948_11e5_9fe3_44a8422565ee");
		parkIdList.add("0118d31f_2312_11e6_92fb_44a842256329");
		try {
			List<CopParkVO>  list =  testService.queryParkListByThirdInfo(map);
			System.out.println(JSON.toJSON(list));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
