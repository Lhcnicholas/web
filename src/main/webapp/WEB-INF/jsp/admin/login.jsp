<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LiNic
  Date: 2017/10/31
  Time: 上午1:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <form method="post" action="<c:url value="/admin/login"/>">
        <table>
            <tr>
                <td>登录名：</td>
                <td><input type="text" name="username" placeholder="请输入登录名"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="password" placeholder="请输入密码"> </td>
            </tr>
            <tr>
                <td><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
</body>
</html>
