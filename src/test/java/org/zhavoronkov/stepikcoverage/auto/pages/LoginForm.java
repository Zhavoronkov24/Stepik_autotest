package org.zhavoronkov.stepikcoverage.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;

public class LoginForm extends RunnerTest {

    public LoginForm() {
        PageFactory.initElements(getDriver(), this);
    }

    //Поле ввода почты
    public WebElement emailField() {
        return getDriver().findElement(By.xpath("//*[@id=\"id_login_email\"]"));
    }

    //Поле ввода пароля
    public WebElement passwordField() {
        return getDriver().findElement(By.xpath("//*[@id=\"id_login_password\"]"));
    }

    //Кнопка войти
    public WebElement enterButton() {
        return getDriver().findElement(By.xpath("//*[@class=\"sign-form__btn button_with-loader \"]"));
    }

    public WebElement warnMessage() {
        return getDriver().findElement(By.xpath("//*[@role=\"alert\"]"));
    }
}
