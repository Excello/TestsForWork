import core.TestData;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {
    private CommonCatalogPage commonCatalogPagePageItems = new CommonCatalogPage().isProductsDisplayed();
    private CommonCatalogPage commonCatalogPageItemsFilters = new CommonCatalogPage().isFilterSectionDisplayed();
    private CommonCatalogPage commonCatalogPageAnyFilter = new CommonCatalogPage().isAnyFilterExisted();

    @Test(priority=0)
    public void MobileCatalogTest() {
        MobilePage mobilePage = new CatalogNavigatorPage().goToMobilePage();
        MobilePage mobilePageResult = new MobilePage().isMobilePageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }

    @Test(priority=1)
    public void TabletPcCatalogTest() {
        TabletPcPage tabletPcPage = new CatalogNavigatorPage().goToTabletPcPage();
        TabletPcPage tabletPcPageResult = new TabletPcPage().isTabletPcPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=2)
    public void NotebookCatalogTest() {
        NotebookPage notebookPage = new CatalogNavigatorPage().goToNotebookPage();
        NotebookPage notebookPageResult = new NotebookPage().isNotebookPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=3)
    public void TvCatalogTest() {
        TvPage tvPage = new CatalogNavigatorPage().goToTvPage();
        TvPage tvPageResult = new TvPage().isTvPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=4)
    public void PhotoCatalogTest() {
        PhotoPage photoPage = new CatalogNavigatorPage().goToPhotoPage();
        PhotoPage photoPageResult = new PhotoPage().isPhotoPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=5)
    public void TiresCatalogTest() {
        TiresPage tiresPage = new CatalogNavigatorPage().goToTiresPage();
        TiresPage tiresPageResult = new TiresPage().isTiresPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=6)
    public void RefrigeratorCatalogTest() {
        RefrigeratorPage refrigeratorPage = new CatalogNavigatorPage().goToRefrigeratorPage();
        RefrigeratorPage refrigeratorPageResult = new RefrigeratorPage().isRefrigeratorPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=7)
    public void HeaterCatalogTest() {
        HeaterPage heaterPage = new CatalogNavigatorPage().goToHeaterPage();
        HeaterPage heaterPageResult = new HeaterPage().isHeaterPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=8)
    public void DisplayCatalogTest() {
        DisplayPage displayPage = new CatalogNavigatorPage().goToDisplayPage();
        DisplayPage displayPageResult = new DisplayPage().isDisplayPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=9)
    public void HeadphonesCatalogTest() {
        HeadphonesPage headphonesPage = new CatalogNavigatorPage().goToHeadphonesPage();
        HeadphonesPage headphonesPageResult = new HeadphonesPage().isHeadphonesPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=10)
    public void DesktopPcCatalogTest() {
        DesktopPcPage desktopPcPage = new CatalogNavigatorPage().goToDesktopPcPage();
        DesktopPcPage desktopPcPageResult = new DesktopPcPage().isDesktopPcPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }
    @Test(priority=11)
    public void ActionCameraCatalogTest() {
        ActionCameraPage actionCameraPage = new CatalogNavigatorPage().goToActionCameraPage();
        ActionCameraPage actionCameraPageResult = new ActionCameraPage().isActionCameraPageOpened();
        commonCatalogPagePageItems.isProductsDisplayed();
        commonCatalogPageItemsFilters.isFilterSectionDisplayed();
        commonCatalogPageAnyFilter.isAnyFilterExisted();
    }

   /* Impossible to find on page these catalogs
    @Test
    public void PrintersCatalogTest() {
        CatalogNavigatorPage.GoToPrinterPage(driver);
        PrintersPage.PrintersPageIsOpened(driver);
        PrintersPage.CheckPrintersProducts(driver);
        PrintersPage.CheckFilterSection(driver);
        PrintersPage.AnyFilterIsExisted(driver);
    }
    @Test
    public void ParfumeCatalogTest() {
        CatalogNavigatorPage.GoToParfumePage(driver);
        ParfumePage.ParfumePageIsOpened(driver);
        ParfumePage.CheckParfumeProducts(driver);
        ParfumePage.CheckFilterSection(driver);
        ParfumePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void HouseCatalogTest() {
        CatalogNavigatorPage.GoToHousePage(driver);
        HousePage.HousePageIsOpened(driver);
        HousePage.CheckHouseProducts(driver);
        HousePage.CheckFilterSection(driver);
        HousePage.AnyFilterIsExisted(driver);
    }*/
}
