package br.com.dals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.dals.moduloA.service.MyService;

@Controller
public class HelloController {

	@Autowired
	private MyService myService;
	
	@GetMapping("/ok")
    public @ResponseBody String home() {
        return myService.message();
    }

}
