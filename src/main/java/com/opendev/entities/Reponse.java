package com.opendev.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Responses")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "rps_clef")) })
public class Reponse extends BaseEntity {

	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "rps_contenue")
	private String contenue;
	
	@Column(name = "rps_type")
	private String type;
	
    @ManyToOne
    @JoinColumn(name="qst_clef")
	private Question question ;

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
   
	@JsonIgnore
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
