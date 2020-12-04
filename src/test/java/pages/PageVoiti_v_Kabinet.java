package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static logger.CustomLogger.logger;

public class PageVoiti_v_Kabinet {
    SelenideElement fillFieldEmail = $(byXpath("//*[@id='rst-signin-username']"));
    SelenideElement fillFieldPassword = $(byXpath("//*[@id='rst-signin-password']"));
    SelenideElement buttonVoiti = $(byXpath("//*[@class='rst-uix-button-new']"));
    @Step
    public void fillFieldEmail(String email) {
        fillFieldEmail.sendKeys(email);
        logger.info(email + " is visible");

    }

    @Step
    public void fillFieldPassword(String password) {
        fillFieldPassword.sendKeys(password);
        logger.info(password + " is visible");

    }
    @Step
    public void pressButtonVoiti(){
        buttonVoiti.click();
        logger.info(" OK");
    }
   
}