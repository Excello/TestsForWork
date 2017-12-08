package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class NotebookPage extends CommonCatalogPage {
    private static By NOTEBOOK_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public NotebookPage(WebDriver driver) {
        super(driver);
    }

    public NotebookPage isNotebookPageOpened () {
        Assert.assertTrue(driver.findElement(NOTEBOOK_PAGE_TITLE).getText().contains("Ноутбуки"));
        return new NotebookPage(driver);
    }
}
