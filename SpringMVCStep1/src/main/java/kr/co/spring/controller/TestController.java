package kr.co.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.spring.beans.DataBean;
import kr.co.spring.beans.DataBean2;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	// 자동형변환 불가함 무조건 String으로 받아야함 
	public String test1(@RequestParam Map<String,String> map , @RequestParam List<String>data3) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		
		System.out.printf("data1 : %s\n", data1);
		System.out.printf("data2 : %s\n", data2);
		System.out.printf("data33 : %s\n", data33);
		
		
		for(String str:data3) {
			System.out.printf("data3 : %s\n", str);
		}
		
		return "result";

	}
	/* data1 :100 
	 * data2 :200
	 * data33 :300   < Map사용시 data3 동일명으로 전달되는 2개이상 파라메터는 하나만 전달된다.
	 * 				 2개이상다 받고싶으면 list 사용해야함)
	 * data3 : 300
	 * data3 : 400
	 */

	//@ModelAttribute 어노테이션을 사용하면 파라미터를 객체로 주입받을 수 있습니다. 
	//전달되는 파라미터 이름과 동일한 프로퍼티에 자동으로 주입된다. 
	//이 어노테이션은 생략이 가능하며 = 커맨드 객체라고불립니다. 
	
	@GetMapping("/test2")
	//public String test2(@ModelAttribute DataBean bean1 , @ModelAttribute DataBean2 bean2) {
	public String test2( DataBean bean1 , DataBean2 bean2) {	//생략가능 
		System.out.printf("data1 : %d\n", bean1.getData1());
		System.out.printf("data2 : %d\n", bean1.getData2());
		
		for(int number1: bean1.getData3()) {
			System.out.printf("data3 : %d\n",number1);
		}
		
		System.out.printf("bean2.data1 : %d\n", bean2.getData1());
		System.out.printf("bean2.data2 : %d\n", bean2.getData2());
		
		return "result";
		
	}
}
