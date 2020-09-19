package com.takeOff.Run;

import static org.junit.Assert.assertEquals;

import com.TheMainClasses.cucmber.AircraftCheck;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TakeOffStepDefinition {
	AircraftCheck aircraft;
	String warningMessage;
	@Given("^Boarding is complete and engines are fired up$")
	public void boarding_is_complete_and_engines_are_fired_up() throws Throwable {
		System.out.println("ENGINES FIRED UP!!!!");
	}

	@When("^the fuel in the aircraft is (\\d+) gallon only, which is less than twenty one gallon$")
	public void the_fuel_in_the_aircraft_is_gallon_only_which_is_less_than_twenty_one_gallon(int arg1) throws Throwable {
		 aircraft=new AircraftCheck(arg1,35);
		 this.warningMessage="Fuel is lesser than the standard, permission to take off denied";
	}

	@Then("^A fuel warning message is shown to the pilot to abort takeoff$")
	public void a_fuel_warning_message_is_shown_to_the_pilot_to_abort_takeoff() throws Throwable {
		assertEquals(this.warningMessage,aircraft.readyToTakeOff());
		System.out.println(aircraft.readyToTakeOff());
	}

	@When("^the fuel in the aircraft is twentytwo gallon but the visibility is (\\d+) metres$")
	public void the_fuel_in_the_aircraft_is_twentytwo_gallon_but_the_visibility_is_metres(int arg1) throws Throwable {
		 aircraft=new AircraftCheck(22,arg1);
		 this.warningMessage="Visibility is low, please wait for the further instructions";
	}

	@Then("^The visibility warning message is shown to the pilot to abort takeoff$")
	public void the_visibility_warning_message_is_shown_to_the_pilot_to_abort_takeoff() throws Throwable {
		assertEquals(this.warningMessage,aircraft.readyToTakeOff());;
		System.out.println(aircraft.readyToTakeOff());
	}

	@When("^the fuel in the aircraft is (\\d+) gallon and the visibility is (\\d+) metres so both are favourable$")
	public void the_fuel_in_the_aircraft_is_gallon_and_the_visibility_is_metres_so_both_are_favourable(int arg1, int arg2) throws Throwable {
		 aircraft=new AircraftCheck(arg1,arg2);
		 this.warningMessage="ATC clearance granted, you are allowed to move to the runway to take off";
	}

	@Then("^The pilot is allowed to procede the flight to the runway to takeoff$")
	public void the_pilot_is_allowed_to_procede_the_flight_to_the_runway_to_takeoff() throws Throwable {
		assertEquals(this.warningMessage,aircraft.readyToTakeOff());
		System.out.println(aircraft.readyToTakeOff());
	}

}
