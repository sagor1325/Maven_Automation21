package DAY9_2022;

import org.openqa.selenium.WebDriver;

public class UPSReusable {
    public static void main(String[] args) {

        WebDriver driver = Reusableactions.setDriver();
        //navigate to ups
        driver.navigate().to("https://www.ups.com/us/en/Home.page");

        //click on track
        Reusableactions.clickMethod(driver,"//*[text()='Tracking']", "Track", "track");

        //click on tract a package
        Reusableactions.clickMethod(driver,"//*[text()='Track a Package']", "Track a package", "track");
        // click on tracking
       Reusableactions.sendKeysMethod(driver,"//*[@id='stApp_trackingNumber']","122138","enterzip");



    }// end of main
}// end of java class
