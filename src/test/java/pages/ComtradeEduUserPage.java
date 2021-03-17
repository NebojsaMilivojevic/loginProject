package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComtradeEduUserPage extends BaseHelper
{
    @FindBy(className = "page-header-headings")
    WebElement userHeader;

    WebDriver driver;

    public ComtradeEduUserPage (WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements (driver, this);
    }

    public String getUserName ()
    {
        wdWait.until(ExpectedConditions.visibilityOf(userHeader));
        String userName = userHeader.getText();
        System.out.println(userName);
        return userName;
    }

}
