<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Nhân Viên</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 style="text-align: center">Nhân Viên</h1>
    <div class="col-11 mt-3 mx-5">
        <sf:form method="post" action="${dsNhanVien}" modelAttribute="nv">
            <div class="row mt-3">
                <div class="col-6">
                    <label>Mã:</label><br>
                    <sf:input cssClass="form-control" path="ma"/>
                    <sf:errors cssStyle="color: red" path="ma"/><br/>
                </div>
                <div class="col-6">
                    <label>Họ:</label><br>
                    <sf:input cssClass="form-control" path="ho"/>
                    <sf:errors cssStyle="color: red" path="ho"/><br/>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Tên Đệm:</label><br>
                    <sf:input cssClass="form-control" path="tendem"/>
                    <sf:errors cssStyle="color: red" path="tendem"/><br/>
                </div>
                <div class="col-6">
                    <label>Tên:</label><br>
                    <sf:input cssClass="form-control" path="ten"/>
                    <sf:errors cssStyle="color: red" path="ten"/><br/>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Email:</label><br>
                    <sf:input cssClass="form-control" path="email"/>
                    <sf:errors cssStyle="color: red" path="email"/><br/>
                </div>
                <div class="col-6">
                    <label>Giới tính:</label><br>
                    <sf:radiobutton value="Nam" checked="Checked" path="gioitinh"/>Nam
                    <sf:radiobutton value="Nữ" path="gioitinh"/>Nữ
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Ngày Sinh:</label><br>
                    <sf:input type="Date" cssClass="form-control" path="ngaySinh"/>
                    <sf:errors cssStyle="color: red" path="ngaySinh"/><br/>
                </div>
                <div class="col-6">
                    <label>Địa chỉ:</label><br>
                    <sf:input cssClass="form-control" path="diachi"/>
                    <sf:errors cssStyle="color: red" path="diachi"/><br/>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Số đt:</label><br>
                    <sf:input cssClass="form-control" path="sdt"/>
                    <sf:errors cssStyle="color: red" path="sdt"/><br/>
                </div>
                <div class="col-6">
                    <label>Mật khẩu:</label><br>
                    <sf:input cssClass="form-control" path="matkhau"/>
                    <sf:errors cssStyle="color: red" path="matkhau"/><br/>
                </div>
            </div>

            <div class="row mt-3">
                <div class="col-6">
                    <label>Tên Chức vụ:</label><br>
                    <sf:select path="chucVu"  cssClass="form-select">
                        <c:forEach items="${dsChucVu}" var="cv">
                            <sf:option value="${cv.id}">${cv.ten}</sf:option>
                        </c:forEach>
                    </sf:select>
                </div>
                <div class="col-6">
                    <label>Tên Cửa Hàng:</label><br>
                    <sf:select path="cuaHang" cssClass="form-select">
                        <c:forEach items="${dsCuaHang }" var="ch">
                            <sf:option value="${ch.id}">${ch.ten}</sf:option>
                        </c:forEach>
                    </sf:select>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <button class="btn btn-primary">ADD</button>
                </div>
                <div class="col-6"></div>
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