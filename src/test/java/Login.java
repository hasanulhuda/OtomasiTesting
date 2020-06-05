import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
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

public class Login extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "0895338021090", kodepos = "15155", password ="tapaukeyi",
    invaliduser="Hasanulhuda", invalidpassword ="tapaukeyi1";

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
    public void loginInvalidUserID(){
        try {
            Thread.sleep(5000);
            PageObjectHalamanLogin pageObjectHalamanLogin = new PageObjectHalamanLogin(driver);
            pageObjectHalamanLogin.clickPilihanLogin();
            log.log(Status.PASS,"pilih Button Login/Register Untuk pindah ke Halaman login");
            pageObjectHalamanLogin.setInsertUserID(invaliduser);
            log.log(Status.PASS,"Melakukan inputan User ID yang dimiliki oleh pengguna");
            pageObjectHalamanLogin.seteInsertUserPassword(password);
            log.log(Status.PASS,"Melakukan inputan password yang dimiliki oleh pengguna");
            pageObjectHalamanLogin.clickButtonSubmitLogin();
            log.log(Status.PASS,"Tap Button Login untuk melakukan validasi data Pengguna");

            String actualErrTxt = pageObjectHalamanLogin.getErrTxt();

            Thread.sleep(3000);
            pageObjectHalamanLogin.clickButtonValidasi();
            String expectedErrTxt = "Username and Password Doesn't Match or Coudn't find User with this ID";
            System.out.println("actual error txt-"+actualErrTxt+"\n"+"expected error txt-"+expectedErrTxt);

            Assert.assertEquals(actualErrTxt,expectedErrTxt);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 3)
    public void loginInvalidPassword(){
        try {
            Thread.sleep(5000);
            PageObjectHalamanLogin pageObjectHalamanLogin = new PageObjectHalamanLogin(driver);
//            pageObjectHalamanLogin.clickPilihanLogin();
//            Thread.sleep(3000);
            pageObjectHalamanLogin.setInsertUserID(user);
            log.log(Status.PASS,"Melakukan inputan User ID yang dimiliki oleh pengguna");
            pageObjectHalamanLogin.seteInsertUserPassword(invalidpassword);
            log.log(Status.PASS,"Melakukan inputan password yang dimiliki oleh pengguna");
            pageObjectHalamanLogin.clickButtonSubmitLogin();
            log.log(Status.PASS,"Tap Button Login untuk melakukan validasi data Pengguna");

            String actualErrTxt = pageObjectHalamanLogin.getErrTxt();

            Thread.sleep(5000);
            pageObjectHalamanLogin.clickButtonValidasi();
            String expectedErrTxt = "Username and Password Doesn't Match or Coudn't find User with this ID";
            System.out.println("actual error txt-"+actualErrTxt+"\n"+"expected error txt-"+expectedErrTxt);

            Assert.assertEquals(actualErrTxt,expectedErrTxt);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 4)
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

    @Test(priority = 5)
    public void logOut(){
        try{
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickHalamanPersonal();
            log.log(Status.PASS,"klik icon Profile untuk pindah ke Halaman Personal");
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickPanduanProfilPertama();
            log.log(Status.PASS,"tap panduan penggunaan pertama pada Halaman Personal");
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickPanduanProfilKedua();
            log.log(Status.PASS,"tap panduan penggunaan kedua pada Halaman Personal");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Keluar\").instance(0))"));
            log.log(Status.PASS,"melakukan scroll sampai muncul kata 'keluar' pada tampilan layar");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickTombolKeluar();
            log.log(Status.PASS,"klik tombol logout dan logout berhasil");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
