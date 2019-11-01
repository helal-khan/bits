package com.bits.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Occupation extends Audit{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nameEnglish;
	private String nameBangla;
}
