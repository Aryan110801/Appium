package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Contacts_Appium {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "aryan110801");
//        caps.setCapability("udid", "62c6ccc5"); //Give Device ID of your mobile phone
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9 PKQ1.180904.001");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", "com.android.contacts.activities.NonPhoneActivity");
        caps.setCapability("noReset", "true");

        URL url = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,caps);
//        Thread.sleep(5000);
    }
}
