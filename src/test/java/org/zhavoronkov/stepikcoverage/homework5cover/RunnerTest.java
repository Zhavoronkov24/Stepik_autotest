package org.zhavoronkov.stepikcoverage.homework5cover;

import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@all",
        dryRun = false,
        strict = false
)

public abstract class RunnerTest {

    private static WebDriver driver;


    public static void prepare() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
    }

    public static void goTo() {
        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://stepik.org/catalog"), "Страница недоступна");
    }


    public static void quit() {
        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    // Ввод
    public static void sendText(WebElement element, String textToSend) {
        element.clear();
        element.sendKeys(textToSend);
    }

    // Нажатие
    public static void click(WebElement element) {
        element.click();
    }
}
