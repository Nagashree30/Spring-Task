package com.chimera.news.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NewsPaperDTO {

	private String name;
	private double cost;
	private short noOfPages;
	private String language;
	private boolean magazine;

	public NewsPaperDTO() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public NewsPaperDTO(String name, double cost, short noOfPages, String language, boolean magazine) {
		super();
		this.name = name;
		this.cost = cost;
		this.noOfPages = noOfPages;
		this.language = language;
		this.magazine = magazine;
		System.out.println(this.getClass().getSimpleName() + " object created");
	}
}
