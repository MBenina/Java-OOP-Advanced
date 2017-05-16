package ex2.CarShop;

public interface Rentable extends Car
{
	Integer getMinRentDay();
	Double pricePerDay();
}
