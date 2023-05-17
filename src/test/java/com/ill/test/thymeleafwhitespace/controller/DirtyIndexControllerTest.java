package com.ill.test.thymeleafwhitespace.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@TestPropertySource(properties = "app.whitespace-remove=false")
@WebMvcTest
class DirtyIndexControllerTest {

    @Autowired
    private MockMvc mvc;

    // the HTML should be formatted with TABS so we check for (tab) in the response body.
    @Test
    void hasRemovedWhitespace() throws Exception {
        mvc.perform(get("/"))
                .andExpect(status().is(200))
                .andExpect(content().string(containsString("<head>\n\t<title")));
    }

}
