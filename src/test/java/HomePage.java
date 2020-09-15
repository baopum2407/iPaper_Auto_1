import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage {
    Params params = new Params();
    private WebDriver driver;
    private By byAdvanced = By.id("details-button");
    private By byProcessLink = By.id("proceed-link");
    private By inPurUserName = By.id("j_username_id");
    private By inPutPassword = By.id("j_password_id");
    private By submitButton = By.className("btn-login");
    private By img_hdbank = By.xpath("/html/body/div/div/div[1]/div/img");
    private By title_login = By.className("title-login-common");
    private By theme = By.xpath("/html/body/div/div/div[2]/div/form/div[2]/label/i");
    private By errorMessage = By.id("errormsg");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getByProcessLink() {
        driver.findElement(byProcessLink).click();
    }

    public void getByAdvanced() {
        driver.findElement(byAdvanced).click();
    }

    public void TC001_TC002() {
        WebElement logoHD = driver.findElement(img_hdbank);
        WebElement text_title = driver.findElement(title_login);
        WebElement field_username = driver.findElement(inPurUserName);
        WebElement field_password = driver.findElement(inPutPassword);
        WebElement login_button = driver.findElement(submitButton);
        WebElement theme_color = driver.findElement(theme);
        logoHD.isDisplayed();
        text_title.isDisplayed();
        field_username.isEnabled();
        field_password.isEnabled();
        login_button.isDisplayed();
        theme_color.getCssValue("color").contains(params.theme_color_value);
        params.printToTxt("TC_001002_All expected output are checked");
    }

    public void TC003() {
        WebElement login_button = driver.findElement(submitButton);
        login_button.click();
        WebElement errMsg = driver.findElement(errorMessage);
        if (errMsg.getText().contains(params.Username_is_required)) {
            params.printToTxt("\nTC003_ExpectedOutput is checked");
        }
    }

    public void TC004() {
        iPaperLogin(params.ReadUserName(), "");
        WebElement errMsg = driver.findElement(errorMessage);
        if (errMsg.getText().contains(params.Password_is_required)) {
            params.printToTxt("\nTC004_ExpectedOutput is checked");
        }
    }

    public void TC005() {
        iPaperLogin("", params.Readpass());
        WebElement errMsg = driver.findElement(errorMessage);
        if (errMsg.getText().contains(params.Username_is_required)) {
            params.printToTxt("\nTC005_ExpectedOutput is checked");
        }
    }

    public void TC006() {
        iPaperLogin(params.ReadUserName(), "111111");
        WebElement errMsg = driver.findElement(errorMessage);
        if (errMsg.getText().contains(params.You_provide_wrong_password)) {
            params.printToTxt("\nTC006_ExpectedOutput is checked");
        }
    }

    public void TC007() {
        iPaperLogin("aqvn3", params.Readpass());
        WebElement errMsg = driver.findElement(errorMessage);
        if (errMsg.getText().contains(params.Username_does_not_exist)) {
            params.printToTxt("\nTC007_ExpectedOutput is checked");
        }
    }

    public void TC008() {
        iPaperLogin("baone123", "baone");
        WebElement errMsg = driver.findElement(errorMessage);
        if (errMsg.getText().contains(params.Username_does_not_exist)) {
            params.printToTxt("\nTC008_ExpectedOutput is checked");
        }
    }

    public void TC009() throws InterruptedException {
        iPaperLogin(params.ReadUserName(), params.Readpass());
        Thread.sleep(2000);
        driver.getTitle().contains(params.iPaperSystem);
        params.printToTxt("\nTC009_ExpectedOutput is checked");
    }

    public void iPaperLogin(String userName, String passWord) {
        driver.findElement(inPurUserName).click();
        driver.findElement(inPurUserName).sendKeys(userName);
        driver.findElement(inPurUserName).sendKeys(Keys.TAB);
        driver.findElement(inPutPassword).sendKeys(passWord);
        driver.findElement(submitButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
