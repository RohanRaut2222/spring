package beans;

public class ReportManager
{
	private int pages;
	private ReportCreator reportCreator;
	
	public ReportManager(int pages)
	{
		this.pages = pages;
	}
	
	public void setReportCreator(ReportCreator reportCreator)
	{
		this.reportCreator =reportCreator;
	}
	
	public void generateReport()
	{
		reportCreator.createReport(pages);
	}
}

