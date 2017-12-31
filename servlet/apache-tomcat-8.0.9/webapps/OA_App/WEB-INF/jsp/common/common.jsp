<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <!-- 引入常用标签 -->
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@ taglib prefix="s" uri="/struts-tags"%>
   
   <!-- 给项目取别名 -->
   <c:set value="${pageContext.request.contextPath}" var="ctx"></c:set>
  
   <script type="text/javascript" src="${ctx}/js/jquery.js"></script>
   