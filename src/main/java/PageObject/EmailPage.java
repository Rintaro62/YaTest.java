package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmailPage extends BasePO {
    public EmailPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ".//span[@class='mail-ComposeButton-Text']")
    private WebElement submitEmail;
    @FindBy(xpath = ".//a[@class='user-account user-account_has-ticker_yes user-account_has-accent-letter_yes legouser__current-account i-bem']")
    private WebElement profileOpen;
    @FindBy(xpath = ".//span[contains(text(),'Почта')]")
    private WebElement mailOpen;
    @FindBy(xpath = ".//*[contains(@is,'x-bubbles')][1]")
    private WebElement adress;
    @FindBy(xpath = ".//input[@class='composeTextField ComposeSubject-TextField']")
    private WebElement theme;
    @FindBy(xpath = ".//div[@role='textbox']")
    private WebElement textMail;
    @FindBy(xpath = ".//button[@class='control button2 button2_view_default button2_tone_default button2_size_l button2_theme_action button2_pin_circle-circle ComposeControlPanelButton-Button ComposeControlPanelButton-Button_action']")
    private WebElement sendLetter;
    @FindBy(xpath = ".//a[@data-lego='react']")
    private WebElement incomingLetter;
    @FindBy(xpath = ".//span[@data-click-action='mailbox.check']")
    private WebElement f5;
    @FindBy(xpath = ".//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_subject']")
    private WebElement themeField;
    @FindBy(xpath = ".//a[@class='mail-MessageSnippet js-message-snippet toggles-svgicon-on-important toggles-svgicon-on-unread mail-MessageSnippet_thread is-unread']")
    private WebElement firstLetter;
    @FindBy(xpath = ".//a[@class='mail-MessageSnippet js-message-snippet toggles-svgicon-on-important toggles-svgicon-on-unread is-unread']")
    private WebElement testLetter;
    @FindBy(xpath = ".//button[@class='control button2 button2_view_classic button2_theme_default mail-GhostButton mail-SettingsButton']")
    private WebElement settingBtn;
    @FindBy(xpath =".//*[@class=\"svgicon svgicon-mail--Settings_setup-sender mail-SettingsPopup__menu-icon\"]")
    private WebElement accountPage;
    @FindBy(xpath = ".//div[@role='textbox']")
    private WebElement signature;
    @FindBy(xpath = ".//span[@class='ui-button-text']")
    private WebElement addBtn;
    @FindBy(xpath = ".//a[@data-tab-id='contacts']")
    private WebElement contacts;
    @FindBy(xpath = ".//div[@class='ComposeDoneScreen-Actions']")
    private WebElement ret;
    @FindBy(xpath = ".//a[@class='mail-MessageSnippet js-message-snippet toggles-svgicon-on-important toggles-svgicon-on-unread mail-MessageSnippet_thread is-unread']")
    private WebElement secondLetter;
    @FindBy(xpath = ".//a[@class='mail-MessageSnippet js-message-snippet toggles-svgicon-on-important toggles-svgicon-on-unread is-unread']")
    private WebElement openSecondLetter;
    @FindBy(xpath = ".//a[@data-title='Входящие']")
    private WebElement massenge;
    @FindBy(xpath = ".//span[@class='_nb-checkbox-flag _nb-checkbox-normal-flag'][1]")
    private WebElement check1;
    @FindBy(xpath = "(//span[@class='_nb-checkbox-flag _nb-checkbox-normal-flag'])[4]")
    private WebElement check2;
    @FindBy(xpath = ".//span[@class='mail-Toolbar-Item-Text js-toolbar-item-title js-toolbar-item-title-delete']")
    private WebElement delete;

    public void clickSubmitEmail() {
        click(submitEmail);
    }
    public void clickProfileOpen(){
        click(profileOpen);
    }
    public void clickMailOpen(){
        click(mailOpen);
    }
    public void setAdress(String text){
        setText(adress,text);
    }
    public void setTheme(String text){
        setText(theme,text);
    }
    public void setTextMail(String text){
        setText(textMail,text);
    }
    public void clickSendLetter(){
        click(sendLetter);
    }
    public void clickIncomingLetter(){
        click(incomingLetter);
    }
    public void clickF5(){
        click(f5);
    }
    public void clickFirstLetter(){click(firstLetter);}
    public void clickTestLetter(){click(testLetter);}
    public void clickSettingBtn(){click(settingBtn);}
    public void clickAccountPage(){click(accountPage);}
    public void setSignature(String text){setText(signature,text);}
    public void clickAddSignature(){click(addBtn);}
    public void clickContacts(){click(contacts);}
    public void clickRet(){click(ret);}
    public void clickSecondLetter(){click(secondLetter);}
    public void clickOpenSecondLetter(){click(openSecondLetter);}
    public void clickMassenge(){click(massenge);}
    public void clickCheck1(){click(check1);}
    public void clickCheck2(){click(check2);}
    public void clickDelete(){click(delete);}



    }
    /**
    public boolean waitLetter() {
        waitVisibilityOfElement();
        try {
            ExpectedConditions.visibilityOf(windowEmail);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
     */





