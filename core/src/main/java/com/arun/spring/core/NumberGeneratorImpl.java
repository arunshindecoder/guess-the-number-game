package com.arun.spring.core;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component

public class NumberGeneratorImpl implements NumberGenerator {

	// == fields ==
	private final Random random = new Random();
	/*
	 * @Autowired
	 * 
	 * @MaxNumber private int maxNumber;
	 * 
	 * @Autowired
	 * 
	 * @MinNumber private int minNumber;
	 */
	@Getter
	private final int maxNumber;
	
	@Getter
	private final int minNumber;
	
	
	@Autowired
	public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
		super();
		this.maxNumber = maxNumber;
		this.minNumber = minNumber;
	}

	// == public methods ==
	@Override
	public int next() {
		return random.nextInt(maxNumber - minNumber) + minNumber;
	}

}
