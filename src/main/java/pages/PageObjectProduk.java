package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectProduk extends BasePage {

    public PageObjectProduk(AndroidDriver driver){
        super(driver);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView[1]")
    private AndroidElement btnProductDetail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement guideProductDetail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    private AndroidElement btnAddWishlist;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView")
    private AndroidElement btnHalamanWishlist;

    //PRODUK BANNER
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/ix/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnProdukBanner;
    //PRODUK BANNER

    // PRODUK OFFICIAL STORE
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")
    private AndroidElement hyperlinkProdukOfficialStore;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    private AndroidElement btnProdukOSUnilever;
    // PRODUK OFFICIAL STORE


    public void clickDetailProduct() throws InterruptedException{
        waitForVisibility(btnProductDetail);
        btnProductDetail.click();
    }
    public void clickGuideCariTokoygMenjual() throws InterruptedException{
        waitForVisibility(guideProductDetail);
        guideProductDetail.click();
    }
    public void clickButtonTambahWishlist() throws InterruptedException{
        waitForVisibility(btnAddWishlist);
        btnAddWishlist.click();
    }
    public void clickHalamanWishlist() throws InterruptedException{
        waitForVisibility(btnHalamanWishlist);
        btnHalamanWishlist.click();
    }

    //PRODUK BANNER
    public void clickProdukBanner() throws InterruptedException{
        waitForVisibility(btnProdukBanner);
        btnProdukBanner.click();
    }
    //PRODUK BANNER

    //PRODUK OFFICIAL STORE
    public void clickHyperlinkOfficialStore() throws InterruptedException{
        waitForVisibility(hyperlinkProdukOfficialStore);
        hyperlinkProdukOfficialStore.click();
    }
    public void clickProdukOfficialStore() throws InterruptedException{
        waitForVisibility(btnProdukOSUnilever);
        btnProdukOSUnilever.click();
    }
    //PRODUK OFFICIAL STORE
}