<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous">
<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                <ul class="nav navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="index">Главная</a></li>
                    <li class="nav-item"><a class="nav-link" href="fullsearch">Расширенный поиск</a></li>
                    <li class="nav-item"><a class="nav-link" href="newbook">Добавить книгу</a></li>
                </ul>
            </nav>
            <table class="table table-hover">
                <thead class="thead-dark" >
                <tr>
                    <th>Id</th>
                    <th>Название</th>
                    <th>Автор</th>
                    <th>Издательство</th>
                    <th>Наличие</th>
                    <th>Выбрана</th>
                    <th>Комната/полка</th>
                </tr>
                </thead>
                <c:forEach var="title" items="${titleList}">
                    <tr>
                        <td>${title.articleId}</td>
                        <td>${title.title}</td>
                        <td>${title.titleauthor}</td>
                        <td>${title.publishing}</td>
                        <td>${title.instock}</td>
                        <td>${title.reader}</td>
                        <td>${title.position}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div class="col-md-1"></div>
    </div>
</div>
</body>
</html>