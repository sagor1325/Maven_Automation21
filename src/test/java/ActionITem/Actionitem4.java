package ActionITem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Actionitem4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver();

        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11218");
        zipcode.add("10021");
        zipcode.add("08837");


        for (int i=0; i< zipcode.size(); i++){
            try {
             driver.navigate().to( "http://www.weightwatcher.com/us/");
            }catch (Exception e) {
                System.out.println("unable to navigate to website" + e);
            }// end of exception of navigate website
            try{
                driver.findElement(By.xpath("//*[text()= Attend")).click();
            }catch (Exception e) {
                System.out.println("unable to click on attend" + e);
            }// end of exceptions for attend
            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@class='menuItem_subtitle_3LoiE'//")).click();

            }catch (Exception e) {
                System.out.println("Unable to click unlimited workshops" + e);
            }// end of exception for clicking workshop
            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@class='buttonWrapper-QK2gi"));

            }catch (Exception e) {
                System.out.println("Unable to click on Studio" + e);
            }// end of exceptions for clicking studio
            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@class='input input-3TfT5")).sendKeys(zipcode.get(i));

            }catch (Exception e) {
                System.out.println("unable to enter  zipcode" + e);
            }// end of exceptions for enter zip code
            Thread.sleep(2000);

            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP'")).click();

            }catch (Exception e) {
                System.out.println("Unable to click on arrow" + e);
            }// end of exception for click arrow
            Thread.sleep(2000);

            try {
                if (i==0) {
                  driver.findElements(By.xpath("//*[@class='container-3SE46']")).get(1).click();

                }else if (i==1) {
                    driver.findElements(By.xpath("//*[@class='container-3SE46']")).get(2).click();
                }else if (i==2){
                    driver.findElements(By.xpath("//*[@class='container-3SE46']")).get(0).click();
                }// end of condition
            }catch (Exception e) {
                System.out.println("unable to click on address" + e);
            }// end of exception for clicking address

            try {
                String address = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();
                System.out.println("The studio address for zipcode " + zipcode.get(i)+ "is" + address);
            }catch (Exception e) {
                System.out.println("unable to print address" + e);
            }// end of address exception
            Thread.sleep(2000);

            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll(0,950)");
            }catch (Exception e) {
                System.out.println("unable to scroll" + e);
            }// end of exception for scroll

            try {
                String schedule = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText();
                System.out.println("The schedule for zipcode " + zipcode.get(i) + "is" + schedule);
            }catch (Exception e) {
                System.out.println("unable to get schedule");
            }// end of exception for schedule
            



























        }// end of loop















    }// end of main
}// end of java class
