package Day5_121821;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
    public static void main(String[] args) throws InterruptedException {


        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "Src/main/resources/chromedriver.exe");
        // define the web driver you are using
        WebDriver driver = new ChromeDriver();

        //simply open the Google website
        driver.navigate().to("https://www.google.com");

        //maximize my browser
        driver.manage().window().maximize();
        // anytime when you go to a new page you should put some wait statement
        Thread.sleep( 2000);

        //searching for cars on google search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        //hit submit on google serch button
        driver.findElement(By.xpath("//*[@Value='Google Search']")).submit();

        //another wait statement since we came to a new page
        Thread.sleep(3000);

        //capture the search result and store it as a variable
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //declaring the array variable to split the result
        String[] arrayResult = result.split(" ");
        // now print the search number only
        System.out.println("My search result is " + arrayResult[1]);


    }// end of main


}// end o java class
