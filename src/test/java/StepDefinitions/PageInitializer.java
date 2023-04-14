package StepDefinitions;

import Pages.AddEmployee;
import Pages.LoginPage;
import Utils.CommonMethods;

public class PageInitializer {

    public static LoginPage login;
    public static AddEmployee addEmployee;

    public static void initializePageObjects(){
        login=new LoginPage();
        addEmployee=new AddEmployee();



    }

}
