package org.zhavoronkov.stepikcoverage.auto.steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;
import org.zhavoronkov.stepikcoverage.auto.pages.CoursesPage;
import org.zhavoronkov.stepikcoverage.auto.pages.StepikBody;

public class OtherSteps extends RunnerTest {

    @Когда("пользователь видит на главной странице иконку JetBrains")
    public void userViewLogoJB() {
        StepikBody stepikBody = new StepikBody();
        Assert.assertTrue(stepikBody.logoJB().isDisplayed());
    }

    @Тогда("пользователь нажимает на нее")
    public void userClickLogoJB() {
        StepikBody stepikBody = new StepikBody();
        click(stepikBody.logoJB());
    }

    @Тогда("пользователь видит страницу JetBrains в новой вкладке")
    public void userViewPageJB() {
        CoursesPage coursesPage = new CoursesPage();
        Assert.assertTrue(coursesPage.jbURL().isDisplayed());
    }


}
