package Spring.hello.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	public List<String> employee()
	{
		List<String> allEmployee=Arrays.asList("nandhini","ashwin","murali");
		return allEmployee;
	}
	

}
