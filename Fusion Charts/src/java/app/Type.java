package app;

/**
 *
 * @author kurt
 */
public enum Type {

    COLUMN_2D("column2d", "Coluna 2D");

    private final String name;
    private final String chartType;

    private Type(String name, String chartType) {
        this.name = name;
        this.chartType = chartType;
    }

    public String getName() {
        return name;
    }

    public String getChartType() {
        return chartType;
    }
        
}
