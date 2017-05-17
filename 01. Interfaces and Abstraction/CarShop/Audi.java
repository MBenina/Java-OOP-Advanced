package ex2.CarShop;

public class Audi implements Rentable
{
	private String  model;
	private String color;
	private int horsePower;
	private String countryProduced;
	private int minRentDays;
	private Double pricePerDay;   

	public Audi(String  model, String color, int horsePower, String countryProduced, int minRentDays, Double pricePerDay) 
	{
		this.setModel(model);
		this.setColor(color);
		this.setHorsePower(horsePower);
		this.setCountryProduced(countryProduced);
		this.setMinRentDays(minRentDays); 
		this.setPricePerDay(pricePerDay);
	}
	@Override
	public String getModel() {
		
		return this.model;
	}

	@Override
	public String getColor() {
		
		return this.color;
	}

	@Override
	public int getHorsePower() {
		
		return this.horsePower;
	}

	@Override
	public Integer getMinRentDay() {
		
		return this.minRentDays;
	}

	@Override
	public Double getpricePerDay() {
		
		return this.pricePerDay;
	}
	
	private void setModel(String model) {
		this.model = model;
	}
	
	private void setColor(String color) {
		this.color = color;
	}

	private void setHorsePower(int horsePower) {
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
	
	private void setMinRentDays(int minRentDays) {
		this.minRentDays = minRentDays;
	}
	
	private void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	

}
