package YandexTest;


import PageObject.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;


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
        ProfilePage prof = new ProfilePage(getDriver());
        LetterPage let = new LetterPage(getDriver());
        SignaturesPage signa = new SignaturesPage(getDriver());

        authya.setLoginField(adress);
        authya.clickJoinBtn();
        authya.setPasswdField("fortest");
        authya.clickSecondJoinBtn();
        System.out.println("Singed in");
        prof.clickProfileOpen();
        prof.clickMailOpen();
        send.clickSubmitEmail();
        let.waitWindowMail();
        System.out.println("The letter is ready to be written");
        let.setAdress(adress);
        let.setTheme(theme);
        let.setTextMail(textMail);
        let.clickSendLetter();
        System.out.println("Email sent");
        send.clickIncomingLetter();
        send.clickF5();
        send.waitLetter();
        send.clickFirstLetter();
        send.clickTestLetter();
        send.waitElement();
        assertEquals(driver.findElement(By.xpath(".//span[@class='mail-Message-Toolbar-Subject-Wrapper']/div")).getText(),theme);
        assertEquals(driver.findElement(By.xpath(".//div[@class='js-message-body-content mail-Message-Body-Content']/div[1]")).getText(),textMail);
        send.clickSettingBtn();
        send.clickAccountPage();
        signa.setSignature(textMail);
        signa.clickAddSignature();
        System.out.println("Signature made");
        signa.clickContacts();
        send.clickF5();
        send.clickSubmitEmail();
        send.waitElement2();
        assertEquals(driver.findElement(By.xpath("(//div[@class='ComposeReact-SignatureContainer']/div)[2]")).getText(),textMail);
        /**повторение шагов*/
        let.setAdress(adress);
        let.setTheme(theme);
        let.setTextMail(textMail);
        let.clickSendLetter();
        System.out.println("Second email sent");
        send.clickRet();
        send.clickF5();
        send.clickSecondLetter();
        send.clickOpenSecondLetter();
        send.waitElement3();
        assertEquals(driver.findElement(By.xpath(".//span[@class='mail-Message-Toolbar-Subject-Wrapper']/div")).getText(),theme);
        assertEquals(driver.findElement(By.xpath(".//div[@class='js-message-body-content mail-Message-Body-Content']/div[1]")).getText(),textMail);
        send.clickMessange();
        send.clickCheck1();
        send.clickCheck2();
        send.clickDelete();
        System.out.println("Messangs delete");
        send.clickF5();
        asCheck();


    }



}
