package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtils;

public class BasePage {
    protected AndroidDriver driver;

    public BasePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void waitForVisibility(AndroidElement e){
        WebDriverWait wait = new WebDriverWait(driver, TestUtils.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public String getAttribute(AndroidElement e, String attribute){
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }
    public void sendKeys(AndroidElement e, String txt){
        waitForVisibility(e);
        e.sendKeys(txt);
    }
}
