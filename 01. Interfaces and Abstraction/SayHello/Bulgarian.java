package ex4.SayHello;

public class Bulgarian implements Person
{
private String name;
	
	public Bulgarian(String name) 
	{
		this.setName(name);
	}
	
	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
		public String sayHello() {
			
			return "Здравей";
		}

}
