package com.vytrack.step_definitions;

import com.vytrack.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class ContactsStepDefs {




    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        System.out.println(menuOptions.size());
        System.out.println(menuOptions);

}


}
