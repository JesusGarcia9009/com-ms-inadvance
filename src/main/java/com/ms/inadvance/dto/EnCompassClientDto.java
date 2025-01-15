package com.ms.inadvance.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnCompassClientDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cellphone;
	
	private String email;
	
	private String lastName;
	
	private String mailingAdd;
	
	private String name;
	
	private String type;

}
