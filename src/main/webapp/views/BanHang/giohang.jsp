<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Chi tiết sản phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="Container">
    <table class="table container">
        <thead>
        <tr>
            <td>ID CTSP</td>
            <td>Tên sản phẩm</td>
            <td>Màu sắc</td>
            <td>Số lượng</td>
            <td>Giá bán</td>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${gioHangChiTiet}" var="gh">
            <tr>
                <td>${gh.idChitietsp}</td>
                <td>${gh.tensanpham}</td>
                <td>${gh.tenmau}</td>
                <td>${gh.soLuong}</td>
                <td>${gh.giaban}</td>
                <td><a class="btn btn-danger" href="">Mua Ngay</a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
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