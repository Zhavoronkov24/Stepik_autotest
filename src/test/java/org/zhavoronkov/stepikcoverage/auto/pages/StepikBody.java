package org.zhavoronkov.stepikcoverage.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;

public class StepikBody extends RunnerTest {

    public StepikBody() {
        PageFactory.initElements(getDriver(), this);
    }

    // Логотип JB
    public WebElement logoJB() {
        return getDriver().findElement(By.xpath("//*[@data-name=\"jetbrains\"]"));
    }
}
