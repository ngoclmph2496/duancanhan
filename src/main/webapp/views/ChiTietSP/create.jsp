<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Chi tiết sản phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 style="text-align: center">Chi tiết sản phẩm</h1>
    <div class="col-11 mt-3 mx-5">
        <sf:form method="post" action="${dsChitietSP}" modelAttribute="ctsp">
            <div class="row mt-3">
                <div class="col-6">
                    <label>Tên Sản Phẩm:</label><br>
                    <sf:select path="sanPham" cssClass="form-select">
                        <c:forEach items="${dsSanPham}" var="sp">
                            <sf:option value="${sp.id}">${sp.ten}</sf:option>
                        </c:forEach>
                    </sf:select>
                </div>
                <div class="col-6">
                    <label>Tên NSX:</label><br>
                    <sf:select path="nsx" cssClass="form-select">
                        <c:forEach items="${dsNSX}" var="nsx">
                            <sf:option value="${nsx.id}">${nsx.ten}</sf:option>
                        </c:forEach>
                    </sf:select>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Tên Màu Sắc:</label><br>
                    <sf:select path="mauSac" cssClass="form-select">
                        <c:forEach items="${dsMauSac}" var="ms">
                            <sf:option value="${ms.id}">${ms.ten}</sf:option>
                        </c:forEach>
                    </sf:select>
                </div>
                <div class="col-6">
                    <label>Tên Dòng sp:</label><br>
                    <sf:select path="dongSP" cssClass="form-select">
                        <c:forEach items="${dsDSP}" var="dsp">
                            <sf:option value="${dsp.id}">${dsp.ten}</sf:option>
                        </c:forEach>
                    </sf:select>
                </div>
            </div>


            <div class="row mt-3">
                <div class="col-6">
                    <label>Năm Bán Hàng:</label><br>
                    <sf:input cssClass="form-control" path="nambanhang"/>
                    <sf:errors cssStyle="color: red" path="nambanhang"/><br/>
                </div>
                <div class="col-6">
                    <label>Mô tả:</label><br>
                    <sf:input cssClass="form-control" path="mota"/>
                    <sf:errors cssStyle="color: red" path="mota"/><br/>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Số Lượng Tồn:</label><br>
                    <sf:input cssClass="form-control" path="soluongton"/>
                    <sf:errors cssStyle="color: red" path="soluongton"/><br/>
                </div>
                <div class="col-6">
                    <label>Gía Nhập:</label><br>
                    <sf:input cssClass="form-control" path="gianhap"/>
                    <sf:errors cssStyle="color: red" path="gianhap"/><br/>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Gía Bán:</label><br>
                    <sf:input cssClass="form-control" path="giaban"/>
                    <sf:errors cssStyle="color: red" path="giaban"/><br/>
                </div>
                <div class="col-6">
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