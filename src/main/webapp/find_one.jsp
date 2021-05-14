<%--
  Created by IntelliJ IDEA.
  User: MacBook
  Date: 2021/5/13
  Time: 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <table border="1">
            <tr>
                <td>编号</td>
                <td>名称</td>
                <td>地点</td>
            </tr>
            <tr>
                <td>${requestScope.dept.deptNo}</td>
                <td>${requestScope.dept.dname}</td>
                <td>${requestScope.dept.loc}</td>
            </tr>
        </table>
    </center>
</body>
</html>
