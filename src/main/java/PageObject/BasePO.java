package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePO {
    private WebDriver driver;

    protected final int driverWaitTime = 20;

    public BasePO(final WebDriver driver) {
        PageFactory.initElements(driver, this);

        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }


    protected Boolean waitVisibilityOfElement(final WebElement element) {
        //   switchToFrame();
        WebDriverWait wait = new WebDriverWait(driver, driverWaitTime);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            // switchToDefaultFrame();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  switchToDefaultFrame();
        return false;


    }

    protected void click(final WebElement webElement) {

        waitVisibilityOfElement(webElement);

        webElement.click();

    }

    protected void setText(final WebElement webElement, final String string) {
        waitVisibilityOfElement(webElement);

        webElement.sendKeys(string);

    }
}
