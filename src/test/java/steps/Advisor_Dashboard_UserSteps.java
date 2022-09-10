package steps;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import singlife.drivermanager.Driverbase;
import singlife.pageobjects.Advisor_Dashboard_UserPage;

public class Advisor_Dashboard_UserSteps {

    private Advisor_Dashboard_UserPage advisorUser = new Advisor_Dashboard_UserPage(Driverbase.driver);

    //TC_01

    @Given("user is on GROW Platform login screen")
    public void user_is_on_grow_platform_login_screen() throws InterruptedException {
        Driverbase.driver.get("https://singlifeadvisoruat.investcloud.com");
        Thread.sleep(2000);
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Advisor portal login page loaded successfully");
    }

    @When("user enters {string} to Advisor Email")
    public void user_enters_to_advisor_username(String email) {
        advisorUser.get_UserName(email);
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered username successfully");
    }

    @When("user enters {string} to Advisor Password")
    public void user_enters_to_advisor_password(String string) {
        advisorUser.get_Password(string);
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Entered password successfully");
    }

    @When("user clicks on Signin")
    public void user_clicks_on_signin() {
        advisorUser.get_signin();
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Sigin is clicked successfully");
    }

    @When("user navigate to Grow Platform Dashboard Screen")
    public void user_navigate_grow_platfor_dashboard_screen() throws InterruptedException {
        Thread.sleep(5000);
        if(advisorUser.get_text_Homepagetext().contains("Advisor")) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Home page displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Home page not displayed");
        }
    }

    @When("user clicks btn_Menu")
    public void user_clicks_on_Menu() {
        advisorUser.openMenu();
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Menu is clicked successfully");
    }

    @When("user able to see home service under the menu")
    public void user_home_services_under_menu() {
        if(advisorUser.homeMenuIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Home service is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Home service is not displayed");
        }
    }

    @When("user able to see Elevator service under the menu")
    public void user_elevator_services_under_menu() {
        if(advisorUser.elevatorMenuIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Elevator service is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Elevator service is not displayed");
        }
    }

    @When("user able to view Tools & Resources  → News & Research")
    public void user_tools_resources_services_under_menu() {
        if(advisorUser.elevatorMenuIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Tools and resources service is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Tools and resources service is not displayed");
        }
    }

    @When("user able to see the Profile Settings and Logout as menu options under profile icon")
    public void user_tool_profile_settings_logout_menu_options() throws InterruptedException {

        Thread.sleep(2000);
        advisorUser.get_profileDropdown();
        Thread.sleep(2000);
        if(advisorUser.profileSettingsIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Profile and settings is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Profile and settings is not displayed");
        }

        if(advisorUser.logoutIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Logout is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Logout is not displayed");
        }
    }

    @When("user able to see the Hello Advisor Preferred Name displayed in the dashboard")
    public void user_navigate_grow_platfor_dashboard_screen_verify_text() throws InterruptedException {
        Thread.sleep(2000);
        if(advisorUser.get_text_Homepagetext().contains("Advisor")) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Advisor Preferred Name displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Advisor Preferred Name not displayed");
        }
    }

    @When("user able to see the Main Carousel with the Insights content based on the CMS category set for the Main Carousel")
    public void user_tools_verify_carousel() {
        if (advisorUser.carouselLinkIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Main Carousel is displayed");
        } else {
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Main Carousel is not displayed");
        }
    }
        @When("user able to see the See More link on top of the Main Carousel in the dashboard")
    public void user_tools_verify_seeMoreLink() {
        if(advisorUser.seeMoreLinkIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "See More link is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "See More link is not displayed");
        }
    }

    @When("user able to see the Research widget with the Research content based on the CMS category set for the Research widget")
    public void user_tools_verify_resourceWidget() {
        if(advisorUser.resourceWidgetIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Resource Widget is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Resource Widget is not displayed");
        }
    }

    @When("user able to see the See More link on top of the Research widget in the dashboard")
    public void user_tools_verify_research_seeMoreLink() {
        if(advisorUser.seeMoreLinkIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "See More research link is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "See More research link is not displayed");
        }
    }

    @When("user able to see the Market News widget with the top 2 Categories World Markets and Finance from CNBC as well as displaying the latest news in the dashboard")
    public void user_tools_verify_marketNews() {
        if(advisorUser.marketNewsIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Market news is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Market news is not displayed");
        }
    }

    @When("user able to see the CopyRight text at the footer of the web portal")
    public void user_tools_verify_copyrights() {
        if(advisorUser.copyrightIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Copyrights is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Copyrights is not displayed");
        }
    }

    @When("user able to see the Disclaimer link at the footer of the web portal")
    public void user_tools_verify_disclaimer() {
        if(advisorUser.disclaimerLinkIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Disclaimer is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Disclaimer is not displayed");
        }
    }

    @When("user clicks link Disclaimer")
    public void user_tools_click_disclaimer() {
        if(advisorUser.disclaimerLinkIsDisplayed()) {
            advisorUser.openDisclaimer();
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Disclaimer is clicked");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Disclaimer is not clicked");
        }
    }

    @When("user able to see the Disclaimer page in a separate browser window within the GROW Platform")
    public void user_tools_verify_disclaimer_note() throws InterruptedException{

        Thread.sleep(3000);
        if(advisorUser.disclaimerNoteTextIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Disclaimer note text is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Disclaimer note text is not displayed");
        }
    }

    @When("user able to see the PrivacyPolicy link at the footer of the web portal")
    public void user_tools_verify_privacypolicy() {
        if(advisorUser.privacypolicyLinkIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "PrivacyPolicy is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "PrivacyPolicy is not displayed");
        }
    }

    @When("user clicks link PrivacyPolicy")
    public void user_tools_click_privacypolicy() {
        if(advisorUser.privacypolicyLinkIsDisplayed()) {
            advisorUser.openprivacyPOlicy();
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "PrivacyPolicy is clicked");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "PrivacyPolicy is not clicked");
        }
    }

    @When("user able to see the privacy policy page in a separate browser window within the GROW Platform")
    public void user_tools_verify_privacy_policy_logo() throws InterruptedException{

        Thread.sleep(3000);
        if(advisorUser.privacypolicyLogoIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Privacy policy Logo is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Privacy policy Logois not displayed");
        }
    }

    @When("user able to see the CopyrightContent at the bottom of the dashboard")
    public void user_tools_verify_copyrights_in_bottom() {
        if(advisorUser.copyrightIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Copyrights is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Copyrights is not displayed");
        }
    }

    @When("user able to see the CopyrightContent fetched form the CMS system")
    public void user_tools_verify_copyrights_Text() {
        if(advisorUser.copyrightIsDisplayed()) {
            Assert.assertTrue(advisorUser.get_text_copyrights().contains("Navigator Investment Services Limited"));
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Copyrights is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Copyrights is not displayed");
        }
    }

    @When("user is able to see link_Terms&Condition")
    public void user_tools_verify_termsandconditions_in_bottom() {
        if(advisorUser.termsandConditionIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Terms and Condition is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Terms and Condition is not displayed");
        }
    }

    @When("user is able to see Go Back")
    public void user_tools_verify_go_back() {
        if(advisorUser.goBackIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Go back link is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Go back link is not displayed");
        }
    }

    @When("user clicks on btn_Back")
    public void user_clicks_on_goback() {
        advisorUser.openGoBack();
        ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Go back is clicked successfully");
    }

    @When("user is able to see DisclaimerText")
    public void user_tools_verify_main_disclaimertext() {
        if(advisorUser.disclaimerMainTextIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Disclaimer Text is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Disclaimer Text is not displayed");
        }
    }

    @When("user able to see the News and Research option under Tools and Resources service")
    public void user_tools_verify_tools_resources() {
        advisorUser.expandToolsandResources();

        if(advisorUser.newsandResearchIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "News and Research is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "News and Research is not displayed");
        }
    }

    @When("user able to see the dashboard with all the widgets that are applicable for the advisor login")
    public void user_tools_verify_homepage_widgets() {
        if (advisorUser.carouselLinkIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Main Carousel is displayed");
        } else {
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Main Carousel is not displayed");
        }
        if(advisorUser.resourceWidgetIsDisplayed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, "Resource Widget is displayed");
        }else{
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, "Resource Widget is not displayed");
        }

    }

}