package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class RefrigeratorPage {
    private WebDriver driver;
    private static By REFRIGERATOR_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public RefrigeratorPage() {
        super();
    }

    public static boolean RefrigeratorPageIsOpened (WebDriver driver) {
        return driver.findElement(REFRIGERATOR_PAGE_TITLE).getText().contains("Холодильники");
    }
}
