package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
/*
 * essa a annotation abstrai outras annotations como configuration,
 * 
 * enableautoconfiguration ( annotation atual do spring-boot )
 * 
 * component scan ( scaneia todas as anotations como controllers,components, services , etc.. para passar para o framework )  
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Inicialização do contexto.. ele procura todos os componentes do do spring e coloca no contexto
    	 */    	
       SpringApplication.run(App.class, args);
    }
}
