package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class data_005fbackup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"scripts/validator.js\"></script>\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\" src=\"scripts/datepicker/WdatePicker.js\"></script> \r\n");
      out.write("<title> 管理 </title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<BODY style=\"BACKGROUND-POSITION-Y: -120px; BACKGROUND-IMAGE: url(images/bg.gif); BACKGROUND-REPEAT: repeat-x\">\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("<DIV> \r\n");
      out.write("\r\n");
      out.write("  <TABLE height=\"100%\" cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\r\n");
      out.write("    <TBODY>\r\n");
      out.write("      <TR   style=\"BACKGROUND-IMAGE: url(images/bg_header.gif); BACKGROUND-REPEAT: repeat-x\"  height=47>\r\n");
      out.write("        <TD width=10><SPAN \r\n");
      out.write("      style=\"FLOAT: left; BACKGROUND-IMAGE: url(images/main_hl.gif); WIDTH: 15px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px\"></SPAN></TD>\r\n");
      out.write("        <TD><SPAN \r\n");
      out.write("      style=\"FLOAT: left; BACKGROUND-IMAGE: url(images/main_hl2.gif); WIDTH: 15px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px\"></SPAN><SPAN \r\n");
      out.write("      style=\"PADDING-RIGHT: 10px; PADDING-LEFT: 10px; FLOAT: left; BACKGROUND-IMAGE: url(images/main_hb.gif); PADDING-BOTTOM: 10px;  PADDING-TOP: 10px; BACKGROUND-REPEAT: repeat-x; HEIGHT: 47px; TEXT-ALIGN: center; 0px: \">数据管理 </SPAN><SPAN \r\n");
      out.write("      style=\"FLOAT: left; BACKGROUND-IMAGE: url(images/main_hr.gif); WIDTH: 60px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px\"></SPAN></TD>\r\n");
      out.write("        <TD \r\n");
      out.write("    style=\"BACKGROUND-POSITION: 50% bottom; BACKGROUND-IMAGE: url(images/main_rc.gif)\" \r\n");
      out.write("    width=10></TD>\r\n");
      out.write("      </TR>\r\n");
      out.write("      <TR>\r\n");
      out.write("        <TD style=\"BACKGROUND-IMAGE: url(images/main_ls.gif)\">&nbsp;</TD>\r\n");
      out.write("        <TD \r\n");
      out.write("    style=\"PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; COLOR: #566984; PADDING-TOP: 10px; BACKGROUND-COLOR: white\" \r\n");
      out.write("    vAlign=top align=middle>\r\n");
      out.write("          <DIV>\r\n");
      out.write("            <TABLE class=gridView id=ctl00_ContentPlaceHolder2_GridView1 \r\n");
      out.write("      style=\"WIDTH: 100%; BORDER-COLLAPSE: collapse\" cellSpacing=0 rules=all \r\n");
      out.write("      border=0>\r\n");
      out.write("              <TBODY>\r\n");
      out.write("              \t\t<tr>\r\n");
      out.write("              \t\t\t<td>\r\n");
      out.write("              \t\t\t<form  name=\"form1\" id=\"form1\" action=\"data.do?method=backup\" method=\"post\"  >\r\n");
      out.write("\t\t\t\t\t\t\t <table width=\"95%\" border=\"0\">    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t  \t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input  type=\"button\" value=\"开始备份\"  onclick=\"doSubmit()\" />  \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\t\t     \r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t\t\t\t</form> \r\n");
      out.write("              \t\t\t</td>\r\n");
      out.write("              \t\t</tr>\t\r\n");
      out.write("              </TBODY>\r\n");
      out.write("            </TABLE>\r\n");
      out.write("          </DIV>\r\n");
      out.write("        </TD>\r\n");
      out.write("        <TD style=\"BACKGROUND-IMAGE: url(images/main_rs.gif)\"></TD>\r\n");
      out.write("      </TR>\r\n");
      out.write("      <TR   style=\"BACKGROUND-IMAGE: url(images/main_fs.gif); BACKGROUND-REPEAT: repeat-x\"   height=10>\r\n");
      out.write("\t        <TD style=\"BACKGROUND-IMAGE: url(images/main_lf.gif)\"></TD>\r\n");
      out.write("\t        <TD style=\"BACKGROUND-IMAGE: url(images/main_fs.gif)\"></TD>\r\n");
      out.write("\t        <TD style=\"BACKGROUND-IMAGE: url(images/main_rf.gif)\"></TD>\r\n");
      out.write("      </TR>\r\n");
      out.write("    </TBODY>\r\n");
      out.write("  </TABLE>\r\n");
      out.write("   \r\n");
      out.write("  \r\n");
      out.write("</DIV> \r\n");
      out.write(" \r\n");
      out.write("<script type=\"text/javascript\"> \r\n");
      out.write("\r\n");
      out.write(" function doSubmit()  { \r\n");
      out.write("\t form1.submit();\r\n");
      out.write(" }\r\n");
      out.write("  \r\n");
      out.write("</script>\r\n");
      out.write("  \r\n");
      out.write("\t\t\t\r\n");
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
}
