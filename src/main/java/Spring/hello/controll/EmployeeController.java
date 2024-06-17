package Spring.hello.controll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Spring.hello.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	  @RequestMapping(value="/listofmessage", method=RequestMethod.GET)
	    @ResponseBody
	public List<String> allemployees()
	{
		return employeeService.employee();
	}
	@GetMapping("/sum/{no1}/{no2}")
	public int add(@PathVariable("no1") int no1,@PathVariable("no2") int no2) {
		return no1+no2;
	}
	@GetMapping("/empAdd/{emp}")
	 public List<String> addEmp(@PathVariable("emp") String emp) {
        List<String> list = new ArrayList<>();
        list.add(emp);
        return list;
    }
	
	

}
