package SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {

    @Test
    public void testcaseA() throws InterruptedException {

        SoftAssert softAssert = new SoftAssert();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.letskodeit.com/login");
        driver.findElement(By.id("email")).sendKeys("shrinathp");
        driver.findElement(By.id("login-password")).sendKeys("abcdefg");
        driver.findElement(By.id("login")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String actualResult = driver.findElement(By.xpath("//span[text()='Your username or password is invalid. Please try again.']")).getText();
        Assert.assertEquals("Your username or password is invalid. Please try again.", "Your username or password is invalid. Please try again.");
        System.out.println("gnsdtc");
        driver.close();
    }
}
