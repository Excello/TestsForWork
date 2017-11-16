package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DisplayPage {
    private WebDriver driver;
    private static By DISPLAY_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public DisplayPage() {
        super();
    }

    public static boolean DisplayIsOpened (WebDriver driver) {
        return driver.findElement(DISPLAY_PAGE_TITLE).getText().contains("Мониторы");
    }
}
