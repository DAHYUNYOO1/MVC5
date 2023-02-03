package kr.co.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.spring.beans.UserDataBean;

@Controller
public class TestController {
	

	@GetMapping(value="/test1")
	public String test1(UserDataBean bean) {
 
		  bean.setUser_name("홍길동");
		  bean.setUser_id("abcd");
		  bean.setUser_pw("12345");
		  bean.setUser_postcode("12345");
		  bean.setUser_address1("주소1번입니다");
		  bean.setUser_address2("주소2번입니다");
		  //이 bean은 modelAttribute로 주입받았기 때문에 request형에 자동으로 저장이되고 jsp에 전달됩니다. 
		
		
		return "test1";
		
	}
	
	@GetMapping("/test2")
	public String test2(UserDataBean bean) {
		
		  bean.setUser_name("홍길동");
		  bean.setUser_id("abcd");
		  bean.setUser_pw("12345");
		  bean.setUser_postcode("12345");
		  bean.setUser_address1("주소1번입니다");
		  bean.setUser_address2("주소2번입니다");
		  
		
		
		return "test2";
		
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		  UserDataBean bean=new UserDataBean();
		  bean.setUser_name("홍길동");
		  bean.setUser_id("abcd");
		  bean.setUser_pw("12345");
		  bean.setUser_postcode("12345");
		  bean.setUser_address1("주소1번입니다");
		  bean.setUser_address2("주소2번입니다");
		  
		  model.addAttribute("test_user2", bean);
		
		
		return "test3";
		
	}
	
	
	
}
