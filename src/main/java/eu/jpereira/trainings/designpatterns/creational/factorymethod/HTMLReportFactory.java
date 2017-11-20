package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class HTMLReportFactory implements ReportFactory {

    HTMLReport htmlreport;
    ReportData data;

    public HTMLReportFactory(ReportData data) {
        this.data = data;
    }

    @Override
    public Report createReport() {
        htmlreport = new HTMLReport();
        htmlreport.generateReport(data);
        return htmlreport;
    }
}
