package com.ms.inadvance.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ms.inadvance.dto.security.UserDto;
import com.ms.inadvance.entity.Users;

/**
 * UserRepository (operaciones CRUD de la entidad) - Spring Boot
 *
 * @author Jesus Garcia
 * @since 1.0
 * @version jdk-11
 */
public interface UserRepository extends CrudRepository<Users, Long> {

	Optional<Users> findByUsernameOrEmail(String Username, String email);
	
	@Query(   "   SELECT new com.ms.inadvance.dto.security.UserDto ( u.id, u.name, u.lastName, u.email, u.cellphone, u.username, u.pass, u.mailingAdd, p.id, p.profileCode, p.profileName) " 
			+ "     FROM Users u INNER JOIN u.profile p ")
	List<UserDto> findAllUsers();
	
	Users findByEmailIgnoreCase(String email);
	
	Long countByEmailOrUsername(String email, String username);
	
}
