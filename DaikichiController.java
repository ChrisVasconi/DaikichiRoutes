package com.chrisvasconi.daikichiroutes.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DaikichiController {
	
		@RequestMapping("/daikichi")
		public String daikichi() {
			return "Welcome";
		}
		
		@RequestMapping("/today")
		public String today() {
			return "Today you will find luck in all your endeavors!";
		}
		
		@RequestMapping("/tomorrow")
		public String tomorrow() {
			return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		}

		@RequestMapping("/path/{daikichi}/{travel}/{pittsburgh}")
	    public String travel(@PathVariable("daikichi") String daikichis, @PathVariable("travel") String travel, @PathVariable("pittsburgh") String pittsburgh){
	    	return "You will soon travel too"+ " " + pittsburgh;
	    }
			}

