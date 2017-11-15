package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class HeaterPage {
    private WebDriver driver;
    private static By HEATER_PAGE_ITEMS = By.id("schema-products");
    private static By HEATER_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By HEATER_PAGE_FILTERS = By.id("schema-filter");
    private static By HEATER_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public HeaterPage(WebDriver driver) {
        this.driver = driver;
    }


    public static boolean HeaterPageIsOpened (WebDriver driver) {
        return driver.findElement(HEATER_PAGE_TITLE).getText().contains("Обогреватели");
    }

    public static void CheckHeaterProducts (WebDriver driver) {
        driver.findElement(HEATER_PAGE_ITEMS).isDisplayed();
    }

    public static void CheckFilterSection (WebDriver driver) {
        driver.findElement(HEATER_PAGE_FILTERS).isDisplayed();
    }

    public static void AnyFilterIsExisted (WebDriver driver) {
        driver.findElement(HEATER_PAGE_ANY_FILTER).isDisplayed();
    }

}
