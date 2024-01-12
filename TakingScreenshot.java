package yatra;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakingScreenshot extends TripPackageAutomation {
	public void screenshot() throws IOException {
		
		//Capture the screen shot of the browser window
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\2303547\\eclipse-workspace\\MiniProject\\screenshots\\ss.png"));
		
		
		
	}

}
