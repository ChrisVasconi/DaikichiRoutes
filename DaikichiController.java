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

		@RequestMapping("/path/daikichi/travel/{pittsburgh}")
	    public String travel (@PathVariable("pittsburgh") String pittsburgh){
	    	return "You will soon travel too"+ " " + pittsburgh;
	    }
		@RequestMapping("/daikichi/lotto/{guess}")
	    public String lotto (@PathVariable("guess") String guess){
			int newNum = Integer.parseInt(guess);
			
			if (newNum % 2 == 1) {
				return "You will take a grand journey in the near future, but be weary of tempting offers";
			}	
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}			
}
		


