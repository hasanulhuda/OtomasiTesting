import com.aventstack.extentreports.Status;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import koneksi.Koneksi;
import koneksi.KoneksiKlik;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanLogin;
import pages.PageObjectHalamanPersonal;
import reports.ExtentReportsDemo;
import utils.Utility;

public class LoginVersi20 extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String user = "082370683185", kodepos = "15155", password ="tapaukeyi",
    invaliduser="Hasanulhuda", invalidpassword ="tapaukeyi1";

//    @Test
//    public void testDB(){
//        KoneksiKlik cn = new KoneksiKlik();
//        try{
//            Thread.sleep(5000);
//            /*------------- OTP Code -------------------*/
//            String isSend= cn.getEmailValid(user);
//            String mailValidation = isSend;
//
//            if(mailValidation.equals("1")){
//                System.out.println("Sudah Terkirim Dund");
//            }else if (mailValidation.equals("0")){
//                System.out.println("Yah!! Tidak Terkirim Pesanmu");
//            } else {
//
//            }
//            /*------------- OTP Code -------------------*/
//
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }

    @Test(priority = 1)
    public void halamanAwalKodePos(){
        try {
            Thread.sleep(10000);
            PageObjectHalamanAwal pageObjectHalamanAwal = new PageObjectHalamanAwal(driver);
            Thread.sleep(5000);
            pageObjectHalamanAwal.clickOnGuide1Versi20();
            Reporter.log("Object Guide Pengguna Pertama Berhasil di Tap");
            log.log(Status.PASS,"Object Guide Pengguna Pertama");
            Thread.sleep(5000);
            pageObjectHalamanAwal.clickOnGuide2Versi20();
            Reporter.log("Object Guide Pengguna Kedua Berhasil di Tap");
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


            Thread.sleep(10000);
            String actualProductTitle = pageObjectHalamanLogin.getTitlekHalamanLogin();
            String expectedProductTitle = "Akun Saya";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
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


            Thread.sleep(3000);
            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTextErrorLogin();
            String expectedProductTitle = " ";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
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

            Thread.sleep(3000);
            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTextErrorLogin();
            String expectedProductTitle = " ";
            System.out.println("actual title -"+actualProductTitle+"\n"+"expected title -"+expectedProductTitle);

            Assert.assertEquals(actualProductTitle,expectedProductTitle);
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
            Thread.sleep(3000);
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
    public void logOutVersi20() {
        try {
            PageObjectHalamanPersonal pageObjectHalamanPersonal = new PageObjectHalamanPersonal(driver);
            Thread.sleep(8000);
            pageObjectHalamanPersonal.clickHalamanPersonal();
            log.log(Status.PASS, "klik icon Profile untuk pindah ke Halaman Personal");
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickPanduanProfilPertamaVersi20();
            log.log(Status.PASS, "tap panduan penggunaan pertama pada Halaman Personal");
            Thread.sleep(5000);
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Keluar\").instance(0))"));
            log.log(Status.PASS, "melakukan scroll sampai muncul kata 'keluar' pada tampilan layar");
            //===================== SCROLL TO TEXT ======================//
            Thread.sleep(5000);
            pageObjectHalamanPersonal.clickTombolKeluarVersi20();
            log.log(Status.PASS, "klik tombol logout dan logout berhasil");

            PageObjectHalamanBeranda pageObjectHalamanBeranda = new PageObjectHalamanBeranda(driver);
            String actualProductTitle = pageObjectHalamanBeranda.getTitle();
            String expectedProductTitle = "Ubah";
            System.out.println("actual title -" + actualProductTitle + "\n" + "expected title -" + expectedProductTitle);

            Assert.assertEquals(actualProductTitle, expectedProductTitle);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
