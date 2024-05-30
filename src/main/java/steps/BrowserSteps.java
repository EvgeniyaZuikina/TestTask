package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class BrowserSteps {
    WebDriver driver;

    @Given("User opens new browser window and follows the link")
    public void getBrowser() throws RuntimeException {
        try {
            // Загрузка пути к драйверу из ресурсов
            URL driverUrl = BrowserSteps.class.getResource("driverPath");
            if (driverUrl == null) {
                throw new RuntimeException("Не удалось найти драйвер в папке ресурсов");
            }
            String driverAbsolutePath = Paths.get(driverUrl.toURI()).toString();

            // Установка системной переменной для указания пути к драйверу
            System.setProperty("webdriver.chrome.driver", driverAbsolutePath);
        } catch (URISyntaxException e) {
            throw new RuntimeException("Ошибка при обработке URI драйвера", e);
        }

        // Настройка и запуск WebDriver
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("ui.url");
        }

    @After
    public void closeBrowser() {
        if (driver != null)
            driver.quit();
    }
}
