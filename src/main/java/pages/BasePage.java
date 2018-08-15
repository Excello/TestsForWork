package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public abstract class BasePage implements Base {
    private final WebDriver driver;
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
    private final By identifyElementLocator; //TODO Зачем этот параметр, если он нигде не используется? Значение не используется по-прежнему

    protected BasePage(By identifyElementLocator, WebDriver d) {
        this.driver = d;
        this.identifyElementLocator = identifyElementLocator;
    }

    public boolean isPageOpened() {
        try {
            WebElement pageTitle = driver.findElement(identifyElementLocator);
            Assert.assertTrue(pageTitle.isDisplayed());
            LOGGER.info("Page was displayed");
            return true;
        } catch (NoSuchElementException e) {
            LOGGER.warn("Page was not displayed");
            return false;
        }
    }

    //TODO Непонятно зачем public?
    protected WebDriver getDriver() {
        return driver;
    }

    //TODO Непонятно зачем public?
    protected By getIdentifyElementLocator() {
        return identifyElementLocator;
    }

    //TODO Непонятно зачем public?
    protected Logger getLog() {
        return LOGGER;
    }
}