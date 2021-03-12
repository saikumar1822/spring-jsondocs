package com.example.springjsondocs;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class SpringJsondocsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJsondocsApplication.class, args);
	}

}
