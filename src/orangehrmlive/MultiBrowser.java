package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";
    static WebDriver driver;
    static String baseurl = "https://opensource-demo.orangehrmlive.com/";
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong browser name");
        }
        driver.get(baseurl);
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
