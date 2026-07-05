package beans;

import java.util.random.RandomGenerator;

public class PdfGenerator implements ReportCreator{

	@Override
	public void generateReport(int pages) {
		System.out.println("Generating pdf report of "+pages+" pages.");
	}

}
