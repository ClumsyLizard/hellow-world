import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/charecterUpdate")
public class charecterUpdate extends HttpServlet {
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Fight Result";
        String docType ="<!DOCTYPE html>\n";
        out.println(docType
                  + "<html>\n"
                  + "<head><title>" + title + "</title></head>\n"
                  + "<body bgcolor=\"#f0f0f0\">\n"
                  + "<h1 align=\"center\">" + title + "</h1>\n"
                  + makeResultString("name", true, request) + makeResultString("name2", false, request)
                  + makeResultString("hp", true, request) + makeResultString("hp2", false, request)
                  + makeResultString("str", true, request) + makeResultString("str2", false, request)
                  + makeResultString("dex", true, request) + makeResultString("dex2", false, request)
                  + makeResultString("str", true, request) + makeResultString("str2", false, request)
                  + makeResultString("magic", true, request) + makeResultString("magic2", false, request)
                  + "</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processGet(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request,response);
    }

    protected String makeResultString(String type, boolean displayOnLeft, HttpServletRequest request){
      //type :String: value type, such as name, hp.etc
      //displayOnLeft :Bool: show text on left of display or right
      //getMsg : msg get from html submit
      String textWidth;
      String endLine;
      var getMsg = request.getParameter(type);
      if (displayOnLeft == true){
        textWidth = "50px";
        endLine = "";
      }else{
        textWidth = "100px";
        endLine = "\n";
      }
      return "<p><span style=\"display:inline-block;width:"
                + textWidth
                + ";text-align:left;\">"
                + type
                + "</span>:&nbsp;"
                + getMsg
                + endLine
                + "</p>";
    }
}
