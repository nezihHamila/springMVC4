package com.opendev.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.opendev.Metiers.QuestionMetier;
import com.opendev.entities.Question;

@Controller
@CrossOrigin
@RequestMapping(value="/question")
public class QuestionController {
	
	@Autowired
	QuestionMetier questionMetier;

	@RequestMapping(value = QuestionURIConstant.GET_QUESTIONS_BY_TYPE, method = RequestMethod.GET, produces = {
	"application/json" })  
    
    public @ResponseBody List<Question> connexion(@RequestParam(required = false, value = "type") String type){
	  
    	System.out.println("ee" + type );
    	
    	 
    			List<Question> quest = questionMetier.getQuestions(type);
    			System.out.println("nn" + quest.size());
    			return quest ;
   }
  
}
