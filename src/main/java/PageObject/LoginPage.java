package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePO {


    @FindBy(xpath = ".//input[@id='passp-field-login']")
    private WebElement LoginField;
    @FindBy(xpath = ".//button[@data-t='button:action']")
    private WebElement JoinBtn;
    @FindBy(xpath = ".//input[@data-t='field:input-passwd']")
    private WebElement PasswdField;
    @FindBy(xpath = ".//button[@data-t='button:action']")
    private WebElement SecondJoinBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setLoginField(String text){
        setText(LoginField,text);
    }
    public void clickJoinBtn(){
        click(JoinBtn);
    }
    public void setPasswdField(String text){
        setText(PasswdField,text);
    }
    public void clickSecondJoinBtn(){
        click(SecondJoinBtn);
    }
}
