package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class JSONReportFactory implements ReportFactory {

    ReportData data;
    JSONReport JSONreport;
    public JSONReportFactory(ReportData data){
        this.data = data;
    }
    @Override
    public Report createReport() {
        JSONreport = new JSONReport();
        JSONreport.generateReport(data);
        return JSONreport;
    }
}
