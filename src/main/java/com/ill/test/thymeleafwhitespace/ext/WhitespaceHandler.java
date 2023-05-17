package com.ill.test.thymeleafwhitespace.ext;

import org.thymeleaf.engine.AbstractTemplateHandler;
import org.thymeleaf.model.IText;

// Original code from Yamani Rodriguez: https://github.com/thymeleaf/thymeleaf/issues/108#issuecomment-761724887
public class WhitespaceHandler extends AbstractTemplateHandler {

    @Override
    public void handleText(IText text) {
        if (text.getText() == null || !text.getText().isBlank()) {
            super.handleText(text);
        }
    }

}
