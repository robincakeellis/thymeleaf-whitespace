package com.ill.test.thymeleafwhitespace.ext;

import java.util.Set;
import org.thymeleaf.dialect.IPostProcessorDialect;
import org.thymeleaf.postprocessor.IPostProcessor;
import org.thymeleaf.postprocessor.PostProcessor;
import org.thymeleaf.templatemode.TemplateMode;

public class WhitespacePostProcessorDialect implements IPostProcessorDialect {

    @Override
    public String getName() {
        return "WhitespacePostProcessorDialect";
    }

    @Override
    public Set<IPostProcessor> getPostProcessors() {
        return Set.of(new PostProcessor(TemplateMode.HTML, WhitespaceHandler.class, Integer.MAX_VALUE));
    }

    @Override
    public int getDialectPostProcessorPrecedence() {
        return 0;
    }

}
