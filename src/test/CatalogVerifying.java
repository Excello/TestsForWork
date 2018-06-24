import core.TestData;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {
    private void checkCatalogs(String pageName) {
        CatalogNavigatorPage catalogNavigatorPage = new CatalogNavigatorPage(driver);
        //BasePage basePage = new BasePage(driver);
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
        basePage.isPageOpened("BicyclePage"); //TODO Этот метод тоже за switch
        basePage.isAnyFilterExisted();
        basePage.isFilterSectionDisplayed();
        basePage.isProductsDisplayed();
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
