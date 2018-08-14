package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage implements Base {
    private final WebDriver driver;
    private Log log = new Log();
    private By identifyElementLocator = By.cssSelector(".catalog-navigation"); //TODO Зачем этот параметр, если он нигде не используется? Значение не используется по-прежнему

    protected BasePage(By identifyElementLocator, WebDriver d) {
        this.driver = d;
        this.identifyElementLocator = identifyElementLocator;
    }

    public boolean isPageOpened() {
        try {
            WebElement pageTitle = getDriver().findElement(getIdentifyElementLocator());
            Assert.assertTrue(pageTitle.isDisplayed());
            getLog().info("Page was displayed");
            return true;
        } catch (NoSuchElementException e) {
            getLog().warn("Page was not displayed");
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
    protected Log getLog() {
        return log;
    }
}