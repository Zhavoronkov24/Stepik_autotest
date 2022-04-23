package org.zhavoronkov.stepikcoverage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Case_id1 {



    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://stepik.org/catalog");

        // Жмем Войти
        WebElement loginButton = driver.findElement(By.xpath("//*[@href=\"/catalog?auth=login\"]"));
        loginButton.click();

        // Ввод почты
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"id_login_email\"]"));
        emailField.sendKeys("doyasih147@arpizol.com");

        // Ввод пароля
      WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"id_login_password\"]"));
        passwordField.sendKeys("12345qwe"); // Да, я знаю что так не делают... но это просто HomeWork...

        // Жмем Войти в форме
        WebElement loginButtonInForm = driver.findElement(By.cssSelector("#login_form > button"));
        loginButtonInForm.click();

        // Проверка отображения иконки пользователя
        WebElement userIcon = driver.findElement(By.xpath("//*[@id=\"ember25\"]/button/img"));
        userIcon.isDisplayed();


        //driver.quit();


    }
}

