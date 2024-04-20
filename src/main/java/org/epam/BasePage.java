
package org.epam;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static AndroidDriver driver;

    protected BasePage ( AndroidDriver driver ) {
        BasePage.driver = driver;
    }

    protected WebElement element ( By by , Integer seconds ) {
        WebDriverWait wait = new WebDriverWait ( driver , Duration.ofSeconds ( seconds ) );
        return wait.until ( ExpectedConditions.presenceOfElementLocated ( by ) );
    }
}
