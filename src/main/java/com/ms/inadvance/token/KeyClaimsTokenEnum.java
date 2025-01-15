package com.ms.inadvance.token;

public enum KeyClaimsTokenEnum {
	
	ID_USUARIO("idUser"),
	FULL_NAME("fullName"),
	EMAIL("email"),
	USERNAME("username"),
	AUTHORITIES("authorities"),
	PROFILE("profile"),
	USERINPUT("userinput"),
	PERFILES("perfiles"),
	APLICACIONES("aplicaciones");
	
	private String descripcion;
	
	KeyClaimsTokenEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
