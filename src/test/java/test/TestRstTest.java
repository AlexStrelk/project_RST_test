package test;

import data.Projects;
import data.UserRstTest;
import org.testng.annotations.Test;
import runner.Debug;

import static com.codeborne.selenide.Selenide.open;
import static common.CommonSteps.checkUrl;

public class TestRstTest extends Debug {

    @Test
    public void validationButtonSellCar() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.pressButtonSellCar();
        rstMainPage.checkControlText("подать объявление на RST");
        checkUrl("https://rst.ua/autosale.html");
        rstMainPage.checkVisibleText("Подача объявления о продаже машины:");
    }

    @Test
    public void validationButtonNewCars() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.buttonSellNewCar();
        rstMainPage.checkControlText1("Каталог автосалонов");
        checkUrl("https://rst.ua/autosalons/");
        rstMainPage.checkVisibleText1("Поиск нового авто на");
    }

    @Test
    public void pressButtonExchangeCar() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.clickButtonExchangeCar();
        rstMainPage.checkControlTextExchangeCar("Предложения обмена авто на ");
        rstMainPage.checkVisibleText2("параметры Вашего авто:");
        checkUrl("https://rst.ua/oldcars/exchange/");
    }

    @Test
    public void pressButtonFreshCars() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.pressButtonFreshCars();
        rstMainPage.checkControlText3("Спец. доступ к базе непроверенных объявлений");
        rstMainPage.checkVisibleText3("Чтобы получить доступ к базе самых свежих объявлений,");
        checkUrl("https://list.rst.ua/");
    }

    @Test
    public void pressButtonAvtosaloni() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.pressButtonAvtosaloni();
        rstMainPage.checkControlText4("Каталог автосалонов");
        rstMainPage.checkVisibleText4("Поиск нового авто на");
        checkUrl("https://rst.ua/autosalons/");
    }

    @Test
    public void pressButtonNews() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.pressButtonNews();
        rstMainPage.controlText5("Последние автоновости на ");
        rstMainPage.checkVisibleText5("Автоновости на RST");
        checkUrl("https://rst.ua/autonews/");

    }

    @Test
    public void pressButtonEsheKatalogNovihAvto() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.buttonEshe();
        rstMainPage.dropButtonKatalogNovihAvto();
        rstMainPage.controltext6("Поиск нового авто на ");
        rstMainPage.checkVisibleText6("Каталог автосалонов");
        checkUrl("https://rst.ua/new/");
    }

    @Test
    public void pressButtonKatalogsaitov() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.buttonEshe();
        rstMainPage.pressButtonCatalogSaitov();
        rstMainPage.controltext7("Каталог автомобильных сайтов");
        rstMainPage.checkVisibleText7("TOP5 автомобильных сайтов");
        checkUrl("https://top.rstcars.com/");
    }
    @Test
    public void pressButtonAvtorinok() {
        open(Projects.RST_TEST.getUrl());
        rstMainPage.buttonEshe();
        rstMainPage.pressButtonAvtorinoc();
        rstMainPage.controltext8("авторынки Украины");
        rstMainPage.checkVisibleText8("\"Центральный\"");
        checkUrl("https://rst.ua/oldcars/");
    }
    @Test
    public void pressButtonVoitiVkabinet(){
        open(Projects.RST_TEST.getUrl());
        rstMainPage.buttonVoitiVkabinet();
        rstMainPage.controlText9("Войти на сайт");
        rstMainPage.checkVisibleText9("Забыли пароль?");
        checkUrl("https://rst.ua/signin/");
    }
    @Test
    public void negativeFillEmailVLichniiKabinet(){
        open(Projects.RST_Voiti_V_Kabinet.getUrl());
        pageVoiti_v_kabinet.fillFieldEmail(UserRstTest.email.getValue());
        pageVoiti_v_kabinet.fillFieldPassword(UserRstTest.password.getValue());
        pageVoiti_v_kabinet.pressButtonVoiti();

    }

}