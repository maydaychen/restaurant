package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/chili-1.7.pack.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.dimensions.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.accordion.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tjQuery().ready(function(){\r\n");
      out.write("\t\tjQuery('#navigation').accordion({\r\n");
      out.write("\t\t\theader: '.head',\r\n");
      out.write("\t\t\tnavigation1: true, \r\n");
      out.write("\t\t\tevent: 'click',\r\n");
      out.write("\t\t\tfillSpace: true,\r\n");
      out.write("\t\t\tanimated: 'bounceslide'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("#navigation {\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("\twidth:147px;\r\n");
      out.write("}\r\n");
      out.write("#navigation a.head {\r\n");
      out.write("\tcursor:pointer;\r\n");
      out.write("\tbackground:url(images/main_34.gif) no-repeat scroll;\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tfont-weight:bold;\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:5px 0 5px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\ttext-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("#navigation ul {\r\n");
      out.write("\tborder-width:0px;\r\n");
      out.write("\tmargin:0px;\r\n");
      out.write("\tpadding:0px;\r\n");
      out.write("\ttext-indent:0px;\r\n");
      out.write("}\r\n");
      out.write("#navigation li {\r\n");
      out.write("\tlist-style:none; display:inline;\r\n");
      out.write("}\r\n");
      out.write("#navigation li li a {\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tfont-size:12px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tpadding:3px;\r\n");
      out.write("}\r\n");
      out.write("#navigation li li a:hover {\r\n");
      out.write("\tbackground:url(images/tab_bg.gif) repeat-x;\r\n");
      out.write("\t\tborder:solid 1px #adb9c2;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div  style=\"height:100%;\">\r\n");
      out.write("  <ul id=\"navigation\">\r\n");
      out.write("  \r\n");
      out.write("  \t<li> <a class=\"head\">用户管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li> <a href=\"user.do?method=list\" target=\"rightFrame\"> 用户管理</a>  </li>\r\n");
      out.write("        <li> <a href=\"user_add.jsp\" target=\"rightFrame\"> 新增用户</a>    </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("     \r\n");
      out.write("  \t<li> <a class=\"head\"> 注册用户管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li> <a href=\"user_tb.do?method=list\" target=\"rightFrame\"> 注册用户管理</a>  </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t<li> <a class=\"head\"> 类别管理</a>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li> <a href=\"type.do?method=list\" target=\"rightFrame\"> 类别管理</a>  </li>\r\n");
      out.write("        <li> <a href=\"type_add.jsp\" target=\"rightFrame\"> 新增类别</a>    </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("    <li> <a class=\"head\">菜谱管理</a>\r\n");
      out.write("      <ul> \r\n");
      out.write("        <li> <a href=\"foodList.do\" target=\"rightFrame\"> 显示所有</a>  </li>\r\n");
      out.write("        <li> <a href=\"foodList.do?method=goAdd\" target=\"rightFrame\"> 新增菜谱</a>    </li> \r\n");
      out.write("      </ul>\r\n");
      out.write("    </li>\r\n");
      out.write("    \r\n");
      out.write("   <li> <a class=\"head\">订单管理</a>\r\n");
      out.write("     <ul>\r\n");
      out.write("       <li>  <a href=\"order.do\" target=\"rightFrame\"> 显示所有订单</a> \t</li>\r\n");
      out.write("     </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("  </ul>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
}
