package com.bits.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.bits.model.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends Audit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotEmpty
//	@Size(min=6, max=30)
//	@Pattern(regexp="^[a-zA-Z0-9_.]+$")
	private String username;
	
	@NotEmpty
//	@Size(min=6, max=30)
//	@Pattern(regexp="^\\S+$")
	private String password;
	
	@NotEmpty
	@Email
	private String email;
	
//	@NotEmpty()
//	@Pattern(regexp="^(01)(1|7|8|9|6|3|4)[0-9]{8}$")
	private String phone;
	private String userKey;
	
	@ManyToOne
	private Role role;
	
}
