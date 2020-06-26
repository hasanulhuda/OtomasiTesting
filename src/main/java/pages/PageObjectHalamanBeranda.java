package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectHalamanBeranda extends BasePage{

    public PageObjectHalamanBeranda(AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]")
    private AndroidElement btnSearchProduct;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNamaProduct;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btnPilihanTeratasSearch;



    public String getTitle(){
        return getAttribute(btnUbahHome, "text");
    }
    public void clickKolomSearch()throws InterruptedException{
        waitForVisibility(btnSearchProduct);
        btnSearchProduct.click();
    }
    public void setInsertNamaProduct (String namaProduct) throws InterruptedException{
        waitForVisibility(insertNamaProduct);
        sendKeys(insertNamaProduct, namaProduct);
    }
    public void clickPilihanTeratasPencarian() throws InterruptedException{
        waitForVisibility(btnPilihanTeratasSearch);
        btnPilihanTeratasSearch.click();
    }

//region Metode Pembelian
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnUbahHome;

    public void clickButtonUbahMetode() throws InterruptedException{
        waitForVisibility(btnUbahHome);
        btnUbahHome.click();
    }

    //region Metode Ambil di Toko
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnAmbildiToko;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
    private AndroidElement allowPermission;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnGuideAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView[2]")
    private AndroidElement btnKolomSearch;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    private AndroidElement insertKodeToko;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnPilihanTokoTeratas;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnPilihToko;


    public void clickButtonAmbildiToko() throws InterruptedException{
        waitForVisibility(btnAmbildiToko);
        btnAmbildiToko.click();
    }
    public void pilihAllowPermissionLocation() throws InterruptedException{
        waitForVisibility(allowPermission);
        allowPermission.click();
    }
    public void clickGuideAlamatToko() throws InterruptedException{
        waitForVisibility(btnGuideAlamat);
        btnGuideAlamat.click();
    }
    public void clickKolomSearchToko() throws InterruptedException{
        waitForVisibility(btnKolomSearch);
        btnKolomSearch.click();
    }
    public void setInsertKodeToko(String kodeToko) throws InterruptedException{
        waitForVisibility(insertKodeToko);
        sendKeys(insertKodeToko, kodeToko);
    }
    public void clickPilihanTokoTeratas() throws InterruptedException{
        waitForVisibility(btnPilihanTokoTeratas);
        btnPilihanTokoTeratas.click();
    }
    public void clickPilihToko() throws InterruptedException{
        waitForVisibility(btnPilihToko);
        btnPilihToko.click();
    }
    //endregion

    //region Kirim Ke Alamat (Sudah Ada)
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[1]")
    private AndroidElement btnPilihAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView[1]")
    private AndroidElement btnPilihAlamatKedua;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnAturAlamat1Baris;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")
    private AndroidElement btnAturAlamat2Baris;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/cq/android.widget.TextView")
    private AndroidElement btnTambahAlamatKedua;

    public void clickCheckUntukPilihAlamat() throws InterruptedException{
        waitForVisibility(btnPilihAlamat);
        btnPilihAlamat.click();
    }
    public void clickCheckUntukPilihanAlamatKedua() throws InterruptedException{
        waitForVisibility(btnPilihAlamatKedua);
        btnPilihAlamatKedua.click();
    }
    public void clickAturAlamatHanyaSatu() throws InterruptedException{
        waitForVisibility(btnAturAlamat1Baris);
        btnAturAlamat1Baris.click();
    }
    public void clickAturAlamatHanyaDua() throws InterruptedException{
        waitForVisibility(btnAturAlamat2Baris);
        btnAturAlamat2Baris.click();
    }
    public void clickTambahAlamatKedua() throws InterruptedException{
        waitForVisibility(btnTambahAlamatKedua);
        btnTambahAlamatKedua.click();
    }
    //endregion

    //region Kirim Ke Alamat (Baru)
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup")
    private AndroidElement btnTambahAlamatBaru;


    public void clickTambahHalamanAlamatBaru() throws InterruptedException{
        waitForVisibility(btnTambahAlamatBaru);
        btnTambahAlamatBaru.click();
    }
    //endregion

//endregion
}
