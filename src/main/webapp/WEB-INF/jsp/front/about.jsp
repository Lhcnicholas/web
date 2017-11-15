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
                <li><a href="#">关于我们</a></li>
            </ol>
        </div>
    </div>
    <div class="row aboutUs-area">
        <div class="col-xs-12 ">
            <div class="row">
                <div class="col-xs-3 col-md-3">
                    <ul class="nav nav-pills nav-stacked">
                        <li class="active"><a data-toggle="tab" href="#home">关于我们</a></li>
                        <li><a data-toggle="tab" href="#menu1">昊富优势</a></li>
                        <li><a data-toggle="tab" href="#menu2">昊富文化</a></li>
                        <li><a data-toggle="tab" href="#menu3">免责声明</a></li>
                    </ul>
                </div>
                <div class="col-xs-9 col-md-9">
                    <div class="tab-content">
                        <div id="home" class="tab-pane fade in active">
                            <p>浙江昊富资产管理有限公司，（以下简称“昊富资产“）是一家注册成立于浙江省杭州市，注册资金2000万元，专业从事股权投资、新三板、ipo在即企业、第三方理财等业务的金融公司。</p>
                            <p>昊富资产一直本着“昊诚信达，富泽一方！”的理念，用最专业的服务，最好的信誉，最全面的业务，帮助所有投资者，实现财富增值。</p>
                            <p>为此我们以从业10余年资深专家顾问团队为依托，以中信证券、摩根大通等高素养的管理团队为核心，对三板市场12000余家企业进行筛选，建立1000余家标的池，帮助客户快速实现IPO，借力于中国顶级投行IDG，东方富海等每年筛选线下项目近20000余家，考察300余家，选出最优质项目。</p>
                            <p>昊富资产坚信以风险控制为前提、以市场为导向、以客户为中心、以收益为目标，昊富必将成为新三板市场、股权投资领域中的顶级机构，实现四方共赢状态，一起成就辉煌。</p>
                        </div>
                        <div id="menu1" class="tab-pane fade">
                            <p>权威----由中信证券，摩根大通等高素质的管理团队为核心</p>
                            <p>优质----以ipo两倍标准，严格的选择项目，1%的入选率</p>
                            <p>低价----昊富资产自营项目，直接对接企业方，控制成本，获得超低溢价</p>
                            <p>全面----对接几十家机构，每年筛选企业近50000余家</p>
                            <p>负责----企业所有资料，全面复核，实地考察</p>
                            <p>专业----所有从业人员均有从业3年以上，具有行业资格证书</p>
                            <p> 放心----每个项目实时跟踪，了解企业全面动态</p>
                        </div>
                        <div id="menu2" class="tab-pane fade">
                            <p>昊诚信达，富泽一方！</p>
                            <p>用最专业的服务，最好的信誉，最全面的业务，帮助所有投资者，实现财富增值。</p>
                            <p>我们的愿景是：成为中国一流的金融服务机构</p>
                            <p>我们的使命是：让中国的中小企业融资变得更加快捷</p>
                            <p>我们的作风是：想客户所想，思客户所思，以客户的利益为第一宗旨</p>
                            <p>我们的原则是：风险告知，收益告知，客观公正</p>
                        </div>
                        <div id="menu3" class="tab-pane fade">
                            <p>昊富资产所发布的产品与研究资料虽经严谨筛选考证，但并不就其准确性作出保证，本网不对数据的错误或遗漏承担责任。</p>
                            <p>作为一家专业的股权投资机构，我们一直在进行的是“投资者教育”，帮助投资者学习选择标的的方法，帮助解读市场政策，帮助投资判断。虽然我们有最顶尖的理财顾问，但是理财顾问只是提供客观的资讯和参考性的建议，投资理财仍需投资者自己决策 。</p>
                            <p>昊富资产不对投资风险承担责任。</p>
                            <p>投资有风险，入市需谨慎。</p>
                        </div>
                    </div>
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
