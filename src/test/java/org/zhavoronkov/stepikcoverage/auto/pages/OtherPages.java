package org.zhavoronkov.stepikcoverage.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;

public class OtherPages extends RunnerTest {

    public OtherPages() {
        PageFactory.initElements(getDriver(), this);
    }

    // Кнопка "En"
    public WebElement enButton() {
        return getDriver().findElement(By.xpath("//*[@href=\"http://welcome.stepik.org/en/privacy\"]"));
    }

    // Кнопка "About"
    public WebElement aboutENButton() {
        return getDriver().findElement(By.xpath("//*[@href=\"https://welcome.stepik.org/en/about\"]"));
    }
}
