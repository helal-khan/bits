package com.bits.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class EducationalQualification extends Audit{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotEmpty
	private String subject;
	@NotEmpty
	private String institutionName;
	@NotNull
	@Positive
	private int passingYear;
	@NotEmpty
	private String boardOrUniversity;
	@NotEmpty
	private String gradeClassDivision;
	@ManyToOne
	private Education education;
	@ManyToOne
	private Applicant applicant;
}
