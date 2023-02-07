<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <a href='test1'>test1 HttpServletRequest 사용 </a><br/>
 <a href='test2'>test2 Model 사용  </a><br/>
 <a href='test3'>test3 ModelAndView 사용  </a><br/>
 <a href='test4'>test4 RequestBean1 객체 사용 (model)  </a><br/>
 <a href='test5'>test5 RequestBean1 객체 사용 (modelAttribute)  </a><br/>
 <a href='request1'>requstScope bean 주입 </a><br/>
 
 
 <a href='session1'>SessionScope  사용 </a><br/>
 <a href='session2'>SessionScope  사용 (redirect)  </a><br/>
 <a href='session3'>SessionScope  사용 (forward) </a><br/>
 <a href='session4'>@SessionAttributes  사용  </a><br/>
 
 <a href = 'save_cookie'>save_cookie</a>
 <a href = 'Load_cookie'>Load_cookie (Servlet)</a>
 <a href = 'Load_cookie2'>Load_cookie (Spring)</a>
 
</body>
</html>