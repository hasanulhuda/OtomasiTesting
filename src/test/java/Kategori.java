import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanKategori;
import pages.PageObjectHalamanLogin;
import reports.ExtentReportsDemo;
import utils.Utility;

public class Kategori extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", password ="tapaukeyi", kodepos="15155";

    @Test(priority = 1)
    public void halamanAwalKodePos(){
        try {
            Thread.sleep(7000);
            PageObjectHalamanAwal pageObjectHalamanAwal = new PageObjectHalamanAwal(driver);
            pageObjectHalamanAwal.clickOnGuide1();
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
            pageObjectHalamanLogin.clickPilihanLogin();
//            Thread.sleep(3000);
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
    public void kategoriFashion(){
        try{
            PageObjectHalamanKategori pageObjectHalamanKategori = new PageObjectHalamanKategori(driver);
            pageObjectHalamanKategori.clickHalamanKategori();
            log.log(Status.PASS,"klik icon kategori untuk pindah ke halaman Kategori");
            Thread.sleep(3000);
            pageObjectHalamanKategori.clickGuideKategori();
            log.log(Status.PASS,"tap 'Mengerti' pada petunjuk yang ada pada Halaman Kategori");
            pageObjectHalamanKategori.clickButtonFashion();
            log.log(Status.PASS,"klik listview untuk memilih kategori mengenai 'Fashion'");
            Thread.sleep(3000);
            pageObjectHalamanKategori.clickButtonKategoriFashionWanita();
            log.log(Status.PASS,"memilih kategorri fashion wanita berhasil");
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionPakaianWanita();
            log.log(Status.PASS,"fashion pakaian wanita Berhasil dipilih");
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionPakaianMuslimWanita();
            log.log(Status.PASS,"fashion pakaian Muslim Wanita Berhasil dipilih");
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionPakaianTidurWanita();
            log.log(Status.PASS,"fashion pakaian Tidur Wanita Berhasil dipilih");
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionPakaianDalamWanita();
            log.log(Status.PASS,"fashion pakaian Dalam Wanita Berhasil dipilih");
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionAksesorisWanita();
            log.log(Status.PASS,"fashion Aksesoris Wanita Berhasil dipilih");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
