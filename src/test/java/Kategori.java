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
            Thread.sleep(7000);
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
            Thread.sleep(10000);
            String actualProductKategori1 = pageObjectHalamanKategori.getTextPakaianWanita();
            String expectedProductKategori1 = "Pakaian Wanita";
            System.out.println("actual title -"+actualProductKategori1+"\n"+"expected title -"+actualProductKategori1);

            Assert.assertEquals(actualProductKategori1,expectedProductKategori1);

            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionPakaianMuslimWanita();
            log.log(Status.PASS,"fashion pakaian Muslim Wanita Berhasil dipilih");
            Thread.sleep(10000);
            String actualProductKategori2 = pageObjectHalamanKategori.getTextPakaianMuslimWanita();
            String expectedProductKategori2 = "Pakaian Muslim Wanita";
            System.out.println("actual title -"+actualProductKategori2+"\n"+"expected title -"+actualProductKategori2);

            Assert.assertEquals(actualProductKategori2,expectedProductKategori2);
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionPakaianTidurWanita();
            log.log(Status.PASS,"fashion pakaian Tidur Wanita Berhasil dipilih");
            Thread.sleep(10000);
            String actualProductKategori3 = pageObjectHalamanKategori.getTextPakaianTidurWanita();
            String expectedProductKategori3 = "Pakaian Tidur Wanita";
            System.out.println("actual title -"+actualProductKategori3+"\n"+"expected title -"+actualProductKategori3);

            Assert.assertEquals(actualProductKategori3,expectedProductKategori3);
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionPakaianDalamWanita();
            log.log(Status.PASS,"fashion pakaian Dalam Wanita Berhasil dipilih");
            Thread.sleep(10000);
            String actualProductKategori4 = pageObjectHalamanKategori.getTextPakaianDalamWanita();
            String expectedProductKategori4 = "Pakaian Dalam Wanita";
            System.out.println("actual title -"+actualProductKategori4+"\n"+"expected title -"+actualProductKategori4);

            Assert.assertEquals(actualProductKategori4,expectedProductKategori4);
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(3000);
            pageObjectHalamanKategori.fashionAksesorisWanita();
            log.log(Status.PASS,"fashion Aksesoris Wanita Berhasil dipilih");
            Thread.sleep(10000);
            String actualProductKategori5 = pageObjectHalamanKategori.getTextPakaianDalamWanita();
            String expectedProductKategori5 = "Aksesoris Wanita";
            System.out.println("actual title -"+actualProductKategori5+"\n"+"expected title -"+actualProductKategori5);

            Assert.assertEquals(actualProductKategori5,expectedProductKategori5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
