package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/commons/taglibs.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>餐饮管理系统后台</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/js.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

if(request.getAttribute("s") != null){


      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\talert('用户名或者密码错误!');\r\n");
      out.write("</script>\r\n");

}

      out.write("\r\n");
      out.write("<div id=\"top\"> </div>\r\n");
      out.write("<form id=\"LogonForm\" method=\"post\" action=\"login.do\"  >\r\n");
      out.write("  <div id=\"center\">\r\n");
      out.write("    <div id=\"center_left\"></div>\r\n");
      out.write("    <div id=\"center_middle\">\r\n");
      out.write("      <div class=\"user\">\r\n");
      out.write("        <label>用户名：\r\n");
      out.write(" \t\t\t\t<input type='text' name='name' dataType=\"Require\" msg=\"不能为空\">\r\n");
      out.write("        </label>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"user\">\r\n");
      out.write("        <label>密　码：\r\n");
      out.write("\t\t\t<input type='password' name='password' dataType=\"Require\" msg=\"不能为空\">\r\n");
      out.write("\t\t\t<input type='hidden' name='type'  value=\"1\" >\r\n");
      out.write("        </label>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"center_middle_right\"></div>\r\n");
      out.write("    <div id=\"center_submit\">\r\n");
      out.write("      <div class=\"button\">\r\n");
      out.write("\t\t\t\t<img src=\"images/dl.gif\" width=\"57\" height=\"20\" onclick=\"form_submit()\" > \r\n");
      out.write("\t  </div>\r\n");
      out.write("      <div class=\"button\"> \r\n");
      out.write("\t\t\t<img src=\"images/cz.gif\" width=\"57\" height=\"20\" onclick=\"form_reset()\">\r\n");
      out.write("\t  </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"center_right\"></div>\r\n");
      out.write("  </div>\r\n");
      out.write("</form>\r\n");
      out.write("<div id=\"footer\"></div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction form_submit(){\r\n");
      out.write(" \r\n");
      out.write("\t\t\tLogonForm.submit(); \t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction form_reset(){\r\n");
      out.write("\t\tLogonForm.reset();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /commons/taglibs.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /commons/taglibs.jsp(5,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
