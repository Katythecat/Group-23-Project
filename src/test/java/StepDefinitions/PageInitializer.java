package StepDefinitions;

import Pages.LoginPage;
import Pages.SearchEmployeeFNPage;

public class PageInitializer {

    public static LoginPage loginPage;
    public static SearchEmployeeFNPage searchEmployeeFNPage;

    public static void initializePageObjects(){

        searchEmployeeFNPage=new SearchEmployeeFNPage();
        loginPage=new LoginPage();
    }
}
