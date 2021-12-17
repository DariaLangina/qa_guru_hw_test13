package dlangina.config;

import org.aeonbits.owner.Config;

public interface BrowserConfig extends Config {

  @Key("browser")
  @DefaultValue("CHROME")
  String getBrowser();

  @Key("browserSize")
  @DefaultValue("1920x1080")
  String getBrowserSize();
}
