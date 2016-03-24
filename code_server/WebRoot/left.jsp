<%@ page contentType="text/html;charset=utf-8" language="java" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/chili-1.7.pack.js"></script>
<script type="text/javascript" src="js/jquery.easing.js"></script>
<script type="text/javascript" src="js/jquery.dimensions.js"></script>
<script type="text/javascript" src="js/jquery.accordion.js"></script>
<script language="javascript">
	jQuery().ready(function(){
		jQuery('#navigation').accordion({
			header: '.head',
			navigation1: true, 
			event: 'click',
			fillSpace: true,
			animated: 'bounceslide'
		});
	});
</script>
<style type="text/css">
<!--
body {
	margin:0px;
	padding:0px;
	font-size: 12px;
}
#navigation {
	margin:0px;
	padding:0px;
	width:147px;
}
#navigation a.head {
	cursor:pointer;
	background:url(images/main_34.gif) no-repeat scroll;
	display:block;
	font-weight:bold;
	margin:0px;
	padding:5px 0 5px;
	text-align:center;
	font-size:12px;
	text-decoration:none;
}
#navigation ul {
	border-width:0px;
	margin:0px;
	padding:0px;
	text-indent:0px;
}
#navigation li {
	list-style:none; display:inline;
}
#navigation li li a {
	display:block;
	font-size:12px;
	text-decoration: none;
	text-align:center;
	padding:3px;
}
#navigation li li a:hover {
	background:url(images/tab_bg.gif) repeat-x;
		border:solid 1px #adb9c2;
}
-->
</style>
</head>
<body>

<div  style="height:100%;">
  <ul id="navigation">
  
  	<li> <a class="head">用户管理</a>
      <ul>
        <li> <a href="user.do?method=list" target="rightFrame"> 用户管理</a>  </li>
        <li> <a href="user_add.jsp" target="rightFrame"> 新增用户</a>    </li>
      </ul>
    </li>
     
  	<li> <a class="head"> 注册用户管理</a>
      <ul>
        <li> <a href="user_tb.do?method=list" target="rightFrame"> 注册用户管理</a>  </li>
      </ul>
    </li>


  	<li> <a class="head"> 类别管理</a>
      <ul>
        <li> <a href="type.do?method=list" target="rightFrame"> 类别管理</a>  </li>
        <li> <a href="type_add.jsp" target="rightFrame"> 新增类别</a>    </li>
      </ul>
    </li>
     
    
    <li> <a class="head">菜谱管理</a>
      <ul> 
<!--         <li> <a href="foodList.do?type=1&flag=1" target="rightFrame"> 显示本店招牌菜谱</a>  </li>
        <li> <a href="foodList.do?type=2&flag=2" target="rightFrame"> 显示本店热门菜谱</a>  </li> -->
        <li> <a href="foodList.do" target="rightFrame"> 显示本店所有菜谱</a>  </li>
        <li> <a href="foodList.do?method=goAdd" target="rightFrame"> 新增菜谱</a></li> 
      </ul>
    </li>
    
   <li> <a class="head">订单管理</a>
     <ul>
       <li>  <a href="order.do" target="rightFrame"> 显示所有订单</a> 	</li>
     </ul>
   </li>
   
   
   
  </ul>
</div>
</body>
</html>
