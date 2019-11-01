package com.bits.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Helal
 *
 */
@Entity
public class Recruitment extends Audit {

	@Id
	private Long id;
	private String memorandum;
	private String paraOne;
	private float salary;
	private int grade;
	private int positionNo;
	private Date applicationStartDate;
	private Date applicationEndDate;
	private int minAage;
	private int maxAge;
	
	private String education;
	private String experience;
	private String remarks;
	private float applicationAmount;
	private String applicationRules;
	private String termsAndConditions;
	private Date closeDate;
	
	@ManyToOne
	private Position position;
	
	@ManyToOne
	@JoinColumn(name = "job_location_id")
	private District district;
	
	@ManyToOne
	@JoinColumn(name = "min_education_id")
	private Education minEducation;
	
	@ManyToOne
	@JoinColumn(name = "max_education_id")
	private Education maxEducation;
}
