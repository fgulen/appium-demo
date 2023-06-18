package com.appium.step_defs;

import com.appium.pages.CalculatorPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class Calculator_stepDefs {


    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("user makes calculation")
    public void user_makes_calculation() {

        calculatorPage.digit1.click();//click on 1
        calculatorPage.digit1.click();

        //click on 2
        calculatorPage.getDigit(2).click();

        //click on +
        calculatorPage.plus.click();

        //click on 2
        calculatorPage.getDigit(2).click();
        //click on 2
        calculatorPage.getDigit(2).click();

        //click on equals
        calculatorPage.equals.click();

        //get text of result
        String actual = calculatorPage.result.getText();

        Assert.assertEquals("134", actual);

        //2 * 2 = 4
        //click on 2
        calculatorPage.getDigit(2).click();
        calculatorPage.multiply.click();
        //click on 2
        calculatorPage.getDigit(2).click();
        calculatorPage.equals.click();
        Assert.assertEquals("4", calculatorPage.result.getText());

        //10 - 5 + 6 = 11
        calculatorPage.getDigit(1).click();
        calculatorPage.getDigit(0).click();
        calculatorPage.minus.click();
        calculatorPage.getDigit(5).click();
        calculatorPage.plus.click();
        calculatorPage.getDigit(6).click();
        calculatorPage.equals.click();

        Assert.assertEquals("11", calculatorPage.result.getText());

        calculatorPage.delete.click();

   }
}