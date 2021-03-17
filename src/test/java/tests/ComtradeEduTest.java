package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.ComtradeEduHomePage;
import pages.ComtradeEduLogInPage;
import pages.ComtradeEduUserPage;

public class ComtradeEduTest extends BaseTest
{
    private final String userName = "neb.mili";
    private final String password = "Neb.Mili_C0de";

    @Test
    public void successfulLogInTest ()
    {
        ComtradeEduHomePage homePage = new ComtradeEduHomePage(driver);
        homePage.logIn();

        ComtradeEduLogInPage logInPage = new ComtradeEduLogInPage(driver);
        logInPage.inputFields(userName, password);

        ComtradeEduUserPage userPage = new ComtradeEduUserPage(driver);
        Assert.assertTrue("Unsuccessful login!",userPage.getUserName().contains("Nebojša Milivojević"));
    }

    @Test
    public void unsuccessfulLogInTest ()
    {
        ComtradeEduHomePage homePage = new ComtradeEduHomePage(driver);
        homePage.logIn();
        ComtradeEduLogInPage logInPage = new ComtradeEduLogInPage(driver);
        logInPage.inputFields(userName, "");

        Assert.assertTrue("Something went wrong!",logInPage.getErrorMassage().contains("Invalid login, please try again"));
    }
}
