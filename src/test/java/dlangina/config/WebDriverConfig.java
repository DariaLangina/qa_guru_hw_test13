package dlangina.config;

import java.net.URL;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
    "system:properties",
    "classpath:config/local.properties"
})
public interface WebDriverConfig extends Config {

  @Key("browser")
  @DefaultValue("chrome")
  Browser getBrowser();

  @Key("browserSize")
  @DefaultValue("1920x1080")
  String getBrowserSize();

  @Key("remoteWebDriver")
  URL remoteDriverUrl();
}
