import core.TestData;
import org.testng.annotations.Test;
import pages.*;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class CatalogVerifying extends TestData {

    @Test(priority=0)
    public void MobileCatalogTest() {
        CatalogNavigatorPage.goToMobilePage(MobilePage);
        MobilePage.MobilePageIsOpened();
        MobilePage mb = new MobilePage();

        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test(priority=1)
    public void TabletPcCatalogTest() {
        CatalogNavigatorPage.goToTabletPcPage(driver);
        TabletPcPage.TabletPcPageIsOpened(driver);
        TabletPcPage.CheckTabletPcProducts(driver);
        TabletPcPage.CheckFilterSection(driver);
        TabletPcPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=2)
    public void NotebookCatalogTest() {
        CatalogNavigatorPage.goToNotebookPage(driver);
        NotebookPage.NotebookPageIsOpened(driver);
        NotebookPage.CheckNotebookProducts(driver);
        NotebookPage.CheckFilterSection(driver);
        NotebookPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=3)
    public void TvCatalogTest() {
        CatalogNavigatorPage.goToTvPage(driver);
        TvPage.TvPageIsOpened(driver);
        TvPage.CheckTvProducts(driver);
        TvPage.CheckFilterSection(driver);
        TvPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=4)
    public void PhotoCatalogTest() {
        CatalogNavigatorPage.goToPhotoPage(driver);
        PhotoPage.PhotoPageIsOpened(driver);
        PhotoPage.CheckPhotoProducts(driver);
        PhotoPage.CheckFilterSection(driver);
        PhotoPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=5)
    public void TiresCatalogTest() {
        CatalogNavigatorPage.goToTiresPage(driver);
        TiresPage.TiresPageIsOpened(driver);
        TiresPage.CheckTiresProducts(driver);
        TiresPage.CheckFilterSection(driver);
        TiresPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=6)
    public void RefrigeratorCatalogTest() {
        CatalogNavigatorPage.goToRefrigeratorPage(driver);
        RefrigeratorPage.RefrigeratorPageIsOpened(driver);
        RefrigeratorPage.CheckRefrigeratorProducts(driver);
        RefrigeratorPage.CheckFilterSection(driver);
        RefrigeratorPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=7)
    public void HeaterCatalogTest() {
        CatalogNavigatorPage.goToHeaterPage(driver);
        HeaterPage.HeaterPageIsOpened(driver);
        HeaterPage.CheckHeaterProducts(driver);
        HeaterPage.CheckFilterSection(driver);
        HeaterPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=8)
    public void DisplayCatalogTest() {
        CatalogNavigatorPage.goToDisplayPage(driver);
        DisplayPage.DisplayIsOpened(driver);
        DisplayPage.CheckDisplayProducts(driver);
        DisplayPage.CheckFilterSection(driver);
        DisplayPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=9)
    public void HeadphonesCatalogTest() {
        CatalogNavigatorPage.goToHeadphonesPage(driver);
        HeadphonesPage.HeadphonesPageIsOpened(driver);
        HeadphonesPage.CheckHeadphonesProducts(driver);
        HeadphonesPage.CheckFilterSection(driver);
        HeadphonesPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=10)
    public void DesktopPcCatalogTest() {
        CatalogNavigatorPage.goToDesktopPcPage(driver);
        DesktopPcPage.DesktopPcPageIsOpened(driver);
        DesktopPcPage.CheckDesktopPcProducts(driver);
        DesktopPcPage.CheckFilterSection(driver);
        DesktopPcPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=11)
    public void ActionCameraCatalogTest() {
        CatalogNavigatorPage.goToActionCameraPage();
        ActionCameraPage.ActionCameraPageIsOpened(driver);
        ActionCameraPage.CheckActionCameraProducts(driver);
        ActionCameraPage.CheckFilterSection(driver);
        ActionCameraPage.AnyFilterIsExisted(driver);
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
