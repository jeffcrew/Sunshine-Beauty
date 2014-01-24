package com.jeffcrew.sunshine.web;

import com.jeffcrew.sunshine.domain.Category;
import com.jeffcrew.sunshine.service.SunshineService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@ContextConfiguration(locations = { "classpath:application-context.xml", "classpath:dispatcher-servlet.xml"  })
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class CategoryControllerTest extends AbstractTransactionalJUnit4SpringContextTests
{
	@Autowired
    private WebApplicationContext ctx;

    private MockMvc mockMvc;

    @Autowired
    private SunshineService sunshineService;

    @Before
    public void setup() {
        //this.mockMvc = MockMvcBuilders.webAppContextSetup(this.ctx).build();
    }
    
    @Test
    public void testGetCategory()
    {
    	Category c = sunshineService.getCategory(1);
    	System.out.println(c.getTreatments().size());
    	
    }
    
    
    @Test
    public void testRequestAllCategorys() throws Exception {

    	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/category/1");

    	this.mockMvc.perform(requestBuilder).
        andExpect(MockMvcResultMatchers.status().isOk());
    	
    	System.out.println("Yo!");
        //andExpect(MockMvcResultMatchers.model().attribute("welcome_message", "Welcome to use product: DELL Insprson")).
        //andExpect(MockMvcResultMatchers.model().size(1)).
        //andExpect(MockMvcResultMatchers.view().name("welcome"));
    	
    	
    }
    
    
    
    
}