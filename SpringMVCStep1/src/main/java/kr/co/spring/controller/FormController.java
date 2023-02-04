package kr.co.spring.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.spring.beans.Form2Bean;
import kr.co.spring.beans.FormBean;
import kr.co.spring.beans.KeyValueBean;

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

	 
	@GetMapping("form2")
	public String form2(Form2Bean bean , Model model) {
		
		bean.setA1("data1");
		bean.setA2("data1");
		bean.setA3("data2");
		bean.setA4("data1");
		
		
		String[] check_list= {"data1","data3"};
		bean.setA5(check_list);
		bean.setA6(check_list);
		bean.setA7(check_list);
		bean.setA8(check_list);
		
		bean.setB1("data1");
		bean.setB2("data1");
		bean.setB3("data2");
		bean.setB4("data1");
		
		String [] data_list1 = {"data1","data2","data3"};
		model.addAttribute("data_list1",data_list1);
		
		ArrayList<String> data_list2 = new ArrayList<String>();
		data_list2.add("data1");
		data_list2.add("data2");
		data_list2.add("data3");
		model.addAttribute("data_list2", data_list2);
		
		KeyValueBean key_bean1 = new KeyValueBean();
		KeyValueBean key_bean2 = new KeyValueBean();
		KeyValueBean key_bean3 = new KeyValueBean();
		
		key_bean1.setKey("항목1");
		key_bean1.setValue("data1");
		
		key_bean2.setKey("항목2");
		key_bean2.setValue("data2");
		
		key_bean3.setKey("항목3");
		key_bean3.setValue("data3");
		
		ArrayList<KeyValueBean> data_list3 = new ArrayList<KeyValueBean>();
		
		data_list3.add(key_bean1);
		data_list3.add(key_bean2);
		data_list3.add(key_bean3);
		
		model.addAttribute("data_list3", data_list3);
		
		return "form2";
	
	}
}
