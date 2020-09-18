import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PROFILE {

    private WebDriver driver;
    private By username = By.xpath("//*[@id=\"logoutform\"]/div/nav/div[1]/div/ul/li[2]/a/p");
    private By user_infor_Logout = By.xpath("//*[@id=\"infoUser\"]");
    private By input_manhanvien = By.id("code");
    private By input_username = By.id("username1");
    private By input_fullname = By.id("fullname");
    private By input_birthDay = By.id("birthday");
    private By input_gioitinh = By.id("gender");
    private By input_email = By.id("email");
    private By input_phone = By.id("phone");
    private By input_cmnd = By.id("cmnd");
    private By avatar = By.id("imgAccount");
    private By nhanthongbao = By.xpath("//*[@id=\"togglePushNotification\"]/i");
    private By nhanEmail = By.xpath("//*[@id=\"togglePushEmail\"]/i");
    private By btn_luu = By.xpath("//*[@id=\"search-box-1\"]/div[3]/a");
    private By tochuc = By.xpath("//*[@id=\"id-org-for-account\"]/div/div[1]/div/h2");
    private By table = By.xpath("//*[@id=\"orgForAccountTable\"]/thead/tr");


    Params params = new Params();

    public PROFILE(WebDriver driver) {
        this.driver = driver;
    }

    public void TC01() throws InterruptedException {
        WebElement get_username = driver.findElement(username);
        get_username.click();
        Thread.sleep(2000);
        WebElement get_user_inforLogout = driver.findElement(user_infor_Logout);
        get_user_inforLogout.click();
        Thread.sleep(2000);
        driver.getTitle().contains(params.title_page_userInformation);
        params.printToTxt("\nĐiều hướng đến page thông tin người dùng");
        WebElement get_input_manhanvien = driver.findElement(input_manhanvien);
        get_input_manhanvien.getAttribute("disabled").compareTo("true");

        WebElement get_input_username = driver.findElement(input_username);
        get_input_username.getAttribute("disabled").compareTo("true");

        WebElement get_input_fullname = driver.findElement(input_fullname);
        get_input_fullname.getAttribute("disabled").compareTo("true");

        WebElement get_input_birthDay = driver.findElement(input_birthDay);
        get_input_birthDay.getAttribute("disabled").compareTo("true");

        WebElement get_input_gioitinh = driver.findElement(input_gioitinh);
        get_input_gioitinh.getAttribute("disabled").compareTo("true");

        WebElement get_input_email = driver.findElement(input_email);
        get_input_email.getAttribute("disabled").compareTo("true");

        WebElement get_input_phone = driver.findElement(input_phone);
        get_input_phone.getAttribute("disabled").compareTo("true");

        WebElement get_input_cmnd = driver.findElement(input_cmnd);
        get_input_cmnd.getAttribute("disabled").compareTo("true");

        params.printToTxt("\nAll fields are displayed, But cannot mordify");

        WebElement get_avatar = driver.findElement(avatar);
        get_avatar.isDisplayed();

        WebElement get_nhanthongbao = driver.findElement(nhanthongbao);
        get_nhanthongbao.isSelected();

        WebElement get_nhanemail = driver.findElement(nhanEmail);
        get_nhanemail.isSelected();

        WebElement get_btn_luu = driver.findElement(btn_luu);
        get_btn_luu.isDisplayed();

        WebElement get_text_tochuc = driver.findElement(tochuc);
        get_text_tochuc.isDisplayed();


        WebElement get_table = driver.findElement(table);
        List<WebElement> ElementCollector = get_table.findElements(By.xpath("//*[@id=\"orgForAccountTable\"]/thead/tr/th"));
        for (WebElement item : ElementCollector) {
            params.printToTxt(item.getText());
        }
        System.out.println("Expected Output are checked");

    }


}
