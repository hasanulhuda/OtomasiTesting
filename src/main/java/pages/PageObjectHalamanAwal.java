package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectHalamanAwal extends BasePage {

    public PageObjectHalamanAwal(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement guideLogin1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement guideLogin2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement textHalamanLogin;

    public void clickOnGuide1() throws InterruptedException {
        waitForVisibility(guideLogin1);
        guideLogin1.click();
    }
    public void clickOnGuide2() throws InterruptedException {
        waitForVisibility(guideLogin2);
        guideLogin2.click();
    }
    public String getTextHalamanLogin() throws InterruptedException{
        return getAttribute(textHalamanLogin, "text");
    }
    //region v.20
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView")
    private AndroidElement guideLogin1Versi20;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.widget.TextView")
    private AndroidElement guideLogin2Versi20;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[5]/android.widget.TextView")
    private AndroidElement guideLogin3Versi20;


    public void clickOnGuide1Versi20() throws InterruptedException {
        waitForVisibility(guideLogin1Versi20);
        guideLogin1Versi20.click();
        Thread.sleep(5000);
        guideLogin1Versi20.click();
    }
    public void clickOnGuide2Versi20() throws InterruptedException {
        waitForVisibility(guideLogin2Versi20);
        guideLogin2Versi20.click();
        Thread.sleep(4000);
        guideLogin2Versi20.click();
    }
    public void clickOnGuide3Versi20() throws InterruptedException {
        waitForVisibility(guideLogin3Versi20);
        guideLogin3Versi20.click();
    }
    //endregion


//region 1. Lokasi by Kode POS
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")
    private AndroidElement btnKodePos;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKodePos;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btnTapKodePos;

    //===================== Elemen Milik Kode POS =====================//
    public void clickButtonKodePos() throws InterruptedException {
        waitForVisibility(btnKodePos);
        btnKodePos.click();
    }
    public void setInsertKodePos(String kodePos) throws InterruptedException{
        waitForVisibility(insertKodePos);
        sendKeys(insertKodePos,kodePos);
    }
    public void clickPilihanKodePos() throws InterruptedException{
        waitForVisibility(btnTapKodePos);
        btnTapKodePos.click();
    }
    //===================== Elemen Milik Kode POS =====================//
//endregion

//region 2. Lokasi by Kode Wilayah
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private AndroidElement btnKodeWilayah;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertProvinsi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnProvinsi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKota;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnKota;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKecamatan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
    private AndroidElement btnKecamatan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKelurahan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnKelurahan;

    //===================== Elemen Milik Kode Wilayah =====================//
    public void clickButtonKodeWilayah() throws InterruptedException{
        waitForVisibility(btnKodeWilayah);
        btnKodeWilayah.click();
    }
    public void setInsertProvinsi(String provinsi) throws InterruptedException{
        sendKeys(insertProvinsi,provinsi);
    }
    public void clickPilihanTeratasProvinsi() throws InterruptedException{
        waitForVisibility(btnProvinsi);
        btnProvinsi.click();
    }
    public void setInsertKota( String kota) throws InterruptedException{
        waitForVisibility(insertKota);
        sendKeys(insertKota, kota);
    }
    public void clickPilihanTeratasKota() throws InterruptedException{
        waitForVisibility(btnKota);
        btnKota.click();
    }
    public void setInsertKecamatan(String kecamatan) throws InterruptedException{
        waitForVisibility(insertKecamatan);
        sendKeys(insertKecamatan, kecamatan);
    }
    public void clickPilihanTeratasKecamatan() throws InterruptedException{
        waitForVisibility(btnKecamatan);
        btnKecamatan.click();
    }
    public void setInsertKelurahan(String kelurahan) throws InterruptedException{
        waitForVisibility(insertKelurahan);
        sendKeys(insertKelurahan, kelurahan);
    }
    public void clickPilihanTeratasKelurahan() throws InterruptedException{
        waitForVisibility(btnKelurahan);
        btnKelurahan.click();
    }
    //===================== Elemen Milik Kode Wilayah =====================//
//endregion

}
