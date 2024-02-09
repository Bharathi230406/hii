package com.tech.hi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@RequestMapping(value = "/admin")
public class HiPrint {

//	@GetMapping(value = "/hi")
//	public String print() {
//		return "sample.html";
//	}
	@GetMapping(value = "/hi")
	public String print() {
		return "Hello all";
	}
}
