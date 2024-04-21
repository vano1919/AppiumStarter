package org.epam;


import org.epam.pages.LoginPage;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestApp extends BaseTest {

    LoginPage loginPage = new LoginPage ( driver );

    @Test
    public void test_1_LoginScreen () {
        loginPage.clickLoginScreen ( );
    }

    @Test
    public void test_2_LoginCorrectCredentials(){
        String username = "alice";
        String password = "mypassword";
        String actualDisplayedName = loginPage.loginToApp ( username,password );
        Assert.assertEquals("You are logged in as alice", actualDisplayedName);
    }

}
