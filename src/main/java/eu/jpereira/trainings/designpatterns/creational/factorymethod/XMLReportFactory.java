package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class XMLReportFactory implements ReportFactory {
    ReportData data;
    XMLReport XMLreport;
    public XMLReportFactory(ReportData data){
        this.data = data;
    }
    @Override
    public Report createReport() {
        XMLreport = new XMLReport();
        XMLreport.generateReport(data);
        return XMLreport;
    }
}
