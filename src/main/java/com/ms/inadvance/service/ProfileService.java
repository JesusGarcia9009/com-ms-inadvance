package com.ms.inadvance.service;

import static com.ms.inadvance.utils.ConstantUtil.LOG_END;
import static com.ms.inadvance.utils.ConstantUtil.LOG_START;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ms.inadvance.repository.ProfileRepository;
import com.ms.inadvance.token.ProfileDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * ProfileService clase que implementa la interfaz de servicio
 * 
 * @author Jesus Garcia
 * @version 1.0 Creacion
 * @since Java 11
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class ProfileService {
	
	private final ProfileRepository profileRepository;
	
	public List<ProfileDto> findAllProfiles() {
		log.info(String.format(LOG_START, Thread.currentThread().getStackTrace()[1].getMethodName()));
		List<ProfileDto> result = profileRepository.findProfileList();
		log.info(String.format(LOG_END, Thread.currentThread().getStackTrace()[1].getMethodName()));
		return result;
	}

	
}
