package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.URL;

public class Utility {

    public static AndroidDriver getAndroidDriver(){
        AndroidDriver driver=null;
        try{

        DesiredCapabilities desiredCapabilites = new DesiredCapabilities();
        desiredCapabilites.setCapability("platformName","Android");
        desiredCapabilites.setCapability("platformVersion","7.1.1");
        desiredCapabilites.setCapability("deviceName","emulator-5554");
        desiredCapabilites.setCapability("appPackage","com.indomaret.klikindomaret");
        desiredCapabilites.setCapability("appActivity",".default");
        driver = new AndroidDriver(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilites);

        } catch (Exception e){
            e.printStackTrace();
        }
        return driver;
    }
}
