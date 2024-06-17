package Spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class End {
	
	private Car car;
	
//public End(@Qualifier Ford ford)
//    {
//	this.ford = ford;
//	}
	@Autowired
public void setFord(@Qualifier("audi") Car car) 
    {
    this.car = car;
	}
public void display() 
{
System.out.println("Hello");	
System.out.println(car.getCar());
}


}
