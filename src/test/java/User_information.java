import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;


public class User_information {
    Params params = new Params();
    private WebDriver driver;
    private By employee_code = By.id("code");

    public User_information(WebDriver driver) {
        this.driver = driver;
    }

    //Check title
    public void check_title() {
        driver.getTitle().contains("iPaper System - User information");
        params.printToTxt("\nTitle display correct");
    }

    //Check all text box disabled
    public void textBox_disabled() {
        WebElement emp_textbox = driver.findElement(employee_code);

        List<String> disable_element = new ArrayList<>();
        disable_element.add(emp_textbox.getAttribute("disabled"));


    }

}
