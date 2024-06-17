package Spring.hello;

public class Hello {
	private Shop shopping;

	public Hello(Shop shopping)
	{
		this.shopping = shopping;
	}
	
	public void add()
	{
		System.out.println("HelloWorld");
		System.out.println(shopping.getPizza());
	}

}
