FusionCharts.ready(function() {
    var chart = new FusionCharts({
        type: "${chart.type.name}",
        renderAt: "chartContainer",
        width: "500",
        height: "300",
        dataFormat: "json", 
        dataSource: ${chart.datasource}
    });                    

    chart.render();
});