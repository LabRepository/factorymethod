package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class PDFReportFactory implements ReportFactory {

    PDFReport PDFreport;
    ReportData data;
    public PDFReportFactory(ReportData data){
        this.data = data;
    }
    @Override
    public Report createReport() {
        PDFreport = new PDFReport();
        PDFreport.generateReport(data);
        return PDFreport;
    }
}
