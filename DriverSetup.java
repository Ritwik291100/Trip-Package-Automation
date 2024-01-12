package yatra;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;



public class DriverSetup {

	public static WebDriver driver;


	//To call different browsers

	public static void driverSetup(int choice)

	{

		switch(choice) {

		case 1:

			driver = new ChromeDriver();

			break;

		case 2:

			driver = new EdgeDriver();

			break;

		default:

			System.out.println("Please Select The Correct Choice");

		}


		//To maximize the Browser Window

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	//To close the Browser Window
	public static void closeBrowser()

	{

		driver.quit();

	}
 


}
