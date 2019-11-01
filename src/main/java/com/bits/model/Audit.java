package com.bits.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdDate", "updatedDate" }, allowGetters = true)
@Getter
@Setter
@NoArgsConstructor
public abstract class Audit {
	
	private boolean active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, updatable = false)
	@CreatedDate
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	@LastModifiedDate
	private Date updatedDate;
}
