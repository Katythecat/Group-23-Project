package StepDefinitions;

import Pages.SearchEmployeeFNPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;

public class SearchEmployeeFN extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
      doClick(searchEmployeeFNPage.pimTab);
    }


    @When("search employee by first name")
    public void search_employee_by_first_name() {
      sendText(searchEmployeeFNPage.firstName, ConfigReader.getValueOfProperty("firstname"));
    }

}
