package singlife.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BecomeUserPage {

    private WebDriver driver;


    public BecomeUserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[contains(@id,'Field_UserName_I')]")
    private WebElement txt_UserName;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement txt_Password;

    @FindBy(xpath = "//*[@id='Btn5__BB2SignIn1_Input_App_CD']")
    private WebElement btn_Login;

    @FindBy(xpath = "//*[text()='Users']")
    private WebElement btn_Users;

    @FindBy(xpath = "(//*[text()='Become User'])[2]")
    private WebElement btn_BecomeUser;

    @FindBy(xpath = "//*[@class='TableTitle' and text()='Become User']")
    private WebElement becomeUserTxt;

    @FindBy(xpath = "(//*[contains(@value,'singlifeadvisoruat')])[1]")
    private WebElement clientPortalURL;


    @FindBy(xpath = "(//*[@readonly='readonly'])[1]")
    private WebElement urlEditable;

    @FindBy(xpath = "//*[@id='lblField_SkipInterstitialPages']")
    private WebElement skipInterPages;

    @FindBy(xpath = "//*[contains(@id,'SkipInterstitialPages_I')]")
    private WebElement dpd_SkipPages;


    public void get_txt_UserName(String userName) {
        txt_UserName.sendKeys(userName);
    }

    public void get_txt_Password(String password) {
        txt_Password.sendKeys(password);
    }

    public void get_btn_Login() {
        btn_Login.click();
    }

    public void get_btn_BecomeUser() {
        btn_Users.click();
        btn_BecomeUser.click();
    }

    public String get_becomeUserTxt() {
        return becomeUserTxt.getText();
    }

    public String get_clientPortalURL() {
        return clientPortalURL.getAttribute("value");
    }

    public String get_UrlEditable() {
        return urlEditable.getAttribute("readonly");
    }

    public String get_skipInterPages() {
        return skipInterPages.getText();
    }

    public void get_dpd_SkipPages() {
        dpd_SkipPages.click();
    }

}
