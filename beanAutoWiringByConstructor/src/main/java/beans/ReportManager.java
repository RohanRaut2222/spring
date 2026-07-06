package beans;

public class ReportManager
{
	private int pages;
	private ReportCreator reportCreator;
	
	public ReportManager(int pages, ReportCreator reportCreator)
	{
		this.pages = pages;
		this.reportCreator =reportCreator;
	}
	
	public void generateReport()
	{
		reportCreator.createReport(pages);
	}
}

