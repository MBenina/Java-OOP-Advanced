package ex5.SayHelloExtend;

public abstract class BasePerson implements Person
{
	private String name;
	
	//N.B!!!
	protected BasePerson(String name) 
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
