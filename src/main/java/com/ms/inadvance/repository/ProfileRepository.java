package com.ms.inadvance.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ms.inadvance.entity.Profile;
import com.ms.inadvance.token.ProfileDto;

/**
 * ProfileRepository (operaciones CRUD de la entidad) - Spring Boot
 *
 * @author Jesus Garcia
 * @since 1.0
 * @version jdk-11
 */
public interface ProfileRepository extends CrudRepository<Profile, Long> {

	Profile findByProfileCode(String profileCode);
	
	Optional<Profile> findByProfileName(String profileName);
	
	@Query(" SELECT new com.ms.inadvance.token.ProfileDto (p.id, p.profileCode ,p.profileName) FROM Profile p ")
	List<ProfileDto> findProfileList();
	
	@Query(   "   SELECT new com.ms.inadvance.token.ProfileDto (p.id, p.profileCode ,p.profileName) " 
			+ "     FROM Users u "
			+ "          INNER JOIN u.profile p "
			+ "    WHERE u.id = :userId ")
	ProfileDto getProfileByUserId(Long userId);
	
}
