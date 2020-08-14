package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class HelloController {
	public static int currVal = 0;

	@RequestMapping("/")
	public String index() {
		return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) + " Greetings from Spring Boot!...";
	}

	@GetMapping("/echoIn/{variableID}/{echoValue}")
	public String echoIn(@PathVariable String variableID, @PathVariable String echoValue) {
		int variableID2 = Integer.parseInt(variableID);
		currVal = Integer.parseInt(echoValue);
		return "/echo/input value: " +  echoValue + " at ..... " + new SimpleDateFormat("mm 'min', ss 'sec'").format(new Date());
	}

	@GetMapping("/echoOut/{variableID}")
	public String echoOut(@PathVariable String variableID) {
		int variableID2 = Integer.parseInt(variableID);
		return "/echoOut/output/ variableID..: " +  variableID2 + " value: <b>" + currVal + "</b> at ..... " + new SimpleDateFormat("mm 'min', ss 'sec'").format(new Date());
	}

}
