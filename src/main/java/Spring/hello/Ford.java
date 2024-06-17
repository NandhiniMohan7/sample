package Spring.hello;

import org.springframework.stereotype.Component;

@Component
public class Ford  implements Car{
public String getCar() 
{
	return "This is FORD";
}
}
