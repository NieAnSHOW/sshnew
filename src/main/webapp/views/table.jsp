<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>测试</title>
    <script src="js/jquery-3.3.1.js" type="text/javascript"></script>
</head>
<body>
<div style="width: 100%;height: auto;border: 1px solid black">
    <input type="text" id="s_pid" name="id" value="0">
    <select id="s_sid" name="remark">
        <option value="1">人事部</option>
        <option value="2">研发部</option>
        <option value="3">销售部</option>
        <option value="4">客服部</option>
    </select>
    用户名：<input type="text" id="s_username" value="">
    <a href="javascript:select()">查询</a>
    <table id="res" border="1">
        <tr id="data">
            <td>人员id</td>
            <td>created</td>
            <td>用户名</td>
            <td>地址</td>
            <td>电话</td>
            <td>部门</td>
        </tr>
    </table>
</div>
<div style="width: 100%;height: auto;border: 1px solid black">
    <table border="1">
        <tr>
            <td>人员id</td>
            <td>created</td>
            <td>用户名</td>
            <td>地址</td>
            <td>电话</td>
            <td>remark</td>
        </tr>
        <c:forEach var="person" begin="0" items="${personList}">
            <tr>
                <td>${person.id}</td>
                <td>${person.created}</td>
                <td>${person.username}</td>
                <td>${person.address}</td>
                <td>${person.phone}</td>
                <td>${person.emp}</td>
                <td><a href="javascript:update(${person.id})">修改</a></td>
                <td><a id="del" href="javascript:del(${person.id})">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <table border="1">
        <tr>
            <td>部门id</td>
            <td>部门名称</td>
        </tr>
        <c:forEach var="elist" begin="0" items="${empList}">
            <tr>
                <td>${elist.sid}</td>
                <td>${elist.emp}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<div style="width: 100%;height: auto;border: 1px solid black">
    <form id="add" action="add" method="post">
        <table>
            <tr>
                <td>created</td>
                <td>username</td>
                <td>address</td>
                <td>phone</td>
                <td>部门id</td>
            </tr>
            <tr>
                <td><input type="text" name="created" value=""></td>
                <td><input type="text" name="username" value=""></td>
                <td><input type="text" name="address" value=""></td>
                <td><input type="text" name="phone" value=""></td>
                <td>
                    <select name="remark">
                        <option value="1">人事部</option>
                        <option value="2">研发部</option>
                        <option value="3">销售部</option>
                        <option value="4">客服部</option>
                    </select>
                </td>
            </tr>
        </table>
        <button type="submit" value="提交">添加</button>
    </form>
</div>

</body>
</html>
<script type="text/javascript">
    function update(id) {
        self.location = "byid?id="+id+"&sid=0&username=";
    }
    function del(id){
        var res = confirm("确定删除嘛？")
        if (res){
            self.location = "del?id="+id;
        }
    };
    function select(){
        var id = $("#s_pid").val();
        var username = $("#s_username").val();
        var sid = $("#s_sid").val();
        $.getJSON("selectbyid?id="+id+"&sid="+sid+"&username="+username,function (pers) {
            for (var i; i < pers.length ; i++){
                var per = pers[i];
                $("#res").append("<tr><td>"+per.id+"</td><td>"+per.created+"</td><td>"+per.username+"</td><td>"+per.address+"</td><td>"+per.phone+"</td><td>"+per.remark+"</td></tr>")
            }

        })
    }
</script>