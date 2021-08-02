package com.dictality.allure_report;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("GitHub Issues Tab Present Tests, HW6")
public class IssuesTests {

    private final GithubIssueTabSteps steps = new GithubIssueTabSteps();

    @Test
    @DisplayName("Check Issues Tab Exists with plain Selenide")
    void checkIssuesTabExistsSelenide() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(Constants.REPO);
        $("#issues-tab").should(exist);
    }
}
