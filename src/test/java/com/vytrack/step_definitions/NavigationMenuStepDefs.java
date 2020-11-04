package com.vytrack.step_definitions;

import com.vytrack.pages.pages.ContactsPage;
import com.vytrack.pages.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;

public class NavigationMenuStepDefs {


    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {

        // selenium codes should be written here
        System.out.println("the user navigate to Feet, Vehicles");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing, Campaigns");
    }

    @Then("title should be campaigns")
    public void title_should_be_campaigns() {
        System.out.println("Expected and Actual title are matching");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities, Calendar Events");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("Expected and Actual title are matching");
    }


    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

      new DashboardPage().navigateToModule(tab, module);
    }



    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {
        BrowserUtils.waitFor(3);

        ContactsPage contactsPage= new ContactsPage();
        Integer actualNumber = Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNumber,actualNumber);



    }


}
