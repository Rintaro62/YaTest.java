package YandexTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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

        // initialize Helper with your driver on startup
        public Helper(WebDriver yourDriver) {
            driver = yourDriver;
        }
    }



    public void waitWindowEmail(){
        WebElement window = Helper.findElement(By.xpath(".//div[@class='ComposePopup-Head']"));
        if(window == null) {
            System.out.println("Window mail is Absent");
        }else {
            System.out.println("Window Mail exists");
        }

    }
    public void waitLetter() {
        WebElement step5Letter = Helper.findElement(By.xpath(".//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_subject']"));
        if (step5Letter == null) {
            System.out.println("My Letter is Absent");
        } else {
            System.out.println("Letter exists");
        }
    }
    String theme = "It is test";
    public void getText(String z) {
        driver.findElement(By.xpath(".//span[@class='mail-Message-Toolbar-Subject-Wrapper']")).getText();
        if (z==theme)
        {

            System.out.println("all right");

        }else {
            System.out.println("all bad");
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
    /**
    @AfterTest
    public void aftertest() {

        driver.quit();
        if (driver != null) {
            driver.quit();
        }
    }
    */
}
