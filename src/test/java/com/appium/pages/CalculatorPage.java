package com.appium.pages;

import com.appium.utilities.Driver;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {


    public CalculatorPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);

    }

    @AndroidFindBy(id="com.android.calculator2:id/digit_1")
    public WebElement digit1;
// WebElement digit1 = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
    @AndroidFindBy(id="com.android.calculator2:id/digit_2")
    public WebElement digit2;
//    WebElement digit2 = driver.findElement(By.id("com.android.calculator2:id/digit_2"));

    @AndroidFindBy(accessibility = "plus")
    public WebElement plus;
//    WebElement plus = driver.findElement(AppiumBy.accessibilityId("plus"));

    @AndroidFindBy(accessibility = "equals")
    public WebElement equals;
//    WebElement equals = driver.findElement(AppiumBy.accessibilityId("equals"));

    @AndroidFindBy(id="com.android.calculator2:id/result")
    public WebElement result;
//        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));

    @AndroidFindBy(accessibility = "minus")
    public WebElement minus;
//        WebElement minus = driver.findElement(AppiumBy.accessibilityId("minus"));

    @AndroidFindBy(accessibility = "multiply")
    public WebElement multiply;
//        WebElement multiply = driver.findElement(AppiumBy.accessibilityId("multiply"));

    @AndroidFindBy(accessibility = "divide")
    public WebElement divide;
//        WebElement divide = driver.findElement(AppiumBy.accessibilityId("divide"));

    @AndroidFindBy(accessibility = "delete")
    public WebElement delete;
//    WebElement delete = driver.findElement(AppiumBy.accessibilityId("delete"));
    public WebElement getDigit(int digit) {
        return Driver.get().findElement(By.id("com.android.calculator2:id/digit_" + digit));
    }

}
