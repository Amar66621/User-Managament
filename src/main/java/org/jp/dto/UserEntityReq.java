package org.jp.dto;

import lombok.Data;

@Data
public class UserEntityReq {

	private String userName;

	private Long phoneNo;

	private Long roleId;

	private Boolean status;

	private String userEmail;
	
	private String password;

}
