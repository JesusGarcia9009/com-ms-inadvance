package com.ms.inadvance.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ms.inadvance.dto.LoanOfficerDto;
import com.ms.inadvance.entity.LoanOfficer;

public interface LoanOfficerRepository extends CrudRepository<LoanOfficer, Long> {
	
	LoanOfficer findByEmailOrCellphoneIgnoreCase(String email, String cellphone);
	
	LoanOfficer findByEmailOrCellphone(String email, String cellphone);
	
	@Query(" SELECT new com.ms.inadvance.dto.LoanOfficerDto ( "
			+ " l.id, "
			+ "	l.cellphone, "
			+ "	l.email, "
			+ "	l.lastName, "
			+ "	l.mailingAdd, "
			+ "	l.name, "
			+ "	l.nmls, "
			+ " l.pass, "
			+ " p.id, "
			+ " p.profileCode, "
			+ " p.profileName ) "
		+ "    FROM LoanOfficer l "
		+ "         INNER JOIN l.users u "
		+ "         INNER JOIN u.profile p "
		+ "   WHERE l.id = :id ")
	LoanOfficerDto getLoanById(Long id);

}
