<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
      crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<div class="container">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <nav class="navbar navbar-expand-sm bg-dark navbar-dark mb-3">
                <ul class="nav navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="index">Главная</a></li>
                    <li class="nav-item"><a class="nav-link" href="fullsearch">Расширенный поиск</a></li>
                    <li class="nav-item"><a class="nav-link" href="newbook">Добавить книгу</a></li>
                </ul>
            </nav>
            <form method="POST" action="newbook">
                <input type="text" class="form-control mb-3" name="title"
                       placeholder="Название книги" required
                       aria-describedby="basic-addon2">
                <input type="text" class="form-control mb-3" name="titleauthor"
                       placeholder="Автор" required
                       aria-describedby="basic-addon2">
                <input type="text" class="form-control mb-3" name="publishing"
                       placeholder="Издательство" required
                       aria-describedby="basic-addon2">
                <input type="text" class="form-control mb-3" name="position"
                       placeholder="Комнта/полка" required
                       aria-describedby="basic-addon2">
                <div class="input-group-append">
                    <button type="submit" class="btn btn-primary">Добавить книгу</button>
                </div>
            </form>
        </div>
        <div class="col-md-1"></div>
    </div>
</div>
</body>
</html>