package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectHalamanPersonal extends BasePage {

    public PageObjectHalamanPersonal(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnHalamanPersonal;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")
    private AndroidElement btnGuideProfil1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")
    private AndroidElement btnGuideProfil2;

    //region Halaman Edit Profil
    /*========================================= Halaman Edit Profil ===================================================*/
    /*========================================= 1111111111111111111 ===================================================*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView[2]")
    private AndroidElement btnEditProfil;

    /*-------------------- iSaku Connect ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]/android.widget.TextView")
    private AndroidElement btnISakuConnect;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    private AndroidElement checkBoxTerms;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnSetujuHubungkanIsaku;
    /*-------------------- iSaku Connect ---------------------------*/

    /*-------------------- Ubah Informasi Akun ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[4]")
    private AndroidElement btnUbahNomorPonsel;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNomorPonselBaru;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertPasswordValidasi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnSubmitNomorPonsel;
    /*-------------------- Ubah Nomor Ponsel ---------------------------*/

    /*-------------------- Ubah Informasi Akun ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNamaDepan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNamaBelakang;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
    private AndroidElement radioBtnSexFemale;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView")
    private AndroidElement radioBtnSexMale;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView")
    private AndroidElement btnSumbitUbahInformasiAkun;
    /*-------------------- Ubah Informasi Akun ---------------------------*/

    /*-------------------- Ubah Kata Sandi ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[6]")
    private AndroidElement btnUbahKataSandi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertPassSekarang;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertPassBaru;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKonfirmPassBaru;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]/android.widget.TextView")
    private AndroidElement btnSubmitUbahPassword;
    /*-------------------- Ubah Kata Sandi ---------------------------*/

    /*-------------------- Ubah Email ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
    private AndroidElement hyperLinkEmail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertAlamatEmail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKonfirmPass;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnSubmitAlamatEmail;
    /*-------------------- Ubah Email ---------------------------*/

    /*-------------------- Ubah Informasi Rekening ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNamaPemilikRekening;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNamaBank;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
    private AndroidElement insertNomorRekening;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertCabangPerbankan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
    private AndroidElement btnSubmitUbahInformasiRekening;
    /*-------------------- Ubah Informasi Rekening ---------------------------*/

    /*-------------------- OTP Code ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
    private AndroidElement insertOTPCode1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    private AndroidElement insertOTPCode2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
    private AndroidElement insertOTPCode3;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
    private AndroidElement insertOTPCode4;
    /*-------------------- OTP Code ---------------------------*/

    /*========================================= 1111111111111111111 ===================================================*/
    /*========================================= Halaman Edit Profil ===================================================*/
    //endregion Halaman Edit Profil

    //region Halaman Buku Alamat
    /*========================================= Halaman Buku Alamat ===================================================*/
    /*========================================= 2222222222222222222 ===================================================*/

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView[2]")
    private AndroidElement hyperlinkBukuAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.TextView")
    private AndroidElement btnSubmitTambahAlamat;

    /*-------------------- Buku Alamat ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/nz/android.widget.TextView")
    private AndroidElement btnTambahAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertTitleAlamat;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertnamaLengkap;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNoHP;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertAlamat;
    /*-------------------- Buku Alamat ---------------------------*/

    /*-------------------- Metode Kode POS ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView")
    private AndroidElement btnKodePOS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKodePOS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btnPilihanKodePOS;
    /*-------------------- Metode Kode POS ---------------------------*/

    /*-------------------- Metode Kode Wilayah ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.ImageView")
    private AndroidElement btnKodeWilayah;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertProvinsi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnProvinsi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKota;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnKota;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKecamatan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnKecamatan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKelurahan;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnKelurahan;
    /*-------------------- Metode Kode Wilayah ---------------------------*/

    /*========================================= 2222222222222222222 ===================================================*/
    /*========================================= Halaman Buku Alamat ===================================================*/
    //endregion Halaman Buku Alamat

    //region Log Out
    /*========================================= LogOut ===================================================*/
    /*========================================= 333333333333333333 ===================================================*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
    private AndroidElement btnLogout;
    /*========================================= 333333333333333333 ===================================================*/
    /*========================================= LogOut ===================================================*/
    //endregion Log Out

    public void clickHalamanPersonal() throws InterruptedException {
        btnHalamanPersonal.click();
    }
    public void clickPanduanProfilPertama() throws InterruptedException{
        btnGuideProfil1.click();
    }
    public void clickPanduanProfilKedua() throws InterruptedException{
        btnGuideProfil2.click();
    }

    //region Halaman Edit Profil
    /*========================================= Halaman Edit Profil ===================================================*/
    /*========================================= 1111111111111111111 ===================================================*/

    public void clickHalamanEditProfil() throws InterruptedException{
        btnEditProfil.click();
    }

    /*-------------------- Log Out ---------------------------*/
    public void clickTombolKeluar() throws InterruptedException{
        waitForVisibility(btnLogout);
        btnLogout.click();
    }
    /*-------------------- Log Out ---------------------------*/
    /*-------------------- iSaku Connect ---------------------------*/
    public void clickHubungkanIsaku() throws InterruptedException{
        waitForVisibility(btnISakuConnect);
        btnISakuConnect.click();
    }
    public void tapCheckBoxTerms() throws InterruptedException{
        waitForVisibility(checkBoxTerms);
        checkBoxTerms.click();
    }
    public void clickSetujuHubungkanISaku() throws InterruptedException{
        waitForVisibility(btnSetujuHubungkanIsaku);
        btnSetujuHubungkanIsaku.click();
    }
    /*-------------------- iSaku Connect ---------------------------*/

    /*-------------------- Ubah Nomor Ponsel ---------------------------*/
    public void clickHyperlinkUbahNomorPonsel() throws InterruptedException{
        btnUbahNomorPonsel.click();
    }
    public void clickTombolSetujuUbahNomorPonsel() throws InterruptedException{
        btnSubmitNomorPonsel.click();
    }
    public void setInsertNomorPonselBaru(String nomorPonsel) throws InterruptedException{
        sendKeys(insertNomorPonselBaru, nomorPonsel);
    }
    public void setInsertPasswordValidasi(String passwordValidasi) throws InterruptedException{
        sendKeys(insertPasswordValidasi, passwordValidasi);
    }
    /*-------------------- Ubah Nomor Ponsel ---------------------------*/

    /*-------------------- Ubah Informasi Akun ---------------------------*/
    public void setInsertNamaDepan(String namadepan) throws InterruptedException{
        waitForVisibility(insertNamaDepan);
        insertNamaDepan.clear();
        sendKeys(insertNamaDepan, namadepan);
    }
    public void setInsertNamaBelakang(String namaBelakang) throws InterruptedException{
        waitForVisibility(insertNamaBelakang);
        insertNamaBelakang.clear();
        sendKeys(insertNamaBelakang, namaBelakang);
    }
    public void clickPilihJenisKelaminPerempuan() throws InterruptedException{
        waitForVisibility(radioBtnSexFemale);
        radioBtnSexFemale.click();
    }
    public void clickPilihJenisKelaminLakiLaki() throws InterruptedException{
        waitForVisibility(radioBtnSexFemale);
        radioBtnSexMale.click();
    }
    /*-------------------- Ubah Informasi Akun ---------------------------*/

    /*-------------------- Ubah Kata Sandi ---------------------------*/
    public void clickTombolSetujuUbahInformasiakun() throws InterruptedException{
        waitForVisibility(btnSumbitUbahInformasiAkun);
        btnSumbitUbahInformasiAkun.click();
    }
    public void clickHyperLinkUbahKataSandi() throws InterruptedException{
        waitForVisibility(btnUbahKataSandi);
        btnUbahKataSandi.click();
    }
    public void setInsertPassSekarang(String passSekarang) throws InterruptedException{
        waitForVisibility(insertPassSekarang);
        insertPassSekarang.clear();
        sendKeys(insertPassSekarang, passSekarang);
    }
    public void setInsertPassBaru(String passBaru) throws InterruptedException{
        waitForVisibility(insertPassBaru);
        insertPassBaru.clear();
        sendKeys(insertPassBaru, passBaru);
    }
    public void setInsertKonfirmPassBaru(String konfirmPassBaru) throws InterruptedException{
        waitForVisibility(insertKonfirmPassBaru);
        insertKonfirmPassBaru.clear();
        sendKeys(insertKonfirmPassBaru, konfirmPassBaru);
    }
    public void clickTombolSetujuUbahPassword() throws InterruptedException{
        waitForVisibility(btnSubmitUbahPassword);
        btnSubmitUbahPassword.click();
    }
    /*-------------------- Ubah Kata Sandi ---------------------------*/

    /*-------------------- Ubah Email ---------------------------*/
    public void clickHyperlinkUbahAlamatEmail() throws InterruptedException{
        waitForVisibility(hyperLinkEmail);
        hyperLinkEmail.click();
    }
    public void setInsertAlamatEmail(String email) throws InterruptedException{
        waitForVisibility(insertAlamatEmail);
        insertAlamatEmail.clear();
        sendKeys(insertAlamatEmail, email);
    }
    public void setInsertKonfirmPass(String password) throws InterruptedException{
        waitForVisibility(insertKonfirmPass);
        insertKonfirmPass.clear();
        sendKeys(insertKonfirmPass, password);
    }
    public void clickTombolSetujuUbahEmail() throws InterruptedException{
        waitForVisibility(btnSubmitAlamatEmail);
        btnSubmitAlamatEmail.click();
    }
    /*-------------------- Ubah Email ---------------------------*/

    /*-------------------- Ubah Informasi Rekening ---------------------------*/
    public void setInsertNamaPemilikRekening(String namaPemilikRekening) throws InterruptedException{
        waitForVisibility(insertNamaPemilikRekening);
        insertNamaPemilikRekening.clear();
        sendKeys(insertNamaPemilikRekening, namaPemilikRekening);
    }
    public void setInsertNamaBank(String namaBank) throws InterruptedException{
        waitForVisibility(insertNamaBank);
        insertNamaBank.clear();
        sendKeys(insertNamaBank, namaBank);
    }
    public void setInsertNomorRekening(String nomorRekening) throws InterruptedException{
        waitForVisibility(insertNomorRekening);
        insertNomorRekening.clear();
        sendKeys(insertNomorRekening, nomorRekening);
    }
    public void setInsertCabangPerbankan(String cabangPerbankan) throws InterruptedException{
        waitForVisibility(insertCabangPerbankan);
        insertCabangPerbankan.clear();
        sendKeys(insertCabangPerbankan, cabangPerbankan);
    }
    public void clickTombolSetujuSimpanInformasiRekening() throws InterruptedException{
        waitForVisibility(btnSubmitUbahInformasiRekening);
        btnSubmitUbahInformasiRekening.click();
    }
    /*-------------------- Ubah Informasi Rekening ---------------------------*/

    /*-------------------- OTP Code ---------------------------*/
    public void setInsertOTPCode1(String otpCode1) throws InterruptedException{
        sendKeys(insertOTPCode1, otpCode1);
    }
    public void setInsertOTPCode2(String otpCode2) throws InterruptedException{
        sendKeys(insertOTPCode2, otpCode2);
    }
    public void setInsertOTPCode3(String otpCode3) throws InterruptedException{
        sendKeys(insertOTPCode3, otpCode3);
    }
    public void setInsertOTPCode4(String otpCode4) throws InterruptedException{
        sendKeys(insertOTPCode4, otpCode4);
    }
    /*-------------------- OTP Code ---------------------------*/

    /*========================================= 1111111111111111111 ===================================================*/
    /*========================================= Halaman Edit Profil ===================================================*/
//endregion Halaman Edit Profil

    //region Halaman Buku Alamat
    /*========================================= Halaman Buku Alamat ===================================================*/
    /*========================================= 2222222222222222222 ===================================================*/

    public void clickHyperLinkBukuAlamat() throws InterruptedException{
        waitForVisibility(hyperlinkBukuAlamat);
        hyperlinkBukuAlamat.click();
    }
    public void clickButtonTambahAlamat() throws InterruptedException{
        waitForVisibility(btnTambahAlamat);
        btnTambahAlamat.click();
    }
    public void clickTombolSetujuTambahAlamat() throws InterruptedException{
        waitForVisibility(btnSubmitTambahAlamat);
        btnSubmitTambahAlamat.click();
    }

    /*-------------------- Buku Alamat ---------------------------*/
    public void setInsertTitleAlamat(String titleAlamat) throws InterruptedException{
        waitForVisibility(insertTitleAlamat);
        insertTitleAlamat.clear();
        sendKeys(insertTitleAlamat, titleAlamat);
    }
    public void setInsertnamaLengkap(String namalengkap) throws InterruptedException{
        waitForVisibility(insertnamaLengkap);
        insertnamaLengkap.clear();
        sendKeys(insertnamaLengkap, namalengkap);
    }
    public void setInsertNoHP(String noHP) throws InterruptedException{
        waitForVisibility(insertNoHP);
        insertNoHP.clear();
        sendKeys(insertNoHP, noHP);
    }
    public void setInsertAlamat(String alamat) throws InterruptedException{
        waitForVisibility(insertAlamat);
        insertAlamat.clear();
        sendKeys(insertAlamat, alamat);
    }
    /*-------------------- Buku Alamat ---------------------------*/

    /*-------------------- Metode Kode POS ---------------------------*/
    public void clickButtonKodePOS() throws InterruptedException{
        waitForVisibility(btnKodePOS);
        btnKodePOS.click();
    }
    public void setInsertKodePOS(String kodePOS) throws InterruptedException{
        waitForVisibility(insertKodePOS);
        insertKodePOS.clear();
        sendKeys(insertKodePOS, kodePOS);
    }
    public void clickPilihanTeratasKodePOS() throws InterruptedException{
        waitForVisibility(btnPilihanKodePOS);
        btnPilihanKodePOS.click();
    }
    /*-------------------- Metode Kode POS ---------------------------*/

    /*-------------------- Metode Kode Wilayah ---------------------------*/
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
    /*-------------------- Metode Kode Wilayah ---------------------------*/

    /*========================================= 2222222222222222222 ===================================================*/
    /*========================================= Halaman Buku Alamat ===================================================*/
    //endregion Halaman Buku Alamat

}
