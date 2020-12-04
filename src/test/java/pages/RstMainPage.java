package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static logger.CustomLogger.logger;

public class RstMainPage {
    SelenideElement buttonSellcar = $(byXpath("//a[@href='/autosale.html']"));
    String controlText = "//button[@id='rst-page-autosale-form-submit']";
    SelenideElement buttonNewCars = $(byXpath("//a[@href='/autosalons/']"));
    String controlText1 = "//h2";
    SelenideElement buttonExchangeCar = $(byXpath("//a[@href='//rst.ua/oldcars/exchange/']"));
    String controlText2 = "//div/section[@class=\"rst-ocb1\"]/header";
    SelenideElement buttonFreshCars = $(byXpath("//a[@href='//list.rst.ua/']"));
    String controlText3 = "//div/div/h2";
    SelenideElement buttonAvtosaloni = $(byXpath("//a[@href='//rst.ua/autosalons/']"));
    String controlText4 = "//h2";
    SelenideElement buttonNews = $(byXpath("//a[@href='//rst.ua/autonews/']"));
    String controlText5 = "//h2";
    SelenideElement buttonEshe = $(byXpath("//a[@href='javascript:void(0)']"));
    SelenideElement dropButtonKatalogNovihAvto = $(byXpath("//a[@href='//rst.ua/new/']"));
    String controltext6 = "//div/section/article/header";
    SelenideElement buttonKatalogAvtosaitov = $(byXpath("//a[@href='//top.rstcars.com/']"));
    String controlText7 = "//h2";
    SelenideElement buttonAvtorinok = $(byXpath("//a[@href='//rst.ua/oldcars/']"));
    String controlText8= "//h2";
    SelenideElement buttonVoitiVKabinet = $(byXpath("//a[@href='//rst.ua/signin/']"));
    String controlText9 = "//h2";
    @Step
    public void pressButtonSellCar() {
        buttonSellcar.click();
        logger.info("button Sell car - ok");
    }

    @Step
    public void checkControlText(String text) {
        $(byXpath(controlText + "[text()='" + text + "']")).shouldBe(Condition.visible);
        logger.info(controlText + " is visible");
    }

    @Step
    public void checkVisibleText(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + "is visible");
    }

    @Step
    public void buttonSellNewCar() {
        buttonNewCars.click();
        logger.info("button New car - ok");
    }

    @Step
    public void checkControlText1(String text) {
        $(byXpath(controlText1 + "[text()='" + text + "']")).shouldBe(Condition.visible);
        logger.info(text + "is visible");
    }

    @Step
    public void checkVisibleText1(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + "is visible");
    }

    @Step
    public void clickButtonExchangeCar() {
        buttonExchangeCar.click();
        logger.info("OK");
    }

    @Step
    public void checkControlTextExchangeCar(String text) {
        $(byXpath(controlText2 + "[text()='" + text + "']")).shouldBe(Condition.visible);
        logger.info(text + "is visible");
    }

    @Step
    public void checkVisibleText2(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + "is visible");
    }

    @Step
    public void pressButtonFreshCars() {
        buttonFreshCars.click();
        logger.info("OK");
    }

    @Step
    public void checkControlText3(String text) {
        $(byXpath(controlText3 + "[text()='" + text + "']"));
        logger.info(text + "is visible");
    }

    @Step
    public void checkVisibleText3(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + "is visible");
    }

    @Step
    public void pressButtonAvtosaloni() {
        buttonAvtosaloni.click();
        logger.info("OK");
    }

    @Step
    public void checkControlText4(String text) {
        $(byXpath(controlText4 + "[text()='" + text + "']"));
        logger.info(text + " is visible");
    }

    @Step
    public void checkVisibleText4(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + " is visible");
    }

    @Step
    public void pressButtonNews() {
        buttonNews.click();
        logger.info("OK");
    }

    @Step
    public void controlText5(String text) {
        $(byXpath(controlText5 + "[text()='" + text + "']"));
        logger.info(text + " is visible");
    }

    @Step
    public void checkVisibleText5(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + " is visible");
    }

    @Step
    public void buttonEshe() {
        buttonEshe.click();
        logger.info("OK");
    }

    @Step
    public void dropButtonKatalogNovihAvto() {
        dropButtonKatalogNovihAvto.click();
        logger.info("OK");
    }

    @Step
    public void controltext6(String text) {
        $(byXpath(controltext6 + "[text()='" + text + "']"));
        logger.info(text + " is visible");
    }

    @Step
    public void checkVisibleText6(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + " is visible");
    }

    @Step
    public void pressButtonCatalogSaitov() {
        buttonKatalogAvtosaitov.click();
        logger.info("OK");
    }

    @Step
   public void controltext7(String text){
        $(byXpath(controlText7+"[text()='"+text+"']"));
        logger.info(text + " is visible");
    }
    @Step
    public void checkVisibleText7(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + " is visible");
    }
    @Step
    public void pressButtonAvtorinoc(){
        buttonAvtorinok.click();
        logger.info("OK");
    }
    @Step
    public void controltext8(String text){
        $(byXpath(controlText8+"[text()='"+text+"']"));
        logger.info(text + " is visible");
    }
    @Step
    public void checkVisibleText8(String text) {
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + " is visible");
    }
    @Step
    public void buttonVoitiVkabinet(){
        buttonVoitiVKabinet.click();
        logger.info("OK");
    }
    @Step
    public void controlText9(String text){
        $(byXpath(controlText9+"[text()='"+text+"']"));
        logger.info(text + " is visible");
    }
    @Step
    public void checkVisibleText9(String text){
        $(byText(text)).shouldBe(Condition.visible);
        logger.info(text + " is visible");
    }
}

