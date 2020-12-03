package com.code.sysPedidos_backend.Entity;

public class User {
	public int idusuario;
	public String nomuser;
	public String passuser;
	public int estado;
	public int idpersona;
	public User() {
		
	}
	public User(int idusuario, String nomuser, String passuser, int estado, int idpersona) {
		
		this.idusuario = idusuario;
		this.nomuser = nomuser;
		this.passuser = passuser;
		this.estado = estado;
		this.idpersona = idpersona;
	}
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomuser() {
		return nomuser;
	}
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}
	public String getPassuser() {
		return passuser;
	}
	public void setPassuser(String passuser) {
		this.passuser = passuser;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	

}
