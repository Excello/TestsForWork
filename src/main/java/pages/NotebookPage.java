package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class NotebookPage {
    private WebDriver driver;
    private static By NOTEBOOK_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public NotebookPage() {
        super();
    }

    public static boolean NotebookPageIsOpened (WebDriver driver) {
        return driver.findElement(NOTEBOOK_PAGE_TITLE).getText().contains("Ноутбуки");
    }
}
