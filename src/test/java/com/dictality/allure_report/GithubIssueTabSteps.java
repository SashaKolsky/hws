package com.dictality.allure_report;

import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubIssueTabSteps {

    @Step("Open GitHub Repository: {repo}")
    public void openRepoPage(String repo) {
        open(Constants.REPO);
    }

    @Step("Verify Issues Tab exists")
    public void verifyIssuesTabExists() {
        $("#issues-tab").should(exist);
    }

}
