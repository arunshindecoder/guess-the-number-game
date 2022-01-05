package com.arun.spring.console;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arun.spring.config.GameConfig;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	//private static final Logger log = LoggerFactory.getLogger(Main.class);
	
	


	public static void main(String[] args) {
		log.info("Guess The Number Game");

		// create context (container)
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

		// get number generator bean from context (container)
	//	NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

		

        // close context (container)
        context.close();

	}
}
