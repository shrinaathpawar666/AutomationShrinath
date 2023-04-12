package utils;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;
import java.util.Set;

public class TestUtilsOne extends WebTestBase {
    public static Select select;

    public static final long PAGE_LOAD_WAIT = 20;
    public static final long IMPLICIT_WAIT = 20;
    private static final long EXPLICIT_WAIT = 20;


    public static void waitUntilElementToBeClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static String getTextOfElement(@NotNull WebElement element) {

        return element.getText();
    }


    public static void selectDropDownValueByVisibleText(WebElement element, String productName) {
        select = new Select(element);
        select.selectByVisibleText(productName);
    }

    public static void getWindowHandles() {
        String parentId = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentId.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
            driver.switchTo().window(parentId);
        }
    }

    public static void scrollDownByPixel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10000)");
    }

    public static void scrollUpByPixel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-10000)");
    }

    public static String getTitleOfPage() {
        return driver.getTitle();
    }

    public static void mouseHoverActionOnElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static boolean isSelectedElement(WebElement element) {
        return element.isSelected();
    }

    public static boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }
}



