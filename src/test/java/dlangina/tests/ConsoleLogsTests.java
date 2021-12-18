package dlangina.tests;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import dlangina.helpers.ConsoleLogs;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConsoleLogsTests {

  @Test
  @DisplayName("В логах консоли отсутсвуют ошибки при открытии главной страницы")
  void CheckNoErrorsInConsole() {
    step("Открытие главной страницы", () ->
        open("https://new.rvision.ru/"));

    step("В логах консоли отсутствует текст 'SEVERE'", () -> {
      String consoleLogs = ConsoleLogs.getConsoleLogs();
      String errorText = "SEVERE";
      assertThat(consoleLogs).doesNotContain(errorText);
    });
  }
}
