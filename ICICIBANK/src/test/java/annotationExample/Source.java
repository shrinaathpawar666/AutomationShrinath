package annotationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class Source {
    ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new



             driver.get("https://selenium-apps.doselect.in/simple-popup/");

             // Find the 'VIEW POP-UP' button by xpath and click it
            WebElement viewPopupButton = driver.findElement(By.xpath("//a[text()='View Popup']"));
             viewPopupButton.click();

             // Find the close button in the pop-up by xpath and click it
            WebElement closeButton = driver.findElement(By.xpath("//a[text()='Close']"));
             closeButton.click();

             // DO NOT REMOVE THE BELOW CODE

             driver.quit();
}
