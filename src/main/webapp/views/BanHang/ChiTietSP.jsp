<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Chi tiết sản phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<div class="row-3 Container">
    <div class="row offset-1">
        <c:forEach items="${chiTietSanPhams}" var="ctsp">
            <div class="col-3 m-3">
                <div class="card text-center">
                    <h5 class="card-header">${ctsp.sanPham.ten}</h5>
                    <div class="card-body">
                        <img src="https://taimienphi.vn/tmp/cf/aut/Uhun-IbFB-MnGE-DiPL-OCTB-hinh-dep-1.jpg"
                             style="height: 300px; left: 100px;" alt="">
                        <p><strong class="font-weight-bold text-danger" style="color: red">${ctsp.giaban} VND</strong>
                        </p>
                    </div>
                    <div class="card-footer">
                        <a href="/cart/add?ctspId=${ctsp.id}" class="btn btn-primary">Add giỏ hàng session</a>
                    </div>
                </div>
            </div>
        </c:forEach>
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