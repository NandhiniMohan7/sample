package Spring.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {
	
@Bean("Pizza")
public Shop vegPizza()
{
	return new VegPizza();
}
	
@Bean
public Shop nonVegPizza()
{
	return new NonVeg();
}

@Bean
public Hello hello()
{
return new Hello(nonVegPizza());	
}
}
