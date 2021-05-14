<%--
  Created by IntelliJ IDEA.
  User: MacBook
  Date: 2021/5/12
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <font style="font-size:30px">部门注册页面</font>
    <form action="/myWeb/add" method="post">
        <table border=2>
            <tr>
                <td>部门编号</td>
                <td><input type="text" name='deptNo'></td>
            </tr>
            <tr>
                <td>部门名称</td>
                <td><input type="text" name='dname'></td>
            </tr>
            <tr>
                <td>部门位置</td>
                <td><input type="text" name='loc'></td>
            </tr>
            <tr>
                <td><input type="submit" value="注册部门"></td>
                <td><input type="reset" value='重置'></td>
            </tr>
        </table>

    </form>
</center>
</body>
</html>
