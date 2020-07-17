package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectHalamanTransaksiBeta15 extends BasePage {

    public PageObjectHalamanTransaksiBeta15(AndroidDriver driver){
        super(driver);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.widget.TextView")
    private AndroidElement btnHalamanTransaksi;

    public void clickButtonHalamanTransaksi() throws InterruptedException{
        waitForVisibility(btnHalamanTransaksi);
        btnHalamanTransaksi.click();
    }

//region Retail

//endregion

//endregion

}
