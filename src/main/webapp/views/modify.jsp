<%--
  Created by IntelliJ IDEA.
  User: Unlucky
  Date: 2018/10/27
  Time: 23:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<div style="width: 400px;height: 200px;border: 1px solid black">
    <form id="update" action="update" method="post">
        <input type="text" name="id" readonly value="${person.id}">
        <input type="text" name="created" value="${person.created}">
        <input type="text" name="username" value="${person.username}">
        <input type="text" name="address" value="${person.address}">
        <input type="text" name="phone" value="${person.phone}">
            <select name="remark">
                <option <c:if test="${person.remark eq 1}">selected</c:if> value="1">人事部</option>
                <option <c:if test="${person.remark eq 2}">selected</c:if> value="2">研发部</option>
                <option <c:if test="${person.remark eq 3}">selected</c:if> value="3">销售部</option>
                <option <c:if test="${person.remark eq 4}">selected</c:if> value="4">客服部</option>
            </select>
        <button type="submit" value="提交">提交</button>
    </form>
</div>
</body>
</html>
