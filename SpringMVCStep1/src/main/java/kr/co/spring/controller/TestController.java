package kr.co.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		String data1 =request.getParameter("data1");
		String data2 =request.getParameter("data2");
		String[] data3 =request.getParameterValues("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		for(String str1 : data3) {
			System.out.println("data3 :"+ str1);
		}
		
		/*
		 data1=100
		 data2=200
		 data3=300
		 data4=400
		 */
		
		return "result";
	}

	
	@PostMapping("/test2")
	public String test2 (HttpServletRequest request) {
		
		String data1 =request.getParameter("data1");
		String data2 =request.getParameter("data2");
		String[] data3 =request.getParameterValues("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		//checkbox 체크를 아무것도 안하면null값이 들어오게 되고 null로 반복문 돌리면 오류남 
		
		if(data3 != null) {
		
		for(String str1 : data3) {
			System.out.println("data3 :"+ str1);
		 }
		}
		return "result";		
	}
	
	//WebRequest도 있다. HttpServletRequest 한단계 발전한 것이며 동일하게 사용하면 된다. 
	//PathVariable도 있다. Restful API에서 사용 하는 방법 
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String test4(@PathVariable int data1,  // 자동형변환이 가능하다 .int String double 알아서 지정하면된다.
					   @PathVariable int data2,
					   @PathVariable String data3) {
		
     System.out.println("data1 :"+ data1);
     System.out.println("data1 :"+ data1);
     System.out.println("data1 :"+ data1);
     
     int add= data1+data2;
     System.out.println("add :"+add);
     return "result";
	}
	
	//RequestParam도 있다.  자동형변환 가능 변수의이름이 동일해야한다.(동일하지않다면 value를 사용하면됨) 
	//만약에 넘어오는 값이 숫가자 아니면 정수로 형변환하는 과정에서 오류가발생한다. 그럴땐 무조건String으로 받아야함 
	@GetMapping("/test5")
	public String test5(@RequestParam(value="data1") int value1,
						@RequestParam int data2,
						@RequestParam int[] data3) {

		System.out.println("data1 : "+ value1);
		System.out.println("data2 : "+ data2);
		
		for(int a1 : data3) {
			System.out.println("data3 :"+ a1);
		}
		return "result";
	}
	 
	// data2는 존재하지않는 파라메터임  error : Required String parameter 'data2' is not present. 
	// (required=false) 입력시 넘어오지않을 경우 null값으로 넘어오게 한다. 
	//  (defaultValue ="0") 입력시 넘어오지 않을 경우 디폴트값 설정 가능 
	@GetMapping("/test6")
	public String test6(@RequestParam int data1,
						@RequestParam (required=false) String data2,
						@RequestParam (defaultValue ="0") int data3) {
		System.out.println("data1 :" + data1);
		System.out.println("data2 :" + data2);
		System.out.println("data3 :" + data3);
		return "result";
	}
}
