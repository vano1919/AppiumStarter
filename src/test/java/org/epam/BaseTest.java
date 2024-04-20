
package org.epam;

import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseTest {

    private static final String APP = "https://github.com/cloudgrey-io/the-app/releases/download/v1.9.0/TheApp-v1.9.0.apk";
    protected static final String APPIUM = "http://localhost:4723/wd/hub";

    protected static AndroidDriver driver;
    protected static DesiredCapabilities caps;

    @BeforeClass
    public static void setUp () throws Exception {
        caps = new DesiredCapabilities ( );
        caps.setCapability ( "platformName" , "Android" );
        caps.setCapability ( "platformVersion" , "9" );
        caps.setCapability ( "deviceName" , "Android Emulator" );
        caps.setCapability ( "automationName" , "UiAutomator2" );
        caps.setCapability ( "app" , APP );

        driver = new AndroidDriver ( new URL ( APPIUM ) , caps );
    }

    @AfterClass
    public static void tearDown () {
        if (driver != null) {
            driver.quit ( );
        }
    }
}
