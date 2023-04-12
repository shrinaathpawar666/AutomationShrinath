package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utils.TestUtilsOne;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//select[@title='Search in']")
    WebElement allCategoryBtn;

    @FindBy(id = "//input[@id='nav-search-submit-button']")
    WebElement searchBtn;

    @FindBy(xpath = "//i[@class='a-icon a-icon-checkbox']")
    WebElement englishCheckBox;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    WebElement bookNameBtn;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchTextBox;

    @FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[4]")
    WebElement checkBoxBtn;

    @FindBy(xpath = "//a[@id='icp-nav-flyout']")
    WebElement mouseHoverBtn;

    @FindBy(xpath = "(//a[@class='nav_a'])[5]")
    WebElement facebookBtn;


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void book(String Book) {
        allCategoryBtn.sendKeys(Book);
    }

    public void clickOnAllCategoryBtn() {
        allCategoryBtn.click();
        TestUtilsOne.waitUntilElementToBeClick(searchBtn);
    }

    public void clickOnSearchLogo() {
        searchBtn.click();
    }

    public void clickOnCheckBoxBtn(String english) {
        englishCheckBox.click();
        TestUtilsOne.waitUntilElementToBeClick(englishCheckBox);
        bookNameBtn.click();
    }

    public void selectDropDown(String bookName) {
        TestUtilsOne.selectDropDownValueByVisibleText(allCategoryBtn, bookName);
    }

    public String getTitleOfCurrentPage() {
        return TestUtilsOne.getTitleOfPage();
    }

    public void searchTextInTextBox(String bookName) {
        searchTextBox.sendKeys(bookName);
        searchTextBox.sendKeys(Keys.ENTER);
        TestUtilsOne.waitUntilElementToBeClick(checkBoxBtn);
    }

    public boolean isSelectedCheckBox() {
        return TestUtilsOne.isSelectedElement(checkBoxBtn);
    }

    public void mouseHoverAction() {
        mouseHoverBtn.click();
        TestUtilsOne.mouseHoverActionOnElement(mouseHoverBtn);
    }

    public void scrollDownPageByPixel() {
        TestUtilsOne.scrollDownByPixel();
    }

    public void scrollUpPageByPixel() {
        TestUtilsOne.scrollUpByPixel();
    }

    public void clickOnFacebookBtn() {
        facebookBtn.click();
    }

    public void getAllWindowHandles() {
        TestUtilsOne.getWindowHandles();
    }

    public boolean elementToBeDisplayed() {
        return TestUtilsOne.isElementDisplayed(checkBoxBtn);
    }

}
