package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectTransaksi extends BasePage{

    public PageObjectTransaksi(AndroidDriver driver){
        super(driver);
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.ImageView[1]")
    private AndroidElement btnProductDetail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement guideProductDetail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnBeli;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
    private AndroidElement btnShoppingCart;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnBukaDetailPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.widget.ImageView")
    private AndroidElement btnTutupDetailPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnLanjutPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnLanjutSetelahKonfirmAlamat;

    //===================== Metode Pembayaran CIMB Rekening Ponsel ======================//
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[2]/android.view.View[2]")
    private AndroidElement listCIMBNiagaRekeningPonsel;
    //===================== Metode Pembayaran CIMB Rekening Ponsel ======================//

    @AndroidFindBy(id = "android:id/tokenRekPon1")
    private AndroidElement insertTokenRekeningPonsel;
    @AndroidFindBy(id = "android:id/payButton")
    private AndroidElement btnPayCIMBRekPon;


    public void clickDetailProduct() throws InterruptedException{
        waitForVisibility(btnProductDetail);
        btnProductDetail.click();
    }
    public void clickGuideCariTokoygMenjual() throws InterruptedException{
        waitForVisibility(guideProductDetail);
        guideProductDetail.click();
    }
    public void clickButtonBeliProduct() throws InterruptedException{
        waitForVisibility(btnBeli);
        btnBeli.click();
    }
    public void clickShoppingCart() throws InterruptedException{
        waitForVisibility(btnShoppingCart);
        btnShoppingCart.click();
    }
    public void clickOpenDetailPembayaran() throws InterruptedException{
        waitForVisibility(btnBukaDetailPembayaran);
        btnBukaDetailPembayaran.click();
    }
    public void clickCloseDetailPembayaran() throws InterruptedException{
        waitForVisibility(btnTutupDetailPembayaran);
        btnTutupDetailPembayaran.click();
    }
    public void clickKonfirmasiBarangBelanjaan() throws InterruptedException{
        waitForVisibility(btnLanjutPembayaran);
        btnLanjutPembayaran.click();
    }
    public void clickKonfirmasiAlamatPengiriman() throws InterruptedException{
        waitForVisibility(btnLanjutSetelahKonfirmAlamat);
        btnLanjutSetelahKonfirmAlamat.click();
    }
    public void clickMetodePembayaranCIMBNiagaRekeningPonsel() throws InterruptedException{
        waitForVisibility(listCIMBNiagaRekeningPonsel);
        listCIMBNiagaRekeningPonsel.click();
    }
    public void setInsertTokenRekeningPonsel(String tokenRekeningPonsel) throws InterruptedException{
        waitForVisibility(insertTokenRekeningPonsel);
        sendKeys(insertTokenRekeningPonsel, tokenRekeningPonsel);
    }
    public void clickKolomTokenRekeningPonsel() throws InterruptedException{
        waitForVisibility(insertTokenRekeningPonsel);
        insertTokenRekeningPonsel.click();
    }
    public void clickPayButtonCIMBRekPon() throws InterruptedException{
        waitForVisibility(btnPayCIMBRekPon);
        btnPayCIMBRekPon.click();
    }
}
