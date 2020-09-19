Feature: Test all the Landing warnings and permissions

  Scenario: Warning when the fuel in the aircraft is less than one tenth of the standard, 
    Given Flight is in the air, and the pilot is preparing for the landing
    When the fuel in the aircraft is 1 gallon only, which is less than one by ten of twenty one gallon
    Then Special instruction is given to the pilot by the autopilot,i.e to use the emergency back up power 
    
   Scenario: Warning when fuel in the aircraft is greater than one tenth of twenty one gallon
             but visibility is lesser than the standard, where the standard visibility is thirty metres
    Given Flight is in the air, and the pilot is preparing for the landing
    When the fuel in the aircraft is 3 gallon but the visibility is 29 metres
    Then The visibility warning message is shown to the pilot, and pilot requests for a guided landing 

    Scenario: Safe to land message when fuel is greater than one tenth of twent one gallon and the visibility
              is greater than thirty metres
    Given Flight is in the air, and the pilot is preparing for the landing
    When the fuel in the aircraft is 3 gallon and the visibility is 31 metres
    Then A normal landing can now be made
    