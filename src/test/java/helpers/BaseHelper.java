package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement; stavljeno pod koment zbog brisanja
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BaseHelper
{
    protected static WebDriver driver = new ChromeDriver();
    protected static WebDriverWait wdWait = new WebDriverWait(driver, 40);


    protected static JavascriptExecutor js = (JavascriptExecutor) driver;

    public static void navigateToUrl (String url)
    {
        driver.get(url);
    }

    public static void clickOnElement (WebElement element)
    {
        element.click();
    }

}
