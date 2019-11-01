package com.bits.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Upazila extends Audit{
	@Id
	private int id;
	private String NameEnglish;
	private String nameBangla;
	@ManyToOne
	private Division division;
	@ManyToOne
	private District district;
}
