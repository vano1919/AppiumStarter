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
        elementByPresence ( loginScreen , 10 ).click ( );
    }

    public String loginToApp ( String userName , String password ) {
        elementByPresence ( loginField , 5 ).sendKeys ( userName );
        elementByPresence ( passwordField , 5 ).sendKeys ( password );
        elementByClickable ( loginButton , 5 ).click ( );
        return elementByPresence ( loginText,10).getText ();

    }


}
