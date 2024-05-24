package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    int firstNum;
    int secondNum;
    int expectedSum;
    int realSum;
    int realMult;
    Belly calculator;

    @Before
    public void createCalc(){
        calculator = new Belly();
    }

    @Given("I have Two Numbers {int} and {int}")
    public void add(int a, int b) {
        firstNum =a;
        secondNum = b;
    }

    @When("I add Them.")
    public void iAddThem() {
        realSum = calculator.add(firstNum,secondNum);
    }

    @Then("I must receive result {int}")
    public void myBellyShouldGrowl(int expected) {
        Assertions.assertEquals(expected,realSum);
    }


    @When("I multiply Them")
    public void iMultiplyThem() {
        realMult = calculator.mult(firstNum,secondNum);
    }

    @Then("The Multiplication of Them must be {int}")
    public void theMultiplicationOfThemMustBe(int expectedMult) {
        Assertions.assertEquals(expectedMult,realMult);
    }
}
