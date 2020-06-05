import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageObjectHalamanAwal;
import pages.PageObjectHalamanBeranda;
import pages.PageObjectHalamanLogin;
import reports.ExtentReportsDemo;
import utils.Utility;

public class HalamanAwal extends ExtentReportsDemo {

    AndroidDriver driver = Utility.getAndroidDriver();

    String kodepos = "15155", provinsi="DKI", kota = "Selatan",
            kecamatan = "Pesanggrahan", kelurahan = "Utara";

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
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public void halamanAwalKodeWilayah(){
        try{
            PageObjectHalamanAwal pageObjectHalamanAwal = new PageObjectHalamanAwal(driver);
            Thread.sleep(7000);
//            pageObjectHalamanAwal.clickOnGuide1();
//            log.log(Status.PASS,"Object Guide Pengguna Pertama");
            pageObjectHalamanAwal.clickOnGuide2();
            log.log(Status.PASS,"Object Guide Pengguna Kedua");
            pageObjectHalamanAwal.clickButtonKodeWilayah();
            log.log(Status.PASS,"Button Untuk Input lokasi menggunakan Kode Wilayah");
            pageObjectHalamanAwal.setInsertProvinsi(provinsi);
            log.log(Status.PASS,"inputan untuk mencari Provinsi");
            pageObjectHalamanAwal.clickPilihanTeratasProvinsi();
            log.log(Status.PASS,"tampilan teratas untuk provinsi yang dicari");
            pageObjectHalamanAwal.setInsertKota(kota);
            log.log(Status.PASS,"inputan untuk mencari Kota");
            pageObjectHalamanAwal.clickPilihanTeratasKota();
            log.log(Status.PASS,"tampilan teratas untuk Kota yang dicari");
            pageObjectHalamanAwal.setInsertKecamatan(kecamatan);
            log.log(Status.PASS,"inputan untuk mencari Kecamatan");
            pageObjectHalamanAwal.clickPilihanTeratasKecamatan();
            log.log(Status.PASS,"tampilan teratas untuk Kecamatan yang dicari");
            pageObjectHalamanAwal.setInsertKelurahan(kelurahan);
            log.log(Status.PASS,"inputan untuk mencari Kelurahan");
            pageObjectHalamanAwal.clickPilihanTeratasKelurahan();
            log.log(Status.PASS,"tampilan teratas untuk provinsi yang dicari");
            Thread.sleep(5000);
            pageObjectHalamanAwal.clickHalamanLogin();
            log.log(Status.PASS,"Memilih Lokasi berdasar Kode Wilayah Berhasil");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
