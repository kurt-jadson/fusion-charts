package datasources;

import app.Datasource;

/**
 *
 * @author kurt
 */
public class Column2dExemploDS extends Datasource {

    @Override
    public String getChart() {
        return "\"caption\": \"Monthly revenue for last year\",\n"
                + "                \"subCaption\": \"Harry's SuperMart\",\n"
                + "                \"xAxisName\": \"Month\",\n"
                + "                \"yAxisName\": \"Revenues (In USD)\",\n"
                + "                \"theme\": \"zune\"";
    }

    @Override
    public String getData() {
        return "{\n                   \"label\": \"Jan\",\n                   \"value\": \"420000\"\n"
                + "                 },{\n                    \"label\": \"Feb\",\n                    \"value\": \"810000\"\n"
                + "                 },{"
                + "\n                    \"label\": \"Mar\",\n                    \"value\": \"720000\"\n"
                + "                 }";
    }

}
