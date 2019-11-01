package com.bits.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Payment extends Audit{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int paymentType;
	@NotEmpty
	private String paymentNo;
	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date paymentDate;
	@NotEmpty
	private String bankName;
	@NotEmpty
	private String brunchName;
	private float amount;
	@OneToOne(mappedBy = "payment")
	private Applicant applicant;
}
