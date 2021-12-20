package dlangina.tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import dlangina.helpers.Attach;
import dlangina.helpers.DriverSettings;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({AllureJunit5.class})
public class TestBase {

  @BeforeAll
  public static void setUp() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    DriverSettings.config();
    closeWeUseCookieModal();
  }

  public static void closeWeUseCookieModal() {
    step("Открытие главной страницы", () ->
        open("https://new.rvision.ru/"));
//    step("Закрытие модального окна 'Мы используем Cookie'", () ->
//        $(".t-modal__close-cookie").click());

    try {
      $(".t-modal__close-cookie").shouldBe(Condition.visible);
      $(".t-modal__close-cookie").click();
    } catch (Exception e) {
      System.out.println("Нет модального окна");
    }
  }


  @AfterEach
  public void tearDown() {
    Attach.screenshotAs("Last screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
//    Selenide.closeWebDriver();
  }
}

