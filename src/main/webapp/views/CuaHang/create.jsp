<%@ page language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Cua Hang</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 style="text-align: center">Cửa Hàng</h1>
    <div class="col-11 mt-3 mx-5">
        <sf:form method="post" action="${dsCuaHang}" modelAttribute="ch">
            <div class="row mt-3">
                <div class="col-6">
                    <label>Mã:</label><br/>
                    <sf:input cssClass="form-control" path="ma"/>
                    <sf:errors cssStyle="color: red" path="ma"/><br/>
                </div>
                <div class="col-6">
                    <label>Tên:</label><br/>
                    <sf:input cssClass="form-control" path="ten"/>
                    <sf:errors cssStyle="color: red" path="ten"/><br/>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Địa Chỉ:</label><br/>
                    <sf:input cssClass="form-control" path="diachi"/>
                    <sf:errors cssStyle="color: red" path="diachi"/><br/>
                </div>
                <div class="col-6">
                    <label>Thành Phố:</label><br/>
                    <sf:select class="form-select" path="thanhpho">
                        <sf:option value="Hà Nội">Hà Nội</sf:option>
                        <sf:option value="Bắc Ninh">Bắc Ninh</sf:option>
                    </sf:select><br/>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-6">
                    <label>Quốc gia:</label><br/>
                    <sf:input cssClass="form-control" path="quocgia"/>
                    <sf:errors cssStyle="color: red" path="quocgia"/><br/>
                </div>
                <div class="col-6">
                </div>
            </div>
            <br>
            <button class="btn btn-danger">add</button>
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