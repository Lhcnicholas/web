<%--
  Created by IntelliJ IDEA.
  User: lhc19
  Date: 2017-11-05
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>金谷子网后台管理</title>
    <link id="easyuiTheme" rel="stylesheet" href="<%=request.getContextPath()%>/static/themes/gray/easyui.css" type="text/css"></link>
    <link rel="stylesheet" type="text/css" href="../static/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../static/portal.css">
    <link rel="stylesheet" type="text/css" href="../static/common.css">
    <script type="text/javascript" src="../static/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="../static/xheditor-1.1.14/xheditor-1.1.14-zh-cn.min.js"></script>
    <script type="text/javascript" src="../static/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../static/jquery.portal.js"></script>
    <script type="text/javascript" src="../static/jquery.cookie.js"></script>
    <script type="text/javascript" src="../static/jeasyui.common.js"></script>
    <script type="text/javascript" src="../static/locale/easyui-lang-zh_CN.js" charset="utf-8"></script>
</head>
<body class="easyui-layout">
<noscript>
    <div style="position:absolute; z-index:100000; height:246px;top:0px;left:0px; width:100%; background:white; text-align:center;">
        <img src="images/noscript.gif" alt='抱歉，请开启脚本支持！' />
    </div>
</noscript>
<div data-options="region:'north',border:false" style="height:60px;background:#fff;padding:0px">
    <div class="site_title">买买茶游戏后台管理系统</div>
    <div id="sessionInfoDiv" style="position: absolute;right: 5px;top:10px;">
        [<strong>牛儿吃草</strong>]，欢迎你！您使用[<strong>123.232.103.195</strong>]IP登录！
    </div>
    <div style="position: absolute; right: 0px; bottom: 0px; ">
        <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_pfMenu',iconCls:'icon-ok'">更换皮肤</a> <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-help'">控制面板</a> <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_zxMenu',iconCls:'icon-back'">注销</a>
    </div>
    <div id="layout_north_pfMenu" style="width: 120px; display: none;">
        <div onclick="changeTheme('default');">default</div>
        <div onclick="changeTheme('gray');">gray</div>
        <div onclick="changeTheme('metro');">metro</div>
        <div onclick="changeTheme('cupertino');">cupertino</div>
        <div onclick="changeTheme('dark-hive');">dark-hive</div>
        <div onclick="changeTheme('pepper-grinder');">pepper-grinder</div>
        <div onclick="changeTheme('sunny');">sunny</div>
    </div>
    <div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
        <div onclick="userInfoFun();">个人信息</div>
        <div onclick="userInfoFun();">退出登录</div>
    </div>
    <div id="layout_north_zxMenu" style="width: 100px; display: none;">
        <div onclick="logoutFun();">锁定窗口</div>
        <div class="menu-sep"></div>
        <div onclick="logoutFun();">重新登录</div>
        <div onclick="logoutFun(true);">退出系统</div>
    </div>


