package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Map;
import com.web.order.Order;;

public final class orderList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=gb2312");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>菜谱</title>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=7\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html;charset=gb2312\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 3px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 3px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tcolor: #e1e2e3;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE6 {color: #000000; font-size: 12; }\r\n");
      out.write(".STYLE10 {color: #000000; font-size: 12px; }\r\n");
      out.write(".STYLE19 {\r\n");
      out.write("\tcolor: #344b50;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE21 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #3b6375;\r\n");
      out.write("}\r\n");
      out.write(".STYLE22 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #295568;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"mainbody\">\r\n");
      out.write(" \r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"24\" bgcolor=\"#353c44\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"6%\" height=\"19\" valign=\"bottom\"><div align=\"center\"><img src=\"images/tb.gif\" width=\"14\" height=\"14\" /></div></td>\r\n");
      out.write("                <td width=\"94%\" valign=\"bottom\"> <span class=\"STYLE1\">订单管理</span>  </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td><div align=\"right\"><span class=\"STYLE1\"> \r\n");
      out.write("                 &nbsp;&nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; <span class=\"STYLE1\"> &nbsp;</span></div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#a8c7ce\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"4%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE10\"><div align=\"center\">\r\n");
      out.write("          \t\t序号 \r\n");
      out.write("        </div></td>\r\n");
      out.write("        <td width=\"10%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\"> 订单号 </span></div></td>\r\n");
      out.write("        <td width=\"14%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">  菜名  </span></div></td>\r\n");
      out.write("        <td width=\"8%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\"> 用户 </span></div></td>\r\n");
      out.write("        <td width=\"10%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\"> 下单时间</span></div></td>\r\n");
      out.write("        <td width=\"10%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\"> 备注</span></div></td>\r\n");
      out.write("        <td width=\"10%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\"> 总价格</span></div></td>\r\n");
      out.write("        <td width=\"8%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\"> 账单状态</span></div></td> \r\n");
      out.write("        <td width=\"22%\" height=\"20\" bgcolor=\"d3eaef\" class=\"STYLE6\"><div align=\"center\"><span class=\"STYLE10\">操作</span></div></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

      	List list = (List) request.getAttribute("list") ;
      	Order order = null ;
		for(int i=0; i<list.size(); i++){
			order = (Order) list.get(i) ; 
		
      out.write("\r\n");
      out.write("\t\t      <tr>\r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t        \t<div align=\"center\"> ");
      out.print(i+1);
      out.write("</div>\r\n");
      out.write("\t\t        </td>\r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\"> ");
      out.print(order.getId());
      out.write(" </div></td>\r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\"> ");
      out.print(order.getDesc());
      out.write(" </div></td>\r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\"> ");
      out.print(order.getSeat());
      out.write("  </div></td>\r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\"> ");
      out.print(order.getOrder_date());
      out.write(" </div></td> \t\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\"> ");
      out.print(order.beizhu);
      out.write(" </div></td> \t\r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\"> ");
      out.print(order.price);
      out.write(" </div></td> \t\t\r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\" class=\"STYLE19\"><div align=\"center\"> ");
      out.print(order.state);
      out.write(" </div></td> \t\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t        <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\" class=\"STYLE21\">  \r\n");
      out.write("\t\t         \t\t<a href=\"order.do?method=update&id=");
      out.print(order.getId());
      out.write("&state=1\">结账</a>   \r\n");
      out.write("\t\t         \t\t<a href=\"order.do?method=update&id=");
      out.print(order.getId());
      out.write("&state=0\">不结账</a>   \r\n");
      out.write("\t\t         \t\t<a href=\"order.do?method=del&id=");
      out.print(order.getId());
      out.write("\"> 删除</a>  </div>\r\n");
      out.write("\t\t         </td>\r\n");
      out.write("\t\t      </tr>\r\n");
      out.write("\t");

		}
	 
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
