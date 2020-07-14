import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanLogin;
import pages.PageObjectTransaksi;
import reports.ExtentReportsDemo;
import utils.Utility;

public class TransaksiVersi20 extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", kodepos = "15155", password ="tapaukeyi";

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

    @Test(priority = 3)
    public void transaksiKolomPencarian(){
        String productid ="10017288", productBDPAAI="", productBDnonPAAI="20100669"
                , productBDJNE="20074452", productBPJNE="20069260", productBP="20065806"
                , productDP="20042702", ProductDPJNE="20073427";
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
//            pageObjectTransaksi.clickDetailProductPenjual();
            pageObjectTransaksi.clickDetailProductToko1();
//            pageObjectTransaksi.clickDetailProductKlik1();
            log.log(Status.PASS,"klik untuk melihat detail produk");
            Thread.sleep(7000);
            pageObjectTransaksi.clickGuideCariTokoygMenjual();
            log.log(Status.PASS,"tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Thread.sleep(4000);
            //===================== SCROLL TO TEXT ======================//
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PLU\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickButtonBeliProduct();
            Thread.sleep(5000);
//            pageObjectTransaksi.clickButtonBeliProduct();
            Thread.sleep(5000);
            log.log(Status.PASS,"klik tombol beli untuk menambahkan produk kedalam keranjang belanja");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().back();

            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTitle();
            String expectedProductTitle = "Ubah";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void checkOutToko(){
        try {
        Thread.sleep(5000);
        PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
        pageObjectTransaksi.clickShoppingCart();
        log.log(Status.PASS,"klik icon shopping cart untuk pindah ke Halaman Pembayaran");
        Thread.sleep(6000);
        pageObjectTransaksi.clickOpenDetailPembayaran();
        log.log(Status.PASS,"klik list view untuk melihat detail pembayaran");
        Thread.sleep(5000);
        pageObjectTransaksi.clickCloseDetailPembayaran();
        log.log(Status.PASS,"klik listview untuk menutup detail pembayaran");
        pageObjectTransaksi.clickKonfirmasiBarangBelanjaan();
        log.log(Status.PASS,"klik lanjut untuk konfirmasi barang belanjaan");
        Thread.sleep(4000);
        pageObjectTransaksi.pilihAllowPermissionLocation();
        log.log(Status.PASS,"aplikasi telah diizinkan untuk mengakses lokasi pengguna");
        Thread.sleep(6000);
        pageObjectTransaksi.clickKonfirmasiAlamatPengiriman();
        log.log(Status.PASS,"klik lanjut jika sudah melakukan konfirmasi alamat pengiriman");

        Thread.sleep(5000);
        String actualProductTitle = pageObjectTransaksi.getTextPembayaran();
        String expectedProductTitle = "Pembayaran";
        System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

        Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void checkOutKlik(){
        try {
            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
            pageObjectTransaksi.clickShoppingCart();
            log.log(Status.PASS,"klik icon shopping cart untuk pindah ke Halaman Pembayaran");
            Thread.sleep(6000);
            pageObjectTransaksi.clickOpenDetailPembayaran();
            log.log(Status.PASS,"klik list view untuk melihat detail pembayaran");
            Thread.sleep(5000);
            pageObjectTransaksi.clickCloseDetailPembayaran();
            log.log(Status.PASS,"klik listview untuk menutup detail pembayaran");
            pageObjectTransaksi.clickKonfirmasiBarangBelanjaan();
            log.log(Status.PASS,"Barang Belanjaan Telah dikonfirmasi");
            Thread.sleep(4000);
            pageObjectTransaksi.pilihAllowPermissionLocation();
            log.log(Status.PASS,"aplikasi telah diizinkan untuk mengakses lokasi pengguna");
            Thread.sleep(6000);
            pageObjectTransaksi.clickListDaftarAlamatUser();
            log.log(Status.PASS,"Daftar Alamat berhasil ditampilkan");
            Thread.sleep(6000);
            pageObjectTransaksi.clickPilihAlamatUntukPengiriman();
            log.log(Status.PASS,"Alamat Pengiriman Telah dipilih");
            Thread.sleep(6000);
            pageObjectTransaksi.clickKonfirmasiAlamatPengiriman();
            log.log(Status.PASS,"Alamat Berhasil dikonfirmasi");

            Thread.sleep(5000);
            String actualErrorText = pageObjectTransaksi.getErrorTextCheckOut();
            String expectedErrorText = "Mohon maaf, alamat pengiriman yang Anda pilih saat ini belum dapat dilayani. Silahkan pilih alamat lainnya";

            if(actualErrorText == expectedErrorText){
                pageObjectTransaksi.clickButtonErrorCheckOutNotification();
            }else {
                String actualProductTitle = pageObjectTransaksi.getTextPembayaran();
                String expectedProductTitle = "Pembayaran";
                Assert.assertEquals(actualProductTitle,expectedProductTitle);

                System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranCIMBNiagaRekPon(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(10000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Rekening Ponsel\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            log.log(Status.PASS,"melakukan Scroll hingga 'CIMB Rekening POnsel' tampil pada Tampilan Layar");

            Thread.sleep(4000);
            pageObjectTransaksi.clickMetodePembayaranCIMBNiagaRekeningPonsel();
            log.log(Status.PASS,"klik metode pembayaran menggunakan CIMB Rekening Ponsel");
//            pageObjectTransaksi.clickKolomTokenRekeningPonsel();
            pageObjectTransaksi.clickKolomTokenRekeningPonselXPath();
            log.log(Status.PASS,"klik kolom untuk melakukan pengisian token RekPon");
//            pageObjectTransaksi.setInsertTokenRekeningPonsel("000000");
            pageObjectTransaksi.setInsertTokenRekeningPonselXPath("000000");
            log.log(Status.PASS,"insert token Rekening Ponsel");
            Thread.sleep(4000);
            driver.hideKeyboard();
            Thread.sleep(4000);
//            pageObjectTransaksi.clickPayButtonCIMBRekPon();
            pageObjectTransaksi.clickPayButtonCIMBRekPonXPath();
            log.log(Status.PASS,"klik setuju melakukan pembayaran menggunakan Rekening Ponsel");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranVirtualAccountBCA(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(20000);
            pageObjectTransaksi.clickMetodePembayaranVirtualAccountBCA();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranVirtualAccountLainnya(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(10000);
            pageObjectTransaksi.clickMetodePembayaranVirtualLainnya();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranBCAKlikPay(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(10000);
            pageObjectTransaksi.clickMetodePembayaranBCAKlikPay();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranAkuLaku(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(10000);
            pageObjectTransaksi.clickMetodePembayaranAkuLaku();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranKartuKreditBCA(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
                //===================== SCROLL TO TEXT ======================//
                try {
                    Thread.sleep(5000);
                    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+".scrollToEnd(55);"));
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
                //===================== SCROLL TO TEXT ======================//
                Thread.sleep(10000);
            pageObjectTransaksi.clickMetodePembayaranKartuKreditBCA();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranPaymentPointIndomaret(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            try {
                Thread.sleep(5000);
                driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+".scrollToEnd(55);"));
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(6000);
            log.log(Status.PASS,"melakukan Scroll hingga 'Payment Point Indomaret' tampil pada Tampilan Layar");
            Thread.sleep(10000);
            pageObjectTransaksi.clickMetodePembayaranPaymentPointIndomaret();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void pembayaranLinkAja(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            try {
                Thread.sleep(5000);
                driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+".scrollToEnd(55);"));
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            //===================== SCROLL TO TEXT ======================//
            log.log(Status.PASS,"melakukan Scroll hingga 'LinkAja' tampil pada Tampilan Layar");
            Thread.sleep(10000);
            pageObjectTransaksi.clickMetodePembayaranLinkAja();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
