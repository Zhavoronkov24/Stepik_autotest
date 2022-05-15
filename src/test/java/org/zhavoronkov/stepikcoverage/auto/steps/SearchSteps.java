package org.zhavoronkov.stepikcoverage.auto.steps;

import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import org.zhavoronkov.stepikcoverage.auto.RunnerTest;
import org.zhavoronkov.stepikcoverage.auto.pages.CoursesPage;
import org.zhavoronkov.stepikcoverage.auto.pages.SearchBar;

import java.util.concurrent.TimeUnit;

public class SearchSteps extends RunnerTest {


    @Когда("пользователь вбивает в поиск (.+)$")
    public void userEnterCourseInField(String query) throws InterruptedException {
        SearchBar bar = new SearchBar();
        sendText(bar.searchField(), query);
        TimeUnit.MILLISECONDS.sleep(700);
    }

    @И("ставит чек-бокс 'Бесплатные'")
    public void userClickCheckBoxFree() throws InterruptedException {
        SearchBar bar = new SearchBar();
        click(bar.checkBoxFree());
        TimeUnit.MILLISECONDS.sleep(5000);
    }

    @Тогда("пользователь видит искомый курс в выдаче")
    public void userViewExpectedCourseInSearch() {
        SearchBar bar = new SearchBar();

        Assert.assertTrue(bar.actualCourse().isEnabled());
    }

    @Затем("пользователь нажимает на него")
    public void userClickExpectedCourseInSearch() {
        SearchBar bar = new SearchBar();
        click(bar.actualCourse());
    }

    @И("видит что курс открыт в текущей вкладке")
    public void userViewCoursePage() {
        CoursesPage coursesPage = new CoursesPage();

        Assert.assertTrue(coursesPage.courseLinkVerify().isDisplayed());
    }
}
