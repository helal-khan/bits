package com.bits.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class District extends Audit {

	@Id
	private int id;
	private String NameEnglish;
	private String nameBangla;
	@ManyToOne
	private Division division;
}
