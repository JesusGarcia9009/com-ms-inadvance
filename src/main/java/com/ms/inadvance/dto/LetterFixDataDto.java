package com.ms.inadvance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LetterFixDataDto {
	
	private long id;

	private String conditions;

	private boolean deleted;

	private String finaltext;

	private String subject;

}
