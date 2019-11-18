package com.firstProject.firstProject;

import com.firstProject.firstProject.controllers.MainController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(value = MainController.class)
@RunWith(SpringRunner.class)
public class MainTesting {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void firstTest(){
        try{

            RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/main/shoe").accept(MediaType.APPLICATION_JSON);
            MvcResult mvcResult =  mockMvc.perform(requestBuilder).andReturn();
            String expected = "{\n" +
                    "    \"id\": 2,\n" +
                    "    \"type\": \"addidas\",\n" +
                    "    \"color\": \"green\",\n" +
                    "    \"size\": 23\n" +
                    "}";
            JSONAssert.assertEquals(expected,mvcResult.getResponse().getContentAsString(),false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
