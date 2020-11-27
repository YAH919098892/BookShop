<%--
  Created by IntelliJ IDEA.
  User: vili
  Date: 2019/8/29
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>优惠卷</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="css/bootstrap.css"/>
</head>
<body>
<div class="container-fluid">

    <jsp:include page="header.jsp"></jsp:include>
    <br>
    <div>
        <form class="form-inline" method="post" action="addCou.action">
            <input type="text" class="form-control" id="input_name" name="coutype" placeholder="输入优惠券类型" required="required" style="width: 200px">
            <input type="text" class="form-control" id="input_name2" name="coumoney" placeholder="输入优惠券金额" required="required" style="width: 200px">
            <input type="text" class="form-control" id="input_name3" name="count" placeholder="输入数目" required="required" style="width: 200px">
            <input type="submit" class="btn btn-warning" value="添加优惠券"/>
        </form>
    </div>
    <br/>
    <c:if test="${!empty msg }">
        <div class="alert alert-success">${msg }</div>
    </c:if>
    <c:if test="${!empty failMsg }">
        <div class="alert alert-danger">${failMsg }</div>
    </c:if>
    <br>
    <table class="table table-bordered table-hover">
        <tr>
            <th width="5%">ID</th>
            <th width="10%">类型</th>
            <th width="10%">金额</th>
            <th width="10%">数量</th>
            <th width="10%">操作</th>
        </tr>

        <c:forEach items="${allcoupone}" var="t">
            <tr>
                <td><p>${t.couid }</p></td>
                <td><p>${t.coutype }</p></td>
                <td><p>${t.coumoney }</p></td>
                <td><p>${t.count }</p></td>
                <td>
                    <a class="btn btn-primary" href="selectCouponById.action?couid=${t.couid}">修改</a>
                    <a class="btn btn-danger" href="delectCou.action?couid=${t.couid}">删除</a>
                </td>
            </tr>
        </c:forEach>


    </table>

</div>
</body>
</html>
