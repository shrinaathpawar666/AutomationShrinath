package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution1 {
    public static WebDriver driver;



    @Test
    public void testcase1()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.edubridgeindia.com/login");
        driver.manage().window().maximize();
        Assert.assertTrue(false);
        driver.close();
    }
    @Test
    public void testcase2()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.edubridgeindia.com/login");
        driver.findElement(By.id("btnLoginSubmit")).click();
        driver.manage().window().maximize();
        driver.close();
    }

}
