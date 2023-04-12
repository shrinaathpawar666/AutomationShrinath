package annotationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
public class FirstTest {
    public static WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);  //Important  //upcasting in Java
    }
    @Test
    public void testcase1()
    {
        driver.get("https://www.edubridgeindia.com/login");
        driver.manage().window().maximize();
    }
    @Test
    public void testcase2()
    {
        driver.get("https://www.edubridgeindia.com/login");
        driver.findElement(By.id("btnLoginSubmit")).click();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}

