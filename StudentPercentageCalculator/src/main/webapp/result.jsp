<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css"/>
<title>JNTU Results</title>
</head>
<body>
<p class="re"> &#x2764;<p><h1>JNTU Results</h1><p class="re"> &#x2764;<p>
<h5><marquee scrollamount="7"  width="50%">3<sup>rd</sup>SemResults</marquee></h5>
<table border=1 align="center">
<caption>Student Results</caption>
<tr>
<th>name</th>
<th>Maths</th>
<th>physics</th>
<th>computers</th>
<th>result</th>
<th><span style="color:brown;font-weight:bold;">Grade</span></th>
</tr>
<tr>
<td><%out.println(request.getParameter("tbname")) ;%></td>
<td><%out.println(request.getParameter("tbnumber")) ;%></td>
<td><%out.println(request.getParameter("tbnum1")) ;%></td>
<td><%out.println(request.getParameter("tbnum2")) ;%></td>
<td><%out.println(request.getAttribute("result")) ;%></td>
<td> <% out.println(request.getAttribute("grade")); %> </td>
</tr>
</table>
</body>
</html>