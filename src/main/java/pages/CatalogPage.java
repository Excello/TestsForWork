package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 */
public class CatalogPage {
    private static By MOBILE_PAGE_TAB = By.linkText("Мобильные телефоны");


    public static void GoToMobilePage(WebDriver driver) {
        driver.findElement(MOBILE_PAGE_TAB).click();
    }

}
