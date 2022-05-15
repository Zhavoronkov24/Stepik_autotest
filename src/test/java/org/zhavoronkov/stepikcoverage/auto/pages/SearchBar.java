package org.zhavoronkov.stepikcoverage.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;

public class SearchBar extends RunnerTest {

    public SearchBar() {
        PageFactory.initElements(getDriver(), this);
    }

    //Поле поиска
    public WebElement searchField() {
        return getDriver().findElement(By.xpath("//*[@placeholder=\"Название курса, автор или предмет\"]"));
    }

    //Чек-бокс "Бесплатные"
    public WebElement checkBoxFree() {
        return getDriver().findElement(By.xpath("//span[contains(.,'Бесплатные')]"));
    }

    // Курс "Веб-разработка для начинающих: HTML и CSS" в выдаче
    public WebElement actualCourse() {
        return getDriver().findElement(By.xpath(".//*[@aria-label=\"Веб-разработка для начинающих: HTML и CSS\"]"));


    }

}



