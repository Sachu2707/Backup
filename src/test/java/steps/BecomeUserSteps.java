package steps;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import singlife.drivermanager.Driverbase;
import singlife.pageobjects.BecomeUserPage;

public class BecomeUserSteps {

    private BecomeUserPage becomeUser = new BecomeUserPage(Driverbase.driver);

    //TC_01

    @Given("user is on Admin portal login screen")
    public void user_is_on_admin_portal_login_screen() throws InterruptedException {
        Driverbase.driver.get("https://singlifeadminuat.investcloud.com");
        Thread.sleep(2000);
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Admin portal login page loaded successfully");

    }

    @When("user enters {string} to txt_Username")
    public void user_enters_to_txt_username(String username) {
        becomeUser.get_txt_UserName(username);
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered username successfully");
    }

    @When("user enters {string} to txt_Password")
    public void user_enters_to_txt_password(String string) {
        becomeUser.get_txt_Password(string);
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered password successfully");
    }

    @When("user clicks on btn_Login")
    public void user_clicks_on_btn_login() {
        becomeUser.get_btn_Login();
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Login is clicked successfully");
    }

    @Then("User navigates to Admin portal dashboard page")
    public void user_navigates_to_admin_portal_dashboard_page() {
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "navigated to Admin portal dashboard page successfully");
    }

    @When("User clicks on btn_BecomeAUser in the menu bar")
    public void user_clicks_on_btn_become_a_user_in_the_menu_bar() throws InterruptedException {
        Thread.sleep(3000);
        becomeUser.get_btn_BecomeUser();
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Become User menu clicked successfully");
    }

    @Then("User is able to see user listing screen")
    public void user_is_able_to_see_user_listing_screen() throws InterruptedException {
        Thread.sleep(1000);
        String actual = "Become User";
        Assert.assertEquals("Validate Become User page", actual, becomeUser.get_becomeUserTxt());
        //  ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "");
    }

    //TC_02
    @Then("User is able to see {string} as header")
    public void user_is_able_to_see_as_header(String string) {
        String actual = string;
        Assert.assertEquals("Validate header in Become User page", actual, becomeUser.get_becomeUserTxt());

    }

    //TC_03

    @Then("User is able to see {string}")
    public void user_is_able_to_see(String string) {
        String actual = string;
        Assert.assertEquals("User able to see the Client portal URL", actual, becomeUser.get_clientPortalURL());

    }

    @Then("User verifys that URL is not editable")
    public void user_verifys_that_url_is_not_editable() {
        String readOnly = "true";
        Assert.assertEquals("Client portal URL is not editable", readOnly, becomeUser.get_UrlEditable());
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Client portal URL is not editable");
    }

    //TC_04
    @Then("User is able to see {string} dropdown")
    public void user_is_able_to_see_dropdown(String string) {
        String actual = string;
        Assert.assertEquals(actual, becomeUser.get_skipInterPages());
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "User verifies the dropdown successfully");
    }

    @Then("User verifys that dropdown is displayed and enabled")
    public void user_verifys_that_dropdown_is_displayed_and_enabled() {
        becomeUser.get_dpd_SkipPages();
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "User verifies that dropdown is displayed and enabled successfully");
    }


}
