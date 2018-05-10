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

        //TODO
        //1. В switch оставить только переход на страницу. вызов isProductsDisplayed, isFilterSectionDisplayed, isAnyFilterExisted сделать за switch
        //2. Не нравится привязка к текстовому имени класса. Лучше напрямую делать например BicyclePage.class.getSimpleName()
        //3. В действительности лучше сдедать в catalogNavigatorPage метод openSubCatalog(Class catalogClass)
        switch (pageName) {
            case "BicyclePage" : BicyclePage bicyclePage = catalogNavigatorPage.goToBicyclePage();
                bicyclePage.isActionCameraPageOpened();
                bicyclePage.isProductsDisplayed();
                bicyclePage.isFilterSectionDisplayed();
                bicyclePage.isAnyFilterExisted();
                break;
            case "VideoCardPage" : VideoCardPage videoCardPage = catalogNavigatorPage.goToVideoCardPage();
                videoCardPage.isDisplayPageOpened();
                videoCardPage.isProductsDisplayed();
                videoCardPage.isFilterSectionDisplayed();
                videoCardPage.isAnyFilterExisted();
                break;
            case "HeadphonesPage" : HeadphonesPage headphonesPage = catalogNavigatorPage.goToHeadphonesPage();
                headphonesPage.isHeadphonesPageOpened();
                headphonesPage.isProductsDisplayed();
                headphonesPage.isFilterSectionDisplayed();
                headphonesPage.isAnyFilterExisted();
                break;
            case "StrollersPage" : StrollersPage strollersPage = catalogNavigatorPage.goToStrollersPage();
                strollersPage.isHeaterPageOpened();
                strollersPage.isProductsDisplayed();
                strollersPage.isFilterSectionDisplayed();
                strollersPage.isAnyFilterExisted();
                break;
            case "MobilePage" : MobilePage mobilePage = catalogNavigatorPage.goToMobilePage();
                mobilePage.isMobilePageOpened();
                mobilePage.isProductsDisplayed();
                mobilePage.isFilterSectionDisplayed();
                mobilePage.isAnyFilterExisted();
                break;
            case "NotebookPage" : NotebookPage notebookPage = catalogNavigatorPage.goToNotebookPage();
                notebookPage.isNotebookPageOpened();
                notebookPage.isProductsDisplayed();
                notebookPage.isFilterSectionDisplayed();
                notebookPage.isAnyFilterExisted();
                break;
            case "PhotoPage" : PhotoPage photoPage = catalogNavigatorPage.goToPhotoPage();
                photoPage.isPhotoPageOpened();
                photoPage.isProductsDisplayed();
                photoPage.isFilterSectionDisplayed();
                photoPage.isAnyFilterExisted();
                break;
            case "MotorOilPage" : MotorOilPage motorOilPage = catalogNavigatorPage.goToMotorOilPage();
                motorOilPage.isRefrigeratorPageOpened();
                motorOilPage.isProductsDisplayed();
                motorOilPage.isFilterSectionDisplayed();
                motorOilPage.isAnyFilterExisted();
                break;
            case "TabletPcPage" : TabletPcPage tabletPcPage = catalogNavigatorPage.goToTabletPcPage();
                tabletPcPage.isTabletPcPageOpened();
                tabletPcPage.isProductsDisplayed();
                tabletPcPage.isFilterSectionDisplayed();
                tabletPcPage.isAnyFilterExisted();
                break;
            case "TiresPage" : TiresPage tiresPage = catalogNavigatorPage.goToTiresPage();
                tiresPage.isTiresPageOpened();
                tiresPage.isProductsDisplayed();
                tiresPage.isFilterSectionDisplayed();
                tiresPage.isAnyFilterExisted();
                break;
            case "SmartWatchPage" : SmartWatchPage smartWatchPage = catalogNavigatorPage.goToSmartWatchPage();
                smartWatchPage.isSmartWatchPageOpened();
                smartWatchPage.isProductsDisplayed();
                smartWatchPage.isFilterSectionDisplayed();
                smartWatchPage.isAnyFilterExisted();
                break;
        }
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
