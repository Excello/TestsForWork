package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TvPage {
    private WebDriver driver;
    private static By TV_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public TvPage() {
        super();
    }

    public static boolean TvPageIsOpened (WebDriver driver) {
        return driver.findElement(TV_PAGE_TITLE).getText().contains("Телевизоры");
    }
}
