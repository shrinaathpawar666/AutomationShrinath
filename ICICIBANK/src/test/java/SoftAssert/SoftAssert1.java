package SoftAssert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1 {
    public static WebDriver driver;

    @Test
    public void testcase1() {

        SoftAssert softAssert = new SoftAssert();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=11855254449033652806&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        softAssert.assertEquals(driver.getTitle(), "amazon.in", "this should be match");
        softAssert.assertTrue(driver.findElement(By.id("nav-search-submit-button")).isDisplayed());
        driver.manage().window().maximize();
        driver.close();
    }
}
