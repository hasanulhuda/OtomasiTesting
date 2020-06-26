import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import reports.ExtentReportsDemo;
import utils.Utility;

public class UbahMetodePengiriman extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", kodepos = "15155", password ="tapaukeyi";
    String productid ="20079790", kodetoko="TLW7", address="Jl. Medan Merdeka Barat no. 57";

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

            PageObjectHalamanLogin pageObjectHalamanLogin = new PageObjectHalamanLogin(driver);
            pageObjectHalamanLogin.clickHalamanLogin();
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

    @Test(priority = 3)
    public void transaksiKolomPencarian(){
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanberanda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanberanda.clickKolomSearch();
            log.log(Status.PASS,"tap kolom search pada Beranda");
            pageObjectHalamanberanda.setInsertNamaProduct(productid);
            log.log(Status.PASS,"insert produk yang dicari");
            pageObjectHalamanberanda.clickPilihanTeratasPencarian();
            log.log(Status.PASS,"pilih produk teratas dari daftar pencarian");

            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
//            pageObjectTransaksi.clickDetailProductToko2();
            pageObjectTransaksi.clickDetailProductPenjual();
//            pageObjectTransaksi.clickDetailProductToko1();
//            pageObjectTransaksi.clickDetailProductKlik1();
            log.log(Status.PASS,"klik untuk melihat detail produk");
//            pageObjectTransaksi.clickGuideCariTokoygMenjual();
            log.log(Status.PASS,"tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Thread.sleep(4000);
            //===================== SCROLL TO TEXT ======================//
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PLU\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickButtonBeliProduct();
            Thread.sleep(5000);
            pageObjectTransaksi.clickButtonBeliProduct();
            Thread.sleep(5000);
            log.log(Status.PASS,"klik tombol beli untuk menambahkan produk kedalam keranjang belanja");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().back();


        } catch (InterruptedException e){
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
            log.log(Status.PASS, "klik icon shopping cart untuk pindah ke Halaman Pembayaran");
            Thread.sleep(6000);
//            pageObjectHalamanBeranda.clickCheckUntukPilihAlamat();
            log.log(Status.PASS,"");
            Thread.sleep(6000);
            pageObjectHalamanBeranda.clickAturAlamatHanyaSatu();
            log.log(Status.PASS,"");
            Thread.sleep(6000);
            pageObjectHalamanBeranda.clickTambahAlamatKedua();
            log.log(Status.PASS,"");
//            Thread.sleep(6000);
//            pageObjectHalamanBeranda.clickCheckUntukPilihanAlamatKedua();
//            log.log(Status.PASS,"");
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
//            pageObjectHalamanBeranda.clickAturAlamatHanyaSatu();
            pageObjectHalamanBeranda.clickAturAlamatHanyaDua();
            log.log(Status.PASS,"");
            Thread.sleep(5000);

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
            Thread.sleep(6000);
            pageObjectHalamanBeranda.clickTambahHalamanAlamatBaru();
            log.log(Status.PASS,"");
            Thread.sleep(6000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //region Halaman Buku Alamat(Priority = 3)
    @Test(priority = 5)
    public void BukuAlamat(){
        String titleAddress="Kantor", namaDepan = "Muhammad",
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
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(3000);
            pageObjectHalamanPersonal.clickButtonKodePOS();
            Thread.sleep(5000);
            driver.hideKeyboard();
            Thread.sleep(5000);
            pageObjectHalamanPersonal.setInsertKodePOS(kodepos);
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
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickButtonSimpanAlamat();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
