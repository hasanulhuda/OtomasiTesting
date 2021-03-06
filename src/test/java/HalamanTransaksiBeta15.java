import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.*;
import reports.ExtentReportsDemo;
import utils.Utility;

public class HalamanTransaksiBeta15 extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", kodepos = "15155", password ="tapaukeyi";
    String productid ="Kacang";

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
            Reporter.log("listview Metode Lokasi dengan Kode POS berhasil diTap");
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
            Reporter.getCurrentTestResult();
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
    public void halamanTransaksi(){
        try{
            Thread.sleep(5000);
            PageObjectHalamanTransaksiBeta15 pageObjectHalamanTransaksiBeta15 = new PageObjectHalamanTransaksiBeta15(driver);
            pageObjectHalamanTransaksiBeta15.clickButtonHalamanTransaksi();
            log.log(Status.PASS,"tap untuk pindah ke Halaman Transaksi");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
