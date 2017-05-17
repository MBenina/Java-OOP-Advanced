package ex5.SayHelloExtend;

public interface Person 
{
	String getName();
	default String sayHello() 
	{
		return "Hello";
	}
}
