package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee extends CommonMethods {
    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimTab;

    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmpBtn;

    @FindBy(id = "firstName")
    public WebElement firstnameTextBox;

    @FindBy(id = "middleName")
    public WebElement middlenameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastnameTextBox;


    public AddEmployee() {
        PageFactory.initElements(driver, this);
        //initialize the webelement of the current page


    }
}