package com.bits.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Entity
public class Address extends Audit{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotEmpty
	private String homeAndRoadNo;
	@NotEmpty
	private String villageName;
	@NotEmpty
	private String unionName;
	@NotEmpty
	private String postOffice;
	@NotEmpty
	@Pattern(regexp = "^\\d+$")
	private String postCode;

	private int  type;
	
	@ManyToOne
	private District district;
	
	@ManyToOne
	private Upazila upazila;
	
	@ManyToOne
	private Applicant applicant;
}
