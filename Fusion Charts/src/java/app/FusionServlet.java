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
        
        Datasource ds = new Column2dExemploDS(request.getServletContext());
        ds.setCaption("Monthly revenue for last year");
        ds.setSubCaption("Harry's SuperMart");
        ds.setxAxisName("Month");
        ds.setyAxisName("Revenues (In USD)");
        ds.setTheme("zune");
        chart.setDatasource(ds);
        
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
