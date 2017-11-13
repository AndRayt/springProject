<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head lang="en">
  <title>Books</title>
  <c:url value="" var="cssURL" />
  <style><%@include file="/resources/css/style.css"%></style>
</head>

<body bgcolor="#ffff99">
<div class="center">
  <div class="form">
    <form action="${pageContext.servletContext.contextPath}/search" method="GET">
    Search : <input type="text" name="nameSearch">
    <td><input type="submit" value="Ok"/></td>
    </form>

    <a href="${pageContext.servletContext.contextPath}/Views/CreateBook.jsp">Add Book</a>
    <a href="${pageContext.servletContext.contextPath}/">Reset search</a>

    <br><br><table border="1">
      <tr>
        <td>Name</td>
        <td>Author</td>
        <td>Genre</td>
        <td>Moves</td>
      </tr>
      <c:forEach items="${books}" var="book" varStatus="status">
        <tr valign="top">
          <td>${book.getName()}</td>
          <td>${book.getAuthor()}</td>
          <td>${book.getGenre()}</td>
          <td>
            <a href="${pageContext.servletContext.contextPath}/delete?id=${book.id}">Delete</a>
          </td>
        </tr>
      </c:forEach>
    </table>
  </div>
</div>
</body>
</html>
