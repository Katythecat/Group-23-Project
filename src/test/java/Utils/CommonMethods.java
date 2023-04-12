package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowser() {
        ConfigReader.readProperties();

        String browserType = ConfigReader.getValueOfProperty("browserType");
        switch (browserType) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
        }
        driver.get(ConfigReader.getValueOfProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void doClick(WebElement element) {

        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }


}