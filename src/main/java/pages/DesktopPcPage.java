package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class DesktopPcPage extends CommonCatalogPage {
    private WebDriver driver;
    private static By DESKTOP_PC_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public DesktopPcPage() {
        super();
    }

    public static boolean DesktopPcPageIsOpened (WebDriver driver) {
        return driver.findElement(DESKTOP_PC_PAGE_TITLE).getText().contains("Компьютеры");
    }
}
