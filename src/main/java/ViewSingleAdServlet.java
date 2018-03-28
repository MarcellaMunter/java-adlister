import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ViewAd", urlPatterns = "/show")
public class ViewSingleAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.getRequestDispatcher("/ads/show.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        // Pass all of the ads to the jsp
        List<Ad> ad = DaoFactory.getAdsDao().all();
        // Get the selected ad id via parameters
        String adId = request.getParameter("ad");
        // Pass the selected ad id to the jsp
        request.setAttribute("ad", adId);
        request.getRequestDispatcher("/ads/show.jsp").forward(request, response);
    }
}
