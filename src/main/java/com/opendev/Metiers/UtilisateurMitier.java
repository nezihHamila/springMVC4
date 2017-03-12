package com.opendev.Metiers;

import java.util.List;

import com.opendev.entities.Utilisateur;

public interface UtilisateurMitier {
	
	public Utilisateur addUtilisateur(Utilisateur utl);
	public List<Utilisateur> connexion(String log, String pw);

}
