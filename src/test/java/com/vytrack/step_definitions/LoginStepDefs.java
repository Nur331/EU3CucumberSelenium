package com.vytrack.step_definitions;

import com.vytrack.pages.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs  {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

       String url= ConfigurationReader.get("url");
        //  WebDriver driver= Driver.get();
         Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
    String username=ConfigurationReader.get("driver_username");
    String password=ConfigurationReader.get("driver_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(3);

String actualTitle=Driver.get().getTitle();
Assert.assertEquals( "Dashboard", actualTitle);
    }


    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username=ConfigurationReader.get("sales_manager_username");
        String password=ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);



   }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username=ConfigurationReader.get("store_manager_username");
        String password=ConfigurationReader.get("store_manager_password");

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);

    }


    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        LoginPage loginPage= new LoginPage();
        loginPage.login(username, password);

    }


    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {

        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + Driver.get().getTitle());

        BrowserUtils.waitFor(3);
Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle) );

    }


//      // homework
//    @Given("the user logged in as {string}")
//    public void the_user_logged_in_as(String usertype) {
//// go to login page
//Driver.get().get(ConfigurationReader.get("url"));
//
//        System.out.println("usertype = "+usertype);
//
////based on input enter that user information
//   String username = null;
//   String password = null;
//
//   BrowserUtils.waitFor(2);
//
//   if(usertype.equals("driver")){
//       username=ConfigurationReader.get("driver_username");
//       password=ConfigurationReader.get("driver_password");
//
//   }else if(usertype.equals("sales_manager")){
//       username=ConfigurationReader.get("sales_manager_username");
//       password=ConfigurationReader.get("sales_manager_password");
//
//   }else if(usertype.equals("store_manager")){
//       username=ConfigurationReader.get("store_manager_username");
//       password=ConfigurationReader.get("store_manager_password");
//   }
//
//
//// send username and password and login
//
//        new LoginPage().login(username, password);
//
//
//
//    }


}
