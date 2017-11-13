package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class RefrigeratorPage {
    private static By REFRIGERATOR_PAGE_ITEMS = By.id("schema-products");
    private static By REFRIGERATOR_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By REFRIGERATOR_PAGE_FILTERS = By.id("schema-filter");
    private static By REFRIGERATOR_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");


    public static boolean RefrigeratorPageIsOpened (WebDriver driver) {
        return driver.findElement(REFRIGERATOR_PAGE_TITLE).getText().contains("Холодильники");
    }

    public static void CheckRefrigeratorProducts (WebDriver driver) {
        driver.findElement(REFRIGERATOR_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(REFRIGERATOR_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(REFRIGERATOR_PAGE_ANY_FILTER).isDisplayed();
    }

}
