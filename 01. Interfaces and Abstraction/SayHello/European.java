package ex4.SayHello;

public class European implements Person
{
	
	private String name;
	
	public European(String name) 
	{
		this.setName(name);
	}
	
	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
