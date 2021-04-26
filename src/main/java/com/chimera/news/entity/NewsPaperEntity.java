package com.chimera.news.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "newspaper")
public class NewsPaperEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "NEWSPAPER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newspaperID;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "COST")
	private double cost;
	
	@Column(name = "NOOFPAGES")
	private short noOfPages;
	
	@Column(name = "LANGUAGE")
	private String language;
	
	@Column(name = "MAGAZINE")
	private boolean magazine;
	
	public NewsPaperEntity() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public NewsPaperEntity(String name, double cost, short noOfPages, String language, boolean magazine) {
		super();
		this.name = name;
		this.cost = cost;
		this.noOfPages = noOfPages;
		this.language = language;
		this.magazine = magazine;
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

}
