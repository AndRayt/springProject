<%@ page language="java" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head lang="en">
  <title>Books</title>
  <link rel="stylesheet" type="text/css" href="../resources/css/index.css" />
</head>

<body>

<div id="main">

    <div id="header">
        <div id="books">
            <img src="../resources/images/indexH.png">
        </div>
    </div>

    <div id="dialog">
        <div id="search">
            <form action="${pageContext.servletContext.contextPath}/search" method="GET">
                <div id="searchParams1">
                    <label for="nameSearch">Search by Name:</label>
                    <input type="text" name="nameSearch">
                    <td><input type="submit" value="Ok"/></td>
                </div>
            </form>

            <form action="${pageContext.servletContext.contextPath}/search_author" method="GET">
                <div id="searchParams2">
                    <label for="nameSearch">Search by Author:</label>
                    <input type="text" name="nameSearch">
                    <td><input type="submit" value="Ok"/></td>
                </div>
            </form>

            <a href="${pageContext.servletContext.contextPath}/Views/CreateBook.jsp">Add Book</a>
            <a href="${pageContext.servletContext.contextPath}/">Reset search</a>

            <br><br><table>
              <tr>
                <th>Name</th>
                <th>Author</th>
                <th>Genre</th>
                <th>Moves</th>
              </tr>
              <c:forEach items="${books}" var="book" varStatus="status">
                <tr valign="top">
                  <td>${book.getName()}</td>
                  <td>${book.getAuthor()}</td>
                  <td>${book.getGenre()}</td>
                  <td>
                    <a href="${pageContext.servletContext.contextPath}/delete?id=${book.id}">Delete</a>
                    <a href="${pageContext.servletContext.contextPath}/get_edit_id?id=${book.id}">Edit</a>
                  </td>
                </tr>
              </c:forEach>
            </table>
        </div>
  </div>
</div>
</body>
</html>
