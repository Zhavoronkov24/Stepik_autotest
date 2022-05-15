package org.zhavoronkov.stepikcoverage.homework5cover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.homework5cover.RunnerTest;

public class RegForm extends RunnerTest {

    public RegForm() {
        PageFactory.initElements(getDriver(), this);
    }

    //Поле ввода Имени и Фамилии
    public WebElement fullNameField() {
        return getDriver().findElement(By.xpath("//*[@id=\"id_registration_full-name\"]"));
    }

    //Поле ввода почты
    public WebElement emailRegField() {
        return getDriver().findElement(By.xpath("//*[@id=\"id_registration_email\"]"));
    }

    //Поле ввода пароля
    public WebElement passwordRegField() {
        return getDriver().findElement(By.xpath("//*[@id=\"id_registration_password\"]"));
    }

    //Кнопка войти
    public WebElement regButton() {
        return getDriver().findElement(By.xpath("//*[@type=\"submit\"]"));
    }

    public WebElement warnMessageInReg() {
        return getDriver().findElement(By.xpath("//*[@role=\"alert\"]"));
    }
}
