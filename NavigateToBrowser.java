package yatra;

import java.io.IOException;

import org.openqa.selenium.By;

public class NavigateToBrowser extends TripPackageAutomation {
	
	public void navigation() throws IOException {
		//Opening "Yatra.com" after initiating the driver
		String file=System.getProperty("user.dir")+"\\Test_Data\\data.xlsx";
		String baseURL = ExcelUtils.getCellData(file, "Sheet1", 0, 0);
				
		
		driver.get(baseURL);
        		
	}
	
	
	public void offers() {
		//Find Offers and click on it
		driver.findElement(By.xpath("//a[@title='Offers']")).click();
	}

}
