package Spring.hello.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Spring.hello.service.RemoteMachineService;
@Controller
public class RemoteMachineControll {
    @Autowired
	private RemoteMachineService remoteMachineService;
    
    @RequestMapping(value="/message", method=RequestMethod.GET)
    @ResponseBody
    public String message()
    {
    	return remoteMachineService.message();
    }
    
    @RequestMapping(value="/listofmessage", method=RequestMethod.GET)
    @ResponseBody
    public List<String> listofmessage()
    {
    	return remoteMachineService.listOfMessages();
    }

}
