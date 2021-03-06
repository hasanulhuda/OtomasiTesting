package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectTransaksi extends BasePage{

    public PageObjectTransaksi(AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button")
    private AndroidElement btnPayNow;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
    private AndroidElement allowPermission;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]")
    private AndroidElement textPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement textKeranjangbelanja;

    public void clickPayNow() throws InterruptedException{
        waitForVisibility(btnPayNow);
        btnPayNow.click();
    }
    public void pilihAllowPermissionLocation() throws InterruptedException{
        waitForVisibility(allowPermission);
        allowPermission.click();
    }
    public String getTextPembayaran(){
        return getAttribute(textPembayaran, "text");
    }
    public String getTextKeranjangBelanja(){
        return getAttribute(textKeranjangbelanja, "text");
    }

//region Jenis Produk
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[1]")
    private AndroidElement btnProductDetailToko2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView[1]")
    private AndroidElement btnProductDetailToko1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]")
    private AndroidElement btnProductDetailKlik1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]")
    private AndroidElement btnProductDetailpenjual;

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
    public void clickDetailProductPenjual() throws InterruptedException{
        waitForVisibility(btnProductDetailpenjual);
        btnProductDetailpenjual.click();
    }
//endregion

//region Matriks Shopping Cart
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

    //region BD Plaza
    //endregion
//endregion

//region Check Out
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.app.Dialog/android.view.View/android.view.View/android.view.View[1]")
    private AndroidElement textErrorCheckOut;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnBukaDetailPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.widget.ImageView")
    private AndroidElement btnTutupDetailPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnLanjutPembayaran;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")
    private AndroidElement btnListAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
    private AndroidElement btnPilihAlamatPengiriman;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnLanjutSetelahKonfirmAlamat;
    @AndroidFindBy(id = "android:id/btnClose")
    private AndroidElement btnCloseErrorCheckOut;

    // Metode Kirim Ke Alamat
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btnMetodeKirimKeAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")
    private AndroidElement listAlamatKirimKeAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView[1]")
    private AndroidElement btnAlamatKirimKeAlamat1;

    public void clickPilihMetodeKirimKeAlamat() throws InterruptedException{
        waitForVisibility(btnMetodeKirimKeAlamat);
        btnMetodeKirimKeAlamat.click();
    }
    public void listviewAlamatKirimKeAlamat() throws InterruptedException{
        waitForVisibility(listAlamatKirimKeAlamat);
        listAlamatKirimKeAlamat.click();
    }
    public void clickPilihAlamatKirimKeAlamat1() throws InterruptedException{
        waitForVisibility(btnAlamatKirimKeAlamat1);
        btnAlamatKirimKeAlamat1.click();
    }
    // Metode Kirim Ke Alamat

    // Metode Ambil di Toko
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnMetodeAmbilDiToko;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")
    private AndroidElement listAlamatAmbildiToko;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnKolomKodeTokoAmbildiToko;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKolomKodeTokoAmbildiToko;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement pilihTeratasKodeTokoAmbildiToko;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
    private AndroidElement radiobuttonPilihTokoAmbildiToko;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Google Map\"]/android.view.View[8]")
    private AndroidElement btnPilihToko;

    public void clickPilihMetodeAmbildiToko() throws InterruptedException{
        waitForVisibility(btnMetodeAmbilDiToko);
        btnMetodeAmbilDiToko.click();
    }
    public void listviewAlamatAmbildiToko() throws InterruptedException{
        waitForVisibility(listAlamatAmbildiToko);
        listAlamatAmbildiToko.click();
    }
    public void btnKolomKodetokoAmbildiToko() throws InterruptedException{
        waitForVisibility(btnKolomKodeTokoAmbildiToko);
        btnKolomKodeTokoAmbildiToko.click();
    }
    public void insertKolomKodetokoAmbildiToko(String kodetoko) throws InterruptedException{
        waitForVisibility(insertKolomKodeTokoAmbildiToko);
        sendKeys(insertKolomKodeTokoAmbildiToko, kodetoko);
    }
    public void pilihTeratasTokoAmbilDiToko() throws InterruptedException{
        waitForVisibility(pilihTeratasKodeTokoAmbildiToko);
        pilihTeratasKodeTokoAmbildiToko.click();
    }
    public void radiobuttonPilihTokoAmbilDiToko() throws InterruptedException{
        waitForVisibility(pilihTeratasKodeTokoAmbildiToko);
        pilihTeratasKodeTokoAmbildiToko.click();
    }
    public void clickPilihToko() throws InterruptedException{
        waitForVisibility(btnPilihToko);
        btnPilihToko.click();
    }

    //Metode Ambil di Toko

    public String getErrorTextCheckOut() throws InterruptedException{
        return getAttribute(textErrorCheckOut,"text");
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
    public void clickButtonErrorCheckOutNotification() throws InterruptedException{
        waitForVisibility(btnCloseErrorCheckOut);
        btnCloseErrorCheckOut.click();
    }

//endregion

//region Payment Method

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement textKonfirmasiPembayaran;

    public String getTextKonfirmasiPembayaran() throws InterruptedException{
        waitForVisibility(textKonfirmasiPembayaran);
        return getAttribute(textKonfirmasiPembayaran,"Text");
    }

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
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View[1]")
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
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View")
    private AndroidElement listBCAKlikPayxPath;

    public void clickMetodePembayaranBCAKlikPay() throws InterruptedException{
        waitForVisibility(listBCAKlikPayxPath);
        listBCAKlikPayxPath.click();
    }
    //endregion

    //region 4. Akulaku
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Akulaku\"]")
    private AndroidElement listAkulaku;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.view.View")
    private AndroidElement listAkulakuxPath;

    public void clickMetodePembayaranAkuLaku() throws InterruptedException{
        waitForVisibility(listAkulakuxPath);
        listAkulakuxPath.click();
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

    //region 8. Kartu Kredit/Debit BNI
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[5]/android.view.View[2]")
    private AndroidElement listKartuKreditBNI;

    public void clickMetodePembayaranKartuKreditBNI() throws InterruptedException {
        waitForVisibility(listKartuKreditBNI);
        listKartuKreditBNI.click();
    }
    //endregion

    //region 9. Kartu Kredit/Debit Mandiri
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]")
    private AndroidElement listKartuKreditMandiri;

    public void clickMetodePembayaranKartuKreditMandiri() throws InterruptedException {
        waitForVisibility(listKartuKreditMandiri);
        listKartuKreditMandiri.click();
    }
    //endregion

    //region  close
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/cq/android.widget.TextView")
    private AndroidElement closePembayaran;

    public void clickTutupKonfirmasiPembayaran() throws InterruptedException {
        waitForVisibility(closePembayaran);
        closePembayaran.click();
    }
    //endregion close

//endregion


}
