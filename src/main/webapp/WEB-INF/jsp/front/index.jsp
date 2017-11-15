<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lhc19
  Date: 2017-10-29
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>昊富资产</title>
    <link rel="stylesheet" href="../static/plugins/fullpage/jquery.fullpage.min.css" />
    <jsp:include page="headCss.jsp" />
    <link rel="stylesheet" href="../static/index.css">
</head>
<body>
<jsp:include page="header.jsp" />
<div id="fullPage">
    <!--第一屏-->
    <div class="section section1">
        <a href="#" class="pagebg backCover"></a>
        <div class="content">
            <div class="big-tit">
                <h1>HAOFU&nbsp;&nbsp;&nbsp;ZICHAN</h1>
                <p>专业的股权信息平台，让您的股权动起来</p>
                <a href="#">探索更多 <i class="fa fa-long-arrow-right" aria-hidden="true"></i></a>
            </div>
        </div>
    </div>
    <!--第二屏-->
    <div class="section section2">
        <div class="col-xs-10 col-xs-offset-1 content">
            <div class="content-detail">
                <h3 class="section-tit">我们拥有 我们提供</h3>
                <div class="item-area">
                    <div class="row item-box">
                        <div class="col-xs-12 col-sm-6 col-md-3 item-unit-box">
                            <div class="item-unit item-unit1">
                                <i class="item-icons icon1"></i>
                                <div class="item-info">
                                    <span><strong>88</strong>个明星项目</span><br />
                                    <span>专业挑选，严格把关</span>
                                </div>
                            </div>

                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-3 item-unit-box">
                            <div class="item-unit item-unit2">
                                <i class="item-icons icon1"></i>
                                <div class="item-info">
                                    <span><strong>68228</strong>个优秀会员</span><br />
                                    <span>实名认证，平台审核</span>
                                </div>
                            </div>

                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-3 item-unit-box">
                            <div class="item-unit item-unit3">
                                <i class="item-icons icon1"></i>
                                <div class="item-info">
                                    <span>项目<strong>100%</strong>安全对接</span><br />
                                    <span>成立以来，从不违约</span>
                                </div>
                            </div>

                        </div>
                        <div class="col-xs-12 col-sm-6 col-md-3 item-unit-box">
                            <div class="item-unit item-unit4">
                                <i class="item-icons icon1"></i>
                                <div class="item-info">
                                    <span>热线<strong>24</strong>小时在线</span><br />
                                    <span>随时接听，专业对接</span>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>
    <!--第三屏-->
    <div class="section section3">
        <div class="col-xs-10 col-xs-offset-1 content">
            <div class="content-detail">
                <h3 class="section-tit">昊富案例</h3>
                <div class="item-area">
                    <div class="row pro-box" >
                        <c:forEach items="${projects}" var="item" begin="0" end="3">
                            <div class="col-xs-12 col-sm-4 pro-item">
                                <div class="item-box">
                                    <img src='${item.projectPicture}' alt="">
                                    <div class="pro-info">
                                        <span class="pro-name">${item.projectName}</span>
                                        <div class="pro-intro">${item.projectIntro}</div>
                                    </div>
                                    <a href="#">Learn More <i class="fa fa-angle-right"></i></a>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="text-right">
                        <a href="javascript:;" class="goMore">更多案例<i class="fa fa-angle-double-right"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--第四屏-->
    <div class="section section4">
        <div class="content">
            <div class="detail">
                <h3 class="section-tit">关于昊富</h3>
                <div class="row">
                    <div class="col-xs-12 col-md-10 col-md-offset-1 aboutUs">
                        <p>浙江昊富资产管理有限公司，（以下简称“昊富资产“）是一家注册成立于浙江省杭州市，注册资金2000万元，专业从事股权投资、新三板、ipo在即企业、第三方理财等业务的金融公司。</p>
                        <p>昊富资产一直本着“昊诚信达，富泽一方！”的理念，用最专业的服务，最好的信誉，最全面的业务，帮助所有投资者，实现财富增值。</p>
                        <p>为此我们以从业10余年资深专家顾问团队为依托，以中信证券，摩根大通等高素质的管理团队为核心，对三板市场12000余家企业进行筛选，建立1000余家标的池，帮助客户快速实现IPO，借力于中国顶级投行IDG，东方富海等每年筛选线下项目近20000余家，考察300余家，选出最优质项目。</p>
                        <p>昊富资产坚信以风险控制为前提、以市场为导向、以客户为中心、以收益为目标，昊富必将成为在新三板市场、股权投资领域中的顶级机构，实现四方共赢状态，一起成就辉煌。</p>
                    </div>
                </div>
            </div>
            <jsp:include page="footer.jsp"/>
        </div>
    </div>
</div>
<jsp:include page="footJs.jsp" />
<script src="../static/plugins/jquery.easing.1.3.js"></script>
<script src="../static/plugins/fullpage/jquery.fullpage.min.js"></script>
<script src="../static/index.js"></script>
</body>
</html>