import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.Reporter;
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
            Thread.sleep(15000);
            PageObjectHalamanAwal pageObjectHalamanAwal = new PageObjectHalamanAwal(driver);
            pageObjectHalamanAwal.clickOnGuide1Versi20();
            log.log(Status.PASS,"Object Guide Pengguna Pertama");
            Reporter.log("Object Guide Pengguna Pertama Berhasil di Tap");
            Thread.sleep(5000);
            pageObjectHalamanAwal.clickOnGuide2Versi20();
            log.log(Status.PASS,"Object Guide Pengguna Kedua");
            Reporter.log("Object Guide Pengguna Kedua Berhasil diTap");
            pageObjectHalamanAwal.clickOnGuide2();
            log.log(Status.PASS,"Klik Button Ubah pada Halaman Utama");
            Reporter.log("Klik Button Ubah pada Halaman Utama Berhasil diTap");
            pageObjectHalamanAwal.clickButtonKodePos();
            log.log(Status.PASS,"Button Untuk Input lokasi menggunakan Kode POS");
            Reporter.log("listview Metode Lokasi dengan Kode POS berhhasil diTap");
            pageObjectHalamanAwal.setInsertKodePos(kodepos);
            log.log(Status.PASS,"inputan untuk mencari Wilayah Menggunakan Kode POS");
            Reporter.log("kode pos ="+kodepos+" Berhasil diinput");
            pageObjectHalamanAwal.clickPilihanKodePos();
            log.log(Status.PASS,"tampilan teratas untuk Wilayah yang dicari");
            Reporter.log("kode pos ="+kodepos+" Berhasil dipilih");

            PageObjectHalamanLogin pageObjectHalamanLogin = new PageObjectHalamanLogin(driver);
            pageObjectHalamanLogin.clickHalamanLogin();
            log.log(Status.PASS,"Memilih Lokasi berdasar Kode Wilayah Berhasil");
            Reporter.log("Memilih Lokasi berdasar Kode Wilayah Berhasil");

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
            Reporter.log("Button Login/Register Untuk pindah ke Halaman login Berhasil diTap");
            pageObjectHalamanLogin.setInsertUserID(user);
            log.log(Status.PASS,"insert valid User");
            Reporter.log("username = "+user+" berhasil dinput");
            Thread.sleep(3000);
            pageObjectHalamanLogin.seteInsertUserPassword(password);
            log.log(Status.PASS,"insert valid password");
            Reporter.log("Password = "+user+" berhasil dinput");
            Thread.sleep(3000);
            pageObjectHalamanLogin.clickButtonSubmitLogin();
            log.log(Status.PASS,"Tap Button login Berhasil");
            Reporter.log("Tap Button login Berhasil");
            Thread.sleep(3000);
            pageObjectHalamanLogin.clickInvisibleElement();
            log.log(Status.PASS,"klik invisible element yang ada pada beranda");
            Reporter.log("tap invisible element yang ada pada beranda");

            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTitle();
            String expectedProductTitle = "Ubah";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
            Reporter.log("LOGIN BERHASIL!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void addProductToCart(){
        String productToko ="10017288", productBDPAAI="", productBDnonPAAI="20100669"
                , productBDJNE="20074452", productBPJNE="20069260", productBP="20065806"
                , productDP="20042702", ProductDPJNE="20073427";
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanberanda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanberanda.clickKolomSearch();
            log.log(Status.PASS,"tap kolom search pada Beranda");
            Reporter.log("tap kolom search pada Beranda Berhasil");
            pageObjectHalamanberanda.setInsertNamaProduct(productToko);
            log.log(Status.PASS,"insert produk yang dicari");
            Reporter.log("insert produk dengan kode PLU="+productToko+" Berhasil");
            pageObjectHalamanberanda.clickPilihanTeratasPencarian();
            log.log(Status.PASS,"pilih produk teratas dari daftar pencarian");
            Reporter.log("tap pilihan teratas pada pencarian produk");

            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
//            pageObjectTransaksi.clickDetailProductToko2();
//            pageObjectTransaksi.clickDetailProductPenjual();
            pageObjectTransaksi.clickDetailProductToko1();
//            pageObjectTransaksi.clickDetailProductKlik1();
            log.log(Status.PASS,"klik untuk melihat detail produk");
            Reporter.log("Halaman Detail produk dengan PLU= "+productToko+" Berhasil dibuka");
            Thread.sleep(7000);
            pageObjectTransaksi.clickGuideCariTokoygMenjual();
            log.log(Status.PASS,"tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Reporter.log("tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Thread.sleep(4000);
            //===================== SCROLL TO TEXT ======================//
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PLU\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickButtonBeliProduct();
            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
            Thread.sleep(5000);
//            pageObjectTransaksi.clickButtonBeliProduct();
            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
            Thread.sleep(5000);
            log.log(Status.PASS,"klik tombol beli untuk menambahkan produk kedalam keranjang belanja");
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().back();
            Reporter.log("Kembali ke Halaman Awal/Beranda");

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

    @Test(priority = 3)
    public void addProductToCart2(){
        String productToko ="20091108", productBDPAAI="", productBDnonPAAI="20100669"
                , productBDJNE="20074452", productBPJNE="20069260", productBP="20065806"
                , productDP="20042702", ProductDPJNE="20073427";
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanberanda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanberanda.clickKolomSearch();
            log.log(Status.PASS,"tap kolom search pada Beranda");
            Reporter.log("tap kolom search pada Beranda Berhasil");
            pageObjectHalamanberanda.setInsertNamaProduct(productToko);
            log.log(Status.PASS,"insert produk yang dicari");
            Reporter.log("insert produk dengan kode PLU="+productToko+" Berhasil");
            pageObjectHalamanberanda.clickPilihanTeratasPencarian();
            log.log(Status.PASS,"pilih produk teratas dari daftar pencarian");
            Reporter.log("tap pilihan teratas pada pencarian produk");

            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
//            pageObjectTransaksi.clickDetailProductToko2();
//            pageObjectTransaksi.clickDetailProductPenjual();
//            pageObjectTransaksi.clickDetailProductToko1();
            pageObjectTransaksi.clickDetailProductKlik1();
            log.log(Status.PASS,"klik untuk melihat detail produk");
            Reporter.log("Halaman Detail produk dengan PLU= "+productToko+" Berhasil dibuka");
            Thread.sleep(7000);
//            pageObjectTransaksi.clickGuideCariTokoygMenjual();
            log.log(Status.PASS,"tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Reporter.log("tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Thread.sleep(4000);
            //===================== SCROLL TO TEXT ======================//
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PLU\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickButtonBeliProduct();
            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
            Thread.sleep(5000);
//            pageObjectTransaksi.clickButtonBeliProduct();
//            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
//            Thread.sleep(5000);
            log.log(Status.PASS,"klik tombol beli untuk menambahkan produk kedalam keranjang belanja");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().back();
            Reporter.log("Kembali ke Halaman Awal/Beranda");

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

    @Test(priority = 3)
    public void addProductToCart3(){
        String productToko ="10040192", productBDPAAI="", productBDnonPAAI="20100669"
                , productBDJNE="20074452", productBPJNE="20069260", productBP="20065806"
                , productDP="20042702", ProductDPJNE="20073427";
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanberanda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanberanda.clickKolomSearch();
            log.log(Status.PASS,"tap kolom search pada Beranda");
            Reporter.log("tap kolom search pada Beranda Berhasil");
            pageObjectHalamanberanda.setInsertNamaProduct(productToko);
            log.log(Status.PASS,"insert produk yang dicari");
            Reporter.log("insert produk dengan kode PLU="+productToko+" Berhasil");
            pageObjectHalamanberanda.clickPilihanTeratasPencarian();
            log.log(Status.PASS,"pilih produk teratas dari daftar pencarian");
            Reporter.log("tap pilihan teratas pada pencarian produk");

            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
//            pageObjectTransaksi.clickDetailProductToko2();
//            pageObjectTransaksi.clickDetailProductPenjual();
            pageObjectTransaksi.clickDetailProductToko1();
//            pageObjectTransaksi.clickDetailProductKlik1();
            log.log(Status.PASS,"klik untuk melihat detail produk");
            Reporter.log("Halaman Detail produk dengan PLU= "+productToko+" Berhasil dibuka");
            Thread.sleep(7000);
//            pageObjectTransaksi.clickGuideCariTokoygMenjual();
            log.log(Status.PASS,"tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Reporter.log("tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Thread.sleep(4000);
            //===================== SCROLL TO TEXT ======================//
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PLU\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickButtonBeliProduct();
            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
            Thread.sleep(5000);
//            pageObjectTransaksi.clickButtonBeliProduct();
//            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
//            Thread.sleep(5000);
            log.log(Status.PASS,"klik tombol beli untuk menambahkan produk kedalam keranjang belanja");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().back();
            Reporter.log("Kembali ke Halaman Awal/Beranda");

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

    @Test(priority = 3)
    public void addProductToCart4(){
        String productToko ="20091102", productBDPAAI="", productBDnonPAAI="20100669"
                , productBDJNE="20074452", productBPJNE="20069260", productBP="20065806"
                , productDP="20042702", ProductDPJNE="20073427";
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanberanda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanberanda.clickKolomSearch();
            log.log(Status.PASS,"tap kolom search pada Beranda");
            Reporter.log("tap kolom search pada Beranda Berhasil");
            pageObjectHalamanberanda.setInsertNamaProduct(productToko);
            log.log(Status.PASS,"insert produk yang dicari");
            Reporter.log("insert produk dengan kode PLU="+productToko+" Berhasil");
            pageObjectHalamanberanda.clickPilihanTeratasPencarian();
            log.log(Status.PASS,"pilih produk teratas dari daftar pencarian");
            Reporter.log("tap pilihan teratas pada pencarian produk");

            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
//            pageObjectTransaksi.clickDetailProductToko2();
            pageObjectTransaksi.clickDetailProductPenjual();
//            pageObjectTransaksi.clickDetailProductToko1();
//            pageObjectTransaksi.clickDetailProductKlik1();
            log.log(Status.PASS,"klik untuk melihat detail produk");
            Reporter.log("Halaman Detail produk dengan PLU= "+productToko+" Berhasil dibuka");
            Thread.sleep(7000);
//            pageObjectTransaksi.clickGuideCariTokoygMenjual();
            log.log(Status.PASS,"tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Reporter.log("tap 'Mengerti' untuk panduan pencarian toko yang menjual produk");
            Thread.sleep(4000);
            //===================== SCROLL TO TEXT ======================//
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"PLU\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickButtonBeliProduct();
            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
            Thread.sleep(5000);
//            pageObjectTransaksi.clickButtonBeliProduct();
//            Reporter.log("produk dengan PLU= "+productToko+" Berhasil dimasukkan kedalam Keranjang");
//            Thread.sleep(5000);
            log.log(Status.PASS,"klik tombol beli untuk menambahkan produk kedalam keranjang belanja");
            Thread.sleep(3000);
            driver.navigate().back();
            Thread.sleep(3000);
            driver.navigate().back();
            Reporter.log("Kembali ke Halaman Awal/Beranda");

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
    public void shoppingCart(){
        try {
            Thread.sleep(5000);
            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
            pageObjectTransaksi.clickShoppingCart();
            log.log(Status.PASS,"klik icon shopping cart untuk pindah ke Halaman Pembayaran");
            Reporter.log("klik icon shopping cart untuk pindah ke Halaman Pembayaran");
            Thread.sleep(6000);
            pageObjectTransaksi.clickOpenDetailPembayaran();
            log.log(Status.PASS,"klik list view untuk melihat detail pembayaran");
            Reporter.log("klik list view untuk melihat detail pembayaran");

            Thread.sleep(5000);
            String actualProductTitle = pageObjectTransaksi.getTextKeranjangBelanja();
            Thread.sleep(5000);
            pageObjectTransaksi.clickCloseDetailPembayaran();
            log.log(Status.PASS,"klik listview untuk menutup detail pembayaran");
            Reporter.log("klik list view untuk menutup detail pembayaran");
            pageObjectTransaksi.clickKonfirmasiBarangBelanjaan();
            Reporter.log("tap Button untuk melanjutkan ke Halaman Pengiriman");
            String expectedProductTitle = "Keranjang Belanja";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void checkOutToko(){
        try {
        Thread.sleep(5000);
        PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
        Thread.sleep(4000);
        pageObjectTransaksi.pilihAllowPermissionLocation();
        log.log(Status.PASS,"aplikasi telah diizinkan untuk mengakses lokasi pengguna");
        Thread.sleep(6000);
        pageObjectTransaksi.clickKonfirmasiAlamatPengiriman();
        log.log(Status.PASS,"klik lanjut jika sudah melakukan konfirmasi alamat pengiriman");

        Thread.sleep(10000);
        String actualProductTitle = pageObjectTransaksi.getTextPembayaran();
        String expectedProductTitle = "Pembayaran";
        System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

        Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void checkOutProdukCampur(){
        try {
            Thread.sleep(5000);
            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
            Thread.sleep(4000);
            pageObjectTransaksi.pilihAllowPermissionLocation();
            log.log(Status.PASS,"aplikasi telah diizinkan untuk mengakses lokasi pengguna");
            Reporter.log("aplikasi telah diizinkan untuk mengakses lokasi pengguna");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Pesanan + Ongkos Kirim\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickPilihMetodeKirimKeAlamat();
            Reporter.log("pengiriman melalui Metode Kirim ke Alamat berhasil dipilih");
            log.log(Status.PASS,"");
            pageObjectTransaksi.listviewAlamatKirimKeAlamat();
            Reporter.log("tap listview untuk pindah ke Halaman Daftar Alamat");
            log.log(Status.PASS,"");
            pageObjectTransaksi.clickPilihAlamatKirimKeAlamat1();
            Reporter.log("tap alamat untuk pengiriman berhasil dipilih");
            log.log(Status.PASS,"");
            Thread.sleep(6000);
            pageObjectTransaksi.clickKonfirmasiAlamatPengiriman();
            Reporter.log("tap Button Konfirmasi Metode dan Alamat pengiriman sekaligus pindah ke Halaman Pembayaran");
            log.log(Status.PASS,"klik lanjut jika sudah melakukan konfirmasi alamat pengiriman");

            Thread.sleep(20000);
            String actualProductTitle = pageObjectTransaksi.getTextPembayaran();
            String expectedProductTitle = "Pembayaran";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Test(priority = 5)
    public void checkOutProdukCampurAmbildiToko(){
        String kodetoko="TWQA";
        try {
            Thread.sleep(5000);
            PageObjectTransaksi pageObjectTransaksi = new PageObjectTransaksi(driver);
            Thread.sleep(4000);
            pageObjectTransaksi.pilihAllowPermissionLocation();
            Reporter.log("aplikasi telah diizinkan untuk mengakses lokasi pengguna");
            log.log(Status.PASS,"aplikasi telah diizinkan untuk mengakses lokasi pengguna");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Total Pesanan + Ongkos Kirim\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(4000);
            pageObjectTransaksi.clickPilihMetodeAmbildiToko();
            Reporter.log("pengiriman melalui Metode Kirim Ambil diToko dipilih");
            log.log(Status.PASS,"");
            Thread.sleep(4000);
            pageObjectTransaksi.listviewAlamatAmbildiToko();
            Reporter.log("tap listview untuk pindah ke Halaman Daftar Toko");
            log.log(Status.PASS,"");
            pageObjectTransaksi.btnKolomKodetokoAmbildiToko();
            Reporter.log("tap kolom pencarian Toko berhasil");
            log.log(Status.PASS,"");
            Thread.sleep(6000);
            pageObjectTransaksi.insertKolomKodetokoAmbildiToko(kodetoko);
            Reporter.log("Toko dengan kode toko = "+kodetoko+"berhasil diinput");
            log.log(Status.PASS,"klik lanjut jika sudah melakukan konfirmasi alamat pengiriman");
            Thread.sleep(4000);
            pageObjectTransaksi.pilihTeratasTokoAmbilDiToko();
            Reporter.log("pilihan teratas pada pencarian toko berhasil dipilih");
            log.log(Status.PASS,"");
            Thread.sleep(5000);
            pageObjectTransaksi.clickPilihToko();
            Reporter.log("Toko "+kodetoko+" Berhasil dipilih");
            log.log(Status.PASS,"");
            Thread.sleep(6000);
            pageObjectTransaksi.clickKonfirmasiAlamatPengiriman();
            Reporter.log("tap Button Konfirmasi Metode dan Alamat pengiriman sekaligus pindah ke Halaman Pembayaran");
            log.log(Status.PASS,"klik lanjut jika sudah melakukan konfirmasi alamat pengiriman");

            Thread.sleep(20000);
            String actualProductTitle = pageObjectTransaksi.getTextPembayaran();
            String expectedProductTitle = "Pembayaran";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
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

    @Test(priority = 6)
    public void pembayaranCIMBNiagaRekPon(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            Thread.sleep(10000);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(10000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Rekening Ponsel\").instance(0))"));
            //===================== SCROLL TO TEXT ======================//
            log.log(Status.PASS,"melakukan Scroll hingga 'CIMB Rekening POnsel' tampil pada Tampilan Layar");

            Thread.sleep(4000);
            pageObjectTransaksi.clickMetodePembayaranCIMBNiagaRekeningPonsel();
            Reporter.log("pilih metode pembayaran menggunakan 'REKENING PONSEL CIMB NIAGA' berhasil dipilih");
            log.log(Status.PASS,"klik metode pembayaran menggunakan CIMB Rekening Ponsel");
//            pageObjectTransaksi.clickKolomTokenRekeningPonsel();
            pageObjectTransaksi.clickKolomTokenRekeningPonselXPath();
            Reporter.log("tap kolom Token Rekening Ponsel CIMB Niaga");
            log.log(Status.PASS,"klik kolom untuk melakukan pengisian token RekPon");
//            pageObjectTransaksi.setInsertTokenRekeningPonsel("000000");
            pageObjectTransaksi.setInsertTokenRekeningPonselXPath("000000");
            Reporter.log("token Rekening Ponsel berhasil diinput");
            log.log(Status.PASS,"insert token Rekening Ponsel");
            Thread.sleep(4000);
            driver.hideKeyboard();
            Thread.sleep(4000);
//            pageObjectTransaksi.clickPayButtonCIMBRekPon();
            pageObjectTransaksi.clickPayButtonCIMBRekPonXPath();
            Reporter.log("konfirmasi pembayaran berhasil ditap");
            log.log(Status.PASS,"klik setuju melakukan pembayaran menggunakan Rekening Ponsel");
            Thread.sleep(5000);
            pageObjectTransaksi.clickTutupKonfirmasiPembayaran();
            Reporter.log("close Halaman konfirmasi pembayaran dan Kembali ke Halaman Utama/Beranda");
            log.log(Status.PASS,"");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
    public void pembayaranVirtualAccountBCA(){
        try{
            PageObjectTransaksi pageObjectTransaksi= new PageObjectTransaksi(driver);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(20000);
            pageObjectTransaksi.clickMetodePembayaranVirtualAccountBCA();
            Thread.sleep(6000);
            pageObjectTransaksi.clickPayNow();
            Thread.sleep(5000);
            pageObjectTransaksi.clickTutupKonfirmasiPembayaran();
            log.log(Status.PASS,"");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 6)
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

    @Test(priority = 6)
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

    @Test(priority = 6)
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

    @Test(priority = 6)
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

    @Test(priority = 6)
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

    @Test(priority = 6)
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
