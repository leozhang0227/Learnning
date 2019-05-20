<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="springmvc/testRest" method="POST">
<input type="submit"> Post</input>
</form>


<br><br>
<form action="springmvc/testRest/1" method="POST">
<input type="hidden" name="_method" value="DELETE"/>
<input type="submit"> Delete</input>
</form>

<br><br>

<form action="springmvc/testRest/1" method="POST">
<input type="hidden" name="_method" value="PUT"/>
<input type="submit"> PUT</input>
</form>

<br><br>
<a href="springmvc/testRest/1">Rest Get</a>

<br><br>





<a href="springmvc/testPathVariable">Test Rest Get</a>

<br><br>





<a href="springmvc/testAntPath/akdfjlask/abc">Hello World</a>
<br><br>
<a href="springmvc/testParamsAndHeaders?username=atguigu&age=11">testParamsAndHeaders</a>
<br><br>
<form action="springmvc/testMethod" method="POST">
<input type="submit"> submit</input>
</form>

<a href="springmvc/helloworld">Hello World</a>
<br><br>

<a href="springmvc/testRequestMapping">test request mapping</a>
<br><br>
<a href="springmvc/testMethod">test Method</a>
</body>
</html>