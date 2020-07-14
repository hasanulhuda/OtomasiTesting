import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanLogin;
import pages.PageObjectHalamanPersonal;
import reports.ExtentReportsDemo;
import utils.Utility;

public class UbahMetodePengirimanVersi20 extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", kodepos = "15155", password ="tapaukeyi";
    String productid ="20079790", kodetoko="TUOL", address="Jl. Medan Merdeka Barat no. 57";

    @Test(priority = 1)
    public void halamanAwalKodePos(){
        try {
            Thread.sleep(10000);
            PageObjectHalamanAwal pageObjectHalamanAwal = new PageObjectHalamanAwal(driver);
            pageObjectHalamanAwal.clickOnGuide1Versi20();
            log.log(Status.PASS,"Object Guide Pengguna Pertama");
            Thread.sleep(5000);
            pageObjectHalamanAwal.clickOnGuide2Versi20();
            log.log(Status.PASS,"Object Guide Pengguna Kedua");
            pageObjectHalamanAwal.clickOnGuide2();
            log.log(Status.PASS,"Klik Button Ubah pada Halaman Utama");
            pageObjectHalamanAwal.clickButtonKodePos();
            log.log(Status.PASS,"Button Untuk Input lokasi menggunakan Kode POS");
            pageObjectHalamanAwal.setInsertKodePos(kodepos);
            log.log(Status.PASS,"inputan untuk mencari Wilayah Menggunakan Kode POS");
            pageObjectHalamanAwal.clickPilihanKodePos();
            log.log(Status.PASS,"tampilan teratas untuk Wilayah yang dicari");

            PageObjectHalamanLogin pageObjectHalamanLogin = new PageObjectHalamanLogin(driver);
            pageObjectHalamanLogin.clickHalamanLogin();
            log.log(Status.PASS,"Memilih Lokasi berdasar Kode Wilayah Berhasil");

            Thread.sleep(5000);
            String actualProductTitle = pageObjectHalamanLogin.getTitlekHalamanLogin();
            String expectedProductTitle = "Akun Saya";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
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
            pageObjectHalamanLogin.setInsertUserID(user);
            log.log(Status.PASS,"insert valid User");
            Thread.sleep(3000);
            pageObjectHalamanLogin.seteInsertUserPassword(password);
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

    @Test(priority = 4)
    public void metodeAmbildiToko(){
        try {
        Thread.sleep(5000);
        PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
        pageObjectHalamanBeranda.clickButtonUbahMetode();
        log.log(Status.PASS,"klik icon shopping cart untuk pindah ke Halaman Pembayaran");
        Thread.sleep(6000);
        pageObjectHalamanBeranda.clickButtonAmbildiToko();
        log.log(Status.PASS,"klik list view untuk melihat detail pembayaran");
        Thread.sleep(4000);
        pageObjectHalamanBeranda.pilihAllowPermissionLocation();
        log.log(Status.PASS,"");
        Thread.sleep(5000);
        pageObjectHalamanBeranda.clickGuideAlamatToko();
        log.log(Status.PASS,"klik listview untuk menutup detail pembayaran");
        Thread.sleep(4000);
        pageObjectHalamanBeranda.clickKolomSearchToko();
        log.log(Status.PASS,"");
        pageObjectHalamanBeranda.setInsertKodeToko(kodetoko);
        log.log(Status.PASS,"");
        pageObjectHalamanBeranda.clickPilihanTokoTeratas();
        log.log(Status.PASS,"");
        pageObjectHalamanBeranda.clickPilihToko();
        log.log(Status.PASS,"");

        Thread.sleep(5000);
        String actualProductTitle = pageObjectHalamanBeranda.getTextHalamanHome();
        String expectedProductTitle = "Home";
        System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

        Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void metodeAmbildiAlamatSudahAda() {
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanBeranda.clickButtonUbahMetode();
            log.log(Status.PASS,"klik icon shopping cart untuk pindah ke Halaman Pembayaran");
            Thread.sleep(6000);
            pageObjectHalamanBeranda.clickCheckUntukPilihAlamat();
            log.log(Status.PASS,"");
            Thread.sleep(6000);
//            pageObjectHalamanBeranda.clickCheckUntukPilihanAlamatKedua();
            log.log(Status.PASS,"");

            String actualProductTitle = pageObjectHalamanBeranda.getTextHalamanHome();
            String expectedProductTitle = "Home";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void hapusAlamatTerdaftar(){
        try{
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanBeranda.clickButtonUbahMetode();
            log.log(Status.PASS, "klik icon shopping cart untuk pindah ke Halaman Pembayaran");
            Thread.sleep(6000);
            pageObjectHalamanBeranda.clickAturAlamatHanyaSatu();
//            pageObjectHalamanBeranda.clickAturAlamatHanyaDua();
            log.log(Status.PASS,"");
            pageObjectHalamanBeranda.clickHapusAlamatSatu();
            pageObjectHalamanBeranda.clickSetujuHapusAlamat();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().back();

            Thread.sleep(5000);
            String actualProductTitle = pageObjectHalamanBeranda.getTextTokoBelumDipilih();
            String expectedProductTitle = "Belum ada toko Indomaret terpilih";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void metodeAmbildiAlamatBaru() {
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanBeranda.clickButtonUbahMetode();
            log.log(Status.PASS, "klik icon shopping cart untuk pindah ke Halaman Pembayaran");
//            Thread.sleep(6000);
//            pageObjectHalamanBeranda.clickTambahHalamanAlamatBaru();
//            log.log(Status.PASS,"");
            Thread.sleep(6000);
            pageObjectHalamanBeranda.clickAturAlamatHanyaSatu();
            log.log(Status.PASS,"");
            Thread.sleep(6000);
            pageObjectHalamanBeranda.clickTambahAlamatKedua();
            log.log(Status.PASS,"");
            Thread.sleep(6000);

            Thread.sleep(5000);
            String actualProductTitle = pageObjectHalamanBeranda.getTextTambahAlamatBaru();
            String expectedProductTitle = "Tambah Alamat Penerima";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //region Halaman Buku Alamat(Priority = 3)
    @Test(priority = 5)
    public void BukuAlamat(){
        String titleAddress="Rumah", namaDepan = "Muhammad",
                namaBelakang = "Huda";
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(5000);
            pageObjectHalamanPersonal.setInsertTitleAlamat(titleAddress);
            pageObjectHalamanPersonal.setInsertnamaLengkap(namaDepan+" "+namaBelakang);
            pageObjectHalamanPersonal.setInsertNoHP(user);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void metodeKodePOS(){
        String kodeposalamat = "11530";
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickButtonKodePOS();
            Thread.sleep(5000);
            driver.hideKeyboard();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.setInsertKodePOS(kodeposalamat);
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickPilihanTeratasKodePOS();
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Simpan Alamat\").instance(0))"));
            log.log(Status.PASS,"melakukan scroll sampai muncul kata 'keluar' pada tampilan layar");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickAlamatLengkap();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.tapKolomAlamatLengkap(address);
            Thread.sleep(5000);
            driver.hideKeyboard();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickSetujuTandaiAlamat();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickButtonSimpanAlamat();
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().back();

            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTextHalamanHome();
            String expectedProductTitle = "Home";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
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
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Simpan Alamat\").instance(0))"));
            log.log(Status.PASS,"melakukan scroll sampai muncul kata 'keluar' pada tampilan layar");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickAlamatLengkap();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.tapKolomAlamatLengkap(address);
            Thread.sleep(5000);
            driver.hideKeyboard();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickSetujuTandaiAlamat();
            pageObjectHalamanPersonal.clickButtonSimpanAlamat();
            Thread.sleep(5000);
            driver.navigate().back();

            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTextHalamanHome();
            String expectedProductTitle = "Home";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
