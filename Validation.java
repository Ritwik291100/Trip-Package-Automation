package yatra;

import org.openqa.selenium.By;

public class Validation extends TripPackageAutomation {
	public void validate() {
		//Validate the page by checking the title "Domestic Flights Offers | Deals on Domestic Flight Booking | Yatra.com"
		if(driver.getTitle().equals("Domestic Flights Offers | Deals on Domestic Flight Booking | Yatra.com")) {
				System.out.println("Page Validated");
		}else {
			        System.out.println("Page Validation Failed");
			    }
				
		//Validate the banner text "Great Offers & Amazing Deals"
		if(driver.findElement(By.xpath("//h2[@class='wfull bxs']")).getText().equals("Great Offers & Amazing Deals")) {
				System.out.println("Banner Text Verified: Great Offers & Amazing Deals");
		} else {
	        System.out.println("Banner Text Verification Failed");
		}
	}

}
