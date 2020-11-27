
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>领取优惠券</title>
    <meta charset="utf-8"/>
    <link rel="stylesheet" href="css/bootstrap.css"/>
</head>
<body>
<div class="container-fluid">
    <br>
    <table class="table table-bordered table-hover">
        <tr>
            <th width="10%">数量</th>
            <th width="10%">金额</th>
            <th width="10%">操作</th>
        </tr>
        <c:forEach items="${allcoupone}" var="t">
            <tr>
                <td><p>${t.count }</p></td>
                <td><p>${t.coumoney }</p></td>
                <td>
         <a class="btn btn-primary" href="getCoupon.action?couid=${t.couid}&count=${t.count}">领取</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
