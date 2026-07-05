package beans;

public class PdfReportCreator implements ReportCreator{

	@Override
	public void createReport(int pages) {
		
		System.out.println("PdfReport Generation for "+ pages +" pages.");
		
	}
}


