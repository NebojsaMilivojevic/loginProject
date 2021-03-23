package pages;

import helpers.BaseHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComtradeEduHomePage extends BaseHelper
{
    @FindBy (className = "notloggedin-show")
    WebElement logInButton;

    WebDriver driver;

    public ComtradeEduHomePage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    public void logIn ()
    {
        navigateToComtradeEduHomePage();
        clickOnLogInButton();
    }

    private void navigateToComtradeEduHomePage ()
    {
        driver.get("https://lms.code.edu.rs/");
    }

    private void clickOnLogInButton ()
    {
        wdWait.until(ExpectedConditions.visibilityOf(logInButton));
        logInButton.click();
    }

}
