package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BackGroundSteps {

    @Given("user open amazon.com")
    public void user_open_amazon_com() {
        System.out.println("Open amazon.com");
    }
    @Given("user click search button")
    public void user_click_search_button() {
        System.out.println("Click search button");
    }
    @Then("hello")
    public void hello() {
        System.out.println("Say hello");
    }

    @Then("hi")
    public void hi() {
        System.out.println("Say hi");
    }
    @Then("by")
    public void by() {
        System.out.println("Say by");
    }



}
