import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;


public class Untils {
    public void getPage(WebDriver webdriver, String urlPage) {
        webdriver.get(urlPage);
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        Untils untils = new Untils();
        Params params = new Params();

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //TC_012
        untils.getPage(driver, "https://118.69.222.206/login");
        HomePage homePage = new HomePage(driver);
        TodoList todoList = new TodoList(driver);
        User_information user_information = new User_information(driver);
        //Access address HDBank
        homePage.getByAdvanced();
        homePage.getByProcessLink();
        //Dang Nhap
        //Title page must correct before continue
        if (driver.getTitle().contains(params.expectedTitle)) {
            homePage.TC001_TC002();
            Thread.sleep(2000);
            homePage.TC003();
            Thread.sleep(2000);
            homePage.TC004();
            Thread.sleep(2000);
            homePage.TC005();
            Thread.sleep(2000);
            homePage.TC006();
            Thread.sleep(2000);
            homePage.TC007();
            Thread.sleep(2000);
            homePage.TC008();
            Thread.sleep(2000);
            homePage.TC009();
            System.out.println("Login page is checked");
        } else {
            System.out.println("Error.....");
        }
        //MENU_NAVBAR

        //Title page must correct before continue
        if (driver.getTitle().contains(params.iPaperSystem)) {
            todoList.TC001();
            todoList.TC002();
            todoList.TC003_to_TC006_TC008();
            todoList.TC007();
            todoList.TC011_to_016();
            System.out.println("MENU_NAVBAR is checked");
            todoList.TC017();
            todoList.TC018();
            todoList.TC022_to_Tc026();
            System.out.println("MENU_NAVBAR is checked");
        } else {
            System.out.println("Error....");
        }

        Thread.sleep(5000);
        driver.close();
    }
}
