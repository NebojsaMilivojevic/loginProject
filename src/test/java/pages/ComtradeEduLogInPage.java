package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComtradeEduLogInPage extends BaseHelper
{
    @FindBy(id = "username")
    WebElement userNameField;

    @FindBy (id = "password")
    WebElement passworField;

    @FindBy (id = "loginbtn")
    WebElement logInButton;

    WebDriver driver;

    public ComtradeEduLogInPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    public void inputFields (String userName, String password)
    {
        inputUserName(userName);
        inputPassword(password);
        clickOnLogInButton();
    }

    private void inputUserName (String userName)
    {
        wdWait.until(ExpectedConditions.visibilityOf(userNameField));
        userNameField.sendKeys(userName);
    }

    private void inputPassword (String password)
    {
        wdWait.until(ExpectedConditions.visibilityOf(passworField));
        passworField.sendKeys(password);
    }

    private void clickOnLogInButton ()
    {
        wdWait.until(ExpectedConditions.visibilityOf(logInButton));
        logInButton.click();
    }

    public String getErrorMessage()
    {
        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("error")));
        WebElement errorMessage = driver.findElement(By.className("error"));
        String message = errorMessage.getText();
        System.out.println("Error message after unsuccessful log in is: " + message);
        return message;
    }
}
