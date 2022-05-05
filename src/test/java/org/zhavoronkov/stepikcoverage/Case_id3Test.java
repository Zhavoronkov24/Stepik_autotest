package org.zhavoronkov.stepikcoverage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Case_id3Test {
    public static void main(String[] args) throws InterruptedException {

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

        Thread.sleep(5000);

        List<String> windowHandles = new ArrayList(driver.getWindowHandles());
        String secondTab = windowHandles.get(1);
        driver.switchTo().window(secondTab);

        // Уникальный элемент на странице
        WebElement linkJB = driver.findElement(By.xpath("//*[@href=\"https://www.jetbrains.com/\"]"));
        linkJB.isDisplayed();

        //driver.quit();
    }
}
