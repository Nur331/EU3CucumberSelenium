package com.vytrack.step_definitions;

import com.vytrack.pages.pages.DashboardPage;
import com.vytrack.pages.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ContactsStepDefs {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String usertype) {
// go to login page
        Driver.get().get(ConfigurationReader.get("url"));

        System.out.println("usertype = "+usertype);

        BrowserUtils.waitFor(2);

//based on input enter that user information
        String username = null;
        String password = null;

        if(usertype.equals("driver")){
            username=ConfigurationReader.get("driver_username");
            password=ConfigurationReader.get("driver_password");

        }else if(usertype.equals("sales manager")){
            username=ConfigurationReader.get("sales_manager_username");
            password=ConfigurationReader.get("sales_manager_password");

        }else if(usertype.equals("store manager")){
            username=ConfigurationReader.get("store_manager_username");
            password=ConfigurationReader.get("store_manager_password");
        }


// send username and password and login

        new LoginPage().login(username, password);



    }



    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
BrowserUtils.waitFor(2);
        System.out.println(menuOptions.size());
        System.out.println(menuOptions);

// get the list of webElement and convert them to list of string and assert

  List<String> actualOptions= BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals( menuOptions, actualOptions);
        System.out.println("actualOptions = " + actualOptions);
        System.out.println("menuOptions = " + menuOptions);
    }


}
