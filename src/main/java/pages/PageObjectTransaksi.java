package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectTransaksi extends BasePage{

    public PageObjectTransaksi(AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Bayar Sekarang\"]")
    private AndroidElement btnPayNow;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
    private AndroidElement allowPermission;

    public void clickPayNow() throws InterruptedException{
        waitForVisibility(btnPayNow);
        btnPayNow.click();
    }
    public void pilihAllowPermissionLocation() throws InterruptedException{
        waitForVisibility(allowPermission);
        allowPermission.click();
    }

//region Jenis Produk
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    private AndroidElement btnProductDetailToko2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView[1]")
    private AndroidElement btnProductDetailToko1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    private AndroidElement btnProductDetailKlik1;

    public void clickDetailProductToko2() throws InterruptedException{
        waitForVisibility(btnProductDetailToko2);
        btnProductDetailToko2.click();
    }
    public void clickDetailProductToko1() throws InterruptedException{
        waitForVisibility(btnProductDetailToko1);
        btnProductDetailToko1.click();
    }
    public void clickDetailProductKlik1() throws InterruptedException{
        waitForVisibility(btnProductDetailKlik1);
        btnProductDetailKlik1.click();
    }
//endregion

//region Add to Shopping Cart
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement guideProductDetail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnBeli;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
    private AndroidElement btnShoppingCart;

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
//endregion

//region Check Out
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnBukaDetailPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.widget.ImageView")
    private AndroidElement btnTutupDetailPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnLanjutPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
    private AndroidElement btnListAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
    private AndroidElement btnPilihAlamatPengiriman;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnLanjutSetelahKonfirmAlamat;

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
    public void clickListDaftarAlamatUser() throws InterruptedException{
        waitForVisibility(btnListAlamat);
        btnListAlamat.click();
    }
    public void clickPilihAlamatUntukPengiriman() throws InterruptedException{
        waitForVisibility(btnPilihAlamatPengiriman);
        btnPilihAlamatPengiriman.click();
    }
    public void clickKonfirmasiAlamatPengiriman() throws InterruptedException{
        waitForVisibility(btnLanjutSetelahKonfirmAlamat);
        btnLanjutSetelahKonfirmAlamat.click();
    }
//endregion

//region Payment Method

    //region 1. CIMB Rekening Ponsel
    //===================== Metode Pembayaran CIMB Rekening Ponsel ======================//
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View[2]/android.view.View[2]")
    private AndroidElement listCIMBNiagaRekeningPonsel;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/tokenRekPon1\")")
    private AndroidElement insertTokenRekeningPonsel;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.EditText")
    private AndroidElement insertTokenRekeningPonselXPath;
    @AndroidFindBy(id = "android:id/payButton")
    private AndroidElement btnPayCIMBRekPon;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button")
    private AndroidElement btnPayCIMBRekPonXPath;

    public void clickMetodePembayaranCIMBNiagaRekeningPonsel() throws InterruptedException{
        waitForVisibility(listCIMBNiagaRekeningPonsel);
        listCIMBNiagaRekeningPonsel.click();
    }
    public void setInsertTokenRekeningPonsel(String tokenRekeningPonsel) throws InterruptedException{
        waitForVisibility(insertTokenRekeningPonsel);
        sendKeys(insertTokenRekeningPonsel, tokenRekeningPonsel);
    }
    public void setInsertTokenRekeningPonselXPath(String tokenRekeningPonselXPath) throws InterruptedException{
        waitForVisibility(insertTokenRekeningPonselXPath);
        sendKeys(insertTokenRekeningPonselXPath, tokenRekeningPonselXPath);
    }
    public void clickKolomTokenRekeningPonsel() throws InterruptedException{
        waitForVisibility(insertTokenRekeningPonsel);
        insertTokenRekeningPonsel.click();
    }
    public void clickKolomTokenRekeningPonselXPath() throws InterruptedException{
        waitForVisibility(insertTokenRekeningPonselXPath);
        insertTokenRekeningPonselXPath.click();
    }
    public void clickPayButtonCIMBRekPon() throws InterruptedException{
        waitForVisibility(btnPayCIMBRekPon);
        btnPayCIMBRekPon.click();
    }
    public void clickPayButtonCIMBRekPonXPath() throws InterruptedException{
        waitForVisibility(btnPayCIMBRekPonXPath);
        btnPayCIMBRekPonXPath.click();
    }
    //===================== Metode Pembayaran CIMB Rekening Ponsel ======================//
    //endregion

    //region 2. Virtual Account
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"BCA Virtual Account\"]")
    private AndroidElement listVirtualBCA;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Virtual Account Lainnya\"]")
    private AndroidElement listVirtualLainnya;

    public void clickMetodePembayaranVirtualAccountBCA() throws InterruptedException{
        waitForVisibility(listVirtualBCA);
        listVirtualBCA.click();
    }
    public void clickMetodePembayaranVirtualLainnya() throws InterruptedException{
        waitForVisibility(listVirtualLainnya);
        listVirtualLainnya.click();
    }
    //endregion

    //region 3. BCA KlikPay
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"BCA KlikPay\"]")
    private AndroidElement listBCAKlikPay;

    public void clickMetodePembayaranBCAKlikPay() throws InterruptedException{
        waitForVisibility(listBCAKlikPay);
        listBCAKlikPay.click();
    }
    //endregion

    //region 4. Akulaku
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Akulaku\"]")
    private AndroidElement listAkulaku;

    public void clickMetodePembayaranAkuLaku() throws InterruptedException{
        waitForVisibility(listAkulaku);
        listAkulaku.click();
    }
    //endregion

    //region 5. Kartu Kredit BCA
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Kartu Kredit/Debit Online BCA\"]")
    private AndroidElement listKartuKreditBCA;

    public void clickMetodePembayaranKartuKreditBCA() throws InterruptedException {
        waitForVisibility(listKartuKreditBCA);
        listKartuKreditBCA.click();
    }
    //endregion

    //region 6. Kartu Payment Point Indomaret
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Payment Point Indomaret\"]")
    private AndroidElement listPaymentPointIndomaret;

    public void clickMetodePembayaranPaymentPointIndomaret() throws InterruptedException {
        waitForVisibility(listPaymentPointIndomaret);
        listPaymentPointIndomaret.click();
    }
    //endregion

    //region 7. Link Aja
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"LinkAja\"]")
    private AndroidElement listLinkAja;

    public void clickMetodePembayaranLinkAja() throws InterruptedException {
        waitForVisibility(listLinkAja);
        listLinkAja.click();
    }
    //endregion

//endregion


}
