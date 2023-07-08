<%--
  Created by IntelliJ IDEA.
  User: tiennh
  Date: 3/11/23
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LayOut</title>
    <link rel="stylesheet"
          href="/css/bootstrap.min.css"/>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">SOF3011</a>
        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/KhachHang/index">khách Hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/CuaHang/index">Cửa Hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/ChucVu/index">Chức Vụ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/MauSac/index">Màu Sắc</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/SanPham/index">Sản Phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/NSX/index">Nhà Sản Xuất</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/DongSP/index">Dòng Sản Phẩm</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/NhanVien/index">Nhân Viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/ChiTietSP/index">Chi Tiết Sản Phẩm</a>
                </li>
            </ul>
        </div>
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
            Đăng xuất
        </button>

        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Đăng xuất</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        Xác nhận đăng xuất?
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <a href="/login" class="btn btn-primary">OK</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</nav>

<div class="row" style="min-height: 500px;">
    <div class="col-2 bg-warning">
        <div class="container mt-3">
            <div style="text-align: center">
                <img src="https://img-cache.coccoc.com/image2?i=1&l=33/893485644"
                     class="img-fluid"
                     width="200" height="200">
                <h2>SOF3011</h2>
                <ul class="nav nav-pills flex-column ">
                    <li class="nav-item">
                        <a class="nav-link sidenav" href="#">Trang Chủ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Giới thiệu</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Sản Phẩm</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" style="color: aqua" href="#">Giỏ Hàng</a>
                    </li>
                </ul>
            </div>
        </div>


    </div>
    <div class="col-10">
        <jsp:include page="${ view }"/>
    </div>
</div>

<div class="row bg-dark text-white" style="min-height: 200px;">
    <h3 style="text-align: center" class="mt-3">HỌC VIỆN ĐẾN TỪ HÀN QUỐC</h3>
    <div class="col-4">
        <div style="text-align: center">
            <h3>CHI NHÁNH HỒ CHÍ MINH</h3>
            <p><Strong>Địa Chỉ: </Strong>94C Cao Thắng, Phường 4, Quận 3, Tp.HCM
                31/2 Nguyễn Bỉnh Khiêm, Phường Đakao, Quận 1, Tp.HCM</p>
            <p><Strong>Hotline: </Strong> 093 8386 086</p>
            <p><Strong>Email: </Strong> contact@greenacademy.edu.vn</p>
        </div>

    </div>
    <div class="col-4">
        <div style="text-align: center">
            <h3>CHI NHÁNH Hà Nội</h3>
            <p><Strong>Địa Chỉ: </Strong> 148 Nguyễn Trãi, Phường Thượng Đình, Quận Thanh Xuân, Tp.Hà Nội</p>
            <p><Strong>Hotline:</Strong> (024) 7302 8988</p>
            <p><Strong>Email: </Strong> hanoibranch@greenacademy.edu.vn</p>
        </div>
    </div>
    <div class="col-4">
        <div style="text-align: center">
            <iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d284589.12491471175!2d106.01520963532991!3d21.125386942456018!3m2!1i1024!2i768!4f13.1!5e1!3m2!1sen!2s!4v1679378825668!5m2!1sen!2s"
                    width="400px" height="150px" style="border:0;" allowfullscreen="" loading="lazy"
                    referrerpolicy="no-referrer-when-downgrade"></iframe>
        </div>

    </div>

</div>

<script src="/js/bootstrap.min.js"></script>
</body>
</html>
