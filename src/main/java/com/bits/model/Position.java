package com.bits.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Helal
 *
 */
@Entity
public class Position extends Audit{
	@Id
	private int id;
	private String nameEnglish;
	private String nameBangla;
}
