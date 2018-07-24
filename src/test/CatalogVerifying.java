import core.TestData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {
    private void checkCatalogs(String pageName) {
        final By identifyElementLocatorCatalog = By.cssSelector(".catalog-navigation__title");
        final By identifyElementLocatorCatalogProducts = By.cssSelector(".schema-header__title");
        CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(identifyElementLocatorCatalog,driver );
        BaseCatalogProductsPage baseCatalogProductsPage = new BaseCatalogProductsPage(identifyElementLocatorCatalogProducts, driver) {
            @Override
            public boolean isPageOpened() {
                return super.isPageOpened();
            }
        };
        catalogNavigatorPage.isPageOpened();
        switch (pageName) {
            case "BicyclePage" : catalogNavigatorPage.goToBicyclePage();
                break;
            case "VideoCardPage" : catalogNavigatorPage.goToVideoCardPage();
                break;
            case "HeadphonesPage" : catalogNavigatorPage.goToHeadphonesPage();
                break;
            case "StrollersPage" : catalogNavigatorPage.goToStrollersPage();
                break;
            case "MobilePage" : catalogNavigatorPage.goToMobilePage();
                break;
            case "NotebookPage" : catalogNavigatorPage.goToNotebookPage();
                break;
            case "PhotoPage" : catalogNavigatorPage.goToPhotoPage();
                break;
            case "MotorOilPage" : catalogNavigatorPage.goToMotorOilPage();
                break;
            case "TabletPcPage" : catalogNavigatorPage.goToTabletPcPage();
                break;
            case "TiresPage" : catalogNavigatorPage.goToTiresPage();
                break;
            case "SmartWatchPage" : catalogNavigatorPage.goToSmartWatchPage();
                break;
        }
        baseCatalogProductsPage.isPageOpened(); //TODO Этот метод тоже за switch
        baseCatalogProductsPage.isAnyFilterExisted();
        baseCatalogProductsPage.isFilterSectionDisplayed();
        baseCatalogProductsPage.isProductsDisplayed();
    }

    @Test(priority = 1)
    public void BicyclePageTest() {
        checkCatalogs("BicyclePage");
    }

    @Test(priority = 2)
    public void VideoCardPageTest() {
        checkCatalogs("VideoCardPage");
    }

    @Test(priority = 3)
    public void HeadphonesPageTest() {
        checkCatalogs("HeadphonesPage");
    }

    @Test(priority = 4)
    public void StrollersPageTest() {
        checkCatalogs("StrollersPage");
    }

    @Test(priority = 5)
    public void MobilePageTest() {
        checkCatalogs("MobilePage");
    }

    @Test(priority = 6)
    public void NotebookPageTest() {
        checkCatalogs("NotebookPage");
    }

    @Test(priority = 7)
    public void PhotoPageTest() {
        checkCatalogs("PhotoPage");
    }

    @Test(priority = 8)
    public void MotorOilPageTest() {
        checkCatalogs("MotorOilPage");
    }

    @Test(priority = 9)
    public void TabletPcPageTest() {
        checkCatalogs("TabletPcPage");
    }

    @Test(priority = 10)
    public void TiresPageTest() { checkCatalogs("TiresPage"); }

    @Test(priority = 11)
    public void SmartWatchPage() {
        checkCatalogs("SmartWatchPage");
    }
}
