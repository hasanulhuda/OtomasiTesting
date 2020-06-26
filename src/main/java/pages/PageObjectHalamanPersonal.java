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

    public void clickHalamanPersonal() throws InterruptedException {
        btnHalamanPersonal.click();
    }
    public void clickPanduanProfilPertama() throws InterruptedException{
        btnGuideProfil1.click();
    }
    public void clickPanduanProfilKedua() throws InterruptedException{
        btnGuideProfil2.click();
    }

//region 1. Halaman Edit Profil
    /*========================================= Halaman Edit Profil ===================================================*/
    /*========================================= 1111111111111111111 ===================================================*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView[2]")
    private AndroidElement btnEditProfil;

    public void clickHalamanEditProfil() throws InterruptedException{
        btnEditProfil.click();
    }

    //region IsakuConnect
    /*-------------------- iSaku Connect ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[10]/android.widget.TextView")
    private AndroidElement btnISakuConnect;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
    private AndroidElement checkBoxTerms;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    private AndroidElement btnSetujuHubungkanIsaku;

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
    //endregion

    //region Ubah Nomor Ponsel
    /*-------------------- Ubah Nomor Ponsel ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[4]")
    private AndroidElement btnUbahNomorPonsel;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertNomorPonselBaru;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertPasswordValidasi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnSubmitNomorPonsel;

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
    //endregion

    //region Ubah Informasi Akun
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
    //endregion

    //region Ubah Kata Sandi
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
    //endregion

    //region Ubah Email
    /*-------------------- Ubah Email ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")
    private AndroidElement hyperLinkEmail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertAlamatEmail;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKonfirmPass;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")
    private AndroidElement btnSubmitAlamatEmail;

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
    //endregion

    //region Ubah Informasi Akun
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
    //endregion

    //region OTP Code
    /*-------------------- OTP Code ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")
    private AndroidElement insertOTPCode1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText")
    private AndroidElement insertOTPCode2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")
    private AndroidElement insertOTPCode3;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
    private AndroidElement insertOTPCode4;

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
    //endregion

    /*========================================= 1111111111111111111 ===================================================*/
    /*========================================= Halaman Edit Profil ===================================================*/
    //endregion Halaman Edit Profil

//region 2. Halaman Buku Alamat
    /*========================================= Halaman Buku Alamat ===================================================*/
    /*========================================= 2222222222222222222 ===================================================*/

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView[2]")
    private AndroidElement hyperlinkBukuAlamat;

    public void clickHyperLinkBukuAlamat() throws InterruptedException{
        waitForVisibility(hyperlinkBukuAlamat);
        hyperlinkBukuAlamat.click();
    }

    //region Buku ALamat
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
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.widget.TextView")
    private AndroidElement btnSubmitTambahAlamat;

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
    public void clickButtonTambahAlamat() throws InterruptedException{
        waitForVisibility(btnTambahAlamat);
        btnTambahAlamat.click();
    }
    public void clickTombolSetujuTambahAlamat() throws InterruptedException{
        waitForVisibility(btnSubmitTambahAlamat);
        btnSubmitTambahAlamat.click();
    }
    /*-------------------- Buku Alamat ---------------------------*/
    //endregion

    //region Metode Kode POS
    /*-------------------- Metode Kode POS ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")
    private AndroidElement btnKodePOS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement insertKodePOS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btnPilihanKodePOS;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.widget.ImageView[1]")
    private AndroidElement btnAlamatLengkap;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.EditText")
    private AndroidElement btnKolomAlamatLengkap;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnTandaiLokasi;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[10]/android.widget.TextView")
    private AndroidElement btnSimpanAlamat;


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
        btnPilihanKodePOS.click();
    }
    public void clickAlamatLengkap() throws InterruptedException{
        waitForVisibility(btnAlamatLengkap);
        btnAlamatLengkap.click();
    }
    public void tapKolomAlamatLengkap(String kolomalamat) throws InterruptedException{
        waitForVisibility(btnKolomAlamatLengkap);
        btnKolomAlamatLengkap.click();
        Thread.sleep(4000);
        sendKeys(btnKolomAlamatLengkap, kolomalamat);
    }
    public void clickSetujuTandaiAlamat() throws InterruptedException{
        waitForVisibility(btnTandaiLokasi);
        btnTandaiLokasi.click();
    }
    public void clickButtonSimpanAlamat() throws InterruptedException{
        waitForVisibility(btnSimpanAlamat);
        btnSimpanAlamat.click();
    }
    /*-------------------- Metode Kode POS ---------------------------*/
    //endregion

    //region Metode Kode Wilayah
    /*-------------------- Metode Kode Wilayah ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]")
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

    //region Ubah Alamat
    /*-------------------- Ubah Alamat ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btnUbahAlamat1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")
    private AndroidElement btnUbahAlamat2;

    public void clickButtonUbahAlamatSatu() throws InterruptedException{
        waitForVisibility(btnUbahAlamat1);
        btnUbahAlamat1.click();
    }
    public void clickButtonUbahAlamatKedua() throws InterruptedException{
        waitForVisibility(btnUbahAlamat2);
        btnUbahAlamat2.click();
    }
    /*-------------------- Ubah Alamat ---------------------------*/
    //endregion

    //region Hapus Alamat
    /*-------------------- Hapus Alamat ---------------------------*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnHapusAlamat1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView")
    private AndroidElement btnHapusAlamat2;

    public void clickHapusAlamatSatu() throws InterruptedException{
        waitForVisibility(btnHapusAlamat1);
        btnHapusAlamat1.click();
    }
    public void clickHapusAlamatKedua() throws InterruptedException{
        waitForVisibility(btnHapusAlamat2);
        btnHapusAlamat2.click();
    }
    /*-------------------- Hapus Alamat ---------------------------*/
    //endregion

    /*-------------------- Metode Kode Wilayah ---------------------------*/

    //endregion

    /*========================================= 2222222222222222222 ===================================================*/
    /*========================================= Halaman Buku Alamat ===================================================*/
//endregion Halaman Buku Alamat

//region 3. Log Out
    /*========================================= LogOut ===================================================*/
    /*========================================= 333333333333333333 ===================================================*/
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")
    private AndroidElement btnLogout;

    public void clickTombolKeluar() throws InterruptedException{
        waitForVisibility(btnLogout);
        btnLogout.click();
    }
    /*========================================= 333333333333333333 ===================================================*/
    /*========================================= LogOut ===================================================*/
    //endregion Log Out

}
