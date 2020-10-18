package com.ylizma.ci_cd_pipeline.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(HelloController.class)
@ExtendWith(SpringExtension.class)
class HelloControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    void hello() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("Hello, World!",result.getResponse().getContentAsString());
    }

    @Test
    void helloName() throws Exception {
        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/hello?name=youssef");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("hello, youssef",result.getResponse().getContentAsString());
    }
}