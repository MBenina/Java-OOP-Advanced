package ex4.SayHello;

public interface Person 
{
	String getName();
	default String sayHello() 
	{
		return "Hello";
	}
}
