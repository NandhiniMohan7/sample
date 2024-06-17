package Spring.hello.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class RemoteMachineService {
	public  String message()
	{
		return "Hello World";
	}
	public List<String> listOfMessages()
	{
		List<String> list=Arrays.asList("java","python","Dot-Net");	
		return list;
	}

}
