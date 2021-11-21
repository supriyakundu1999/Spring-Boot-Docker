package com.sk.springdocker.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class Test {

	public static final Log LOGGER = LogFactory.getLog(Test.class);

	@GetMapping
	ResponseEntity<String> getData() {
		LOGGER.info("GET Method:  Test API");
		return new ResponseEntity<>("Test API Called..", HttpStatus.OK);
	}

}
