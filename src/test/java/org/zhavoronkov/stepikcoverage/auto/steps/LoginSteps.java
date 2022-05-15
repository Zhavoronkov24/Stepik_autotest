package org.zhavoronkov.stepikcoverage.auto.steps;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;
import org.zhavoronkov.stepikcoverage.auto.pages.Header;
import org.zhavoronkov.stepikcoverage.auto.pages.LoginForm;
import org.junit.Assert;
import org.zhavoronkov.stepikcoverage.auto.pages.RegForm;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends RunnerTest {

    @Когда("пользователь нажимает на кнопку Войти")
    public void userClickLoginButton() {
        Header header = new Header();
        click(header.loginButton());
    }

    @Когда("пользователь нажимает на кнопку Регистрация")
    public void userClickRegButton() {
        Header header = new Header();
        click(header.regButton());
    }

    @И("вводит валидный Email")
    public void userEnterMail() {
        LoginForm loginForm = new LoginForm();
        final String mail = "doyasih147@arpizol.com";
        sendText(loginForm.emailField(), mail);
    }

    @И("вводит валидный пароль")
    public void userEnterPassword() {
        LoginForm loginForm = new LoginForm();
        final String password = "12345qwe";
        sendText(loginForm.passwordField(), password);
    }

    @И("вводит невалидный пароль")
    public void userEnterInvalidPassword() {
        LoginForm loginForm = new LoginForm();
        final String invalidPassword = "123456qwe";
        sendText(loginForm.passwordField(), invalidPassword);
    }

    @И("нажимает войти")
    public void userClickLogin() {
        LoginForm loginForm = new LoginForm();
        click(loginForm.enterButton());
    }

    @Тогда("пользователь видит свой аватар")
    public void userAuthSuccess() throws InterruptedException {
        Header header = new Header();
        TimeUnit.MILLISECONDS.sleep(700);

        Assert.assertTrue(header.avatar().isDisplayed());
    }

    @Тогда("пользователь видит сообщение на странице авторизации (.+)$")
    public void userSeeWarnMessageInLogin(String warnMessage) throws InterruptedException {
        LoginForm loginForm = new LoginForm();
        TimeUnit.MILLISECONDS.sleep(700);

        Assert.assertTrue(loginForm.warnMessage().isDisplayed());
    }

    @И("вводит существующий Email")
    public void userEnterBusyMail() {
        RegForm regForm = new RegForm();
        final String mail = "doyasih147@arpizol.com";
        sendText(regForm.emailRegField(), mail);
    }

    @И("вводит валидный пароль на странице регистрации")
    public void userEnterValidPassword() {
        RegForm regForm = new RegForm();
        final String password = "12345qwe";
        sendText(regForm.passwordRegField(), password);
    }

    @И("вводит валидное имя и фамилию")
    public void userEnterValidFullName() {
        RegForm regForm = new RegForm();
        final String fullName = "Вася Иванов";
        sendText(regForm.fullNameField(), fullName);
    }

    @Тогда("пользователь видит сообщение на странице регистрации (.+)$")
    public void userSeeWarnMessageInReg(String warnMessage) throws InterruptedException {
        RegForm regForm = new RegForm();
        TimeUnit.MILLISECONDS.sleep(700);

        Assert.assertTrue(regForm.warnMessageInReg().isDisplayed());
    }


}
