<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Add book</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/index.css"/>"/>
</head>
<body>
<div id="main">

    <div id="header">
        <div id="books">
            <img src="../resources/images/indexH.png">
        </div>
    </div>

    <div id="dialog">

        <div id="name1">
            <h2>Create book</h2>
        </div>

        <div id="search">
            <form action="${pageContext.servletContext.contextPath}/create" method="POST">
                <label for="name">Name : </label>
                <input type="text" name="name">
                <br>
                <label for="author">Author : </label>
                <input type="text" name="author">
                <br>
                <label for="genre">Genre : </label>
                <input type="text" name="genre">
                <br>
                <input type="submit" align="center" value="Ok"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
