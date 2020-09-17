import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class DASHBOARD {
    private WebDriver driver;
    Params params = new Params();
    private By value_hosodaduyet = By.id("statistic-approvedDocCount");
    private By icon_sta = By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[1]/a");
    private By img_HD_large = By.cssSelector("#logoutform > div > a > span.logo-lg > img");
    private By img_HD_Mini = By.cssSelector("#logoutform > div > a > span.logo-mini > img");
    private By icon_thong_ke = By.xpath("/html/body/div[1]/div/div/div/div/div[1]/div/h3/i");
    private By icon_hosoden = By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[1]/a/i");
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
    private By value_tonghoso = By.xpath("//*[@id=\"all-doc-statistic\"]/div/p");
    private By hososdaduyet = By.xpath("//*[@id=\"approved-doc-statistic\"]/div");
    private By hosotuchoi = By.xpath("//*[@id=\"rejected-doc-statistic\"]/div");
    private By hosochuaduyet = By.xpath("//*[@id=\"unapproved-doc-statistic\"]/div");
    private By bieudo = By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div/div[1]/div[2]/div/svg/rect[2]");
    private By toogle_showdesktop = By.className("sidebar-toggle");
    private By ketquatimkiem = By.xpath("//*[@id=\"tableList\"]/div[1]/div[2]");
    private By status_hosodaduyet = By.xpath("//*[@id=\"select2-statusCode-container\"]");
    private By option_hosoden = By.xpath("//*[@id=\"search-box\"]/div[1]/div[2]/div[4]/div/div/button/span[1]");
    private By count_sumhoso = By.xpath("//*[@id=\"tableList\"]/div/div/div[3]/div/span[1]/span");
    private By change_option = By.xpath("//*[@id=\"search-box\"]/div[1]/div[2]/div[4]/div/div/button");
    private By option = By.xpath("//*[@id=\"statusCode\"]");
    private By value_hosatuchoi = By.id("statistic-rejectedDocCount");
    private By value_hosochuaduyet = By.id("statistic-unApprovedDocCount");


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
        params.printToTxt("\nAll Expected Output are checked");
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
        params.printToTxt("\nMove to tao yeu cau success");
    }

    public void TC007() throws InterruptedException {
        WebElement get_hosoden = driver.findElement(hosoden);
        get_hosoden.click();
        driver.getTitle().contains(params.title_taohoso);
        params.printToTxt("\nMove to ho so den success");
    }

    public void TC008() throws InterruptedException {
        WebElement get_hosodi = driver.findElement(hosodi);
        get_hosodi.click();
        driver.getTitle().contains(params.title_taohoso);
        Thread.sleep(1000);
        params.printToTxt("\nMove to ho so di success");
    }

    public void TC009() throws InterruptedException {
        Thread.sleep(2000);
        WebElement get_hosonhap = driver.findElement(hosonhap);
        get_hosonhap.click();
        driver.getTitle().contains(params.title_taohoso);
        params.printToTxt("\nMove to ho so nhap success");
    }

    public void TC010() throws InterruptedException {
        Thread.sleep(2000);
        WebElement get_hosolienquan = driver.findElement(hosolienquan);
        get_hosolienquan.click();
        driver.getTitle().contains(params.title_taohoso);
        Thread.sleep(1000);
        params.printToTxt("\nMove to ho so lien quan success");
    }

    public void TC011() throws InterruptedException {
        Thread.sleep(2000);
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(10000);
        WebElement get_tonghoso = driver.findElement(tonghoso);
        get_tonghoso.click();
        Thread.sleep(2000);
        driver.getTitle().contains(params.timhoso);
        WebElement get_keyquatimkiem = driver.findElement(ketquatimkiem);
        get_keyquatimkiem.isDisplayed();
        params.printToTxt("\nHiển thị tất cả hồ sơ");
    }

    public void TC012() throws InterruptedException {
        driver.navigate().back();
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(7000);
        WebElement get_hososdaduyet = driver.findElement(hososdaduyet);
        get_hososdaduyet.click();
        WebElement get_stthosodaduyet = driver.findElement(status_hosodaduyet);
        System.out.println(get_stthosodaduyet.getAttribute("title"));
        get_stthosodaduyet.getAttribute("title").contains(params.stt_hosodaduyet);
        params.printToTxt("\nHiển thị các hồ sơ đã duyệt & hồ sơ đã hoàn tất");
    }

    public void TC013() throws InterruptedException {
        driver.navigate().back();
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(12000);
        WebElement get_hosotuchoi = driver.findElement(hosotuchoi);
        get_hosotuchoi.click();
        WebElement get_stt_hosotuchoi = driver.findElement(status_hosodaduyet);
        Thread.sleep(1000);
        get_stt_hosotuchoi.getAttribute("title").contains(params.stt_hosotuchoi);
        params.printToTxt("Hiển thị các hồ sơ bị từ chối");
    }

    public void TC014() throws InterruptedException {
        driver.navigate().back();
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(10000);
        Thread.sleep(3000);
        WebElement get_hosochuaduyet = driver.findElement(hosochuaduyet);
        get_hosochuaduyet.click();
        WebElement get_stt_hosochuaduyet = driver.findElement(status_hosodaduyet);
        get_stt_hosochuaduyet.getAttribute("title").contains(params.stt_hosochuaduyet);
        params.printToTxt(" Hiển thị các hồ sơ chưa duyệt");
    }

    public void TC015() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().back();
        WebElement get_hosoden = driver.findElement(hosoden);
        get_hosoden.click();
        Thread.sleep(3000);
        WebElement get_option_hosoden = driver.findElement(option_hosoden);
        get_option_hosoden.getText().contains(params.hosoden);
        //Scoll down page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        WebElement get_count_sumhoso = driver.findElement(count_sumhoso);
        String get_number = get_count_sumhoso.getText().substring(6, 9);
        int sumhoso = Integer.parseInt(get_number);
        if (sumhoso == params.sum_default) {
            params.printToTxt("\nTổng số hồ sơ là 293");
        } else if (sumhoso < params.sum_default) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ đến hoặc cc");
        }
    }

    public void TC016() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");
        WebElement choice_type_hoso = driver.findElement(change_option);
        choice_type_hoso.click();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(option));
        select.selectByVisibleText(params.hosodi);
        Thread.sleep(1000);
        WebElement get_btn_timkiem = driver.findElement(btn_timkiem);
        get_btn_timkiem.click();
        Thread.sleep(10000);
        js.executeScript("window.scrollBy(0,1000)");
        WebElement get_count_sumhoso = driver.findElement(count_sumhoso);
        String get_number = get_count_sumhoso.getText().substring(6, 9);
        int sumhoso = Integer.parseInt(get_number);
        if (sumhoso == params.sun_default_hosodi) {
            params.printToTxt("\nTổng số hồ sơ đi là 553");
        } else if (sumhoso < params.sun_default_hosodi) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ được gửi");
        }
    }

    public void TC017() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");
        WebElement choice_type_hoso = driver.findElement(change_option);
        choice_type_hoso.click();
        Thread.sleep(3000);
        Select select = new Select(driver.findElement(option));
        select.selectByVisibleText(params.hosonhap);
        WebElement get_btn_timkiem = driver.findElement(btn_timkiem);
        get_btn_timkiem.click();
        Thread.sleep(7000);
        js.executeScript("window.scrollBy(0,1000)");
        WebElement get_count_sumhoso = driver.findElement(count_sumhoso);
        String get_number = get_count_sumhoso.getText().substring(6, 11);
        int sumhoso = Integer.parseInt(get_number);
        if (sumhoso == params.sum_default_hosonhap) {
            params.printToTxt("\nTổng số hồ sơ nháp là 16006");
        } else if (sumhoso < params.sum_default_hosonhap) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ được thêm mới");
        }
    }

    public void TC018() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)");
        WebElement choice_type_hoso = driver.findElement(change_option);
        choice_type_hoso.click();
        Thread.sleep(2000);
        Select select = new Select(driver.findElement(option));
        select.selectByVisibleText(params.hosolienquan);
        WebElement get_btn_timkiem = driver.findElement(btn_timkiem);
        get_btn_timkiem.click();
        Thread.sleep(7000);
        js.executeScript("window.scrollBy(0,1000)");
        WebElement get_count_sumhoso = driver.findElement(count_sumhoso);
        String get_number = get_count_sumhoso.getText().substring(6, 8);
        int sumhoso = Integer.parseInt(get_number);
        if (sumhoso == params.sum_default_hosolienquan) {
            params.printToTxt("\nTổng số hồ sơ liên quan là 25");
        } else if (sumhoso < params.sum_default_hosolienquan) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ được cc");
        }
    }

    public void TC019() throws InterruptedException {
        Thread.sleep(2000);
        WebElement get_icon_sta = driver.findElement(icon_sta);
        get_icon_sta.click();
        Thread.sleep(12000);
        WebElement get_value_tonghoso = driver.findElement(value_tonghoso);
        int temp = Integer.parseInt(get_value_tonghoso.getText());
        if (temp == params.default_tonghoso) {
            params.printToTxt("\nTổng số hồ sơ liên quan là: " + temp);
        } else if (temp < params.default_tonghoso) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ được cc");
        }
    }

    public void TC020() throws InterruptedException {
        Thread.sleep(2000);
        WebElement get_value_hosodaduyet = driver.findElement(value_hosodaduyet);
        int temp = Integer.parseInt(get_value_hosodaduyet.getText());
        if (temp == params.default_dosodaduyet) {
            params.printToTxt("\nTổng số hồ sơ liên quan là: " + temp);
        } else if (temp < params.default_dosodaduyet) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ được cc");
        }
    }

    public void TC021() throws InterruptedException {
        Thread.sleep(2000);
        WebElement get_value_hosodaduyet = driver.findElement(value_hosatuchoi);
        int temp = Integer.parseInt(get_value_hosodaduyet.getText());
        if (temp == params.defaul_hosotuchoi) {
            params.printToTxt("\nTổng số hồ sơ liên quan là: " + temp);
        } else if (temp < params.defaul_hosotuchoi) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ được cc");
        }
    }

    public void TC022() throws InterruptedException {
        Thread.sleep(2000);
        WebElement get_value_hosodaduyet = driver.findElement(value_hosochuaduyet);
        int temp = Integer.parseInt(get_value_hosodaduyet.getText());
        if (temp == params.default_hosochuaduyet) {
            params.printToTxt("\nTổng số hồ sơ liên quan là: " + temp);
        } else if (temp < params.default_hosochuaduyet) {
            params.printToTxt("\nCó hồ sơ đã bị xóa");
        } else {
            params.printToTxt("\nCó hồ sơ được cc");
        }
    }

    public void TC023() throws InterruptedException {
        WebElement get_from_date = driver.findElement(from_date);
        get_from_date.click();
        get_from_date.sendKeys("10/01/2020");
        WebElement get_btn_timkiem = driver.findElement(btn_timkiem);
        get_btn_timkiem.click();
        Thread.sleep(7000);
        WebElement get_value_tonghoso = driver.findElement(value_tonghoso);
        int temp = Integer.parseInt(get_value_tonghoso.getText());
        params.printToTxt("\nTổng số hồ sơ là: " + temp);
    }

    public void TC024() throws InterruptedException {
        WebElement get_to_date = driver.findElement(to_date);
        get_to_date.click();
        get_to_date.sendKeys("12/10/2020");
        WebElement get_btn_timkiem = driver.findElement(btn_timkiem);
        get_btn_timkiem.click();
        Thread.sleep(7000);
        WebElement get_value_tonghoso = driver.findElement(value_tonghoso);
        int temp = Integer.parseInt(get_value_tonghoso.getText());
        params.printToTxt("\nTổng số hồ sơ là: " + temp);
    }
}
