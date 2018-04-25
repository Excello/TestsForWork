package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


/**
 * Created by Englich on 11.11.2017.
 *
 */
public class ActionCameraPage extends CommonCatalogPage{
    private static By ACTION_CAMERA_PAGE_TITLE = By.cssSelector(".schema-header__title");
    CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
    CommonCatalogPage commonCatalogPage = new CommonCatalogPage(driver);

    public ActionCameraPage(WebDriver driver) {
        super(driver);
    }

    public ActionCameraPage checkCatalogPageIsOpened() {
        catalogNavigatorPage.goToActionCameraPage();
        Assert.assertTrue(driver.findElement(ACTION_CAMERA_PAGE_TITLE).getText().contains("Экшен-камеры"));
        commonCatalogPage.isProductsDisplayed();
        commonCatalogPage.isFilterSectionDisplayed();
        commonCatalogPage.isAnyFilterExisted();
        return new ActionCameraPage(driver);
    }
}
