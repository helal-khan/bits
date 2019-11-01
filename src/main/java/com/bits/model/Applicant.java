package com.bits.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Applicant extends Audit{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int trackNo;

	@NotEmpty
	private String nameBan;
	@NotEmpty
	private String nameEng;
	@NotEmpty
	@Size(min=10, max=20)
	@Pattern(regexp = "^\\d+$")
	private String nidNo;
	@NotEmpty
	@Size(min=10, max=20)
	@Pattern(regexp = "^\\d+$")
	private String bridNo;
	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	@NotNull
	@Positive
	private int placeOfBirth;
	@NotEmpty
	private String fatherName;
	@NotEmpty
	private String motherName;
	
	@NotEmpty
	private String nationality;


	
	@NotEmpty
	private String additionalQualification;
	@NotEmpty
	private String experience;
	
	@NotNull
	@Positive
	private int divisionalCandidateId;
	private int selectionStatus;
	
	
	
	@ManyToOne
	private Recruitment recruitment;
	
	@OneToMany(mappedBy = "applicant")
	private Set<Address> address;
	
	@ManyToOne
	private Gender gender;
	@ManyToOne
	private Religion religion;
	@ManyToOne
	private Occupation occupation;
	
	@OneToMany(mappedBy = "applicant")
	private Set<EducationalQualification> educationalQualification;
	
	@OneToOne
	private Payment payment;
	
	@ManyToOne
	private Quata quata;
	
	@ManyToOne
	private User user;
	
}
