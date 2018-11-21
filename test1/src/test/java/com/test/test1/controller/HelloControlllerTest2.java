package com.test.test1.controller;

import com.test.test1.Test1Application;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Test1Application.class)//这里的Application是springboot的启动类名
@WebAppConfiguration
public class HelloControlllerTest2 {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hwTest() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hw"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        //.andExpect(MockMvcResultMatchers.content().string("365"));  //测试接口返回内容
    }
}