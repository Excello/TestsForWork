package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class PrintersPage {
    private static By PRINTERS_PAGE_ITEMS = By.id("schema-products");
    private static By PRINTERS_PAGE_TITLE = By.cssSelector(".schema-header__title");
    private static By PRINTERS_PAGE_FILTERS = By.id("schema-filter");
    private static By PRINTERS_PAGE_ANY_FILTER = By.cssSelector(".schema-filter__fieldset");

    public PrintersPage() {
        super();
    }
    public static boolean PrintersPageIsOpened (WebDriver driver) {
        return driver.findElement(PRINTERS_PAGE_TITLE).getText().contains("Принтеры и МФУ");
    }
}
