<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<html>
<head>
    <title>Khách Hàng</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div>
    <div class="container">
        <h1 style="text-align: center">Khách Hàng</h1>
        <div>
            <a class="btn btn-info" href="/KhachHang/create">Thêm Mới</a>
        </div>
        <br/>
        <table class="table table-bordered">
            <thead>
            <tr style="background: #0dcaf0">
                <td>Mã</td>
                <td>Họ</td>
                <td>Tên Đệm</td>
                <td>Tên</td>
                <td>Email</td>
                <td>Ngày Sinh</td>
                <td>Địa chỉ</td>
                <td>Thành Phố</td>
                <td>Quốc Gia</td>
                <td>Số đt</td>
                <td>Mật khẩu</td>
                <td colspan="2">Hoàn Tác</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="kh" items="${dsKhachHang.content}">
                <tr>
                    <td>${kh.ma}</td>
                    <td>${kh.ho}</td>
                    <td>${kh.tendem}</td>
                    <td>${kh.ten}</td>
                    <td>${kh.email}</td>
                    <td>
                        <f:formatDate value="${kh.ngaySinh}" pattern="dd-MM-yyyy"/>
                    </td>
                    <td>${kh.diachi}</td>
                    <td>${kh.thanhpho}</td>
                    <td>${kh.quocgia}</td>
                    <td>${kh.sdt}</td>
                    <td>${kh.matkhau}</td>
                    <td><a class="btn btn-info" href="/KhachHang/edit/${kh.id}">Sửa</a></td>
                    <td><a class="btn btn-danger" href="/KhachHang/delete/${kh.id}">Xóa</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div class="col-2 offset-5">
            <nav aria-label="Page navigation example">
                <ul class="pagination">
                    <c:forEach begin="0" end="${ dsKhachHang.totalPages -1}" varStatus="loop">
                        <li class="page-item">
                            <a class="page-link" href="/KhachHang/index?page=${loop.begin + loop.count - 1}">
                                    ${loop.begin + loop.count }
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </nav>
        </div>
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