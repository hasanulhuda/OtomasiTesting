import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanLogin;
import pages.PageObjectWishlist;
import reports.ExtentReportsDemo;
import utils.Utility;

public class Wishlist extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", kodepos = "15155", password ="tapaukeyi";
    String productid ="Kacang";

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
    public void pencarianProduk(){
        try {
            Thread.sleep(5000);
            PageObjectHalamanBeranda pageObjectHalamanberanda = new PageObjectHalamanBeranda(driver);
            pageObjectHalamanberanda.clickKolomSearch();
            log.log(Status.PASS,"tap kolom search pada Beranda");
            pageObjectHalamanberanda.setInsertNamaProduct(productid);
            log.log(Status.PASS,"insert produk yang dicari");
            pageObjectHalamanberanda.clickPilihanTeratasPencarian();
            log.log(Status.PASS,"pilih produk teratas dari daftar pencarian");

        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
    public void addToWishlist(){
        try{
            Thread.sleep(5000);
            PageObjectWishlist pageObjectWishlist = new PageObjectWishlist(driver);
            pageObjectWishlist.clickButtonTambahWishlist();
            log.log(Status.PASS,"Tap untuk Menambahkan produk kedalam wishlist");
            Thread.sleep(3000);
            driver.navigate().back();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test(priority = 5)
    public void goingToHalamanWishlist(){
        try{
            Thread.sleep(5000);
            PageObjectWishlist pageObjectWishlist = new PageObjectWishlist(driver);
            pageObjectWishlist.clickHalamanWishlist();
            log.log(Status.PASS,"tap untuk pindah ke Halaman Wishlist");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
