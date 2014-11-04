package app;

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
@WebServlet(urlPatterns = {"/charts/*"})
public class FusionServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        DataReader dataReader = new DataReader(request.getServletContext());
        FusionChart chart = new FusionChart();
        String datasource = "";
        
        String uri = request.getRequestURI();
        if (acessou(uri, "column2d")) {
            chart.setType(Type.COLUMN_2D);
            datasource = dataReader.getData("/WEB-INF/charts/column2d.js");
        } else if(acessou(uri, "mscolumn2d")) {
            chart.setType(Type.MS_COLUMN_2D);
            datasource = dataReader.getData("/WEB-INF/charts/mscolumn2d.js");
        } else if(acessou(uri, "stackedcolumn2d")) {
            chart.setType(Type.STACKED_COLUMN_2D);
            datasource = dataReader.getData("/WEB-INF/charts/mscolumn2d.js");
        }
        
        chart.setDatasource(datasource);
        request.setAttribute("chart", chart);
        request.getRequestDispatcher("/ficha.jsp").forward(request, response);
    }
    
    private boolean acessou(String uri, String pagina) {
        String[] parsed = uri.split("/");
        String last = parsed[parsed.length - 1];
        return last.equals(pagina);
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
