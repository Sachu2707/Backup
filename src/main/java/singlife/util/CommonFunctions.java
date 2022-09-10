package singlife.util;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import singlife.drivermanager.Driverbase;


public class CommonFunctions extends Driverbase {

    public void clickActionButton(WebElement element) {
        Point p = (element).getLocation();
        int X = p.getX();
        int Y = p.getY();
        Actions action = new Actions(driver);
        action.moveByOffset(X,Y).click().build().perform();
    }

    public void scrollToElement( WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
    }

    public void waitForElementPresent(WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver,"30");
//        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public String getXpathFromWebelement(WebElement e) {
        String xpath = e.toString();
        xpath = xpath.substring(xpath.indexOf("/"), xpath.lastIndexOf("]"));
        return xpath;
    }




}
