package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TvPage {
    private static By TV_PAGE_ITEMS = By.id("schema-products");
    private static By TV_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By TV_PAGE_FILTERS = By.id("schema-filter");
    private static By TV_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");


    public static boolean TvPageIsOpened (WebDriver driver) {
        return driver.findElement(TV_PAGE_TITLE).getText().contains("Телевизоры");
    }

    public static void CheckTvProducts (WebDriver driver) {
        driver.findElement(TV_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(TV_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(TV_PAGE_ANY_FILTER).isDisplayed();
    }

}
