package feature;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static WebDriver driver;
    @Given("navigate to the website")
    public void navigate_to_the_website() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
    }
    @When("i perform clicking all options")
    public void i_perform_clicking_all_options() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
    }
    @Then("all three option in dropdown select")
    public void all_three_option_in_dropdown_select() {
        // Write code here that turns the phrase above into concrete actions
        Select drop = new Select(driver.findElement(By.name ("multiple-select-example")));
        drop.selectByValue("apple");
        drop.selectByValue("orange");
        drop.selectByValue("peach");

        //driver.close();
    }
}
