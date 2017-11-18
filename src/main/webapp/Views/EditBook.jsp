<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Edit book</title>
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

        <div id="name2">
            <h2>Edit book</h2>
        </div>

        <div id="search">
            <form action="${pageContext.servletContext.contextPath}/edit" method="POST">
                <label for="name">New Name : </label>
                <input type="text" name="name">
                <br>
                <label for="author">New Author : </label>
                <input type="text" name="author">
                <br>
                <label for="genre">New Genre : </label>
                <input type="text" name="genre">
                <br>
               <input type="submit" align="center" value="Edit"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
