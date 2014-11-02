package app;

import datasources.Column2dExemploDS;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kurt
 */
@WebServlet(urlPatterns = {"/charts"})
public class FusionServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        FusionChart chart = new FusionChart();
        chart.setType(Type.COLUMN_2D);
        chart.setDatasource(new Column2dExemploDS());
        
        request.setAttribute("chart", chart);
        request.getRequestDispatcher("/ficha.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
