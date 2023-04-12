package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.TestUtils;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccount;

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
    public String textOfElement() {
        return TestUtils.getTextOfElement(myAccount);
    }
}
