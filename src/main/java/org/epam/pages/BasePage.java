
package org.epam.pages;

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
        return new WebDriverWait ( driver , Duration.ofSeconds ( seconds ) )
                     .until (
                        ExpectedConditions.presenceOfElementLocated ( by ) );
    }
}
