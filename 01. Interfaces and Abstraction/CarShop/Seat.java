package ex2.CarShop;

import java.io.Serializable;

public class Seat implements Car, Serializable //built-in Interface	
{
	
	private String  model;
	private String color;
	private int horsePower;
	
	private String countryProduced;
	
	public Seat(String  model, String color, int horsePower, String countryProduced)
	{
		this.setModel(model);
		this.setColor(color);
		this.setHorsePower(horsePower);
		this.setCountryProduced(countryProduced);
	}
	
	
	public String getCountryProduced() {
		return this.countryProduced;
	}
	
	private void setModel(String model) {
		if(model.length() < 1)
		{
			throw new IllegalArgumentException("Model name is invalid!");
		}
		this.model = model;
	}
	
	private void setColor(String color) {
		if(color.length() <= 2)
		{
			throw new IllegalArgumentException("The color is invalid!");
		}
		this.color = color;
	}
	
	private void setHorsePower(int horsePower) {
		if(horsePower < 0)
		{
			throw new IllegalArgumentException("Horse power cannot be negative!");
		}
		this.horsePower = horsePower;
	}
	 private void setCountryProduced(String countryProduced) 
	 {
		 if(countryProduced.length() <= 2)
		 {
			 throw new IllegalArgumentException("The name of the country is too short!");
		 }
			 
		this.countryProduced = countryProduced;
	 }

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public int getHorsePower() {
		// TODO Auto-generated method stub
		return this.horsePower;
	}
	
	//This is Leon produced in Spain and have 4 tires
	@Override
	public String toString() {
		
		return String.format("This is %s produced in %s and have %s tires", 
				this.model, this.countryProduced, Car.TIRES);
	}
	
}
