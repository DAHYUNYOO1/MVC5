package kr.co.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.spring.beans.FormBean;

@Controller
public class FormController {
	
	@GetMapping("form1")
	public String form1(FormBean bean) {
		
	 bean.setA1("data1");
	 bean.setA2("data2");
	 bean.setA3("data3");
	 bean.setA4("data4");
	 
		return "form1";
		
	}

}
