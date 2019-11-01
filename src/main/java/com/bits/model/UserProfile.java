package com.bits.model;

import java.sql.Timestamp;
import javax.validation.constraints.NotEmpty;

public class UserProfile {
	
	private int userProfileId;
	private int userId;
//	@NotEmpty
	private String firstNameBan;
	@NotEmpty
	private String firstNameEng;
//	@NotEmpty
	private String lastNameBan;
	@NotEmpty
	private String lastNameEng;
}
