package yatra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Holidays extends TripPackageAutomation {
	public void navigateToHolidays() throws InterruptedException, IOException {
		//Navigate to Holiday tab and click on it
		driver.findElement(By.xpath("//ul[@id='offer-box-shadow']/li[4]/a")).click();
		Thread.sleep(2000);
		
		//Store all the view details button in a list
		List<WebElement> buttons = driver.findElements(By.xpath("//span[@class='view-btn flR anim']"));
		//Return the parent window id
		String parent=driver.getWindowHandle();
		
		//Click on view details button of packages
		for(int i = 1; i < 5; i ++) {
			
			buttons.get(i).click();
			Thread.sleep(5000);
			//Pop up window open New Tab to transfer control of driver to new window
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(i));
			//Print the 5 package names and their respective prices
			String pack_name=driver.findElement(By.xpath("//div[@class='flt-cntr']/div/h1/span")).getText();
			String price= driver.findElement(By.xpath("//div[@class='flt-cntr']/div/div/span/span/span")).getText();
			Thread.sleep(5000);
			System.out.print(pack_name+"- ");
			System.out.println(price);
			String file1 =System.getProperty("user.dir")+"\\Test_Data\\data.xlsx";
			ExcelUtils.setCellData(file1, "Sheet2", i, pack_name, price);
			Thread.sleep(2000);
			driver.switchTo().window(parent);
			}

	}
}
