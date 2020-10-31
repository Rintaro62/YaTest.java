package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePO {
    public LetterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ".//*[contains(@is,'x-bubbles')][1]")
    private WebElement adress;
    @FindBy(xpath = ".//input[@class='composeTextField ComposeSubject-TextField']")
    private WebElement theme;
    @FindBy(xpath = ".//div[@role='textbox']")
    private WebElement textMail;
    @FindBy(xpath = ".//button[@class='control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action']")
    private WebElement sendLetter;
    @FindBy(xpath = ".//div[@class='ComposePopup-Content']")
    private WebElement windowMail;
    @Step
    public void setAdress(String text){
        setText(adress,text);
    }
    @Step
    public void setTheme(String text){
        setText(theme,text);
    }
    @Step
    public void setTextMail(String text){
        setText(textMail,text);
    }
    @Step
    public void clickSendLetter(){ click(sendLetter);
    }
    @Step
    public void waitWindowMail() { waitVisibilityOfElement(windowMail);}
}
