package stepDefinitions;

import io.cucumber.java.en.Given;

public class ScenatioOutLineSteps {
    @Given("enter the FirstName {string}")
    public void enter_the_first_name(String string) {
        System.out.println(string);
    }
    @Given("enter the LastName {string}")
    public void enter_the_last_name(String string) {
        System.out.println(string);
    }
    @Given("enter the Email {string}")
    public void enter_the_email(String string) {
        System.out.println(string);
    }


}
