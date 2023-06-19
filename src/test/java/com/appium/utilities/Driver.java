package com.appium.utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AppiumDriver driver;

    public static AppiumDriver get() {
        if (driver == null) {
            String platform = ConfigReader.get("platform");

            switch (platform) {
                case "1":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
                    desiredCapabilities.setCapability("appium:version", "7.0");
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    desiredCapabilities.setCapability("appium:appActivity", "com.etsy.android.ui.homescreen.HomescreenTabsActivity");
                    desiredCapabilities.setCapability("appium:appPackage", "com.etsy.android");

                    try {
                        driver = new AndroidDriver(new URL("http://localhost:4723"), desiredCapabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;



                case "2":
                    DesiredCapabilities desiredCapabilities1 = new DesiredCapabilities();
                    desiredCapabilities1.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
                    desiredCapabilities1.setCapability("appium:version", "7.0");
                    desiredCapabilities1.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
                    // These 2 parameters are required if you want to automate an existing application
                    desiredCapabilities1.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                    desiredCapabilities1.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
                    desiredCapabilities1.setCapability("appium:appPackage", "com.android.calculator2");
                    try {
                        driver = new AndroidDriver(new URL("http://localhost:4723"), desiredCapabilities1);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    throw new RuntimeException("Driver is not implemented yet!");
            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

//adb shell pm list packages -f
//adb shell pm list packages | findstr "com.etsy"