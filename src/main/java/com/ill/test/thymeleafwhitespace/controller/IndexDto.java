package com.ill.test.thymeleafwhitespace.controller;

import java.util.List;

public class IndexDto {

    private boolean removeWhitespace;
    private List<String> options;

    public boolean isRemoveWhitespace() {
        return removeWhitespace;
    }

    public void setRemoveWhitespace(boolean hasWhitespace) {
        this.removeWhitespace = hasWhitespace;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

}
