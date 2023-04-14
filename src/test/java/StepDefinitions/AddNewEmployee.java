package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddNewEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {

        doClick(addEmployee.pimTab);

    }

    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {

        doClick(addEmployee.addEmpBtn);


    }
    @When("user enters firstname, middle name, and lastname")
    public void user_enters_firstname_middle_name_and_lastname() {

        sendText(addEmployee.firstnameTextBox, ConfigReader.getValueOfProperty("firstName"));
        sendText(addEmployee.middlenameTextBox, ConfigReader.getValueOfProperty("middleName"));
        sendText(addEmployee.lastnameTextBox, ConfigReader.getValueOfProperty("lastName"));





    }

}
