package com.bits.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Education extends Audit{
	
	@Id
	private int id;
	private String nameEnglish;
	private String nameBangla;
	private int sorted;
	private int educationLevel;
}
