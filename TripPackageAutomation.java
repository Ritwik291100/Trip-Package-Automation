package yatra;
import java.util.Scanner;

public class TripPackageAutomation extends DriverSetup {
	

	
	public static void main(String args[]) throws Exception {
	
		
		Scanner sc=new Scanner(System.in);
		NavigateToBrowser navigate = new NavigateToBrowser();
		
		Validation valid = new Validation();
		
		TakingScreenshot png = new TakingScreenshot();
		
		Holidays holiday = new Holidays();
		System.out.println("Choose your Browser:(1 for Chrome / 2 for Edge)");
		int choice = sc.nextInt();
		DriverSetup.driverSetup(choice);
		
		navigate.navigation();
		Thread.sleep(3000);
		
		navigate.offers();
		valid.validate();
		Thread.sleep(2000);
		
		png.screenshot();
		holiday.navigateToHolidays();

		DriverSetup.closeBrowser();
		sc.close();

		}	
		
	}

		


