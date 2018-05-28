/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Pivotal tc Runtime 3.2.8.RELEASE/8.5.23.A.RELEASE
 * Generated at: 2018-05-28 10:04:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jdbc7;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.net.*;
import lecture1.jdbc7.*;
import lecture1.*;

public final class studentList1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tags/pagination.tag", Long.valueOf(1527430931000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.net");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("lecture1.jdbc7");
    _jspx_imports_packages.add("lecture1");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

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

      out.write('\n');
      out.write('\n');
      out.write('\n');

int currentPage = 1;
int pageSize = 10;

request.setCharacterEncoding("UTF-8");
String pg = request.getParameter("pg");
if (pg != null) currentPage = ParseUtils.parseInt(pg, 1);

String ss = request.getParameter("ss");
String st = request.getParameter("st");
if (ss == null) ss = "0";
if (st == null) st = "";
String stEncoded = URLEncoder.encode(st, "UTF-8");

int recordCount = StudentDAO.count(ss, st);

int lastPage = Math.max(1, (recordCount + pageSize - 1) / pageSize);
if (currentPage > lastPage) currentPage = lastPage;

String od = request.getParameter("od");
if (od == null) od = "0";
List<Student> list = StudentDAO.findAll(currentPage, pageSize, ss, st, od);

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      body { font-family: 굴림체; }\n");
      out.write("      thead th { background-color: #eee; }\n");
      out.write("      tr:hover td { background-color: #ffe; cursor: pointer; }\n");
      out.write("      table.table { margin-top: 5px; }\n");
      out.write("      select[name=od] { margin-right: 20px; }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("<h1>학생목록</h1>\n");
      out.write("\n");
      out.write("<a id=\"createButton\" class=\"btn btn-primary pull-right\" \n");
      out.write("   href=\"studentCreate1.jsp?pg=");
      out.print(currentPage);
      out.write("&ss=");
      out.print(ss);
      out.write("&st=");
      out.print(stEncoded);
      out.write("&od=");
      out.print(od);
      out.write("\">\n");
      out.write("  <i class=\"glyphicon glyphicon-plus\"></i> 학생 등록\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("<form class=\"form-inline\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label>정렬</label>\n");
      out.write("    <select name=\"od\" class=\"form-control\">\n");
      out.write("      <option value=\"0\" ");
      out.print( "0".equals(od) ? "selected" : "" );
      out.write(">등록순서</option>\n");
      out.write("      <option value=\"1\" ");
      out.print( "1".equals(od) ? "selected" : "" );
      out.write(">학과</option>\n");
      out.write("      <option value=\"2\" ");
      out.print( "2".equals(od) ? "selected" : "" );
      out.write(">학년</option>\n");
      out.write("    </select>\n");
      out.write("    <select name=\"ss\" class=\"form-control\">\n");
      out.write("      <option value=\"0\" ");
      out.print( "0".equals(ss) ? "selected" : "" );
      out.write(">전체</option>\n");
      out.write("      <option value=\"1\" ");
      out.print( "1".equals(ss) ? "selected" : "" );
      out.write(">이름</option>\n");
      out.write("      <option value=\"2\" ");
      out.print( "2".equals(ss) ? "selected" : "" );
      out.write(">학과명</option>\n");
      out.write("    </select>\n");
      out.write("    <input type=\"text\" class=\"form-control\" name=\"st\" value=\"");
      out.print( st );
      out.write("\" />\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">조회</button>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<table class=\"table table-bordered table-condensed\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th>id</th>\n");
      out.write("      <th>학번</th>\n");
      out.write("      <th>이름</th>\n");
      out.write("      <th>학과</th>\n");
      out.write("      <th>학년</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    ");
 for (Student student : list) { 
      out.write("\n");
      out.write("      <tr data-url=\"studentEdit1.jsp?id=");
      out.print(student.getId());
      out.write("&pg=");
      out.print(currentPage);
      out.write("&ss=");
      out.print(ss);
      out.write("&st=");
      out.print(stEncoded);
      out.write("&od=");
      out.print(od);
      out.write("\">\n");
      out.write("        <td>");
      out.print( student.getId() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( student.getStudentNumber() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( student.getName() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( student.getDepartmentName() );
      out.write("</td>\n");
      out.write("        <td>");
      out.print( student.getYear() );
      out.write("</td>\n");
      out.write("      </tr>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      //  my:pagination
      org.apache.jsp.tag.web.pagination_tag _jspx_th_my_005fpagination_005f0 = new org.apache.jsp.tag.web.pagination_tag();
      _jsp_getInstanceManager().newInstance(_jspx_th_my_005fpagination_005f0);
      try {
        _jspx_th_my_005fpagination_005f0.setJspContext(_jspx_page_context);
        // /jdbc7/studentList1.jsp(93,0) name = pageSize type = java.lang.Integer reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
        _jspx_th_my_005fpagination_005f0.setPageSize( pageSize );
        // /jdbc7/studentList1.jsp(93,0) name = recordCount type = java.lang.Integer reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
        _jspx_th_my_005fpagination_005f0.setRecordCount( recordCount );
        // /jdbc7/studentList1.jsp(93,0) name = queryStringName type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
        _jspx_th_my_005fpagination_005f0.setQueryStringName("pg");
        _jspx_th_my_005fpagination_005f0.doTag();
      } finally {
        _jsp_getInstanceManager().destroyInstance(_jspx_th_my_005fpagination_005f0);
      }
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("$(\"[data-url]\").click(function() {\n");
      out.write("    var url = $(this).attr(\"data-url\");\n");
      out.write("    location.href = url;\n");
      out.write("})\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
