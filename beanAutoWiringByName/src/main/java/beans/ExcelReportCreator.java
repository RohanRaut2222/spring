package beans;

public class ExcelReportCreator implements ReportCreator{

	@Override
	public void createReport(int pages) {
		
		System.out.println("ExcelReport Generation for "+ pages +" pages.");
		
	}

}

