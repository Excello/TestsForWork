package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class TabletPcPage {
    private WebDriver driver;
    private static By TABLET_PC_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public TabletPcPage() {
        super();
    }

    public static boolean TabletPcPageIsOpened(WebDriver driver) {
        return driver.findElement(TABLET_PC_PAGE_TITLE).getText().contains("Планшеты");
    }
}
