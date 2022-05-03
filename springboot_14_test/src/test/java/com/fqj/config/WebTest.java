package com.fqj.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.Assert;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class WebTest {
    @Test
    void webtest(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        mvc.perform(builder);
    }
    @Test
    void Statustest(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books1");
        ResultActions ac = mvc.perform(builder);
        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        ac.andExpect(ok );
    }
    @Test
    void Bodytest(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions ac = mvc.perform(builder);
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher body = content.string("springboot2");
        ac.andExpect(body);
    }

    @Test
    void Jsontest(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions ac = mvc.perform(builder);
        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher body = content.json("{\"name\":\"d1a\",\"id\":1,\"description\":\"das\",\"type\":\"dasa\"}");
        ac.andExpect(body);
    }
    @Test
    void COntenttest(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions ac = mvc.perform(builder);
        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher string = header.string("Content-Type", "application/json");
        ac.andExpect(string);
    }

    @Test
    void GetByIdtest(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions ac = mvc.perform(builder);

        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        ac.andExpect(ok );

        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher string = header.string("Content-Type", "application/json");
        ac.andExpect(string);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher body = content.json("{\"name\":\"da\",\"id\":1,\"description\":\"das\",\"type\":\"dasa\"}");
        ac.andExpect(body);
    }
}
