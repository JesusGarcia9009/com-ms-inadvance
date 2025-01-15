package com.ms.inadvance.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.ms.inadvance.dto.security.RegisterRequestDTO;
import com.ms.inadvance.dto.security.UserAuthRequestDTO;
import com.ms.inadvance.dto.security.UserAuthResponseDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


/**
 * LoginUserController
 * 
 * Servicio encargado de hacer login en los nuevos microservicios y ademas otorgando los roles por usuario
 * 
 * @author Jesus Garcia
 */
@Api(value = "Microservicio de Login", description = "Esta API tiene los servicios referentes a operaciones de autentificacion")
public interface LoginUserController {

	/**
	 * Metodo encargado de llamar la autentificacion de parque y asignar los roles al token creado.
	 * 
	 * @param dto UserAuthRequestDTO.class 
	 * @return
	 */
	@ApiOperation(value = "Autentificar", notes = "Retorna los datos de la api de coneccion a nuestra aplicacion")
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorno satisfactorio"),
            @ApiResponse(code = 401, message = "No autorizado"),
            @ApiResponse(code = 403, message = "Prohibido"),
            @ApiResponse(code = 404, message = "No encontrado")
    })
	public ResponseEntity<UserAuthResponseDTO> autenticacionUsuario(UserAuthRequestDTO dto)throws IOException;
	
	public ResponseEntity<?> register(@Valid @RequestBody RegisterRequestDTO request) throws Exception;
	
}
