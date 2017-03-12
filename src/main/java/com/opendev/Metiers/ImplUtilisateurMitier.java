package com.opendev.Metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opendev.DAO.UtilisateurRepository;
import com.opendev.entities.Utilisateur;

@Service
public class ImplUtilisateurMitier implements UtilisateurMitier{

	 @Autowired
		private UtilisateurRepository utilisateurRepository  ;
	@Override
	public Utilisateur addUtilisateur(Utilisateur utl) {
		
		return utilisateurRepository.save(utl);
	}

	@Override
	public List<Utilisateur> connexion(String log, String pw) {
		
		return utilisateurRepository.connexion(log, pw);
	}
	

}
