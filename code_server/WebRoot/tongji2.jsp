<%@ page language="java" pageEncoding="utf-8" %>      
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>新增菜谱</title>
		<%@ include file="/commons/taglibs.jsp"%>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<link href="common/css.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript" src="scripts/validator.js"></script>
<script language="javascript" type="text/javascript" src="scripts/datepicker/WdatePicker.js"></script> 
	</head>
<style type="text/css">
table td {
	padding-bottom: 2px;
	padding-left: 4px;
	padding-right: 4px;
	padding-top: 4px;
	font-size: 12px;
	border-bottom: #c7c7c7 1px solid;
}

body {
	margin: 0;
	font-size: 12px;
	background: url('images/30.gif') repeat-x 0px 0px;
	background-color: #f8f8f8;
}

.loglist {
	width: 90%;
	margin-top: 8px;
	margin-left: 50px;
	padding-bottom: 1px;
	border-bottom: #c7c7c7 1px solid;
}

.list {
	cursor: default;
	margin-top: 1px;
	height: 298px;
	overflow-y: auto;
	overflow-x: hidden;
	scrollbar-shadow-color: #ffffff;
	scrollbar-highlight-color: #ffffff;
	scrollbar-face-color: #d9d9d9;
	scrollbar-3dlight-color: #d9d9d9;
	scrollbar-darkshadow-color: #d9d9d9;
	scrollbar-track-color: #f6f6f6;
	scrollbar-arrow-color: #ffffff;
}
</style>
<body>
 
	
		<form  name="form1" id="form1" action="order.do?method=tongji" method="post"  >
		<div class="loglist">
				<table width="90%" cellspacing="0" cellpadding="0" align="center">
					<tr>
						<td colspan="2">
							<h3> 月营业额 </h3>&nbsp; 
						</td>
					</tr>
					
					<tr align="left">
						<td width="20%">
							 开始日期
						</td>
						<td width="70%"> 
							<input name="type" type="hidden" value="1" /> 
					        	<input name="startDate" type="text"   onClick="WdatePicker({dateFmt:'yyyy-MM'});"  /> 
						</td>
					</tr>
					<tr>
						<td  width="20%">
							截止日期：
						</td>
						<td  width="70%">
					        	<input name="endDate" type="text"  onClick="WdatePicker({dateFmt:'yyyy-MM'});"  /> 
						</td>
					</tr>
				 
	 
				</table>
				<div class="list">
					<table width="90%" border="0" height="20" align="center">
							<tbody>
								<tr>
									<td>
										<input type="button"" value="提交" onclick="goSubmit();"/> &nbsp;&nbsp;&nbsp;&nbsp;
										<input type="button" name="cancel" value="取消" onclick="history.go(-1);" />
									</td>
								</tr>
							</tbody>
					</table>
				</div>
		</div>
	</form>
	
	
<script>
	function goSubmit(){
		 if(!Validator.Validate(form1,1))
				return;
		 form1.submit();
	}
</script>
	
	
</body>

</html>
