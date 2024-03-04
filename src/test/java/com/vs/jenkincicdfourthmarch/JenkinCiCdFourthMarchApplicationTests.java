package com.vs.jenkincicdfourthmarch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
class JenkinCiCdFourthMarchApplicationTests {
    @Autowired
    private MockMvc mockMvc;
    String NAME = "Vishal";

    @Test
    void testGreetings() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greet/{name}", NAME))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello "+ NAME + "Welcome"));

    }

}
