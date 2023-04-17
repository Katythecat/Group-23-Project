package StepDefinitions;

import Pages.AddLastNamePage;
import Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddLastNameStepDef extends CommonMethods {
    AddLastNamePage addLastNamePage = new AddLastNamePage();
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {

        doClick(addLastNamePage.pimMenu);
    }
    @When("user clicks on add lastname button")
    public void user_clicks_on_add_lastname_button() {

    }
    @Then("user enters a valid last name")
    public void user_enters_a_valid_last_name() {

    }
    @And("user clicks on add Employee option")
    public void clickOnAddEmployeeOption(){

        doClick(addLastNamePage.addEmpMenu);
    }
    @And("user enters firstname")
    public  void enterFirstName(){
        sendText(addLastNamePage.firstNameTextbox,"Ridvan");

    }
    @ And ("user enters lastname")
    public void enterLastName(){
        sendText(addLastNamePage.lastNameTextbox,"Cadiroglu");

    }
    @And ("user clicks on save button")
    public void saveBtn(){
    doClick(addLastNamePage.saveBtn);

    }
    @ Then ("employee should be added successfully")
    public void validatSuccesMsg(){

    }
}
