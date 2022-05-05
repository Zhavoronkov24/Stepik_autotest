package org.zhavoronkov.stepikcoverage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Case_id2Test {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://stepik.org/catalog");

        // Поле поиска
        WebElement searchField = driver.findElement(By.xpath("//*[@placeholder=\"Название курса, автор или предмет\"]"));
        searchField.sendKeys("Веб-разработка для начинающих: HTML и CSS");

        // Чек-бокс "Бесплатные"
        WebElement checkboxFree = driver.findElement(By.xpath("//span[contains(.,'Бесплатные')]"));
        checkboxFree.click();

        // Нужный курс
        WebElement resultOne = driver.findElement(By.xpath("//*[@aria-label=\"Веб-разработка для начинающих: HTML и CSS\"]"));
        resultOne.isDisplayed();
        resultOne.click();

        // Уникальный элемент на странице
        WebElement courseLinkVerify = driver.findElement(By.xpath("//*[@href=\"https://stepik.org/38218\"]"));
        courseLinkVerify.isDisplayed();



        //driver.quit();


    }
}
