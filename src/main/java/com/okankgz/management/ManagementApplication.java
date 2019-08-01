package com.okankgz.management;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

	@Bean  //Springin contextine dahil etmek için Autowired erişmek
	public ModelMapper getModelMapper(){

		return new ModelMapper();
	}



}
