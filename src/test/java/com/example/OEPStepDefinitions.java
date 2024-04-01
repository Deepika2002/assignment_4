package com.example;
import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OEPStepDefinitions {
	
	private OEP oep;
    private String result;

	

@Given("I create a OEP Game Play object")
public void i_create_a_oep_game_play_object() {
	oep = new OEP();
}

@When("I play the game with number {int}")
public void i_play_the_game_with_number(Integer int1) {
	result = oep.play(int1);
}

@Then("The result is ODD and PRIME")
public void the_result_is_odd_and_prime() {
	assertEquals("PRIME", result);
}

@Then("The result is {string}")
public void the_result_is(String string) {
	 assertEquals(string, result);
}

@Then("The result is ODD")
public void the_result_is_odd() {
	 assertEquals("ODD", result);
}

}
