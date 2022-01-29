package ActionITem;

import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class express_actionitem {

    WebDriver driver;
    ExtentReports reports;
    ExtentTest logger;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions_Loggers.setDriver();
        // set the path of report once
        reports = new ExtentReports("src/main/java/html_report/Automation_Report.html",true);
    }// end of precondition

    @Test
    public void ExpressSearchDataDriven() throws BiffException, IOException, InterruptedException {
        // step 1 : read the data from excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/GoogleSearchSagor.xls"));
        // step 2 locating the worksheet that you created for workbook
        Sheet readableSheet = readableFile.getSheet(1);
        //will return the psysical rows present on the sheet
        int rowCount = readableSheet.getRows();
        System.out.println("My Row count is" + rowCount);

        // step 3 create writable file to mimic readable and write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/GoogleSearchSagor_Results.xls"),readableFile);
        WritableSheet writableSheet = writableFile.getSheet(1);
        // will return the psysical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        System.out.println("My writable row count is" + rowCount2);

        // generate thr for loop
        for (int i = 1;i < rowCount2;i++) {
            // store the row list as a variable
            String size = writableSheet.getCell(0, i).getContents();
            System.out.println("My value are "+ size);

            String  quantity = writableSheet.getCell(1, i).getContents();
            System.out.println("My values are " + quantity);

            String firstname = writableSheet.getCell(2, i).getContents();
            System.out.println("my values are " + firstname);

            String lastname = writableSheet.getCell(3, i).getContents();
            System.out.println("my values are " + lastname);

            String email = writableSheet.getCell(4 ,i).getContents();
            System.out.println("my values are " + email);

            String phonenumber = writableSheet.getCell(5, i).getContents();
            System.out.println("my values are " + phonenumber);

            String address = writableSheet.getCell(6, i).getContents();
            System.out.println(" my values are" + address);

            String zipcode = writableSheet.getCell(7 ,i).getContents();
            System.out.println(" my values are " + zipcode);

            String city = writableSheet.getCell(8, i).getContents();
            System.out.println(" my values are " + city);

            String cardnumber = writableSheet.getCell(9, i).getContents();
            System.out.println(" my values are" + cardnumber);

            String Expmonth = writableSheet.getCell(10, i).getContents();
            System.out.println("my value are" + Expmonth);

            String EXPYear = writableSheet .getCell(11, i).getContents();
            System.out.println(" My values are" + EXPYear);

            String CVV = writableSheet.getCell(12, i).getContents();
            System.out.println(" my values are" + CVV);

            logger= reports.startTest("purchasing dresses on Express website");
            // navigate to express
            logger.log(LogStatus.INFO,"Navigate to Express Home Page ");
            driver.navigate().to("https://www.express.com/");
            // verify the page title contains 'Men's and 'Women's Clothing
            String actualTitle = driver.getTitle();
            if (actualTitle.contains("Men's & Women's Clothing")){
                System.out.println(" Title Contains 'Men and Women's Clothing");

            }else {
                System.out.println("Tile doesn't match. Actual title is " + actualTitle);
            }// end of get title condistion
            // hover over to 'women' tab
            Reusable_Actions_Loggers.mouseHover(driver,"//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']",logger,"Women");

            // click on 'Dresses' link
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@href='/womens-clothing/dresses/cat550007']",logger,"Dresses");

            // wait times
            Thread.sleep(3000);

            //scroll by pixel
            Reusable_Actions_Loggers.scroll(driver,"0","600",logger,"scroll");
            Reusable_Actions_Loggers.clickByIndex(driver, "//*[@class='-qIS3zH7eoemBZF9mo1K5']",1,logger,"second dress");
            //wait time
            Thread.sleep(3000);
            // pop up
            //Reusable_Actions_Loggers.clickMethod(driver,"//*[@class='icon-close']",logger,"pop up");

            // click on sizes
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='"+size+"']",logger,"size");
            Thread.sleep(3000);

            // click on add bag
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Add to bag']",logger,"Add To Bag");
            Thread.sleep(3000);
            // click on view bag
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='View Bag']",logger,"View Bag");
            // wait time
            Thread.sleep(3000);
            //select on quantity
            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@id='qdd-0-quantity']",quantity,logger,"quantity");
            Thread.sleep(3000);
            //click on checkout
            Reusable_Actions_Loggers.clickMethod(driver,"//*[@id='continue-to-checkout']",logger,"Checkout");
            //wait time
            Thread.sleep(3000);
            // enter first name
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='firstname']",firstname,logger,"First Name");
            //enter last name
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']",lastname,logger,"Last Name");
            // enter email address
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']",email,logger,"email");
            // confirm email
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']",email,logger,"confirmEmail");
            //enter phone number
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']",phonenumber,logger,"phone number");
            // continue
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Continue']",logger,"Continue");

            //







        }// end of loop
    }






}// end of java
