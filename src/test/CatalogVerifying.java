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
        CatalogPage.GoToMobilePage(driver);
        MobilePage.MobilePageIsOpened(driver);
        MobilePage.CheckMobileProducts(driver);
        MobilePage.CheckFilterSection(driver);
        MobilePage.AnyFilterIsExisted(driver);
    }
    @Test(priority=1)
    public void TabletPcCatalogTest() {
        CatalogPage.GoToTabletPcPage(driver);
        TabletPcPage.TabletPcPageIsOpened(driver);
        TabletPcPage.CheckTabletPcProducts(driver);
        TabletPcPage.CheckFilterSection(driver);
        TabletPcPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=2)
    public void NotebookCatalogTest() {
        CatalogPage.GoToNotebookPage(driver);
        NotebookPage.NotebookPageIsOpened(driver);
        NotebookPage.CheckNotebookProducts(driver);
        NotebookPage.CheckFilterSection(driver);
        NotebookPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=3)
    public void TvCatalogTest() {
        CatalogPage.GoToTvPage(driver);
        TvPage.TvPageIsOpened(driver);
        TvPage.CheckTvProducts(driver);
        TvPage.CheckFilterSection(driver);
        TvPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=4)
    public void PhotoCatalogTest() {
        CatalogPage.GoToPhotoPage(driver);
        PhotoPage.PhotoPageIsOpened(driver);
        PhotoPage.CheckPhotoProducts(driver);
        PhotoPage.CheckFilterSection(driver);
        PhotoPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=5)
    public void TiresCatalogTest() {
        CatalogPage.GoToTiresPage(driver);
        TiresPage.TiresPageIsOpened(driver);
        TiresPage.CheckTiresProducts(driver);
        TiresPage.CheckFilterSection(driver);
        TiresPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=6)
    public void RefrigeratorCatalogTest() {
        CatalogPage.GoToRefrigeratorPage(driver);
        RefrigeratorPage.RefrigeratorPageIsOpened(driver);
        RefrigeratorPage.CheckRefrigeratorProducts(driver);
        RefrigeratorPage.CheckFilterSection(driver);
        RefrigeratorPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=7)
    public void HeaterCatalogTest() {
        CatalogPage.GoToHeaterPage(driver);
        HeaterPage.HeaterPageIsOpened(driver);
        HeaterPage.CheckHeaterProducts(driver);
        HeaterPage.CheckFilterSection(driver);
        HeaterPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=8)
    public void DisplayCatalogTest() {
        CatalogPage.GoToDisplayPage(driver);
        DisplayPage.DisplayIsOpened(driver);
        DisplayPage.CheckDisplayProducts(driver);
        DisplayPage.CheckFilterSection(driver);
        DisplayPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=9)
    public void HeadphonesCatalogTest() {
        CatalogPage.GoToHeadphonesPage(driver);
        HeadphonesPage.HeadphonesPageIsOpened(driver);
        HeadphonesPage.CheckHeadphonesProducts(driver);
        HeadphonesPage.CheckFilterSection(driver);
        HeadphonesPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=10)
    public void DesktopPcCatalogTest() {
        CatalogPage.GoToDesktopPcPage(driver);
        DesktopPcPage.DesktopPcPageIsOpened(driver);
        DesktopPcPage.CheckDesktopPcProducts(driver);
        DesktopPcPage.CheckFilterSection(driver);
        DesktopPcPage.AnyFilterIsExisted(driver);
    }
    @Test(priority=11)
    public void ActionCameraCatalogTest() {
        CatalogPage.GoToActionCameraPage(driver);
        ActionCameraPage.ActionCameraPageIsOpened(driver);
        ActionCameraPage.CheckActionCameraProducts(driver);
        ActionCameraPage.CheckFilterSection(driver);
        ActionCameraPage.AnyFilterIsExisted(driver);
    }

   /* Impossible to find on page these catalogs
    @Test
    public void PrintersCatalogTest() {
        CatalogPage.GoToPrinterPage(driver);
        PrintersPage.PrintersPageIsOpened(driver);
        PrintersPage.CheckPrintersProducts(driver);
        PrintersPage.CheckFilterSection(driver);
        PrintersPage.AnyFilterIsExisted(driver);
    }
    @Test
    public void ParfumeCatalogTest() {
        CatalogPage.GoToParfumePage(driver);
        ParfumePage.ParfumePageIsOpened(driver);
        ParfumePage.CheckParfumeProducts(driver);
        ParfumePage.CheckFilterSection(driver);
        ParfumePage.AnyFilterIsExisted(driver);
    }
    @Test
    public void HouseCatalogTest() {
        CatalogPage.GoToHousePage(driver);
        HousePage.HousePageIsOpened(driver);
        HousePage.CheckHouseProducts(driver);
        HousePage.CheckFilterSection(driver);
        HousePage.AnyFilterIsExisted(driver);
    }*/
}
