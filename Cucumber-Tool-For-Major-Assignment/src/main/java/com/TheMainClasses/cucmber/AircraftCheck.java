package com.TheMainClasses.cucmber;
public class AircraftCheck {
	
	float minimumFuelRequired=21f,actualFuel=0f,minimumFuelToLand=2f;
	int minimumVisibility=30,thrust=0,lift=0,drag=0,weight=80000,actualVisibility=0,speed=0;

	public AircraftCheck(float actualFuel,int actualVisibility)
	{
		this.actualFuel=actualFuel;
		this.actualVisibility=actualVisibility;
		
	}
	
	public String readyToTakeOff()
	{
		if(this.actualFuel>this.minimumFuelRequired)
		{
			if(this.actualVisibility>this.minimumVisibility)
			{
				
				this.speed=170;
				this.thrust=1/8*(this.weight);
				return "ATC clearance granted, you are allowed to move to the runway to take off";
			}
			else
			{
				return "Visibility is low, please wait for the further instructions";
			}
			
		}
		else
		{
			return "Fuel is lesser than the standard, permission to take off denied";
		}
			
	}
	
	public String readyToLand()
	{
		this.speed=140;
		this.thrust=-1/10*(this.thrust);
		if(this.actualFuel>this.minimumFuelToLand)
		{
			if(this.actualVisibility<this.minimumVisibility)
			{
				return "Request ATC for a guided landing, observe runway lights";
			}
			else
			{
				return "Perform a normal landing";
			}
		}
		else
		{
			return "Use the back up power,shut the unwanted power usage and request ATC for immediate landing";
		}
	}

}