</div>
<div data-options="region:'west',split:true,title:'导航菜单'" style="width:200px;">
    <div class="easyui-accordion sider" data-options="fit:true,border:false">
        <!--//左侧菜单导航-->
        <div title="基础功能" data-options="iconCls:'icon-mini-add'" style="padding:10px;">
            <ul class="easyui-tree" data-options="animate:false">
                <li data-options="state:'open'">
                    <span>新闻管理</span>
                    <ul>
                        <li><a href="javascript:void(0);" cmshref="news/index.html" type="nav_head" rel="">新闻列表</a></li><li><a href="javascript:void(0);" cmshref="news/newssort.html" type="nav_foot" rel="">新闻分类</a></li>                    </ul>
                </li>
            </ul>
        </div><!--waiceng-->
        <div title="客服中心" data-options="iconCls:'icon-mini-add'" style="padding:10px;">
            <ul class="easyui-tree" data-options="animate:true">
                <li data-options="state:'closed'">
                    <span>文档管理</span>
                    <ul>
                        <li><a href="javascript:void(0);" cmshref="/admin.php/News/index" type="news_list" rel="">文档列表</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/News/index" type="news_list_add" rel="">添加文档</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/News/recycle" type="news_recycle" rel="">文档回收站</a></li>                    </ul>
                </li><li data-options="state:'closed'">
                <span>分类管理</span>
                <ul>
                    <li><a href="javascript:void(0);" cmshref="/admin.php/NewsSort/index" type="sort_list" rel="">分类列表</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/NewsSort/add" type="newssort" rel="dialog">添加分类</a></li>                    </ul>
            </li><li data-options="state:'closed'">
                <span>留言管理</span>
                <ul>
                    <li><a href="javascript:void(0);" cmshref="/admin.php/Message/index" type="message_list" rel="">留言信息</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/Message/sort" type="message_setting" rel="">留言分类</a></li>                    </ul>
            </li><li data-options="state:'closed'">
                <span>评论管理</span>
                <ul>
                    <li><a href="javascript:void(0);" cmshref="/admin.php/Comment/index" type="comment_list" rel="">评论信息</a></li>                    </ul>
            </li><li data-options="state:'closed'">
                <span>单页管理</span>
                <ul>
                    <li><a href="javascript:void(0);" cmshref="/admin.php/Pages/index" type="singlepage_list" rel="">单页文档</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/Pages/sort" type="singlepage_sort" rel="">单页分类</a></li>                    </ul>
            </li><li data-options="state:'closed'">
                <span>碎片文档</span>
                <ul>
                    <li><a href="javascript:void(0);" cmshref="/admin.php/Block/index" type="block_list" rel="">碎片列表</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/Block/sort" type="block_cat" rel="">碎片分类</a></li>                    </ul>
            </li>        </ul>
        </div><!--waiceng--><div title="帐号中心" data-options="iconCls:'icon-mini-add'" style="padding:10px;">
        <ul class="easyui-tree" data-options="animate:true">
            <li data-options="state:'closed'">
                <span>会员管理</span>
                <ul>
                    <li><a href="javascript:void(0);" cmshref="www.baidu.com" type="member_perinfo" rel="">个人资料</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/Operators/index" type="member_adminlist" rel="">后台用户列表</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/Members/index" type="member_frontlist" rel="">前台会员列表</a></li>                    </ul>
            </li><li data-options="state:'closed'">
            <span>后台权限管理</span>
            <ul>
                <li><a href="javascript:void(0);" cmshref="/admin.php/Node/index" type="member_adminlist" rel="">节点管理</a></li><li><a href="javascript:void(0);" cmshref="/admin.php/Role/index" type="member_adminlist" rel="">角色管理</a></li>                    </ul>
        </li><li data-options="state:'closed'">
            <span>前台权限管理</span>
            <ul>
                <li><a href="javascript:void(0);" cmshref="www.baidu.com" type="frontcom_cat" rel="">前台权限分类</a></li><li><a href="javascript:void(0);" cmshref="www.baidu.com" type="frontcom_list" rel="">前台权限列表</a></li>                    </ul>
        </li>        </ul>
    </div>           <!--//左侧菜单导航-->
    </div><!--accordion-->

</div><!--west-->
<div data-options="region:'south',border:false" style="height:50px;background:#fff;padding:10px;">
    <div id="footer">
        Copyright © 2017 HAOFU ZICHAN.<br>
        All Rights Reserved<br>
    </div>
</div>
<!--//主体内容部分-->
<div data-options="region:'center'" class="indexcenter" title="欢迎使用买买茶游戏后台管理系统">
    <div id="tabs_index" class="easyui-tabs"  fit="true" border="false"  >
        <div title="首页" style="overflow:hidden; " data-options="href:'portal.html'">
        </div>
    </div>
</div><!--center-->
<!--//主体内容部分-->
<div id="dialog_cms" data-options="iconCls:'icon-save'">
</div>
</body>
</html>
