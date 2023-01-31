<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <a href= 'test1?data1=100&date2=200&data3=300&data3=400'>test1</a><br/>
 <hr/>
 <form action='test2' method='post'>
   data1: <input type='text' name='data1'/><br/>
   data2: <input type='text' name='data2'/><br/>
   data3: <input type='checkbox' name ='data3' value='100'/>data3 100
 		  <input type='checkbox' name='data3' value='200'/>data3 200<br/>
 		
 		<button type='submit'>test2 post</button>
 </form>
 
 <hr/>
 <!-- 일반적으로 아래주소는 100폴더안에 200폴더안에 300이지만 Restful API 개념에서는 값1/값2/값3 으로 인식한다. 
  <a href= 'test1?data1=100&date2=200&data3=300&data3=400'> 이름을 가지고 추출하는 방법 
  <a href = 'test4?/100/200/300'> 순서를 가지고 추출하는 방법 -->
 <a href = 'test4?/100/200/300'>test4</a><br>
 

 <hr/>
  <a href= 'test5?data1=100&date2=200&data3=300&data3=400'>test5</a><br/>
  
  <hr/>
  <a href= 'test6?data1=100'>test6</a><br/>
</body>
</html>