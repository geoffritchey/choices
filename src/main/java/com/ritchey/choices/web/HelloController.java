package com.ritchey.choices.web;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ritchey.choices.Service.Greeting;
import com.ritchey.choices.Service.GreetingService;
import com.ritchey.choices.Service.ListCount;

@RestController
public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
	
	@Autowired
	GreetingService service;
	
	@RequestMapping("/rest")
	public Greeting greeting(@RequestParam(value = "campusid", defaultValue = "000000000") String campusId
	) {
		
		Greeting ret = new Greeting();
		Map<String, Date> term = service.getStartTerm();

		ListCount<Map> present = service.getPresent(campusId, term, 0, 100);
		ret.setPresent(present);
		
		ListCount<Map> tardies = service.getTardies(campusId, term, 0, 100);
		ret.setTardy(tardies);
		return ret;
	}
	
	@RequestMapping("/leaders")
	public List<Map> leaders() {
		
		List<Map> leaders = service.getMentors();
		return leaders;
	}
	
	@PostMapping(path= "/leaders/{id}", consumes = "application/json", produces = "application/json")
    public List<Map> leaders(@PathVariable("id") Integer leaderId, HttpServletRequest request, ModelMap modelMap) {
		Map<String, String> ret = new HashMap<String, String>();
		ret.put("message", "hi");
		String peopleId = (String) request.getSession().getAttribute("campusId");
		if (peopleId == null) {
			return service.getMentors();
		}
		//String peopleId = (String) modelMap.getAttribute("campusId");
		LOGGER.debug("peopleId = " + peopleId);
		return service.getMentors();
	}
	
	public String wrap(String message) {
		return ("{'message': '" + message + "'}").replaceAll("'", "\"");
	}
}


