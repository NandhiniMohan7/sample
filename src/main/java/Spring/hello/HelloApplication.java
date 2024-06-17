package Spring.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(HelloApplication.class, args);
		                                   
		End s=con.getBean(End.class);
		s.display();
		Audi s1=con.getBean(Audi.class);
		System.out.println(s1.getCar());
		
	}

}
