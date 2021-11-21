package com.sk.springdocker.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Test {

	@GetMapping
	ResponseEntity<String> getData() {
		return new ResponseEntity<>("Test API Called..", HttpStatus.OK);
	}

}
