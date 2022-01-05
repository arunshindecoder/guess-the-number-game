package com.arun.spring.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;



@Component
@Slf4j
@Getter
public class GameImpl implements Game {

    
    // == fields ==
	@Getter(AccessLevel.NONE)
    private final NumberGenerator numberGenerator;
    

    private final int guessCount;
    
    
    @Autowired
    public GameImpl(NumberGenerator numberGenerator, @GuessCount int guessCount) {
    	log.debug("In Constructor of Gameimpl");
		this.numberGenerator = numberGenerator;
		this.guessCount = guessCount;
	}

	private int number;   
    private int smallest;
    private int biggest;
    private int remainingGuesses;
    private boolean validNumberRange = true;
    
    @Setter
    private int guess;
    
	// == init ==
    @PostConstruct
    @Override
    public void reset() {
        smallest =  numberGenerator.getMinNumber();
        guess = numberGenerator.getMinNumber();;
        remainingGuesses = guessCount;
        biggest = numberGenerator.getMaxNumber();
        number = numberGenerator.next();
        log.debug("the number is reset {}", number);
    }

    @PreDestroy
    public void preDestroy() {
        log.info("in Game preDestroy()");
    }

    // == public methods ==
   

	@Override
    public void check() {

        checkValidNumberRange();

        if(validNumberRange) {
            if(guess > number) {
                biggest = guess -1;
            }

            if(guess < number) {
                smallest = guess + 1;
            }
        }

        remainingGuesses--;
    }


    @Override
    public boolean isGameWon() {
        return guess == number;
    }

    @Override
    public boolean isGameLost() {
        return !isGameWon() && remainingGuesses <= 0;
    }

    // == private methods ==
    private void checkValidNumberRange() {
        validNumberRange = (guess >= smallest) && (guess <= biggest);
    }
}
