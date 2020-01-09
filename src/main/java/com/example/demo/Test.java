package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@Value("${valores.valor_fijo}")
	String valorFijo;
	@Value("${datosservidor.maximum}")
	Double datosservidor;
	
	@GetMapping("/refrescado")
	public void getConfiguracionRefrescada()
	    { 
			System.out.print(valorFijo);
			System.out.print(datosservidor);
			
	    }
}
