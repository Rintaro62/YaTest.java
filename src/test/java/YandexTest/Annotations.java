package YandexTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.net.URL;

public class Annotations  {
    static WebDriver driver;
    protected String ggrUrl = "http://localhost:4445";
    public static WebDriver getDriver() {
        return driver;
    }

    public static class Helper {
        public static WebElement findElement(By locator) {
            try {
                return driver.findElement(locator);
            } catch (NoSuchElementException notFound) {
                return null;
            }
        }
        public Helper(WebDriver yourDriver) {
            driver = yourDriver;
        }
    }
    public void asCheck(){
        WebElement window = Helper.findElement(By.xpath(".//span[@class='_nb-checkbox-flag _nb-checkbox-normal-flag']"));
        if(window == null) {
            System.out.println("All right");
        }else {
            System.out.println("Window Mail exists");
        }
    }
    @BeforeTest
    public void beforetest() {
       ChromeOptions options = new ChromeOptions();
       DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.setCapability(ChromeOptions.CAPABILITY, options);

        URL hub = null;
       try {
           hub = new URL(ggrUrl + "/wd/hub");
        } catch (MalformedURLException e) {
           e.printStackTrace();
        }
        driver = new RemoteWebDriver(hub, dc);
    }
    @AfterTest
    public void aftertest() {
        driver.quit();
        if (driver != null) {
            driver.quit();
        }
    }
}
