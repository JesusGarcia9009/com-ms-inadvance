package com.ms.inadvance.client;

import com.ms.inadvance.client.dto.EncompassResponseDto;
import com.ms.inadvance.client.dto.EncompassTokenResponseDto;

/**
 * Encompass Client interface for accessing Encompass rest services.
 * Provides methods for obtaining a token and retrieving loan data.
 * 
 * @author Jesus Garcia
 * @version 0.1
 * @since jdk-11.0.7
 */
public interface EncompassClient {

    /**
     * Retrieves a token to access Encompass rest services.
     *
     * @return the token response {@link EncompassTokenResponseDto}
     */
    public EncompassTokenResponseDto getToken() throws Exception;

    /**
     * Retrieves a full loan data.
     *
     * @param eToken the token used for authentication
     * @param loanId the ID of the loan to retrieve
     * @return the loan data response {@link EncompassResponseDto}
     */
    public EncompassResponseDto getLoan(String eToken, String loanId) throws Exception ;
    
}
