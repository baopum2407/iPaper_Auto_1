import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DASHBOARD {
    private WebDriver driver;
    Params params = new Params();
    private By icon_sta = By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[1]/a");
    private By img_HD_large = By.cssSelector("#logoutform > div > a > span.logo-lg > img");
    private By img_HD_Mini = By.cssSelector("#logoutform > div > a > span.logo-mini > img");
    private By icon_thong_ke = By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/h3/i");
    private By thong_ke = By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/h3/span");
    private By ho_so_cua_toi = By.cssSelector("body > div.wrapper > div > div > div > div > div.box-page-wrapper.row > div.header-box > div > h2");
    private By taoyeucau = By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[1]/div[2]/div[2]");
    private By hosoden = By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div[2]");
    private By hosodi = By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div[2]");
    private By hosonhap = By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[4]/div[2]/div[2]");
    private By hosolienquan = By.xpath("/html/body/div[1]/div/div/div/div/div[2]/div[2]/div/div[5]/div[2]/div[2]");
    private By thongke = By.xpath("//*[@id=\"search-box\"]/div/div/label");
    private By from_date = By.xpath("//*[@id=\"fromDate\"]");
    private By to_date = By.xpath("//*[@id=\"toDate\"]");
    private By btn_timkiem = By.xpath("//*[@id=\"btnSearch\"]");
    private By thongketrangthaihoso = By.xpath("//*[@id=\"tableList\"]/div/div[1]/div[1]/h2");
    private By tonghoso = By.xpath("//*[@id=\"all-doc-statistic\"]/div");
    private By hososdaduyet = By.xpath("//*[@id=\"approved-doc-statistic\"]/div");
    private By hosotuchoi = By.xpath("//*[@id=\"rejected-doc-statistic\"]/div");
    private By hosochuaduyet = By.xpath("//*[@id=\"unapproved-doc-statistic\"]/div");
    private By bieudo = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[1]/div[2]/div/svg/rect[2]");
    private By toogle_showdesktop = By.className("sidebar-toggle");
    private By ketquatimkiem = By.xpath("//*[@id=\"tableList\"]/div[1]/div[2]");
    private By status_hosodaduyet = By.xpath("//*[@id=\"select2-statusCode-container\"]");

    public DASHBOARD(WebDriver driver) {
        this.driver = driver;
    }

    public void TC001() throws InterruptedException {
        Thread.sleep(3000);
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(10000);

        WebElement get_img_HD_Mini = driver.findElement(img_HD_Mini);
        get_img_HD_Mini.isDisplayed();

        WebElement get_icon_thong_ke = driver.findElement(icon_thong_ke);
        get_icon_thong_ke.isDisplayed();

        WebElement get_thong_ke = driver.findElement(thong_ke);
        get_thong_ke.getText().contains(params.thong_ke);

        WebElement get_ho_so_cua_toi = driver.findElement(ho_so_cua_toi);
        get_ho_so_cua_toi.getText().contains(params.hosocuatoi);

        WebElement get_taoyeucau = driver.findElement(taoyeucau);
        get_taoyeucau.isDisplayed();

        WebElement get_hosoden = driver.findElement(hosoden);
        get_hosoden.getText().contains(params.hosoden);

        WebElement get_hosodi = driver.findElement(hosodi);
        get_hosodi.getText().contains(params.hosodi);

        WebElement get_hosonhap = driver.findElement(hosonhap);
        get_hosonhap.getText().contains(params.hosonhap);

        WebElement get_hosolienquan = driver.findElement(hosolienquan);
        get_hosolienquan.getText().contains(params.hosolienquan);

        WebElement get_thongke = driver.findElement(thongke);
        get_thongke.getText().contains("Thống kê");

        WebElement get_from_date = driver.findElement(from_date);
        get_from_date.getAttribute("placeholder").contains("Từ ngày");

        WebElement get_to_date = driver.findElement(to_date);
        get_to_date.getAttribute("placeholder").contains("Đến ngày");

        WebElement get_btn_timkiem = driver.findElement(btn_timkiem);
        get_btn_timkiem.isDisplayed();

        WebElement get_thongketrangthaihoso = driver.findElement(thongketrangthaihoso);
        get_thongketrangthaihoso.getText().contains(params.thongketrangthaihoso);

        WebElement get_tonghoso = driver.findElement(tonghoso);
        get_tonghoso.getAttribute("title").contains(params.tonghoso);

        WebElement get_hososdaduyet = driver.findElement(hososdaduyet);
        get_hososdaduyet.getAttribute("title").contains(params.hosodaduyet);

        WebElement get_hosotuchoi = driver.findElement(hosotuchoi);
        get_hosotuchoi.getAttribute("title").contains(params.hosotuchoi);

        WebElement get_hosochuaduyet = driver.findElement(hosochuaduyet);
        get_hosochuaduyet.getAttribute("title").contains(params.hosochuaduyet);

//        WebElement get_bieudo = driver.findElement(bieudo);
//        get_bieudo.isDisplayed();
    }

    public void TC004() {
        WebElement get_img_mimi = driver.findElement(img_HD_Mini);
        get_img_mimi.isDisplayed();
        params.printToTxt("\nMenu thu gọn");
    }

    public void TC005() throws InterruptedException {
        WebElement get_toogle_showdesktop = driver.findElement(toogle_showdesktop);
        get_toogle_showdesktop.click();
        Thread.sleep(1000);
        WebElement get_img_large = driver.findElement(img_HD_large);
        get_img_large.isDisplayed();
        params.printToTxt("\nMở rộng menu");
    }

    public void TC006() throws InterruptedException {
        WebElement get_toogle_showdesktop = driver.findElement(toogle_showdesktop);
        get_toogle_showdesktop.click();
        WebElement get_taoyeucau = driver.findElement(taoyeucau);
        get_taoyeucau.click();
        driver.getTitle().contains(params.title_taohoso);
        driver.navigate().back();
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(10000);
    }

    public void TC007() throws InterruptedException {
        WebElement get_hosoden = driver.findElement(hosoden);
        get_hosoden.click();
        driver.getTitle().contains(params.title_taohoso);
    }

    public void TC008() throws InterruptedException {
        WebElement get_hosodi = driver.findElement(hosodi);
        get_hosodi.click();
        driver.getTitle().contains(params.title_taohoso);
        Thread.sleep(1000);
    }

    public void TC009() throws InterruptedException {
        WebElement get_hosonhap = driver.findElement(hosonhap);
        get_hosonhap.click();
        driver.getTitle().contains(params.title_taohoso);

    }

    public void TC010() throws InterruptedException {
        WebElement get_hosolienquan = driver.findElement(hosolienquan);
        get_hosolienquan.click();
        driver.getTitle().contains(params.title_taohoso);
        Thread.sleep(1000);

    }

    public void TC011() throws InterruptedException {
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(10000);
        WebElement get_tonghoso = driver.findElement(tonghoso);
        get_tonghoso.click();
        Thread.sleep(2000);
        driver.getTitle().contains(params.timhoso);
        WebElement get_keyquatimkiem = driver.findElement(ketquatimkiem);
        get_keyquatimkiem.isDisplayed();
    }

    public void TC012() throws InterruptedException {
        driver.navigate().back();
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(6000);
        WebElement get_hososdaduyet = driver.findElement(hososdaduyet);
        get_hososdaduyet.click();
        WebElement get_stthosodaduyet = driver.findElement(status_hosodaduyet);
        get_stthosodaduyet.getAttribute("title").contains(params.stt_hosodaduyet);

    }
}
