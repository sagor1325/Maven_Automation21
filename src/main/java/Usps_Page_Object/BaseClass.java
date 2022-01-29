package Usps_Page_Object;

import Reusable_Library.Reusable_Annotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static Reusable_Library.Reusable_Annotation.driver;

public class BaseClass extends Reusable_Annotation {

    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for usps home page
    public static Homepage homepage(){
        Homepage homepage = new Homepage(driver);
        return  homepage;
    }

    //create static reference for send mail and packages page
    public static SendMailAndPackages sendMailAndPackages(){
        SendMailAndPackages sendMailAndPackages = new SendMailAndPackages(driver);
        return  sendMailAndPackages;
    }
}
