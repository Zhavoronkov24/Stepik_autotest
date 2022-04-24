package org.zhavoronkov.stepikcoverage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Case_id3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://stepik.org/catalog");


        // Лого JetBrains
        WebElement logoJB = driver.findElement(By.xpath("//*[@data-name=\"jetbrains\"]"));
        logoJB.click();

        // Уникальный элемент на странице
        WebElement linkJB = driver.findElement(By.xpath("//*[@id=\"ember25\"]/div/div/div[3]/div[2]/p/a"));
        linkJB.isDisplayed();

        // TODO допилить переход на др. вкладку
    }
}
