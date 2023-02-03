<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <!--  spring mvc에서 제공하는 form 커스텀태그 사용하기  -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>test2</h1>
<form:form modelAttribute="userDataBean" action='result'>
   이름 : <form:input path='user_name'/><br/>
   <!-- 이름 : <input id="user_name" name="user_name" type="text" value="홍길동"/><br/> -->
   아이디 : <form:input path='user_id'/><br/>
   비밀번호 : <form:password path='user_pw' showPassword="true"/><br/>
   우편번호 :<form:input path='user_postcode'/><br/>
   주소1 : <form:input path='user_address1'/><br/>
   주소2 :<form:input path='user_address2'/><br/>
   
</form:form>
</body>
</html>