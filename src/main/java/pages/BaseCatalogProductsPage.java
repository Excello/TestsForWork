package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//TODO Все Base классы всегда абстрактные
abstract public class BaseCatalogProductsPage extends BasePage{
    public BaseCatalogProductsPage(By identifyElementLocator, WebDriver d) {
        super(identifyElementLocator, d);
    }

    //TODO Зачем здесь эти параметры? Ты их получаешь в конструкторе, зачем еще и здесь их запрашивать?
    @Override
    public boolean isPageOpened() {
        try {
            WebElement pageTitle = driver.findElement(By.cssSelector(".schema-header__title"));
            Assert.assertTrue(pageTitle.getText().contains("Видеокарты"));
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Page was not displayed");
            return false;
        }
    }
}
