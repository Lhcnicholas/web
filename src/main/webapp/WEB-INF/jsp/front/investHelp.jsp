<%@page contentType="text/html;charset=utf-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>昊富资产</title>
    <jsp:include page="headCss.jsp" />
    <link rel="stylesheet" href="../static/style.css">
</head>
<body>
<jsp:include page="header.jsp" />
<div class="banner-area">
    <a href="#"><img src="../../public/images/00.jpg" alt=""></a>
</div>
<div class="container">
    <div class="row">
        <div class="col-xs-12 breadcrumb-area">
            <span class="breadcrumb-txt">当前位置：</span>
            <ol class="breadcrumb">
                <li><a href="#">投资者服务</a></li>
                <li><a href="#">投资助手</a></li>
            </ol>
        </div>
    </div>
    <!--</div>-->
    <!--<div class="container-fliud">-->
    <div class="row investHelp-area">
        <div class="col-xs-12 ">
            <div class="row">
                <div class="col-sm-3" style="padding-left:40px;">
                    <img src="../../public/images/investHelp/ico_step3.png" alt="" class="img-responsive">
                    <h3>项目解读</h3>
                    <p></p>
                </div>
                <div class="col-sm-3 ">
                    <img src="../../public/images/investHelp/ico_step4.png" alt="" class="img-responsive center-block">
                    <h3 class="text-center">签订协议</h3>
                    <p></p>
                </div>
                <div class="col-sm-3 ">
                    <img src="../../public/images/investHelp/ico_step5.png" alt="" class="img-responsive center-block">
                    <h3 class="text-center">接受股权证书</h3>
                    <p></p>
                </div>
                <div class="col-sm-3 ">
                    <img src="../../public/images/investHelp/ico_step6.png" alt="" class="img-responsive center-block">
                    <h3 class="text-center">企业股东名册变更读</h3>
                    <p></p>
                </div>
                <div class="col-sm-12 text-center" style="margin-top:220px;margin-bottom:10px;">
                    <img src="../../public/images/investHelp/ico_step8.png" alt="" class="img-responsive center-block">
                    <h3>认购成功</h3>
                    <p></p>
                </div>
                <div class="col-xs-12 text-center">
                    <a href="javascript:;" class="investAction">我要投资</a>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp" />
<jsp:include page="footJs.jsp" />
<script src="../static/common.js"></script>
</body>
</html>
