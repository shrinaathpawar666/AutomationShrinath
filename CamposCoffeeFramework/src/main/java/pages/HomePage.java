package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.TestUtils;

public class HomePage extends WebTestBase {
    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement homePageLoginBtn;

    @FindBy(xpath = "//a[@title='Close']")
    WebElement firstAdvertise;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement secondAdvertise;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public void closeAdvertise(){
        TestUtils.waitUntilElementToBeClick(firstAdvertise);
        TestUtils.waitUntilElementToBeClick(secondAdvertise);
    }
    public void clickOnLoginBtn(){
        TestUtils.waitUntilElementToBeClick(homePageLoginBtn);
    }

}
