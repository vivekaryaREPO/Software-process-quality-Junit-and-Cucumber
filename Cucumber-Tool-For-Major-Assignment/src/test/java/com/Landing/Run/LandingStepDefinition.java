package com.Landing.Run;
import static org.junit.Assert.assertEquals;
import com.TheMainClasses.cucmber.AircraftCheck;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingStepDefinition {
    
	AircraftCheck aircraft;
	String warningMessage;

	@Given("^Flight is in the air, and the pilot is preparing for the landing$")
	public void flight_is_in_the_air_and_the_pilot_is_preparing_for_the_landing() throws Throwable {
		System.out.println("Pilot preparing for the landing!!!!");
	}

	@When("^the fuel in the aircraft is (\\d+) gallon only, which is less than one by ten of twenty one gallon$")
	public void the_fuel_in_the_aircraft_is_gallon_only_which_is_less_than_one_by_ten_of_twenty_one_gallon(int arg1) throws Throwable {
		 aircraft=new AircraftCheck(arg1,35);
		 this.warningMessage="Use the back up power,shut the unwanted power usage and request ATC for immediate landing";
	}

	@Then("^Special instruction is given to the pilot by the autopilot,i\\.e to use the emergency back up power$")
	public void special_instruction_is_given_to_the_pilot_by_the_autopilot_i_e_to_use_the_emergency_back_up_power() throws Throwable {
		assertEquals(this.warningMessage,aircraft.readyToLand());
		System.out.println(aircraft.readyToLand());
	}

	@When("^the fuel in the aircraft is (\\d+) gallon but the visibility is (\\d+) metres$")
	public void the_fuel_in_the_aircraft_is_gallon_but_the_visibility_is_metres(int arg1, int arg2) throws Throwable {
		 aircraft=new AircraftCheck(arg1,arg2);
		 this.warningMessage="Request ATC for a guided landing, observe runway lights";
	}

	@Then("^The visibility warning message is shown to the pilot, and pilot requests for a guided landing$")
	public void the_visibility_warning_message_is_shown_to_the_pilot_and_pilot_requests_for_a_guided_landing() throws Throwable {
		assertEquals(this.warningMessage,aircraft.readyToLand());
		System.out.println(aircraft.readyToLand());
	}

	@When("^the fuel in the aircraft is (\\d+) gallon and the visibility is (\\d+) metres$")
	public void the_fuel_in_the_aircraft_is_gallon_and_the_visibility_is_metres(int arg1, int arg2) throws Throwable {
		 aircraft=new AircraftCheck(arg1,arg2);
		 this.warningMessage="Perform a normal landing";
	}

	@Then("^A normal landing can now be made$")
	public void a_normal_landing_can_now_be_made() throws Throwable {
		assertEquals(this.warningMessage,aircraft.readyToLand());
		System.out.println(aircraft.readyToLand());
	}


}
