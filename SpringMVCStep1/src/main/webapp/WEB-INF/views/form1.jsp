 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>form1</h1>
<!--  localhost:8080/SpringMVCStep/result -->
<form:form modelAttribute ="userDataBean" action='result'>
 <form:hitten path="a1"/>
 text : <form:input path="a2"/><br/>
 password :<form:passwrod path="a3" showPassword="true"/><br/>
 textarea : <form:textarea path="a4"/><br/>
 <form:button disabled="true" >확인</form:button>
 
<!-- 
<form id="userDataBean" action="result" method="post" 
 <input id="a1" name="a1" type="hidden" value="data1"/>
 text : <input id="a2" name="a2" type="text" value="data2"/>
 passwrod : <input id="a3" name="a3" type="password" value="data3"/>          showPassword="true"  동그라미로 보여줌 
 textarea : <textarea id="a4" name="a4">
button type="submit" value="Submit" disabled="true" >확인</button>   disabled="true" 버튼 비활성
 </form>
 -->
 
</form:form>
</body>
</html> 