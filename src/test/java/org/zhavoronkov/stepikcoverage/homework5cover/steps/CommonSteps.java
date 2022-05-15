package org.zhavoronkov.stepikcoverage.homework5cover.steps;

import io.cucumber.java.ru.Затем;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.zhavoronkov.stepikcoverage.homework5cover.RunnerTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonSteps extends RunnerTest {

    @Тогда("открывается новая вкладка")
    public void switchPage() throws InterruptedException {

        Thread.sleep(5000);

        List<String> windowHandles = new ArrayList(RunnerTest.getDriver().getWindowHandles());
        String secondTab = windowHandles.get(1);
        getDriver().switchTo().window(secondTab);
    }

    @Когда("открыт Stepik")
    public void openStepik() throws InterruptedException {
        RunnerTest.prepare();
        RunnerTest.goTo();

        TimeUnit.MILLISECONDS.sleep(2000);
    }

    @Затем("закрываем сессию")
    public void closeStepik() {
        RunnerTest.quit();
    }
}
