package dlangina.tests;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import dlangina.helpers.Attach;
import dlangina.helpers.DriverSettings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

  @BeforeAll
  public static void start() {
    DriverSettings.config();
    closeWeUseCookieModal();
  }

  public static void closeWeUseCookieModal() {
    step("Открытие главной страницы", () ->
        open("https://new.rvision.ru/"));
    step("Закрытие модального окна 'Мы используем Cookie'", () ->
        $(".t-modal__close-cookie").click());
  }

  @AfterEach
  public void tearDown() {
    Attach.screenshotAs("Last screenshot");
    Attach.pageSource();
    Attach.browserConsoleLogs();
    Attach.addVideo();
  }
}

