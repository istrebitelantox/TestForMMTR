package SelenideElementsTools;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.Nonnull;
import java.util.concurrent.TimeUnit;

public class WebDriver implements WebDriverProvider {
    @Nonnull
    @Override
    public org.openqa.selenium.WebDriver createDriver(@Nonnull Capabilities capabilities) {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","/home/yuriy/Documents/chromedriver");
        ChromeOptions options=new ChromeOptions()
            .addArguments("--no-sandbox")
            .addArguments("--disable-gpu")
            .addArguments("--window-size=1920,1080")
            .addArguments("--headless")
            .merge(capabilities);
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        ChromeDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return driver;
    }
}
