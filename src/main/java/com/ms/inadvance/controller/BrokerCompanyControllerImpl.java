package com.ms.inadvance.controller;

import static com.ms.inadvance.utils.ConstantUtil.LOG_END;
import static com.ms.inadvance.utils.ConstantUtil.LOG_START;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.inadvance.dto.BrokerCompanyDto;
import com.ms.inadvance.service.BrokerCompanyServices;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("${inadvance.base-uri}/broker")
public class BrokerCompanyControllerImpl implements BrokerCompanyController {
	
	/**
	 * Global variables
	 */
	private final BrokerCompanyServices brokerCompanyServices;

	@Override
	@GetMapping("/list")
	public ResponseEntity<List<BrokerCompanyDto>> findAllBrokerCompanyList() {
		log.info(String.format(LOG_START, Thread.currentThread().getStackTrace()[1].getMethodName()));
		List<BrokerCompanyDto> response = brokerCompanyServices.findAllBrokerCompanyList();
		log.info(String.format(LOG_END, Thread.currentThread().getStackTrace()[1].getMethodName()));
		return new ResponseEntity<>(response, response == null || response.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK);
	}

	
	
}
