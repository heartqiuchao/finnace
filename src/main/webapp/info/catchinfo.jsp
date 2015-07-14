<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
String path = request.getContextPath();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.js"></script>
<script type="text/javascript" src="<%=path%>/js/framework.js"></script>
<link href="<%=path%>/css/import_basic.css" rel="stylesheet" type="text/css"/>
<link href="<%=path%>/oa/css/skins/sky/import_skin.css" rel="stylesheet" type="text/css" themeColor="blue"/>
<!--框架必需end-->
<script src="<%=path%>/js/form/validationEngine-cn.js" type="text/javascript"></script>
<script src="<%=path%>/js/form/validationEngine.js" type="text/javascript"></script>
<script src="<%=path%>/js/menu/contextmenu.js" type="text/javascript"></script>  
<script type="text/javascript" src="<%=path%>/js/tree/stree/stree.js"></script>
<script language="JavaScript" src="<%=path%>/js/form/datePicker/WdatePicker.js"></script>
<link href="<%=path%>/js/tree/stree/stree.css" rel="stylesheet" type="text/css"/>
<title>Insert title here</title>
</head>
<body>
	<form name="catchform" id="catchform" action="catchinfo!catchWeb.action" target="frmright" method="post" >
	
	start year:<select name="starty" id="starty"></select>


	end year:<select name="endy" id="endy"></select>
	
	area:<select name="area">
	<option value="all">全部信息表</option>
	<option value="cmbi">公司基本信息表</option>
	<option value="cmid">公司编码表</option>
	<option value="cmlisgpid">公司上市股票编码表</option>
	<option value="liscmasslia">上市公司资产负债表公司编码表</option>
	<option value="liscmcbbi">上市公司财报基本信息表</option>
	<option value="liscmcf">上市公司现金流量表</option>
	<option value="liscmgborg">上市公司股本结构表</option>
	<option value="liscmpro">上市公司利润表</option>
	<option value="liscmttgd">上市公司前十大股东表</option>
	</select>
	
	<input type="submit" value="开始更新">
	</form>
	<script type="text/javascript">
		var start=document.getElementById("starty");
		var end=document.getElementById("endy")
		for(var i=2008; i<=new Date().getFullYear();i++) {
			start.add(new Option(i,i));	
			end.add(new Option(i,i));
		}
		start.option[0].selected=true;
		end.option[i].selected=true;
	</script>
</body>

</html>