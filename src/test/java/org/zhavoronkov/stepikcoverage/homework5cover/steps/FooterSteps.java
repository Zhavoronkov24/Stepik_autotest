package org.zhavoronkov.stepikcoverage.homework5cover.steps;

import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import org.zhavoronkov.stepikcoverage.homework5cover.RunnerTest;
import org.zhavoronkov.stepikcoverage.homework5cover.pages.Footer;
import org.zhavoronkov.stepikcoverage.homework5cover.pages.OtherPages;

public class FooterSteps extends RunnerTest {

    @Когда("пользователь нажимает на кнопку 'конфиденциальности'")
    public void userClickConfButton() {
        Footer footer = new Footer();
        click(footer.confButton());
    }

    @Затем("пользователь переключает язык страницы на En")
    public void userClickEnButton() {
        OtherPages otherPages = new OtherPages();
        click(otherPages.enButton());
    }

    @Тогда("пользователь видит страницу на английском языке")
    public void userViewAboutButton() {
        OtherPages otherPages = new OtherPages();

        Assert.assertTrue(otherPages.aboutENButton().isDisplayed());
    }
}
