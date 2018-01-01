<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>OA办公管理系统-模块管理</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache" />
	<meta http-equiv="cache-control" content="no-cache" />
	<meta http-equiv="expires" content="0" />    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
	<meta http-equiv="description" content="This is my page" />
	<link href="${ctx}/fkjava.ico" rel="shortcut icon" type="image/x-icon" />
	<script type="text/javascript">
        
		
	</script>
</head>
<body style="overflow: hidden;width: 100%;height: 100%;">
	<!-- 工具按钮区 -->
	<table>
		<tr>
			<td><input type="button" value="添加" id="addModule"/></td>
			<td><input type="button" value="修改" id="updateModule"/></td>
			<td><input type="button" value="删除" id="deleteModule"/>
			    &nbsp;<font color="red">${tip}</font></td>
		</tr>
	</table>
	
	<!-- 数据展示区 -->
	<table width="100%" cellpadding="5" cellspacing="1" style="background-image: url('${ctx}/images/system/t2.jpg');">
		<tr>
			<th width="60px;"><input type="checkbox" id="checkAll"/>全部</th>
			<th>编号</th>
			<th>名称</th>
			<th>备注</th>
			<th>链接</th>
			<th>操作</th>
			<th>创建日期</th>
			<th>创建人</th>
			<th>修改日期</th>
			<th>修改人</th>
		</tr>
		<tbody style="background-color: #FFFFFF;">
			<s:iterator value="modules" status="stat">
				<tr id="data_${stat.index}">
					<td><input type="checkbox" id="box_${stat.index}" value="${code}"/>${stat.count}</td>
					<td><s:property value="code"/></td>
					<td><s:property value="name"/></td>
					<td><s:property value="remark"/></td>
					<td><s:property value="url"/></td>
					<td><a href="${ctx}/admin/identity/selectModule.jspx?parentCode=${code}">查看下级</a></td>
					<td><s:date name="createDate" format="yyyy-MM-dd HH:mm:ss"/></td>
					<td><s:property value="creater.name"/></td>
					<td><s:date name="modifyDate" format="yyyy-MM-dd HH:mm:ss"/></td>
					<td><s:property value="modifier.name"/></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	
	<!-- 分页标签区 -->
	<fk:page pageIndex="${pageModel.pageIndex}" 
				  pageSize="${pageModel.pageSize}" 
				  recordCount="${pageModel.recordCount}" 
				  submitUrl="${ctx}/admin/identity/selectModule.jspx?pageModel.pageIndex={0}&parentCode=${parentCode}"/>
	
	<!-- div作为弹出窗口 -->
    <div id="divDialog" style="overflow: hidden;">
		<iframe id="iframe" frameborder="0" width="100%" height="100%" style="display:none;"></iframe>
	</div>
</body>
</html>