package com.appium.step_defs;

import com.appium.pages.CalculatorPage;
import com.appium.utilities.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Hook {
    private static final Logger logger = Logger.getLogger(Hook.class.getName());

    @Before
    public void setup() {

        try {
            FileHandler fileHandler = new FileHandler("logfile.log", true);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.severe("Failed to setup logger handler: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @After
    public void teardown() {
        Driver.closeDriver();
    }
}
