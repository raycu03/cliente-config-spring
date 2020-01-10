package com.example.demo;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;


@RestController
@RefreshScope
@AutoConfigureMockMvc
public class Test {
	
	 @Autowired
	    private MockMvc mockMvc;
	
	@Value("${how.oee}")	
	String valorFijo;
	
	 public void whenValidRequest_thenReturns200() throws Exception {

	        mockMvc.perform(post("http://localhost:8080/refresh "))
	                .andDo(print());
	    }

	@GetMapping("/refrescado")
	public String getConfiguracionRefrescada() throws Exception
	    { 
			System.out.print(valorFijo);
			 //Thread.sleep(20000);
			whenValidRequest_thenReturns200();
		
			return valorFijo;
			
	    }
}
