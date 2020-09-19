package com.Landing.Run;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:LandingFeatures/AircraftLanding.feature",glue="com.Landing.Run")

public class LandingRunner {
	

}
