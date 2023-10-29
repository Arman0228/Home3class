package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1600х900";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 1000;
        Configuration.holdBrowserOpen = true; //
    }
}