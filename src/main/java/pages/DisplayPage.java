package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DisplayPage {
    private WebDriver driver;
    private static By DISPLAY_PAGE_ITEMS = By.id("schema-products");
    private static By DISPLAY_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By DISPLAY_PAGE_FILTERS = By.id("schema-filter");
    private static By DISPLAY_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public DisplayPage(WebDriver driver) {
        this.driver = driver;
    }


    public static boolean DisplayIsOpened (WebDriver driver) {
        return driver.findElement(DISPLAY_PAGE_TITLE).getText().contains("Мониторы");
    }

    public static void CheckDisplayProducts (WebDriver driver) {
        driver.findElement(DISPLAY_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(DISPLAY_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(DISPLAY_PAGE_ANY_FILTER).isDisplayed();
    }

}
