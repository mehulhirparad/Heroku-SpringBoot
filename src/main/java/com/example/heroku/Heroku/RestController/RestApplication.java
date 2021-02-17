package com.example.heroku.Heroku.RestController;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.example.heroku.Heroku")
@RestController
@RequestMapping("/api")
public class RestApplication
{
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getData()
	{
		return "Hello Spring";
	}
}
