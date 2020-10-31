package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignaturesPage extends BasePO{

    public SignaturesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ".//div[@role='textbox']")
    private WebElement signature;
    @FindBy(xpath = ".//span[@class='ui-button-text']")
    private WebElement addBtn;
    @FindBy(xpath = ".//a[@data-tab-id='contacts']")
    private WebElement contacts;
    @Step
    public void setSignature(String text){setText(signature,text);}
    @Step
    public void clickAddSignature(){click(addBtn);}
    @Step
    public void clickContacts(){click(contacts);}
}
