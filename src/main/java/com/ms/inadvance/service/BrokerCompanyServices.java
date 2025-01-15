package com.ms.inadvance.service;

import static com.ms.inadvance.utils.ConstantUtil.LOG_END;
import static com.ms.inadvance.utils.ConstantUtil.LOG_START;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ms.inadvance.dto.BrokerCompanyDto;
import com.ms.inadvance.repository.BrokerCompanyRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class BrokerCompanyServices {

	private final BrokerCompanyRepository brokerCompanyRepository;

	public List<BrokerCompanyDto> findAllBrokerCompanyList() {
		log.info(String.format(LOG_START, Thread.currentThread().getStackTrace()[1].getMethodName()));
		List<BrokerCompanyDto> result = brokerCompanyRepository.getAllBrokerCompany();
		log.info(String.format(LOG_END, Thread.currentThread().getStackTrace()[1].getMethodName()));
		return result;
	}

	

}
