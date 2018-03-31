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
            <form method="POST" action="fullsearch">
                <div class="input-group">
                    <input type="text" class="form-control" name="search"
                           placeholder="Поиск"
                           aria-label="Recipient's username" aria-describedby="basic-addon2">
                    <select class="custom-select" name="method" wid>
                        <option selected>Условие поиска...</option>
                        <option value="title">Название книги</option>
                        <option value="author">Автор</option>
                        <option value="publishing">Издательство</option>
                    </select>
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-primary">Поиск</button>
                    </div>
                </div>
            </form>
            <table class="table table-hover">
                <thead class="thead-dark">
                <tr>
                    <th>Название</th>
                    <th>Автор</th>
                    <th>Издательство</th>
                </tr>
                </thead>
                <c:forEach var="title" items="${titleList}">
                    <tr>
                        <td><a href="titles?title=${title.title}&publishing=${title.publishing}">${title.title}</a></td>
                        <td>${title.titleauthor}</td>
                        <td>${title.publishing}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div class="col-md-1"></div>
    </div>
</div>
</body>
</html>