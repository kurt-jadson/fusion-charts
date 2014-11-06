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
        <script type="text/javascript" src="/fusion/fusioncharts/js/fusioncharts.js"></script>
        <script type="text/javascript" src="/fusion/fusioncharts/js/themes/fusioncharts.theme.zune.js"></script>
        <!-- Highlight -->
        <link rel="stylesheet" href="/fusion/highlight/styles/obsidian.css">
        <script src="/fusion/highlight/highlight.pack.js"></script>
        <script type="text/javascript">hljs.initHighlightingOnLoad();</script>
        <!-- Estilos da página -->
        <link href="/fusion/assets/estilo.css" type="text/css" rel="stylesheet">
    </head>
    <body>
        <div class="centro">
            <div class="titulo">Exemplo de gráfico de ${chart.type.chartType}</div>
            <div class="meio" id="chartContainer">O gráfico será criado aqui!</div>
            <div class="meio">
                <pre>
                    <code class="javascript">
                        <jsp:include page="fusionchart.jsp" />
                    </code>
                </pre>
            </div>
        </div>
        <script type="text/javascript">
            <jsp:include page="fusionchart.jsp" />
        </script>
        <footer>
            <div class="rodape">
                <ul>
                    <li><a href="column2d">Coluna 2D</a></li>
                    <li> | </li>
                    <li><a href="mscolumn2d">Colunas Multisérie 2D</a></li>
                    <li> | </li>
                    <li><a href="stackedcolumn2d">Colunas Empilhadas 2D</a></li>
                    <li> | </li>
                    <li><a href="mscombi2d">Multisérie Combinado 2D</a></li>
                    <li> | </li>
                    <li><a href="column3d">Coluna 3D</a></li>
                    <li> | </li>
                    <li><a href="pie2d">Pizza 2D</a></li>
                </ul>
            </div>
        </footer>
    </body>
</html>
