package datasources;

import app.Datasource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;

/**
 *
 * @author kurt
 */
public class Column2dExemploDS extends Datasource {

    public Column2dExemploDS(ServletContext servletContext) {
        super(servletContext);
    }
    
    @Override
    public String getData() {
        String path = getServletContext().getRealPath("/WEB-INF/charts/column2d.js");
        File file = new File(path);
        
        try(Scanner scan = new Scanner(file)) {
            StringBuilder sb = new StringBuilder();
            
            String nl = "";
            while(scan.hasNextLine()) {
                sb.append(nl).append(scan.nextLine());
                nl = "\n\t\t";
            }
            
            return sb.toString();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Column2dExemploDS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "";
    }

}
