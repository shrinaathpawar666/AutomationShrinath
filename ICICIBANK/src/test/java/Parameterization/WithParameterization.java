package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization {
    public static WebDriver driver;
    @Parameters({"coursename","cityname"})
     @Test
    public void withparameterization(String coursename, String cityname) throws InterruptedException {
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver(options);
         driver.get("https://www.google.com/");
         driver.manage().window().maximize();
         driver.findElement(By.name("q")).sendKeys(coursename + " " + cityname);
         Thread.sleep(3000);
         driver.close();
     }
}
