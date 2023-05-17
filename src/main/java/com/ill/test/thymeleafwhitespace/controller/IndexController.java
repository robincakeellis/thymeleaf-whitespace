package com.ill.test.thymeleafwhitespace.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Value("${app.whitespace-remove}")
    private boolean removeWhitespace;

    @GetMapping("/")
    public ModelAndView showIndexPage() {
        final IndexDto dto = new IndexDto();
        dto.setRemoveWhitespace(removeWhitespace);
        dto.setOptions(List.of("Fallout 3", "Fallout New Vegas", "Fallout 4"));
        return new ModelAndView("index.html", "dto", dto);
    }

}
