package com.travel.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class CitiesController {
	@RequestMapping("/connected")
	@ResponseBody
	public String cities(@RequestParam String origin, @RequestParam String destination) throws FileNotFoundException, IOException {	
	        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ikaus\\eclipse-workspace\\cities\\src\\main\\resources\\cities.txt"))) {
	            
	            String line;
	            String message = new String();
	            while ((line = bufferedReader.readLine()) != null){
	                System.out.println(line);
	                message += line;
		            //System.out.println("My Lines ===========>\n"+line);
		            //System.out.println("My Message ===========>\n"+message);
	              System.out.println("Origin ===========>\n"+origin);
	              System.out.println("destination ===========>\n"+destination);
	            } 	  
	              if(origin == "Boston"){
	            	  System.out.println("insode boston ori===========>\n"+origin);
	            	  if(destination == "New York") {
	            		  System.out.println("insode boston des===========>\n"+destination);
	            		  return "true";
	            	  }else if(destination == "Philadelphia"){
	            		  return "true";
	            	  }else if(destination == "Newark") {
	            		  return "true";
	            	  }else {
	            		  return "false";
	            	  }
	              }
	              
	              if(origin != "Trenton") {
	            	  if(destination == "Albany") {
	            		  return "true";
	            	  }else {
	            		  return "false";
	            	  }	            	  
	              }
		            //return message.valueOf(origin) != null;
		            //boolean b1=Boolean.parseBoolean(message);
		            //return b1;
		            //return "origin: "+message;
	              return message;
	            //nnnn//}
	            
//	            HashMap<String, String> citiesList = new HashMap<String, String>();
//	            citiesList.put("Boston", "New York");
//	            citiesList.put("Philadelphia", "Newark");
//	            citiesList.put("Newark", "Boston");
//	            citiesList.put("Trenton", "Albany");
//	            System.out.println(citiesList);	 
//	            return citiesList;	            
	            }
	        //nnnboolean b1=Boolean.parseBoolean(origin);
	        //nnnSystem.out.print("===========================******************"+b1);
			//nnnreturn origin;
	        
	}
}
