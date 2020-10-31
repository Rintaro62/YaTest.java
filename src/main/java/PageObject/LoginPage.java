package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePO {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = ".//input[@id='passp-field-login']")
    private WebElement LoginField;
    @FindBy(xpath = ".//button[@data-t='button:action']")
    private WebElement JoinBtn;
    @FindBy(xpath = ".//input[@data-t='field:input-passwd']")
    private WebElement PasswdField;
    @FindBy(xpath = ".//button[@data-t='button:action']")
    private WebElement SecondJoinBtn;
    @Step
    public void setLoginField(String text){ setText(LoginField,text); }
    @Step
    public void clickJoinBtn(){
        click(JoinBtn);
    }
    @Step
    public void setPasswdField(String text){ setText(PasswdField,text); }
    @Step
    public void clickSecondJoinBtn(){
        click(SecondJoinBtn);
    }
}
