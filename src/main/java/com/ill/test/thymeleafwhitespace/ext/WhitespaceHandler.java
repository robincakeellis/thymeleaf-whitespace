package com.ill.test.thymeleafwhitespace.ext;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.model.IText;

public class WhitespaceHandler extends AbstractTemplateHandler {

    @Override
    public void handleText(IText text) {
        if (text.getText() == null || !text.getText().isBlank()) {
            super.handleText(text);
        }
    }

}
