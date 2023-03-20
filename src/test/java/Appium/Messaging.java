package Appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Messaging {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "aryan110801");
        caps.setCapability("udid", "62c6ccc5"); //Give Device ID of your mobile phone
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9 PKQ1.180904.001");
        caps.setCapability("appPackage", "com.android.mms");
        caps.setCapability("appActivity", "com.android.mms.ui.ComposeMessageRouterActivity");

        URL url = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,caps);
        driver.findElement(By.id("com.android.mms:id/recipients_viewer")).click();
        driver.findElement(By.id("com.android.mms:id/recipients_editor")).sendKeys("7802855929");
        driver.findElement(By.id("com.android.mms:id/number")).click();
//        driver.findElement(By.id("com.android.mms:id/message_content_panel")).click();
        driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hello bro");
        driver.findElement(By.id("com.android.mms:id/send_button")).click();
    }
}
