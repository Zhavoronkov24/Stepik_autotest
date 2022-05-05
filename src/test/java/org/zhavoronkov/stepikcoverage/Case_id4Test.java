package org.zhavoronkov.stepikcoverage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Case_id4Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://stepik.org/catalog");

        //Кнопка "конфиденциальности"
        WebElement confButton = driver.findElement(By.xpath("//*[@href=\"https://welcome.stepik.org/ru/privacy\"]"));
        confButton.click();

        Thread.sleep(5000);

        List<String> windowHandles = new ArrayList(driver.getWindowHandles());
        String secondTab = windowHandles.get(1);
        driver.switchTo().window(secondTab);

        // Кнопка "En"
        WebElement switchLangENButton = driver.findElement(By.xpath("//*[@href=\"http://welcome.stepik.org/en/privacy\"]"));
        switchLangENButton.click();

        // Кнопка "About"
        WebElement aboutENButton = driver.findElement(By.xpath("//*[@href=\"https://welcome.stepik.org/en/about\"]"));
        aboutENButton.isDisplayed();

        //driver.quit();
    }
}
