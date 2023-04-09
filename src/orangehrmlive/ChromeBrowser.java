package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {

        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        //launch the chrome browser
        WebDriver driver = new ChromeDriver();
        //open url into browser
        driver.get(baseurl);
        //maximise the browser
        driver.manage().window().maximize();
        //we give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print the title of the page
        System.out.println("Page Title : " + driver.getTitle());
        //print the current url
        System.out.println("Current url : " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source : " + driver.getPageSource());
        //find the email field element
        driver.findElement(By.name("username")).sendKeys("Admin");
        //enter the email to email field
        driver.findElement(By.name("password")).sendKeys("admin123");
        //close the browser
        //driver.close();

    }
}