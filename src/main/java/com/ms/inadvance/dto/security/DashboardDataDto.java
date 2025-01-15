package com.ms.inadvance.dto.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DashboardDataDto {
	
	private Long letterConfigCount;
	private Long deletedLetterConfigCount;
	
	private String topUser;
	
	private Long operationCount;
	private Long clientCount;

}

