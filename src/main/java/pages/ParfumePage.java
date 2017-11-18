package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class ParfumePage extends CommonCatalogPage {
    private static By PARFUME_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public ParfumePage() {
        super();
    }

    public ParfumePage isParfumePageOpened () {
        Assert.assertTrue(driver.findElement(PARFUME_PAGE_TITLE).getText().contains("Парфюмерия"));
        return new ParfumePage();
    }
}
