package feature;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitionForLogin {
    public static WebDriver driver;
    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRINATH\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver(options);
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("I enter the username and password")
    public void I_enter_the_username_and_password() {
        driver.get("https://www.hsbc.com/");
    }
    @Then("I should see login user landed on homepage")
    public void i_should_see_login_user_landed_on_homepage() {
        driver.close();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}
