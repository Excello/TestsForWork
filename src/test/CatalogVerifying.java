import core.TestData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Englich on 11.11.2017.
 */
public class CatalogVerifying extends TestData {
    private void checkCatalogs(String pageName) {
        CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(By.cssSelector(".catalog-navigation__title"), driver);

        //TODO Убрать. Класс для того и сделан абстрактным, чтобы не создавать его
        BaseCatalogProductsPage page;
        catalogNavigatorPage.isPageOpened();
        switch (pageName) {
            case "BicyclePage":
                page = catalogNavigatorPage.goToBicyclePage();
                break;
            case "VideoCardPage":
                page = catalogNavigatorPage.goToVideoCardPage();
                break;
            case "HeadphonesPage":
                page = catalogNavigatorPage.goToHeadphonesPage();
                break;
            case "StrollersPage":
                page = catalogNavigatorPage.goToStrollersPage();
                break;
            case "MobilePage":
                page = catalogNavigatorPage.goToMobilePage();
                break;
            case "NotebookPage":
                page = catalogNavigatorPage.goToNotebookPage();
                break;
            case "PhotoPage":
                page = catalogNavigatorPage.goToPhotoPage();
                break;
            case "MotorOilPage":
                page = catalogNavigatorPage.goToMotorOilPage();
                break;
            case "TabletPcPage":
                page = catalogNavigatorPage.goToTabletPcPage();
                break;
            case "TiresPage":
                page = catalogNavigatorPage.goToTiresPage();
                break;
            case "SmartWatchPage":
                page = catalogNavigatorPage.goToSmartWatchPage();
                break;
            default:
                throw new UnsupportedOperationException();
        }
        page.isPageOpened();
        page.isProductsDisplayed();
        page.isFilterSectionDisplayed();
        page.isAnyFilterExisted();
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
    public void TiresPageTest() {
        checkCatalogs("TiresPage");
    }

    @Test(priority = 11)
    public void SmartWatchPage() {
        checkCatalogs("SmartWatchPage");
    }
}
