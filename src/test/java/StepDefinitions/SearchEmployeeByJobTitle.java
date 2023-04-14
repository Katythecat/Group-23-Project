package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchEmployeeByJobTitle extends CommonMethods {
    @When("click on login button")
    public void click_on_login_button() {
        LoginPage login = new LoginPage();
        doClick(login.loginBtn);
    }
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {

        // driver.findElement(By.id("menu_pim_viewPimModule")).click();
        WebElement pimTab = driver.findElement(By.id("menu_pim_viewPimModule"));
        doClick(pimTab);

    }
    @When("user select Job Title")
    public void user_select_job_title() {
        WebElement jobTitleDdl = driver.findElement(By.id("empsearch_job_title"));
        selectByOptions(jobTitleDdl, "Singer");

        WebElement EmpStatusDdl= driver.findElement(By.id("empsearch_employee_status"));

    }
    @When("Clicks on search button")
    public void clicks_on_search_button() {
        WebElement searchButton = driver.findElement(By.id("searchBtn"));
        doClick(searchButton);

    }
    @When("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("The employee is Displayed");

    }

}
