/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-09-05 06:00:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/common/common.jsp", Long.valueOf(1473048097273L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("   <!-- 引入常用标签 -->\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <!-- 给项目取别名 -->\r\n");
      out.write("   ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  \r\n");
      out.write("   <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("<!--    引入jqueryEasyUi样式以及js文件 -->\r\n");
      out.write("   \t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jqueryEasyUi/themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jqueryEasyUi/themes/icon.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jqueryEasyUi/jquery.easyui.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jqueryEasyUi/locale/easyui-lang-zh_CN.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("  <head>\r\n");
      out.write("  \t<title>办公管理系统</title>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\"/>\r\n");
      out.write("\t<meta http-equiv=\"Cache-Control\" content=\"no-cache, must-revalidate\"/>\r\n");
      out.write("\t<meta name=\"Keywords\" content=\"keyword1,keyword2,keyword3\"/>\r\n");
      out.write("\t<meta name=\"Description\" content=\"网页信息的描述\" />\r\n");
      out.write("\t<meta name=\"Author\" content=\"gdcct.gov.cn\" />\r\n");
      out.write("\t<meta name=\"Copyright\" content=\"All Rights Reserved.\" />\r\n");
      out.write("\t<link href=\"/pujin.ico\" rel=\"shortcut icon\" type=\"image/x-icon\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/common/global.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/fk-timer.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t  $(function(){\r\n");
      out.write("\t\t  //启动定时器\r\n");
      out.write("\t\t  $(\"#time\").timeRun();\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  var tstMain = $(\"#tstMain\",parent.document);\r\n");
      out.write("\t\t  $(\"#nav_title\").toggle(function(){\r\n");
      out.write("\t\t\t  //rows=\"82,*\"\r\n");
      out.write("\t\t\t  tstMain.attr(\"rows\",\"14,*\");\r\n");
      out.write("\t\t\t  $(\"#headtitle\").slideUp(\"slow\");\r\n");
      out.write("\t\t\t  $(\"#img\").attr(\"src\",\"images/system/top_xs.gif\");\r\n");
      out.write("\t\t  },function(){\r\n");
      out.write("\t\t\t  tstMain.attr(\"rows\",\"82,*\");\r\n");
      out.write("\t\t\t  $(\"#headtitle\").slideDown(\"slow\");\r\n");
      out.write("\t\t\t  $(\"#img\").attr(\"src\",\"images/system/top_yc.gif\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t  })\r\n");
      out.write("\t\t  \r\n");
      out.write("\t  })\r\n");
      out.write("\t  \r\n");
      out.write("\t  function exit(){\r\n");
      out.write("\t\t  //用户退出系统   将session以及cookie中的用户信息清除\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  //parent:父级   top:最顶级   \r\n");
      out.write("\t\t  parent.window.location = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/logout.action\";\r\n");
      out.write("\t  }\r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write(" <body class=\"headbody\">\r\n");
      out.write("\t<div class=\"headtitle\" id=\"headtitle\">\r\n");
      out.write("    \t<div class=\"headlogo\"><img src=\"./images/system/logo.gif\" />\r\n");
      out.write("    \t</div>\r\n");
      out.write("        <div class=\"headmenutop\">\r\n");
      out.write("        \t\r\n");
      out.write("        \t<a class=\"headtopout\" title=\"退出系统\" href=\"javascript:void(0);\" onclick=\"exit();\">安全退出</a>\r\n");
      out.write("        \t<a class=\"headtopout\" title=\"密码修改\" href=\"javascript:void(0);\" onclick=\"password();\">密码修改</a>\r\n");
      out.write("\t\t\t<div class=\"titlexx\">\r\n");
      out.write("\t\t\t\t<span style=\"font-size:14px;color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>&nbsp;您好，欢迎使用本系统&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<span id=\"time\" style=\"color:#fff;\"></span>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"yctopdiv\">\r\n");
      out.write("      \t<a href=\"javascript:void(0);\" class=\"t_link\" title=\"隐藏菜单栏\" id=\"nav_title\">\r\n");
      out.write("\t\t<img src=\"./images/system/top_yc.gif\" id=\"img\" onclick=\"ShowNav(this)\"/><!--隐藏时反显示的图片<img src=\"images/top_xs.gif\" />--></a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/common/common.jsp(9,3) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/common/common.jsp(9,3) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/common/common.jsp(9,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
