package singlife.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class Advisor_Dashboard_UserPage {

    private WebDriver driver;


    public Advisor_Dashboard_UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//input[@class='dx-texteditor-input'])[1]")
    private WebElement txt_UserName;

    @FindBy(xpath = "(//input[@class='dx-texteditor-input'])[2]")
    private WebElement txt_Password;

    @FindBy(xpath = "//div[@class='dx-button-content']/span[text()='Sign In']")
    private WebElement btn_Signin;

    @FindBy(xpath = "//div[text()='Hi Singlife Advisor!']")
    private WebElement home_text;

    @FindBy(xpath = "//button[@class='CL_Btn_1 button--has-icon button--icon-only hamburger-icon material-icons ng-isolate-scope dx-button dx-button-normal dx-button-mode-contained dx-widget']")
    private WebElement open_menu;

    @FindBy(xpath = "(//ul[@class='dx-treeview-node-container'])[2]/li[1]")
    private WebElement home_menu;

    @FindBy(xpath = "(//ul[@class='dx-treeview-node-container'])[2]/li[2]")
    private WebElement elevator_menu;

    @FindBy(xpath = "(//ul[@class='dx-treeview-node-container'])[2]/li[3]")
    private WebElement toolsandresources_menu;

    @FindBy(xpath = "(//ul[@class='dx-treeview-node-container'])[2]/li[3]//div[@class='dx-treeview-toggle-item-visibility']")
    private WebElement toolsandresources_menu_expand;

    @FindBy(xpath = "(//ul[@class='dx-treeview-node-container'])[2]/li[3]//ul")
    private WebElement newsandresearch_menu;

    @FindBy(xpath = "(//div[@class='dx-item-content dx-menu-item-content'])[1]")
    private WebElement profileDropdown;

    @FindBy(xpath = "//span[@class='dx-menu-item-text ProfileAndSettings_Holder_AppMenu']")
    private WebElement profileSettings;

    @FindBy(xpath = "//span[@class='dx-menu-item-text /Membership/ExtPages/SignOut_aspx?Menu']")
    private WebElement logout;

    @FindBy(xpath = "//div[@class='CLDashTrendingInsightsListAppPager pagerDiv bx-pager bx-default-pager']")
    private WebElement carouselLink;

    @FindBy(xpath = "(//span[text()='See More'])[1]")
    private WebElement seeMoreLink;

    @FindBy(xpath = "(//span[text()='See More'])[2]")
    private WebElement seeMoreResearchLink;

    @FindBy(xpath = "//div[@class='CLDashResearchListAppPager pagerDiv bx-pager bx-default-pager']")
    private WebElement resourceWidget;

    @FindBy(xpath = "//div[@class='clearfix IXColumn singlife-app-wrapper marketnews-height bb9c-app-below-margin bb9c-reuters-feed-holder']")
    private WebElement marketNews;

    @FindBy(xpath = "//div[@class='CMSFooterTextTerms_Input_AppCtrl ng-isolate-scope']")
    private WebElement copyrights;

    @FindBy(xpath = "//a[@class='wholeItemIsClickableLink']//div[text()='Disclaimer Note']")
    private WebElement disclaimerLink;

    @FindBy(xpath = "//div[@class='bb9c-article-title']//h1[text()='Disclaimer Note']")
    private WebElement disclaimerNoteText;

    @FindBy(xpath = "//a[@class='wholeItemIsClickableLink']//div[text()='Privacy Policy']")
    private WebElement privacypolicyLink;

    @FindBy(xpath = "//a[@class='sl-header-logo']")
    private WebElement privacypolicyLogo;

    @FindBy(xpath = "(//div[@class='NewsFeedTitle'])[3]")
    private WebElement termsandConditionsLink;

    @FindBy(xpath = "//a[text()='Go Back']")
    private WebElement goBackLink;

    @FindBy(xpath = "//span[contains(text(),'Prospective investors are advised to read the fund prospectus')]")
    private WebElement disclaimerMainText;

    public void get_UserName(String userName) {
        txt_UserName.sendKeys(userName);
    }

    public void get_Password(String password) {
        txt_Password.sendKeys(password);
    }

    public void get_signin() {
        btn_Signin.click();
    }

    public void get_profileDropdown() {
        profileDropdown.click();

    }

   public String get_text_Homepagetext(){
      String textHome= home_text.getText();
      return textHome;
   }

    public String get_text_copyrights(){
        String textCopyrights= copyrights.getText();
        return textCopyrights;
    }

    public void openMenu() {
        open_menu.click();
    }

    public void openDisclaimer() {
        disclaimerLink.click();
    }

    public void openprivacyPOlicy() {
        privacypolicyLink.click();
    }

    public void openGoBack() {
        goBackLink.click();
    }

    public void expandToolsandResources() {
        toolsandresources_menu_expand.click();
    }

    public boolean homeMenuIsDisplayed() {
        return home_menu.isDisplayed();    }

    public boolean elevatorMenuIsDisplayed() {
        return home_menu.isDisplayed();    }

    public boolean toolsandresourcesIsDisplayed() {
        return home_menu.isDisplayed();    }

    public boolean profileSettingsIsDisplayed() {
        return profileSettings.isDisplayed();    }

    public boolean logoutIsDisplayed() {
        return logout.isDisplayed();    }

    public boolean carouselLinkIsDisplayed() {
        return carouselLink.isDisplayed();    }

    public boolean seeMoreLinkIsDisplayed() {
        return seeMoreLink.isDisplayed();    }

    public boolean seeMoreLinkResearchIsDisplayed() {
        return seeMoreResearchLink.isDisplayed();    }

    public boolean resourceWidgetIsDisplayed() {
        return resourceWidget.isDisplayed();    }

    public boolean marketNewsIsDisplayed() {
        return marketNews.isDisplayed();    }

    public boolean copyrightIsDisplayed() {
        return copyrights.isDisplayed();    }

    public boolean disclaimerLinkIsDisplayed() {
        return disclaimerLink.isDisplayed();    }

    public boolean disclaimerNoteTextIsDisplayed() {
        return disclaimerNoteText.isDisplayed();    }

    public boolean disclaimerMainTextIsDisplayed() {
        return disclaimerMainText.isDisplayed();    }

    public boolean privacypolicyLinkIsDisplayed() {
        return privacypolicyLink.isDisplayed();    }

    public boolean termsandConditionIsDisplayed() {
        return termsandConditionsLink.isDisplayed();    }

    public boolean goBackIsDisplayed() {
        return goBackLink.isDisplayed();    }

    public boolean newsandResearchIsDisplayed() {
        return newsandresearch_menu.isDisplayed();    }

    public boolean privacypolicyLogoIsDisplayed() {

        // It will return the parent window name as a String
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
      // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
            }
        }
        return privacypolicyLogo.isDisplayed();    }

}
