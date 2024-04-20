package org.epam;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    WebElement loginScreen = element ( AppiumBy.accessibilityId ( "Login Screen" ) , 10 );

    protected LoginPage ( AndroidDriver driver ) {
        super ( driver );
    }

    public void clickLoginScreen () {
        loginScreen.click ( );
    }


}
