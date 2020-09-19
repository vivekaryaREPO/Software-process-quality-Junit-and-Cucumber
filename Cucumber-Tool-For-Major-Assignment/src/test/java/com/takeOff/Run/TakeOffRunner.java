package com.takeOff.Run;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:TakeOffFeatures/AircraftTakeOffTest.feature",glue="com.takeOff.Run")
public class TakeOffRunner {

}
