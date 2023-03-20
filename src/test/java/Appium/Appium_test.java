package Appium;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


import java.net.MalformedURLException;
import java.net.URL;

public class Appium_test {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "aryan110801");
        dc.setCapability("udid", "62c6ccc5");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "9 PKQ1.180904.001");
        dc.setCapability("appPackage", "com.miui.calculator");
        dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement e1 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_1_s"));
        e1.click();
        MobileElement e2 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        e2.click();
        MobileElement e3 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_5_s"));
        e3.click();
        MobileElement e4 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
        e4.click();
        MobileElement e5 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_2_s"));
        e5.click();
        MobileElement e6 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_3_s"));
        e6.click();
        MobileElement e7 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_8_s"));
        e7.click();
        MobileElement e8 = (MobileElement) ad.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
        e8.click();

        Assert.assertEquals(ad.findElement(By.id("com.miui.calculator:id/result")).getText(),"= 393");
    }
}
