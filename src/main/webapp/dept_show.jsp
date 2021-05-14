<%--
  Created by IntelliJ IDEA.
  User: MacBook
  Date: 2021/5/12
  Time: 23:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        td{
            text-align: center;
        }
    </style>
    <script>
        function check(){
            var e = document.getElementsByName('ck');
            for(var a = 0;a < e.length ; a++){
                if(e[a].checked){
                    return true;
                }
            }
            return false;
        }
    </script>
</head>
<body>
    <center>
        <form action="/myWeb/deleteDept" method="post" onsubmit="return check();">
            <table border="1">
                <tr>
                    <td>
                        <%--<input type="checkbox" id="one">全选与全不选--%>
                        <input type="submit" value="批处理删除">
                    </td>

                    <td>部门编号</td>
                    <td>部门名称</td>
                    <td>部门地址</td>
                    <td>详细信息</td>
                </tr>
            <c:forEach items="${requestScope.list}" var="dept">
                <tr>
                    <td><input type="checkbox" name="ck" value="${dept.deptNo}"></td>
                    <td>${dept.deptNo}</td>
                    <td>${dept.dname}</td>
                    <td>${dept.loc}</td>
                    <td><a href="/myWeb/selectOne?deptNo=${dept.deptNo}">详细信息</a> </td>
                </tr>
            </c:forEach>
            </table>

        </form>
    </center>
</body>
</html>
