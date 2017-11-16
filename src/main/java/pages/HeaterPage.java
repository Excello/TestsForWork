package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class HeaterPage {
    private WebDriver driver;
    private static By HEATER_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public HeaterPage() {
        super();
    }

    public static boolean HeaterPageIsOpened (WebDriver driver) {
        return driver.findElement(HEATER_PAGE_TITLE).getText().contains("Обогреватели");
    }
}
