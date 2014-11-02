<%-- 
    Document   : index
    Created on : 01/11/2014, 23:14:35
    Author     : kurt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fusion Charts</title>
        <script type="text/javascript" src="fusioncharts/js/fusioncharts.js"></script>
        <script type="text/javascript" src="fusioncharts/js/themes/fusioncharts.theme.zune.js"></script>
    </head>
    <body>
        <div id="chartContainer">O gráfico será criado aqui!</div>
        <script type="text/javascript">
            FusionCharts.ready(function() {
                 var chart = new FusionCharts({
                    type: "column2d",
                    renderAt: "chartContainer",
                    width: "500",
                    height: "300",
                    dataFormat: "json",
                    dataSource: {
                        "chart": {
                            "caption": "Monthly revenue for last year",
                            "subCaption": "Harry's SuperMart",
                            "xAxisName": "Month",
                            "yAxisName": "Revenues (In USD)",
                            "theme": "zune"
                        },
                        "data": [
                            {
                                "label": "Jan",
                                "value": "420000"
                            },
                            {
                                "label": "Feb",
                                "value": "810000"
                            },
                            {
                                "label": "Mar",
                                "value": "720000"
                            },
                            {
                                "label": "Apr",
                                "value": "550000"
                            },
                            {
                                "label": "May",
                                "value": "910000"
                            },
                            {
                                "label": "Jun",
                                "value": "510000"
                            },
                            {
                                "label": "Jul",
                                "value": "680000"
                            },
                            {
                                "label": "Aug",
                                "value": "620000"
                            },
                            {
                                "label": "Sep",
                                "value": "610000"
                            },
                            {
                                "label": "Oct",
                                "value": "490000"
                            },
                            {
                                "label": "Nov",
                                "value": "900000"
                            },
                            {
                                "label": "Dec",
                                "value": "730000"
                            }
                        ]
                    }
                });           
                
                chart.render();
            });
        </script>
    </body>
</html>
