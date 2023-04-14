package Utils;

import StepDefinitions.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CommonMethods extends PageInitializer {
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
        initializePageObjects();
    }

    public static void closeBrowser() {
        driver.close();
    }

    public static void doClick(WebElement element) {

        element.click();
    }

    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public static Select clickOnDropdown(WebElement element) {
        Select select = new Select(element);
        return select;
    }

    public static void selectByOptions(WebElement element, String text) {
        List<WebElement> options = clickOnDropdown(element).getOptions();
        for (WebElement option : options) {
            String ddlOptionText = option.getText();
            if (ddlOptionText.equals(text)) {
                option.click();
            }
        }


    }
}