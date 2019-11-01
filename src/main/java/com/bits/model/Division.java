package com.bits.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Division extends Audit {
	@Id
	private int id;
	private String nameEnglish;
	private String nameBangla;
	@OneToMany(mappedBy = "division")
	@JsonIgnore
	private Set<District> district;
}
