package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebTestBase;



public class LoginTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;

    LoginTest() {
        super();
    }
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }
    @Test
    public void verifyLoginWithValidUsernamePassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closeAdvertise();
        homePage.clickOnLoginBtn();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password") );
        softAssert.assertEquals(myAccountPage.textOfElement(),"MY ACCOUNT", "Title should be match");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
