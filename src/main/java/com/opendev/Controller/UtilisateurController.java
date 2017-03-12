package com.opendev.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.opendev.Metiers.UtilisateurMitier;
import com.opendev.entities.Utilisateur;


import com.opendev.Controller.UtilRestURIConstants;


@Controller
@CrossOrigin
@RequestMapping(value="/utilisateur")
public class UtilisateurController {
	
	@Autowired
	UtilisateurMitier utilisateurMitier;    
    
    @RequestMapping(value = UtilRestURIConstants.CREER_UTIL, method = RequestMethod.POST, consumes = "application/json;"
			+ "charset=UTF-8")
	public @ResponseBody Utilisateur creerUtl(@RequestBody Utilisateur utilisateur) {
    	
    	return utilisateurMitier.addUtilisateur(utilisateur);
    	
	}
    
    
    
    @RequestMapping(value = UtilRestURIConstants.CONNEXION, method = RequestMethod.GET, produces = {
	"application/json" })  
    
    public @ResponseBody List<Utilisateur> connexion(@RequestParam(required = false, value = "log") String log,@RequestParam(required = false, value = "pw") String pw){
	  
    	System.out.println("ee" + log + pw);
    	
    	 
    			List<Utilisateur> u = utilisateurMitier.connexion(log,pw);
    			System.out.println("nn" + u.size());
    			return u ;
   }
  
}
