package YandexTest;


import PageObject.EmailPage;
import PageObject.LoginPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class YaTest extends Annotations {
    String adress = "testIntelliJIDEA@yandex.ru";
    String theme = "It is test";
    String textMail = "First test for Yandex";


    @Test
    public void auth() {
        getDriver().get("https://passport.yandex.ru/auth/add");
        getDriver().manage().window().maximize();
        LoginPage authya = new LoginPage(getDriver());
        EmailPage send = new EmailPage(getDriver());

        authya.setLoginField(adress);
        authya.clickJoinBtn();
        authya.setPasswdField("fortest");
        authya.clickSecondJoinBtn();
        send.clickProfileOpen();
        send.clickMailOpen();
        send.clickSubmitEmail();
        waitWindowEmail();
        send.setAdress(adress);
        send.setTheme(theme);
        send.setTextMail(textMail);
        send.clickSendLetter();
        send.clickIncomingLetter();
        send.clickF5();
        waitLetter();
        send.clickFirstLetter();
        send.clickTestLetter();
        //getText(theme);
        //assertEquals(driver.findElement(By.xpath(".//span[@class='mail-Message-Toolbar-Subject-Wrapper']")).getText(),theme);
        //assertEquals(driver.findElement(By.xpath(".//div[contains(text(),'First test for Yandex')]")).getText(),textMail);
        //driver.findElement(By.xpath(".//span[@class='mail-Message-Toolbar-Subject-Wrapper']")).getText();
        send.clickSettingBtn();
        send.clickAccountPage();
        send.setSignature(textMail);
        send.clickAddSignature();
        send.clickContacts();
        send.clickF5();
        send.clickSubmitEmail();
        /**повторение шагов*/
        send.setAdress(adress);
        send.setTheme(theme);
        send.setTextMail(textMail);
        send.clickSendLetter();
        send.clickRet();
        send.clickF5();
        send.clickSecondLetter();
        send.clickOpenSecondLetter();
        send.clickMassenge();
        send.clickCheck1();
        send.clickCheck2();
        send.clickDelete();
        send.clickF5();







    }



}
