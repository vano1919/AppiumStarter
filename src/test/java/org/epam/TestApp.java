package org.epam;


import org.epam.pages.LoginPage;
import org.junit.Test;

public class TestApp extends BaseTest {

    LoginPage loginPage = new LoginPage ( driver );

    @Test
    public void testLoginScreen () {
        loginPage.clickLoginScreen ( );
    }

}
