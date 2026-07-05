package beans;

public class ExcelReport implements ReportCreator{
	
	public void generateReport(int pages)
	{
		System.out.println("Generating excel report of "+pages+" pages.");
	}

}
