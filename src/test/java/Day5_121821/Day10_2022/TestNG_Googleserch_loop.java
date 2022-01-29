package Day5_121821.Day10_2022;

import DAY9_2022.Reusableactions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestNG_Googleserch_loop {

    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver() {
        driver = Reusableactions.setDriver();
    }//end of precondition

    @Test
    public void googleSearchLoop() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

        for (int i = 0; i < cars.size(); i++) {
            //navigating to google
            driver.navigate().to("https://www.google.com");
            //entering a unique keyword from array list
            Reusableactions.sendKeysMethod(driver, "//*[@name='q']", cars.get(i), "Search Field");


        }

    }
}// end of java

