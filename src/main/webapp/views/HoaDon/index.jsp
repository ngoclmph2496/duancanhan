<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Sản Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 style="text-align: center">Hóa Đơn</h1>
    <table class="table table-bordered">
        <thead>
        <tr style="background-color: #0dcaf0">
            <td>Mã</td>
            <td>Ngày Tạo</td>
            <td>Ngày Thanh Toán</td>
            <td>Ngày Ship</td>
            <td>Ngày Nhận</td>
            <td>Tình Trạng</td>
            <td>Tên Người Nhận</td>
            <td>Địa Chỉ</td>
            <td>Số đt</td>
            <td>Tên Nhân Viên</td>
            <td>Tên Khách Hàng</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${dsHoaDon}" var="hd">
            <tr>
                <td>${hd.ma}</td>
                <td>
                    <f:formatDate value="${hd.ngaytao}" pattern="dd-MM-yyyy"/>
                </td>
                <td>
                    <f:formatDate value="${hd.ngaythanhtoan}" pattern="dd-MM-yyyy"/>
                </td>
                <td>
                    <f:formatDate value="${hd.ngayship}" pattern="dd-MM-yyyy"/>
                </td>
                <td>
                    <f:formatDate value="${hd.ngaynhan}" pattern="dd-MM-yyyy"/> `
                </td>
                <td>${hd.tinhtrang}</td>
                <td>${hd.tennguoinhan}</td>
                <td>${hd.diachi}</td>
                <td>${hd.sdt}</td>
                <td>${hd.nhanVien.ten}</td>
                <td>${hd.khachHang.ten}</td>
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