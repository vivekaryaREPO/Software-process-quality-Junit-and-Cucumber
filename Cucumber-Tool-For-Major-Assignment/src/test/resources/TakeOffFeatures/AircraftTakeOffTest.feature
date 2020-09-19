Feature: Test all the take off warnings and permissions

  Scenario: Warning when fuel the in the aircraft is lesser than the standard, 
            where the satndard is at least twenty one gallon
    Given Boarding is complete and engines are fired up
    When the fuel in the aircraft is 20 gallon only, which is less than twenty one gallon
    Then A fuel warning message is shown to the pilot to abort takeoff
    
   Scenario: Warning when fuel in the aircraft is greater than twenty one gallon
             but visibility is lesser than the standard, where the standard visibility should be thirty metres
    Given Boarding is complete and engines are fired up
    When the fuel in the aircraft is twentytwo gallon but the visibility is 29 metres
    Then The visibility warning message is shown to the pilot to abort takeoff

    Scenario: Safe to take off message when fuel is greater than twent one gallon and the visibility
              is greater than thirty metres
    Given Boarding is complete and engines are fired up
    When the fuel in the aircraft is 22 gallon and the visibility is 31 metres so both are favourable
    Then The pilot is allowed to procede the flight to the runway to takeoff
    