package com.ms.inadvance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ms.inadvance.dto.BrokerCompanyDto;
import com.ms.inadvance.entity.BrokerCompany;

public interface BrokerCompanyRepository extends CrudRepository<BrokerCompany, Long> {
	
	@Query(" SELECT new com.ms.inadvance.dto.BrokerCompanyDto( "
			+ " bc.id, "
			+ "	bc.name, "
			+ "	bc.phone, "
			+ "	bc.physicalAdd, "
			+ "	bc.webSite ) "
		+ "    FROM BrokerCompany bc ")
	List<BrokerCompanyDto> getAllBrokerCompany();
}
