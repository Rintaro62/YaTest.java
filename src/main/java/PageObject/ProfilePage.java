package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePO {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "(//div[@class='user-pic user-pic_has-plus_ user-account__pic'])[1]")
    private WebElement profileOpen;
    @Step
    public void clickProfileOpen(){
        click(profileOpen);
    }
    @FindBy(xpath = ".//span[contains(text(),'Почта')]")
    private WebElement mailOpen;
    @Step
    public void clickMailOpen(){
        click(mailOpen);
    }
}
