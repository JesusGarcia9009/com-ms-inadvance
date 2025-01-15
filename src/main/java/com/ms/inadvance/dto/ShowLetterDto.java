package com.ms.inadvance.dto;

import java.util.ArrayList;
import java.util.List;

import com.ms.inadvance.entity.LetterConfig;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShowLetterDto {
	
	private List<String> clientsName = new ArrayList<String>();
	
	private LetterConfig letter;

}
