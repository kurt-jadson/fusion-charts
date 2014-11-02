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
        <!-- Fusion Charts Javascript's -->
        <script type="text/javascript" src="fusioncharts/js/fusioncharts.js"></script>
        <script type="text/javascript" src="fusioncharts/js/themes/fusioncharts.theme.zune.js"></script>
        <!-- Highlight -->
        <link rel="stylesheet" href="highlight/styles/obsidian.css">
        <script src="highlight/highlight.pack.js"></script>
        <script type="text/javascript">hljs.initHighlightingOnLoad();</script>
        <!-- Estilos da página -->
        <style>
            .centro {
                margin: 0 auto;
                width: 1024px;
            }
            .meio {
                display: inline-block;
                vertical-align: top;
                width: 508px;
            }
            pre {
                margin: 0;
            }
            code.hljs {
                padding: 2px;
                padding-left: 10px;
                margin: 0;
                padding-bottom: 25px;
            }
        </style>
    </head>
    <body>
        <div class="centro">
            <div style="text-align: center; text-transform: uppercase; text-decoration: underline;">
                Exemplo de gráfico de ${chart.type.chartType}
            </div>
            <div class="meio" id="chartContainer">O gráfico será criado aqui!</div>
            <div class="meio">
                <pre>
                    <code class="javascript">
FusionCharts.ready(function() {
    var chart = new FusionCharts({
        type: "${chart.type.name}",
        renderAt: "chartContainer",
        width: "500",
        height: "300",
        dataFormat: "json", 
        dataSource: {
            "chart": {
                ${chart.datasource.chart}
            },
            "data": 
            ${chart.datasource.data}
        }
    });                    

    chart.render();
});
                    </code>
                </pre>
            </div>
        </div>
        <script type="text/javascript">
            FusionCharts.ready(function() {
                var chart = new FusionCharts({
                    type: "${chart.type.name}",
                    renderAt: "chartContainer",
                    width: "450",
                    height: "300",
                    dataFormat: "json",
                    dataSource: {
                        "chart": {
                            ${chart.datasource.chart}
                        },
                        "data": ${chart.datasource.data}
                    }
                });

                chart.render();
            });
        </script>
    </body>
</html>
