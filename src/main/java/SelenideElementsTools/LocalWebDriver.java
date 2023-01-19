package SelenideElementsTools;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;
import java.time.Duration;

import static org.openqa.selenium.remote.CapabilityType.PAGE_LOAD_STRATEGY;

public class LocalWebDriver implements WebDriverProvider {
    @Nonnull
    @Override
    public org.openqa.selenium.WebDriver createDriver(@Nonnull Capabilities capabilities) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions()
            .addArguments("--no-sandbox")
            .addArguments("--disable-gpu")
            .addArguments("--window-size=1920,1080")
            .addArguments("--headless")
            .merge(capabilities);
        options.setCapability(PAGE_LOAD_STRATEGY, "normal");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(420));
        return driver;
    }
}
