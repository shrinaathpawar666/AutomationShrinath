package tests;

import net.bytebuddy.build.Plugin;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;

public class HomeTest extends WebTestBase {
    public HomePage homePage;

    HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test(priority = 1)
    public void verifyDropDown() {
        SoftAssert softAssert = new SoftAssert();
        homePage.selectDropDown(prop.getProperty("book"));
        softAssert.assertEquals(homePage.getTitleOfCurrentPage(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Title should be match");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void verifyCheckBox() {
        SoftAssert softAssert = new SoftAssert();
        homePage.searchTextInTextBox(prop.getProperty("bookName"));
        softAssert.assertTrue(homePage.elementToBeDisplayed(), "Element should be selected");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void verifyMouseHoverAction() {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHoverAction();
        softAssert.assertEquals("Language Settings", "Language Settings", "Text should be match");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void verifyScrollUpDownPage() {
        SoftAssert softAssert = new SoftAssert();
        homePage.scrollDownPageByPixel();
        homePage.scrollUpPageByPixel();
        softAssert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Title should be match");
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void verifyGetWindowHandles() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnFacebookBtn();
        homePage.scrollUpPageByPixel();
        homePage.getAllWindowHandles();
        softAssert.assertEquals("Amazon India", "Amazon India", "Web element should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}


