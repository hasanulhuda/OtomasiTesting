import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import javafx.scene.layout.Priority;
import jdk.internal.dynalink.beans.StaticClass;
import koneksi.Koneksi;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanLogin;
import pages.PageObjectHalamanPersonal;
import reports.ExtentReportsDemo;
import utils.Utility;

import java.util.List;

public class UbahDataPersonalTestCase extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String nomorhp = "0895338021090", nomortest = "089533802100",
    namaDepan = "Muhammad", namaBelakang = "Huda", kodepos= "15155",
    passwordsekarang = "tapaukeyi", passwordbaru = "tapaukeyi1",
    Bank = "Mandiri", norekening = "098698623762", cabang = "Yogyakarta", email="test1212@gmail.com",
    titleAddress="Rumah", address="Jl. Medan Merdeka Barat no. 57";

    @Test(priority = 1)
    public void halamanAwalKodePos(){
        try {
            Thread.sleep(7000);
            PageObjectHalamanAwal pageObjectHalamanAwal = new PageObjectHalamanAwal(driver);
            pageObjectHalamanAwal.clickOnGuide1();
            Thread.sleep(7000);
            log.log(Status.PASS,"Object Guide Pengguna Pertama");
            pageObjectHalamanAwal.clickOnGuide2();
            log.log(Status.PASS,"Object Guide Pengguna Kedua");
            pageObjectHalamanAwal.clickButtonKodePos();
            log.log(Status.PASS,"Button Untuk Input lokasi menggunakan Kode POS");
            pageObjectHalamanAwal.setInsertKodePos(kodepos);
            log.log(Status.PASS,"inputan untuk mencari Wilayah Menggunakan Kode POS");
            pageObjectHalamanAwal.clickPilihanKodePos();
            log.log(Status.PASS,"tampilan teratas untuk Wilayah yang dicari");
            pageObjectHalamanAwal.clickHalamanLogin();
            log.log(Status.PASS,"Memilih Lokasi berdasar Kode Wilayah Berhasil");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void loginSuccessfull(){
        try {
            Thread.sleep(5000);
            PageObjectHalamanLogin pageObjectHalamanLogin = new PageObjectHalamanLogin(driver);
//            pageObjectHalamanLogin.clickPilihanLogin();
//            Thread.sleep(3000);
            pageObjectHalamanLogin.clickPilihanLogin();
            log.log(Status.PASS,"pilih Button Login/Register Untuk pindah ke Halaman login");
            pageObjectHalamanLogin.setInsertUserID(nomorhp);
            log.log(Status.PASS,"insert valid User");
            Thread.sleep(3000);
            pageObjectHalamanLogin.seteInsertUserPassword(passwordsekarang);
            log.log(Status.PASS,"insert valid password");
            Thread.sleep(3000);
            pageObjectHalamanLogin.clickButtonSubmitLogin();
            log.log(Status.PASS,"klik tombol login");
            Thread.sleep(3000);
            pageObjectHalamanLogin.clickInvisibleElement();
            log.log(Status.PASS,"klik invisible element yang ada pada beranda");

            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTitle();
            String expectedProductTitle = "Ubah";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //region Halaman Ubah Profil(Priority = 3)
    @Test(priority = 3)
    public void halamanEditProfil(){
        try{
            Thread.sleep(5000);
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            pageObjectHalamanPersonal.clickHalamanPersonal();
            log.log(Status.PASS,"klik icon profile/username untuk pindah ke Halaman Personal");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickPanduanProfilPertama();
            log.log(Status.PASS,"tap panduan penggunaan pertama pada Halaman Personal");
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickPanduanProfilKedua();
            log.log(Status.PASS,"tap panduan penggunaan kedua pada Halaman Personal");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickHalamanEditProfil();
            log.log(Status.PASS,"klik hyperlink edit profil untuk pindah ke Halaman Edit Profile");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test(priority = 4)
    public void iSakuConnect(){
        Koneksi cn = new Koneksi();
        log.log(Status.PASS,"Koneksi Database Berhasil");
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            pageObjectHalamanPersonal.clickHubungkanIsaku();
            log.log(Status.PASS,"klik untuk Terhubung ke e-Wallet ISaku");
            pageObjectHalamanPersonal.tapCheckBoxTerms();
            log.log(Status.PASS,"tap untuk menyetujui Syarat dan Ketentuan untuk terhubung dengan iSaku");
            pageObjectHalamanPersonal.clickSetujuHubungkanISaku();
            log.log(Status.PASS,"klik button Submit untuk mulai terhubung dengan iSaku");
            Thread.sleep(3000);
            /*------------- OTP Code -------------------*/
            List<String> OTP= cn.getOTPIsakuConnect(nomorhp);
            String OTPCode1 = OTP.get(0);
            String OTPCode2 = OTP.get(1);
            String OTPCode3 = OTP.get(2);
            String OTPCode4 = OTP.get(3);
            System.out.println(OTPCode1);
            /*------------- OTP Code -------------------*/
            pageObjectHalamanPersonal.setInsertOTPCode1(OTPCode1);
            log.log(Status.PASS,"insert OTP Number Kolom 1");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode2(OTPCode2);
            log.log(Status.PASS,"insert OTP Number Kolom 2");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode3(OTPCode3);
            log.log(Status.PASS,"insert OTP Number Kolom 3");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode4(OTPCode4);
            log.log(Status.PASS,"insert OTP Number Kolom 4");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void ubahNomorPonsel(){
        Koneksi cn = new Koneksi();
        try{
            Thread.sleep(5000);
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickHyperlinkUbahNomorPonsel();
            log.log(Status.PASS,"tap hyperlink ubah nomor ponsel untuk pindah ke Halaman Ubah Nomor");
            Thread.sleep(6000);
            pageObjectHalamanPersonal.setInsertNomorPonselBaru(nomortest);
            log.log(Status.PASS,"masukkan nomor baru yang ingin di gunakan");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertPasswordValidasi(passwordsekarang);
            log.log(Status.PASS,"masukkan password untuk sebagai validasi");
            Thread.sleep(6000);
            pageObjectHalamanPersonal.clickTombolSetujuUbahNomorPonsel();
            log.log(Status.PASS,"klik tombol Setuju untuk merubah nomor ponsel");
            Thread.sleep(6000);

            /*------------- OTP Code -------------------*/
            List<String> OTP= cn.getOTPChangeNumber(nomortest);
            String OTPCode1 = OTP.get(0);
            String OTPCode2 = OTP.get(1);
            String OTPCode3 = OTP.get(2);
            String OTPCode4 = OTP.get(3);
            System.out.println(OTPCode1);
            log.log(Status.PASS,"kode OTP berhasil didapatkan");
            /*------------- OTP Code -------------------*/

            pageObjectHalamanPersonal.setInsertOTPCode1(OTPCode1);
            log.log(Status.PASS,"insert OTP Number Kolom 1");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode2(OTPCode2);
            log.log(Status.PASS,"insert OTP Number Kolom 2");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode3(OTPCode3);
            log.log(Status.PASS,"insert OTP Number Kolom 3");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode4(OTPCode4);
            log.log(Status.PASS,"insert OTP Number Kolom 4");

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void ubahInformasiAkun(){
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(4000);
            pageObjectHalamanPersonal.setInsertNamaDepan(namaDepan);
            log.log(Status.PASS,"Nama Depan Berhasil diubah");
            pageObjectHalamanPersonal.setInsertNamaBelakang(namaBelakang);
            log.log(Status.PASS,"Nama Belakang berhasil diubah");
            pageObjectHalamanPersonal.clickPilihJenisKelaminPerempuan();
            log.log(Status.PASS,"jenis Kelamin Perembuan Berhasil dipilih");
            Thread.sleep(4000);
            pageObjectHalamanPersonal.clickTombolSetujuUbahInformasiakun();
            log.log(Status.PASS,"informasi akun telah berhasil diubah");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void ubahPassword(){
        try{
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Kata Sandi\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            pageObjectHalamanPersonal.clickHyperLinkUbahKataSandi();
            log.log(Status.PASS,"berhasil masuk pada Halaman Ubah Kata Sandi");
            Thread.sleep(4000);
            pageObjectHalamanPersonal.setInsertPassSekarang(passwordsekarang);
            log.log(Status.PASS,"Password yang digunakan berhasil di masukkan");
            pageObjectHalamanPersonal.setInsertPassBaru(passwordbaru);
            log.log(Status.PASS,"Password baru berhasil dimasukkan");
            pageObjectHalamanPersonal.setInsertKonfirmPassBaru(passwordbaru);
            log.log(Status.PASS,"validasi password baru berhasil dimasukkan");
            Thread.sleep(4000);
            pageObjectHalamanPersonal.clickTombolSetujuUbahPassword();
            log.log(Status.PASS,"Password telah berhasil diubah");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void ubahEmail(){
        Koneksi cn = new Koneksi();
        try{
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Email\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            pageObjectHalamanPersonal.clickHyperlinkUbahAlamatEmail();
            log.log(Status.PASS,"berhasil masuk kedalam halaman Ubah Alamat Email");
            pageObjectHalamanPersonal.setInsertAlamatEmail(email);
            log.log(Status.PASS,"Alamat Email Berhasil di Masukkan");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertKonfirmPass(passwordsekarang);
            log.log(Status.PASS,"password untuk konfirmasi berhasil dikenali");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickTombolSetujuUbahEmail();
            log.log(Status.PASS,"tombol setuju untuk tambah/ubah email berhasil");
            Thread.sleep(5000);

            /*------------- OTP Code -------------------*/
            List<String> OTP= cn.getOTPEmail(email);
            String OTPCode1 = OTP.get(0);
            String OTPCode2 = OTP.get(1);
            String OTPCode3 = OTP.get(2);
            String OTPCode4 = OTP.get(3);
            System.out.println(OTPCode1);
            /*------------- OTP Code -------------------*/

            pageObjectHalamanPersonal.setInsertOTPCode1(OTPCode1);
            log.log(Status.PASS,"insert OTP Number Kolom 1");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode2(OTPCode2);
            log.log(Status.PASS,"insert OTP Number Kolom 2");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode3(OTPCode3);
            log.log(Status.PASS,"insert OTP Number Kolom 3");
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode4(OTPCode4);
            log.log(Status.PASS,"insert OTP Number Kolom 4");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void ubahInformasiRekeningBank(){
        Koneksi cn = new Koneksi();
        try{
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
//            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Cabang\").instance(1))"));
//            Thread.sleep(5000);
//            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).setAsVerticalList().flingToEnd(10)"));

            try {
                driver.findElements(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).setAsVerticalList().flingToEnd(10)"));
            } catch (Exception e) {
                // ignore
            }
            //===================== SCROLL TO TEXT ======================//
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(4000);
            pageObjectHalamanPersonal.setInsertNamaPemilikRekening(namaDepan+" "+namaBelakang);
            pageObjectHalamanPersonal.setInsertNamaBank(Bank);
            pageObjectHalamanPersonal.setInsertNomorRekening(norekening);
            pageObjectHalamanPersonal.setInsertCabangPerbankan(cabang);
            Thread.sleep(4000);

            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Simpan\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickTombolSetujuSimpanInformasiRekening();
            Thread.sleep(5000);

            /*------------- OTP Code -------------------*/
            List<String> OTP= cn.getOTPAccount(nomorhp);
            String OTPCode1 = OTP.get(0);
            String OTPCode2 = OTP.get(1);
            String OTPCode3 = OTP.get(2);
            String OTPCode4 = OTP.get(3);
            System.out.println(OTPCode1);
            /*------------- OTP Code -------------------*/

            pageObjectHalamanPersonal.setInsertOTPCode1(OTPCode1);
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode2(OTPCode2);
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode3(OTPCode3);
            Thread.sleep(3000);
            pageObjectHalamanPersonal.setInsertOTPCode4(OTPCode4);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    //endregion Halaman Ubah Profil ((

    //region Halaman Buku Alamat(Priority = 3)
    @Test(priority = 3)
    public void editBukuAlamat(){
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickHalamanPersonal();
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickPanduanProfilPertama();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickPanduanProfilKedua();
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickHyperLinkBukuAlamat();
            pageObjectHalamanPersonal.clickButtonTambahAlamat();
            pageObjectHalamanPersonal.setInsertTitleAlamat(titleAddress);
            pageObjectHalamanPersonal.setInsertnamaLengkap(namaDepan+" "+namaBelakang);
            pageObjectHalamanPersonal.setInsertNoHP(nomorhp);
            pageObjectHalamanPersonal.setInsertAlamat(address);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void metodeKodePOS(){
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickButtonKodePOS();
            pageObjectHalamanPersonal.setInsertKodePOS(kodepos);
            pageObjectHalamanPersonal.clickPilihanTeratasKodePOS();
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            try {
                driver.findElements(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).setAsVerticalList().flingToEnd(10)"));
            } catch (Exception e) {
                // ignore
            }
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickTombolSetujuTambahAlamat();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void metodeKodeWilayah(){
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            pageObjectHalamanPersonal.clickButtonKodeWilayah();
            log.log(Status.PASS,"Button Untuk Input lokasi menggunakan Kode Wilayah");
            pageObjectHalamanPersonal.setInsertProvinsi("DKI");
            log.log(Status.PASS,"inputan untuk mencari Provinsi");
            pageObjectHalamanPersonal.clickPilihanTeratasProvinsi();
            log.log(Status.PASS,"tampilan teratas untuk provinsi yang dicari");
            pageObjectHalamanPersonal.setInsertKota("Selatan");
            log.log(Status.PASS,"inputan untuk mencari Kota");
            pageObjectHalamanPersonal.clickPilihanTeratasKota();
            log.log(Status.PASS,"tampilan teratas untuk Kota yang dicari");
            pageObjectHalamanPersonal.setInsertKecamatan("Pesanggrahan");
            log.log(Status.PASS,"inputan untuk mencari Kecamatan");
            pageObjectHalamanPersonal.clickPilihanTeratasKecamatan();
            log.log(Status.PASS,"tampilan teratas untuk Kecamatan yang dicari");
            pageObjectHalamanPersonal.setInsertKelurahan("Utara");
            log.log(Status.PASS,"inputan untuk mencari Kelurahan");
            pageObjectHalamanPersonal.clickPilihanTeratasKelurahan();
            log.log(Status.PASS,"tampilan teratas untuk provinsi yang dicari");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            try {
                driver.findElements(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector()).setAsVerticalList().flingToEnd(5)"));
            } catch (Exception e) {
                // ignore
            }
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickTombolSetujuTambahAlamat();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    //endregion Halaman Buku Alamat

}

