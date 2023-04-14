package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLastNamePage extends CommonMethods {


    @FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
    public WebElement pimMenu;

    @FindBy(xpath="//a[@id='menu_pim_addEmployee']")
    public WebElement addEmpMenu;

    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstNameTextbox;

    @FindBy(xpath="//input[@id='lastName']")
    public WebElement lastNameTextbox;

    @FindBy(xpath="//input[@id='btnSave']")
    public WebElement saveBtn;


    // firstName
    // lastName
    // btnSave

    public AddLastNamePage() {
        PageFactory.initElements(driver, this);


    }

}
