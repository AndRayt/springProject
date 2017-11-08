<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add book</title>
</head>
<body bgcolor="#9999cc">
<form action="${pageContext.servletContext.contextPath}/create" method="POST">
    <table>
        <tr>
            <td align="right" >Name : </td>
            <td>
                <input type="text" name="name">
            </td>
        </tr>
        <tr>
            <td align="right" >Author : </td>
            <td>
                <input type="text" name="author">
            </td>
        </tr>
        <tr>
            <td align="right" >Genre : </td>
            <td>
                <input type="text" name="genre">
            </td>
        </tr>
        <tr>
            <td><input type="submit" align="center" value="Add"/></td>
        </tr>
    </table>
</form>
</body>
</html>
