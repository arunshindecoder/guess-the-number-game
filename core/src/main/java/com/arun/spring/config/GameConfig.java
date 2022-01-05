package com.arun.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.arun.spring.core.GuessCount;
import com.arun.spring.core.MaxNumber;
import com.arun.spring.core.MinNumber;

@Configuration
@ComponentScan(basePackages = "com.arun.spring")
@PropertySource("classpath:config/game.properties")
public class GameConfig {
	
	@Value("${game.maxNumber:20}")   /// 20 is defualt if Property is not there in property file.
	private int maxNumber;
	
	@Value("${game.guessCount:5}")
	private int guessCount;
	
	@Value("${game.minNumber:2}")
	private int minNumber;
	
	@Bean
	@MaxNumber
	public int maxNumber() {
		return maxNumber;
	}
	
	@Bean
	@MinNumber
	public int minNumber() {
		return minNumber;
	}

	@Bean
	@GuessCount
	public int guessCount() {
		return guessCount;
	}
}
