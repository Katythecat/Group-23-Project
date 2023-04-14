package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEmployeeFNPage extends CommonMethods {


    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimTab;


    @FindBy(id = "empsearch_employee_name_empName")
    public WebElement firstName;



    public SearchEmployeeFNPage (){

        PageFactory.initElements(driver, this);
    }
}
