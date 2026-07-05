package beans;

public class ReportGenerator {
	
	ReportCreator reportCreator;
	int pages;
	
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	public ReportGenerator(ReportCreator reportCreator)
	{
		this.reportCreator = reportCreator;
	}
	
	public void setReportCreator(ReportCreator reportCreator)
	{
		this.reportCreator = reportCreator;
	}
	
	public void generateReport()
	{
		this.reportCreator.generateReport(pages);
	}

}
