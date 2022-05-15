package org.zhavoronkov.stepikcoverage.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;

public class CoursesPage extends RunnerTest {

    public CoursesPage() {
        PageFactory.initElements(getDriver(), this);
    }

    // Уникальный элемент на странице для проверки корректности перехода
    public WebElement courseLinkVerify() {
        return getDriver().findElement(By.xpath("//*[@href=\"https://stepik.org/38218\"]"));
    }

    // Уникальный элемент на странице для проверки корректности перехода
    public WebElement jbURL() {
        return getDriver().findElement(By.xpath("//*[@href=\"https://www.jetbrains.com/\"]"));
    }


}
