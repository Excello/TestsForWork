package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TiresPage {
    private static By TIRES_PAGE_ITEMS = By.id("schema-products");
    private static By TIRES_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By TIRES_PAGE_FILTERS = By.id("schema-filter");
    private static By TIRES_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");


    public static boolean TiresPageIsOpened (WebDriver driver) {
        return driver.findElement(TIRES_PAGE_TITLE).getText().contains("Автомобильные шины");
    }

    public static void CheckTiresProducts (WebDriver driver) {
        driver.findElement(TIRES_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(TIRES_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(TIRES_PAGE_ANY_FILTER).isDisplayed();
    }

}
