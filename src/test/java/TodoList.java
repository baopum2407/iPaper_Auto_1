import gherkin.lexer.Pa;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TodoList {
    Params params = new Params();
    private WebDriver driver;
    private By img_HD_Mini = By.cssSelector("#logoutform > div > a > span.logo-mini > img");
    private By icon_sta = By.className("u-fa-dashboard");
    private By icon_ducoment = By.className("u-fa-todo");
    private By icon_search_document = By.className("u-fa-list-request");
    private By icon_request = By.className("u-fa-form-request");
    private By icon_Dowload = By.className("fa-download");
    private By icon_support = By.className("u-fa-support");
    private By toogle_showdesktop = By.className("sidebar-toggle");
    private By title = By.xpath("//*[@id=\"logoutform\"]/div/nav/h3");
    private By notification = By.id("notify-count");
    private By avatar = By.xpath("//*[@id=\"logoutform\"]/div/nav/div[1]/div/ul/li[2]/a/img");
    private By wellcome = By.xpath("//*[@id=\"logoutform\"]/div/nav/div[1]/div/ul/li[2]/a/span");
    private By username = By.xpath("//*[@id=\"logoutform\"]/div/nav/div[1]/div/ul/li[2]/a/p");
    private By language = By.xpath("//*[@id=\"logoutform\"]/div/nav/div[1]/div/ul/li[3]/a");
    private By notification_table = By.xpath("//*[@id=\"logoutform\"]/div/nav/div[1]/div/ul/li[1]/ul/li[1]/span[1]/b");
    private By user_infor_Logout = By.xpath("//*[@id=\"logoutform\"]/div/nav/div[1]/div/ul/li[2]/ul");

    public TodoList(WebDriver driver) {
        this.driver = driver;
    }

    public void TC001() {
        WebElement get_HD_mimi = driver.findElement(img_HD_Mini);
        get_HD_mimi.isDisplayed();
        WebElement getIcon_static = driver.findElement(icon_sta);
        getIcon_static.isDisplayed();
        WebElement get_iconDocument = driver.findElement(icon_ducoment);
        get_iconDocument.isDisplayed();
        WebElement get_iconSearchDoc = driver.findElement(icon_search_document);
        get_iconSearchDoc.isDisplayed();
        WebElement get_icon_request = driver.findElement(icon_request);
        get_icon_request.isDisplayed();
        WebElement get_icon_dowload = driver.findElement(icon_Dowload);
        get_icon_dowload.isDisplayed();
        WebElement get_icon_support = driver.findElement(icon_support);
        get_icon_support.isDisplayed();
    }

    public void TC002() {
        WebElement toogle_showdesktop_click = driver.findElement(toogle_showdesktop);
        toogle_showdesktop_click.click();
        WebElement get_HD_mimi = driver.findElement(img_HD_Mini);
        get_HD_mimi.isDisplayed();
        WebElement getIcon_static = driver.findElement(icon_sta);
        getIcon_static.isDisplayed();
        WebElement get_iconDocument = driver.findElement(icon_ducoment);
        get_iconDocument.isDisplayed();
        WebElement get_iconSearchDoc = driver.findElement(icon_search_document);
        get_iconSearchDoc.isDisplayed();
        WebElement get_icon_request = driver.findElement(icon_request);
        get_icon_request.isDisplayed();
        WebElement get_icon_contact = driver.findElement(icon_Dowload);
        get_icon_contact.isDisplayed();
        WebElement get_icon_support = driver.findElement(icon_support);
        get_icon_support.isDisplayed();
    }

    public void TC003_to_TC006_TC008() throws InterruptedException {
        WebElement getIcon_static = driver.findElement(icon_sta);
        getIcon_static.click();
        Thread.sleep(10000);

        WebElement get_iconDocument = driver.findElement(icon_ducoment);
        get_iconDocument.click();
        Thread.sleep(10000);

        WebElement get_iconSearchDoc = driver.findElement(icon_search_document);
        get_iconSearchDoc.click();
        Thread.sleep(10000);

        WebElement get_icon_request = driver.findElement(icon_request);
        get_icon_request.click();
        Thread.sleep(10000);

        WebElement get_icon_support = driver.findElement(icon_support);
        get_icon_support.click();
        Thread.sleep(10000);

    }

    public void TC007() throws InterruptedException, IOException {
        deleteDocumentIfexist();
        WebElement get_icon_contact = driver.findElement(icon_Dowload);
        get_icon_contact.click();
        Thread.sleep(4000);
        File tempFile = new File("C:/Users/baotg3/Downloads/wipaper.pdf");
        boolean exists = tempFile.exists();
        params.printToTxt("Download success");
    }

    public void TC011_to_016() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement getIcon_static = driver.findElement(icon_sta);
        actions.moveToElement(getIcon_static);
        Thread.sleep(2000);
        getIcon_static.getAttribute("title").contains(params.tooltip_Static);
        WebElement get_iconDocument = driver.findElement(icon_ducoment);
        WebElement get_iconSearchDoc = driver.findElement(icon_search_document);
        WebElement get_icon_request = driver.findElement(icon_request);
        WebElement get_icon_contact = driver.findElement(icon_Dowload);
        WebElement get_icon_support = driver.findElement(icon_support);
        actions.moveToElement(get_iconDocument);
        Thread.sleep(2000);
        get_iconDocument.getAttribute("title").contains(params.tooltip_document);
        actions.moveToElement(get_iconSearchDoc);
        Thread.sleep(2000);
        get_iconSearchDoc.getAttribute("title").contains(params.tooltip_SearchDocument);

        actions.moveToElement(get_icon_request);
        Thread.sleep(2000);
        get_icon_request.getAttribute("title").contains(params.tooltip_CreateDuconemt);

        actions.moveToElement(get_icon_contact);
        Thread.sleep(2000);
        get_icon_contact.getAttribute("title").contains(params.tooltip_userguide);

        actions.moveToElement(get_icon_support);
        Thread.sleep(2000);
        get_icon_support.getAttribute("title").contains(params.tooltip_Support);
    }

    private void deleteDocumentIfexist() throws IOException {
        Files.deleteIfExists(Paths.get("C:/Users/baotg3/Downloads/wipaper.pdf"));
    }

    public void TC017() {
        WebElement get_HD_mimi = driver.findElement(img_HD_Mini);
        get_HD_mimi.isDisplayed();

        WebElement get_title = driver.findElement(title);
        get_title.getText().contains(params.iPaperSystem);

        WebElement get_icon_notifcation = driver.findElement(notification);
        get_icon_notifcation.isDisplayed();

        WebElement get_avatar = driver.findElement(avatar);
        get_avatar.isDisplayed();

        WebElement get_wellcome = driver.findElement(wellcome);
        get_wellcome.getText().contains(params.wellcome);

        WebElement get_username = driver.findElement(username);
        get_username.getText().contains(params.ReadUserNameFile());

        WebElement get_language = driver.findElement(language);
        get_language.isDisplayed();
    }

    public void TC018() {
        WebElement get_avatar = driver.findElement(avatar);
        get_avatar.getSize().equals(params.size);
    }

    public void TC022_to_Tc026() throws InterruptedException {
        WebElement get_Userinfor = driver.findElement(user_infor_Logout);
        WebElement get_icon_notifcation = driver.findElement(notification);
        get_icon_notifcation.click();
        Thread.sleep(2000);
        WebElement get_notification_table = driver.findElement(notification_table);
        get_notification_table.isDisplayed();

        WebElement get_avatar = driver.findElement(avatar);
        get_avatar.click();
        Thread.sleep(2000);
        get_Userinfor.isDisplayed();

        WebElement get_wellcome = driver.findElement(wellcome);
        get_wellcome.click();
        Thread.sleep(2000);
        get_Userinfor.isDisplayed();

        WebElement get_username = driver.findElement(username);
        get_username.click();
        Thread.sleep(2000);
        get_Userinfor.isDisplayed();
    }
}
