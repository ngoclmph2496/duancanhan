<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div>
        <a class="btn btn-danger" href="/ChucVu/create">Thêm Mới</a>
    </div>
    <br>
    <table class="table table-bordered">
        <thead>
        <tr style="background-color: aqua">
            <td>Mã</td>
            <td>Tên</td>
            <td colspan="2">Thao Tác</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${dsChucVu.content}" var="cv">
            <tr>
                <td>${cv.ma}</td>
                <td>${cv.ten}</td>
                <td><a class="btn btn-danger" href="/ChucVu/edit/${cv.id}">Sửa</a></td>
                <td><a class="btn btn-info" href="/ChucVu/delete/${cv.id}">Xóa</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="col-2 offset-5">
        <nav aria-label="Page navigation example">
            <ul class="pagination">
                <c:forEach begin="0" end="${ dsChucVu.totalPages -1}" varStatus="loop">
                    <li class="page-item">
                        <a class="page-link" href="/ChucVu/index?page=${loop.begin + loop.count - 1}">
                                ${loop.begin + loop.count }
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </nav>
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