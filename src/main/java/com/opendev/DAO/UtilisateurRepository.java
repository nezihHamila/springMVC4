package com.opendev.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.opendev.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
	
	public List<Utilisateur> findById(Long id);
	
	@Query("select u from Utilisateur u where u.mail = :x and u.motPasse = :y")
	public List<Utilisateur> connexion(@Param("x")String log, @Param("y")String pw);
	

}
