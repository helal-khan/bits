package com.bits.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Candidate extends Audit{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long rollNo;
	private int marks;
	private boolean attendWritten;
	private boolean attendViva;
	@OneToOne
	private Applicant applicant;
}
