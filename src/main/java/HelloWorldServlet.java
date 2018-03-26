import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");

        if (req.getParameterMap().containsKey("name")){
            out.println("<h1 style=\"font-family: cursive;\">Hello, " + name + "!</h1>");
        }
        else{
            out.println("<h1 style=\"font-family: fantasy;\">Hello, World!</h1>");
        }
    }
}

//
