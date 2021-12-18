package dlangina.helpers;

import static org.openqa.selenium.logging.LogType.BROWSER;

import com.codeborne.selenide.Selenide;

public class ConsoleLogs {

  public static String getConsoleLogs() {
    return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
    //TODO refactor
  }
}
