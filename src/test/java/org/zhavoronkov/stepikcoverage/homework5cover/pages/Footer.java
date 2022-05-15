package org.zhavoronkov.stepikcoverage.homework5cover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.homework5cover.RunnerTest;

public class Footer extends RunnerTest {

    public Footer() {
        PageFactory.initElements(getDriver(), this);
    }

    // Кнопка "конфиденциальности"
    public WebElement confButton() {
        return getDriver().findElement(By.xpath("//*[@href=\"https://welcome.stepik.org/ru/privacy\"]"));
    }


}
