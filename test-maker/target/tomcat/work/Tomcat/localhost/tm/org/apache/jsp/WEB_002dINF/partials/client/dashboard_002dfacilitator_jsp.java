/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-08 15:16:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.client;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_002dfacilitator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("<div role=\"tabpanel\">\r\n");
      out.write("    <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("        <li role=\"presentation\" class=\"active\"><a href=\"#task-tab\" role=\"tab\" data-toggle=\"tab\">我的任务概况</a></li>\r\n");
      out.write("        <li role=\"presentation\"><a href=\"#project-tab\" role=\"tab\" data-toggle=\"tab\">项目概况</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <!-- Tab panes -->\r\n");
      out.write("    <div class=\"tab-content\">\r\n");
      out.write("        <div role=\"tabpanel\" class=\"tab-pane fade in active\" id=\"task-tab\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "dashboard-user.jsp", out, false);
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div role=\"tabpanel\" class=\"tab-pane fade\" id=\"project-tab\">\r\n");
      out.write("            <nav class=\"toolbar navbar navbar-default\">\r\n");
      out.write("                <div class=\"collapse navbar-collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <button id=\"send-reminder-btn\" class=\"btn btn-primary navbar-btn-tm\" type=\"button\">发送邮件提醒到期任务</button>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <h3><strong>项目进度</strong></h3>\r\n");
      out.write("                    <div class=\"progress\">\r\n");
      out.write("                        <div id=\"project-progress-bar\" class=\"progress-bar progress-bar-primary progress-bar-striped active\" role=\"progressbar\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\">到期任务</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <table id=\"project-expiring-questions\" class=\"table table-condensed table-striped table-bordered\"></table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
}
