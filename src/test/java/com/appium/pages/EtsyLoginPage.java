package com.appium.pages;

import com.appium.utilities.ConfigReader;
import com.appium.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EtsyLoginPage {

    public EtsyLoginPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }



    @AndroidFindBy(id = "com.etsy.android:id/clg_text_input")
    private WebElement emailOrUsernameElement;

    @AndroidFindBy(className = "android.widget.EditText")

    private WebElement passwordElement;

    @AndroidFindBy(accessibility = "Sign in ")
    private WebElement signInBtnElement;

    @AndroidFindBy(id = "com.etsy.android:id/sign_in_button_email")
    private WebElement cont;


    public void login() throws InterruptedException {
        String email = ConfigReader.get("email");
        String password = ConfigReader.get("password");

//        MobileUtilities.waitForPresence(By.id("com.etsy.android:id/edit_username"));

        emailOrUsernameElement.sendKeys(email);
        cont.click();
            Thread.sleep(3000);
        passwordElement.sendKeys(password);

        signInBtnElement.click();
    }
}
