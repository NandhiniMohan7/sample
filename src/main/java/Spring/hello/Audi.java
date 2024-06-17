package Spring.hello;

import org.springframework.stereotype.Component;

@Component
public class Audi implements Car {
	public String getCar() 
	{
		return "This is AUDI";
	}

}
