package org.zhavoronkov.stepikcoverage.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;

public class Header extends RunnerTest {

    public Header() {
        PageFactory.initElements(getDriver(), this);
    }

    // Кнопка Войти
    public WebElement loginButton() {
        return getDriver().findElement(By.xpath("//*[@href=\"/catalog?auth=login\"]"));
    }

    // Кнопка Регистрация
    public WebElement regButton() {
        return getDriver().findElement(By.xpath("//*[@href=\"/catalog?auth=registration\"]"));
    }

    // Аватар пользователя
    public WebElement avatar() {
        return getDriver().findElement(By.xpath("//*[@class=\"navbar__profile-img\"]"));
    }


}
