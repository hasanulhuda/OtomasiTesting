package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.interactions.SendKeysAction;

public class PageObjectHalamanLogin extends BasePage{

    public PageObjectHalamanLogin(AndroidDriver driver){
        super(driver);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]")
    private AndroidElement btnLogin;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertUserID;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertUserPassword;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnSubmitLogin;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup")
    private AndroidElement btnInvisibleElement;
    @AndroidFindBy(id = "android:id/message")
    private AndroidElement errTxt;
    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement btnValidasiPass;

    /*-------------------- Registrasi ---------------------------*/

    /*-------------------- Registrasi ---------------------------*/


    public void clickPilihanLogin() throws InterruptedException{
        waitForVisibility(btnLogin);
        btnLogin.click();
    }
    public void setInsertUserID(String userID) throws InterruptedException{
        waitForVisibility(insertUserID);
        sendKeys(insertUserID, userID);
    }
    public void seteInsertUserPassword(String password) throws InterruptedException{
        waitForVisibility(insertUserPassword);
        sendKeys(insertUserPassword, password);
    }
    public void clickButtonSubmitLogin() throws InterruptedException{
        waitForVisibility(btnSubmitLogin);
        btnSubmitLogin.click();
    }
    public void clickButtonSubmitLoginError() throws InterruptedException{
        btnSubmitLogin.click();
        waitForVisibility(errTxt);
    }
    public void clickInvisibleElement() throws InterruptedException{
        waitForVisibility(btnInvisibleElement);
        btnInvisibleElement.click();
    }
    public String getErrTxt(){
        return getAttribute(errTxt,"text");
    }
    public void clickButtonValidasi() throws InterruptedException{
        waitForVisibility(btnValidasiPass);
        btnValidasiPass.click();
    }
}
