package com.appium.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Optional;
import java.util.logging.Logger;


public final class MobileUtilities {

    private static final Logger logger = Logger.getLogger(MobileUtilities.class.getName());
    private static final WebDriverWait wait = new WebDriverWait(getDriverSafely(), Duration.ofSeconds(20));

    private MobileUtilities() {
        throw new AssertionError("Cannot instantiate utility class.");
    }


    private static WebDriver getDriverSafely() {
        return Optional.ofNullable(Driver.get())
                .orElseThrow(() -> new IllegalStateException("WebDriver is not initialized."));
    }

    public static void waitForPresence(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



//public class MobileUtilities {
//    private static WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
//
//    public static void wait(int seconds) {
//        try {
//            Thread.sleep(seconds * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void waitForPresence(By by) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(by));
//    }
//}
//

