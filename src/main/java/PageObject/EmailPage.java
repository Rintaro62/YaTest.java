package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePO {
    public EmailPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ".//span[@class='mail-ComposeButton-Text']")
    private WebElement submitEmail;
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
    @FindBy(xpath = ".//div[@class='ComposeDoneScreen-Actions']")
    private WebElement ret;
    @FindBy(xpath = ".//a[@class='mail-MessageSnippet js-message-snippet toggles-svgicon-on-important toggles-svgicon-on-unread mail-MessageSnippet_thread is-unread']")
    private WebElement secondLetter;
    @FindBy(xpath = ".//a[@class='mail-MessageSnippet js-message-snippet toggles-svgicon-on-important toggles-svgicon-on-unread is-unread']")
    private WebElement openSecondLetter;
    @FindBy(xpath = ".//a[@data-title='Входящие']")
    private WebElement messange;
    @FindBy(xpath = ".//span[@class='_nb-checkbox-flag _nb-checkbox-normal-flag'][1]")
    private WebElement check1;
    @FindBy(xpath = "(//span[@class='_nb-checkbox-flag _nb-checkbox-normal-flag'])[4]")
    private WebElement check2;
    @FindBy(xpath = ".//span[@class='mail-Toolbar-Item-Text js-toolbar-item-title js-toolbar-item-title-delete']")
    private WebElement delete;
    @FindBy(xpath = ".//span[@class='mail-Message-Toolbar-Subject-Wrapper']/div")
    private WebElement asField;
    @FindBy(xpath = "(//div[@class='ComposeReact-SignatureContainer']/div)[2]")
    private WebElement secondAsField;
    @FindBy(xpath = ".//span[@class='mail-Message-Toolbar-Subject-Wrapper']/div")
    private WebElement thirdAsField;
    @FindBy(xpath = ".//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_subject']")
    private WebElement letter;

    public void waitElement(){
        waitVisibilityOfElement(asField);
    }
    public void waitElement2(){
        waitVisibilityOfElement(secondAsField);
    }
    public void waitElement3(){
        waitVisibilityOfElement(thirdAsField);
    }
    public void waitLetter(){waitVisibilityOfElement(letter);}

    @Step
    public void clickSubmitEmail() {
        click(submitEmail);
    }
    @Step
    public void clickIncomingLetter(){
        click(incomingLetter);
    }
    @Step
    public void clickF5(){
        click(f5);
    }
    @Step
    public void clickFirstLetter(){click(firstLetter);}
    @Step
    public void clickTestLetter(){click(testLetter);}
    @Step
    public void clickSettingBtn(){click(settingBtn);}
    @Step
    public void clickAccountPage(){click(accountPage);}
    @Step
    public void clickRet(){click(ret);}
    @Step
    public void clickSecondLetter(){click(secondLetter);}
    @Step
    public void clickOpenSecondLetter(){click(openSecondLetter);}
    @Step
    public void clickMessange(){click(messange);}
    @Step
    public void clickCheck1(){click(check1);}
    @Step
    public void clickCheck2(){click(check2);}
    @Step
    public void clickDelete(){click(delete);}
    }




