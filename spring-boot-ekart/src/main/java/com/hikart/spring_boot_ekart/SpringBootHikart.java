package com.hikart.spring_boot_ekart;

import org.springframework.boot.SpringApplication;    
import org.springframework.boot.autoconfigure.SpringBootApplication; 

@SpringBootApplication 
public class SpringBootHikart {

	public static void main(String[] args)  
	{    
	SpringApplication.run(SpringBootHikart.class, args); 
	System.out.println("HiKart Products will be available soon");
	} 
}
