package com.ms.inadvance.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ms.inadvance.dto.ClientDto;
import com.ms.inadvance.token.JwtUsuario;
import com.ms.inadvance.token.UserPrincipal;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClientController
 * 
 * This interface defines the methods for managing clients.
 * 
 * @author Jesus Garcia
 */
@Api(value = "ClientController")
public interface ClientController {

    /**
     * Retrieves a list of clients.
     * 
     * @param token The user's JWT token.
     * @return A ResponseEntity containing a list of ClientDto objects.
     */
    @ApiOperation(value = "Get client List", notes = "Retorna los datos referente a los clientes")
    public ResponseEntity<List<ClientDto>> findAllClientList(@JwtUsuario UserPrincipal token);
    
	/**
	 * Method to save client of the application
	 * 
	 * @param dto ClientDto.class 
	 * @return
	 */
	@ApiOperation(value = "Save client", notes = "Inserta o actualiza los clientes de la aplicacion")
	public ResponseEntity<?> save(ClientDto request,UserPrincipal token)throws Exception;
	
	
	/**
	 * Method to delete clients of the application
	 * 
	 * @param dto ClientDto.class 
	 * @return boolean
	 */
	@ApiOperation(value = "Delete client", notes = "Elimina los clientes de la aplicacion")
	public ResponseEntity<?> delete(ClientDto request) throws Exception;

}
