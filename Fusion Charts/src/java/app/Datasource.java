package app;

import javax.servlet.ServletContext;

/**
 *
 * @author kurt
 */
public abstract class Datasource {

    private final ServletContext servletContext;
    private String caption;
    private String subCaption;
    private String xAxisName;
    private String yAxisName;
    private String theme;
    
    public Datasource(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getSubCaption() {
        return subCaption;
    }

    public void setSubCaption(String subCaption) {
        this.subCaption = subCaption;
    }

    public String getxAxisName() {
        return xAxisName;
    }

    public void setxAxisName(String xAxisName) {
        this.xAxisName = xAxisName;
    }

    public String getyAxisName() {
        return yAxisName;
    }

    public void setyAxisName(String yAxisName) {
        this.yAxisName = yAxisName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public ServletContext getServletContext() {
        return servletContext;
    }
    
    public String getChart() {
        return String.format("\"caption\": \"%s\",\n"
                + "                \"subCaption\": \"%s\",\n"
                + "                \"xAxisName\": \"%s\",\n"
                + "                \"yAxisName\": \"%s\",\n"
                + "                \"theme\": \"%s\"",
                caption, subCaption, xAxisName, yAxisName, theme);
    }

    public abstract String getData();

}
