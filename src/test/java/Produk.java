import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanLogin;
import pages.PageObjectProduk;
import reports.ExtentReportsDemo;
import utils.Utility;

public class Produk extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", kodepos = "15155", password ="tapaukeyi";
    String productid ="Kacang";
    PageObjectProduk pageObjectProduk;

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
    public void produkPencarian(){
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanberanda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanberanda.clickKolomSearch();
            log.log(Status.PASS,"tap kolom search pada Beranda");
            pageObjectHalamanberanda.setInsertNamaProduct(productid);
            log.log(Status.PASS,"insert produk yang dicari");
            pageObjectHalamanberanda.clickPilihanTeratasPencarian();
            log.log(Status.PASS,"pilih produk teratas dari daftar pencarian");
            Thread.sleep(5000);
            driver.navigate().back();

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void produkBanner(){
        try{
            Thread.sleep(5000);
            pageObjectProduk = new PageObjectProduk(driver);
            pageObjectProduk.clickProdukBanner();
            Thread.sleep(7000);
            driver.navigate().back();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void produkOfficialStore(){
        try{
            Thread.sleep(5000);
            pageObjectProduk = new PageObjectProduk(driver);
            pageObjectProduk.clickHyperlinkOfficialStore();
            pageObjectProduk.clickProdukOfficialStore();
            Thread.sleep(4000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().back();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
