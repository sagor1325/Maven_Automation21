package Day12_011622;

import DAY9_2022.Reusableactions;
import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusable_Annotation;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class extendreport_usps_example extends Reusable_Annotation {



    @Test()
    public void usps_Test(){

        driver.navigate().to("https://www.usps.com");
        //hover to the quick tool tab
        Reusable_Actions_Loggers.mouseHover(driver,"//*[text()='Quick Tools']",logger,"Quck tools");
        //click on track a package
        Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Track a Package']",logger,"Track a Packgage");
        //enter your tracking number
        Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='tracking-input']","1111111111",logger,"Track Field");
        //click on track button
        Reusable_Actions_Loggers.clickMethod(driver,"//*[@class='button tracking-btn']",logger,"Track Button");

    }//end of test


    }//end of java class

