package com.akshaymisal.sampleboot.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

	private Integer id;
	private String username;
	private String userSSOKey;
	private String firstName;
	private String lastName;
	private String email;
	private Date createdAt;
	private Integer createdBy;
	private Date updatedAt;
	private Integer updatedBy;
}
