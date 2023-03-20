import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Calculator_Appium {
        private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //Set the Desired Capabilities
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "aryan110801");
            caps.setCapability("udid", "62c6ccc5"); //Give Device ID of your mobile phone
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "9 PKQ1.180904.001");
            caps.setCapability("appPackage", "com.miui.calculator");
            caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
            caps.setCapability("noReset", "true");

            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            driver.findElement(By.id("com.miui.calculator:id/btn_1_s")).click();
            driver.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
            driver.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
            driver.findElement(By.id("com.miui.calculator:id/btn_plus_s")).click();
            driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
            driver.findElement(By.id("com.miui.calculator:id/btn_3_s")).click();
            driver.findElement(By.id("com.miui.calculator:id/btn_8_s")).click();
            driver.findElement(By.id("com.miui.calculator:id/btn_equal_s")).click();
            String result = driver.findElement(By.id("com.miui.calculator:id/result")).getText();
            Phone_Appium.highlightelement(driver,result);

//            if (result.equals("= 393")) {
//                    System.out.println("Correct");
//            }
//            else {
//                    System.out.println("Wrong");
//            }
            Thread.sleep(3000);
            driver.quit();
    }
}
