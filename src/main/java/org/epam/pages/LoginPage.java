package org.epam.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class LoginPage extends BasePage {

    By loginScreen = AppiumBy.accessibilityId ( "Login Screen" );

    By loginField = AppiumBy.accessibilityId ( "username" );
    By passwordField = AppiumBy.accessibilityId ( "password" );

    By loginButton = AppiumBy.accessibilityId ( "loginBtn" );

    By loginText = AppiumBy.xpath ( "//android.widget.TextView[@text=\"You are logged in as alice\"]");


    public LoginPage ( AndroidDriver driver ) {
        super ( driver );
    }

    public void clickLoginScreen () {
        element ( loginScreen , 10 ).click ( );
    }

    public String loginToApp ( String userName , String password ) {

        element ( loginField , 5 ).sendKeys ( userName );
        element ( passwordField , 5 ).sendKeys ( password );
        element ( loginButton , 5 ).click ( );
        return element ( loginText,10).getText ();

    }


}
