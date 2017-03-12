package com.opendev.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Utilisateurs")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "uti_clef")) })

public class Utilisateur extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "uti_nom")
	private String nom;
	
	@Column(name = "uti_mail")
	private String mail;
	
	@Column(name = "uti_mot_passe")
	private String motPasse;
	
	@Column(name = "uti_typ")
	private String typeUtilisateur;
	
	@Column(name = "uti_sex")
	private String sex;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String nom, String mail, String motPasse, String typeUtilisateur, String sex) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.motPasse = motPasse;
		this.typeUtilisateur = typeUtilisateur;
		this.sex = sex;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public String getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(String typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
 

}
