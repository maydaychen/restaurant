package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tongji_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>新增菜谱</title>\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html;charset=utf-8\">\r\n");
      out.write("\t\t<link href=\"common/css.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"scripts/validator.js\"></script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"scripts/datepicker/WdatePicker.js\"></script> \r\n");
      out.write("\t</head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("table td {\r\n");
      out.write("\tpadding-bottom: 2px;\r\n");
      out.write("\tpadding-left: 4px;\r\n");
      out.write("\tpadding-right: 4px;\r\n");
      out.write("\tpadding-top: 4px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tborder-bottom: #c7c7c7 1px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tbackground: url('images/30.gif') repeat-x 0px 0px;\r\n");
      out.write("\tbackground-color: #f8f8f8;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loglist {\r\n");
      out.write("\twidth: 90%;\r\n");
      out.write("\tmargin-top: 8px;\r\n");
      out.write("\tmargin-left: 50px;\r\n");
      out.write("\tpadding-bottom: 1px;\r\n");
      out.write("\tborder-bottom: #c7c7c7 1px solid;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".list {\r\n");
      out.write("\tcursor: default;\r\n");
      out.write("\tmargin-top: 1px;\r\n");
      out.write("\theight: 298px;\r\n");
      out.write("\toverflow-y: auto;\r\n");
      out.write("\toverflow-x: hidden;\r\n");
      out.write("\tscrollbar-shadow-color: #ffffff;\r\n");
      out.write("\tscrollbar-highlight-color: #ffffff;\r\n");
      out.write("\tscrollbar-face-color: #d9d9d9;\r\n");
      out.write("\tscrollbar-3dlight-color: #d9d9d9;\r\n");
      out.write("\tscrollbar-darkshadow-color: #d9d9d9;\r\n");
      out.write("\tscrollbar-track-color: #f6f6f6;\r\n");
      out.write("\tscrollbar-arrow-color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("  \r\n");
      out.write("\t\t<div class=\"loglist\">\r\n");
      out.write("\t\t\t\t<table width=\"90%\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t 开始日期\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"70%\"> \r\n");
      out.write("\t\t\t\t\t        \t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${startDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr> \r\n");
      out.write("\t \t \t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td  width=\"20%\">\r\n");
      out.write("\t\t\t\t\t\t\t截止日期：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td  width=\"70%\">\r\n");
      out.write("\t\t\t\t\t        \t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${endDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t\t<h3> 营业额  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sum_price}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" 元</h3>&nbsp; \r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t \r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction goSubmit(){\r\n");
      out.write("\t\t if(!Validator.Validate(form1,1))\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t form1.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
