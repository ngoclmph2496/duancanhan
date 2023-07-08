<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Chức Vụ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="Container">
    <h1 style="text-align: center">Chức Vụ</h1>
    <div class="row-11 mx-3 mt-5">
        <sf:form method="post" action="${dsChucVu}" modelAttribute="cv">
            <div class="row mt-3">
                <div class="col-6">
                    <label>Mã: </label>
                    <sf:input path="ma" cssClass="form-control"/>
                    <sf:errors cssStyle="color: red" path="ma"/>
                </div>
                <div class="col-6">
                    <label>Tên: </label>
                    <sf:input path="ten" cssClass="form-control"/>
                    <sf:errors cssStyle="color: red" path="ten"/>
                </div>
            </div>
            <br>
            <div>
                <button class="btn btn-info">ADD</button>
            </div>
        </sf:form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
        integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
        crossorigin="anonymous"></script>
</body>
</html>