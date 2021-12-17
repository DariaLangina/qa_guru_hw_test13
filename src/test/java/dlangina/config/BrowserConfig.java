package dlangina.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config/browser.properties"})
public interface BrowserConfig extends Config {

  @Key("browser")
  @DefaultValue("chrome")
  String getBrowser();

  @Key("browserSize")
  @DefaultValue("1920x1080")
  String getBrowserSize();
}
