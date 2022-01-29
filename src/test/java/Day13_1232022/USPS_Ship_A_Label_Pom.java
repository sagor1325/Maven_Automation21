package Day13_1232022;

import Reusable_Library.Reusable_Annotation;
import Usps_Page_Object.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class USPS_Ship_A_Label_Pom extends Reusable_Annotation {

    @Test
    public void USPS_Verify_Tabs_Then_Ship_A_Label(){

        //navigate to usps
        logger.log(LogStatus.INFO,"Navigating to USPS home page");
        driver.navigate().to("https://www.usps.com");

        //verify the tabs count
        BaseClass.homepage().getNavigationTabsCount();

        //click on Send tab
        BaseClass.homepage().clickOndSendTab();

        //click on Ship a Label
        BaseClass.sendMailAndPackages().clickOnPrintLabelButton();



    }
}

