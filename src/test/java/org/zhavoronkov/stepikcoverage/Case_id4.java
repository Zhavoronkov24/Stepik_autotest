package org.zhavoronkov.stepikcoverage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Case_id4 {
    public static void main(String[] args) {

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

        // Кнопка "En"
        WebElement switchLangENButton = driver.findElement(By.xpath("//*[@href=\"http://welcome.stepik.org/en/privacy\"]"));
        switchLangENButton.click();

        // TODO допилить переход на др. вкладку
    }
}
