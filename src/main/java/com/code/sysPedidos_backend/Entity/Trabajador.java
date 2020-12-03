package com.code.sysPedidos_backend.Entity;

public class Trabajador {
	
	public int idtrabajador;
	public int idempresa;
	public int idrol;
	public int idusuario;
	public int estado;
	public Trabajador() {
		
	}
	public Trabajador(int idtrabajador, int idempresa, int idrol, int idusuario, int estado) {
		
		this.idtrabajador = idtrabajador;
		this.idempresa = idempresa;
		this.idrol = idrol;
		this.idusuario = idusuario;
		this.estado = estado;
	}
	public int getIdtrabajador() {
		return idtrabajador;
	}
	public void setIdtrabajador(int idtrabajador) {
		this.idtrabajador = idtrabajador;
	}
	public int getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
