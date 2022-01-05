package com.arun.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.arun.spring.core.MessageGenerator;
import com.arun.spring.core.MessageGeneratorImpl;
import com.arun.spring.core.NumberGenerator;
import com.arun.spring.core.NumberGeneratorImpl;
/*
@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages = "com.arun.spring")
*/
public class AppConfig {

	// == bean methods ==
//	@Bean
//	public NumberGenerator numberGenerator() {
//		return new NumberGeneratorImpl();
//	}

//   // @Bean
//    public Game game() {
//        return new GameImpl();
//        
//    }

//	@Bean
//	public MessageGenerator messageGenerator() {
//		return new MessageGeneratorImpl();
//	}
}
