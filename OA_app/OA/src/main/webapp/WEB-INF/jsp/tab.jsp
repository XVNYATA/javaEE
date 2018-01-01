<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<title>办公管理系统</title>
	<meta httT-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="Cache-Control" content="no-cache, must-revalidate"/>
	<meta name="Keywords" content="keyword1,keyword2,keyword3"/>
	<meta name="Description" content="网页信息的描述" />
	<meta name="Author" content="gdcct.gov.cn" />
	<meta name="Copyright" content="All Rights Reserved." />
	<link href="/pujin.ico" rel="shortcut icon" type="image/x-icon" />
	<link rel="stylesheet" type="text/css" href="${ctx}/js/tabpanel/TabPanel.css"/>
	<!-- 引入选项卡 -->
	<script type="text/javascript" src="${ctx}/js/tabpanel/TabPanel.js"></script>
	
  	<style type="text/css">
		html, body {
		width : 100%;
		height : 100%;
		padding : 0;
		margin : 0;
		overflow : hidden;
	</style>
	<script type="text/javascript" >
		$(function(){
			//创建选项卡
			window.tabpanel=new TabPanel({
				renderTo:"tab",//承载容器
				width:"100%",
				height:"100%",
				active:0,//激活第一个
				maxLength:8,//最大选项卡数量
				autoResizable:true,
				items:[{
					id:"tab_1",//id(不能重复)
					title:"用户信息",//标题
					html:"<iframe src='${ctx}/user/showUpdateSelf' width='100%' height='100%' frameborder=0></iframe>",//内容
					closable:false//是否可以关闭(不能关闭)
				}]
			});
		});
		
		//定义添加标签页的函数
		var addTab=function(id,title,url){
			tabpanel.addTab({
				id:id,//id不能重复
				title:title,//标题
				html:'<iframe width="100%" height="100%" src="'+url+'"frameborder="0"></iframe>'
			});
		};
		
		function updateUserPass(){
			$("#divDialog").dialog({
				title : "密码修改", // 标题
				cls : "easyui-dialog", // class
				width : 580, // 宽度
				height : 320, // 高度
				maximizable : true, // 最大化
				minimizable : false, // 最小化
				collapsible : true, // 可伸缩
				modal : true, // 模态窗口
			
			});
			//通过iframe引入修改密码页面
			$("#iframe").attr("src","${ctx}/user/showUpdatePass.action").show();
		}
		
	</script>
</head>
<body>
<div id="tab"></div>
<!-- div作为弹出窗口 -->
    <div id="divDialog" style="overflow: hidden;">
		<iframe id="iframe" frameborder="0" width="100%" height="100%" style="display:none;"></iframe>
	</div>
</body>
</html>