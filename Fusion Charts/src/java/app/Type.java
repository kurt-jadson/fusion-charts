package app;

/**
 *
 * @author kurt
 */
public enum Type {

    COLUMN_2D("column2d", "Coluna 2D"),
    MS_COLUMN_2D("mscolumn2d", "Coluna Multisérie 2D"),
    STACKED_COLUMN_2D("stackedcolumn2d", "Colunas Empilhadas 2D"),
    MS_COMBI_2D("mscombi2d", "Multisérie Combinado 2D"),
    COLUMN_3D("column3d", "Coluna 3D"),
    PIE_2D("pie2d", "Pizza 2D");

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
