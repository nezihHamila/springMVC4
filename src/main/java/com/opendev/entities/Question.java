package com.opendev.entities;

import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Questions")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "qst_clef")) })

public class Question extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "qst_contenue")
	private String contenue;
	
	@Column(name = "qst_type")
	private String type;
	
	@OneToMany(mappedBy="question",fetch=FetchType.LAZY)
	private Collection<Reponse> reponses ;
	
    public Question() {
		super();
	}
	
	public Question(String contenue, String type) {
		super();
		this.contenue = contenue;
		this.type = type;
	}

	public String getContenue() {
		return contenue;
	}

	public void setContenue(String contenue) {
		this.contenue = contenue;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	 
	public Collection<Reponse> getReponses() {
		return reponses;
	}

	public void setReponses(Collection<Reponse> reponses) {
		this.reponses = reponses;
	}

	

	
}
