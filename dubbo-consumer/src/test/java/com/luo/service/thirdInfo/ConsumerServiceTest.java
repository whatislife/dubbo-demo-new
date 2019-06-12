package com.luo.service.thirdInfo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.mysql.fabric.xmlrpc.base.Array;
import com.zhht.cop.entity.CopRole;
import com.zhht.cop.entity.CopUser;
import com.zhht.cop.service.CopThirdService;
import com.zhht.cop.vo.CopThirdInfoRoleChannelVO;
import com.zhht.cop.vo.CopThirdInfoUserVO;
import com.zhht.cop.vo.CopThirdInfoVO;

public class ConsumerServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application.xml" });
		context.start();
		CopThirdService testService = (CopThirdService) context.getBean("copThirdService");
		CopThirdInfoRoleChannelVO copThirdInfoRoleChannelVO = new CopThirdInfoRoleChannelVO();
		copThirdInfoRoleChannelVO.setParkId("0299eba4_ad5d_11e5_a106_822ace0c0095");
		copThirdInfoRoleChannelVO.setType(2);
		try {
			testService.updateThridInfoRoleChannel(copThirdInfoRoleChannelVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//List<String> list = new ArrayList<String>();
		//list.add("898989");
		//list.add("8d509fd6-4f83-11e9-b0a1-c22a1f0f8ab6");
		/*try {
			List<CopThirdInfoUserVO>  list2 = testService.queryUserByThirdInfo(null);
			System.out.println(JSON.toJSON(list2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*CopThirdInfoVO vo = new CopThirdInfoVO(); 
		vo.setThirdInfoId("898989");
		vo.setThridInfoName("¥Û¥∏≤‚ ‘");
		vo.setThridInfoType("1");
		List<String> list = new ArrayList<String>();
		list.add("595f0106-9df7-462e-a7ae-53ce09f2f486");
		list.add("5da04433-31ce-4e04-912b-91b4a1814ed8");
		vo.setResourceIds(list);
		
		CopUser user = new CopUser();
		user.setRealName("¥Û¥∏≤‚ ‘");
		user.setIsClose(1);
		user.setUserName("¥Û¥∏≤‚ ‘");
		user.setEmail("whatis_life@163.com");
		user.setCreatorId("boss");
		user.setMobile("18611508917");
		user.setSex(1);
		user.setThirdInfoCreater(1);
		user.setThirdInfoId("898989");
		user.setThirdInfoName("¥Û¥∏≤‚ ‘");
		user.setRemark("23456");
		user.setPassWord("2345");
		CopRole role = new CopRole(); 
		role.setRoleName("π‹¿Ì‘±");
		role.setThirdInfoCreater(1);
		role.setThirdInfoId("898989");
		role.setThirdInfoName("¥Û¥∏≤‚ ‘");
		role.setIsClock(0);
		role.setRoleCode("");
		
		vo.setRole(role);
		vo.setUser(user);
		try {
			//testService.addUserRoleResourceByThirdInfo(vo);
			
			//CopThirdInfoVO info = testService.queryUserRoleResourceByThirdInfo("8989893");
			//System.out.println(JSON.toJSON(info));
			
			testService.deleteUserRoleResourceByThirdInfo("898989");
			
			CopThirdInfoVO info = testService.queryUserRoleResourceByThirdInfo("898989");
			System.out.println(JSON.toJSON(info));
			
		//	testService.updateThirdInfoName("898989", "¥Û¥∏≤‚ ‘");
		    
		} catch (Exception e) {
			e.printStackTrace();
		}*/

	}

}
