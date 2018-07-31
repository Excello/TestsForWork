package pages;

import utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage implements Base {
    private final WebDriver driver;
    private Log log = new Log();
    private By identifyElementLocator = By.cssSelector(".schema-header__title"); //TODO Зачем этот параметр, если он нигде не используется?

    protected BasePage(By identifyElementLocator, WebDriver d) {
        this.driver = d;
        this.identifyElementLocator = identifyElementLocator;
    }

    //TODO Это лучше вернуть, а поле сделать private
    public WebDriver getDriver() {
        return driver;
    }

    public By getIdentifyElementLocator() {
        return identifyElementLocator;
    }

    public Log getLog() {
        return log;
    }
}