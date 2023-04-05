package SelenideElementsTools.webDrivers;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;
import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.openqa.selenium.remote.CapabilityType.PAGE_LOAD_STRATEGY;

public class LocalWebDriver implements WebDriverProvider {
    public WebDriver driver;
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--lang=ru");
        options.addArguments("--disable-dev-shm-usage");

        options.setCapability(PAGE_LOAD_STRATEGY, "normal");

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", new File(".").getAbsolutePath() + "data");
        options.setExperimentalOption("prefs", prefs);

        WebDriverManager.chromedriver().driverVersion("110.0.5481.77").setup();
        driver = new ChromeDriver(options);
        return driver;
    }
}
