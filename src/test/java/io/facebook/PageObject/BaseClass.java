package io.facebook.PageObject;

import core.DriverManager;

public abstract class BaseClass {

    public Object navigateTo(String url) {
        DriverManager.getDriver().get(url);

        return this;
    }
}
