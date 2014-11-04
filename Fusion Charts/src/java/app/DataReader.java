package app;

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
public class DataReader {

    private static final Logger logger = Logger.getLogger(DataReader.class.getName());
    private final ServletContext servletContext;

    public DataReader(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
    
    public String getData(String path) {
        String realPath = servletContext.getRealPath(path);
        File file = new File(realPath);
        
        try(Scanner scan = new Scanner(file)) {
            StringBuilder sb = new StringBuilder();
            
            String nl = "";
            scan.nextLine();
            while(scan.hasNextLine()) {
                sb.append(nl).append(scan.nextLine());
                nl = "\n\t";
            }
            
            return sb.toString();
        } catch (FileNotFoundException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        
        return "";
    }    
    
}
