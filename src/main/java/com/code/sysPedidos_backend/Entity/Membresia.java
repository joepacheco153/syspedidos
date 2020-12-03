package com.code.sysPedidos_backend.Entity;

import java.sql.Date;

public class Membresia {
	
	public int idmembresia;
	public Date fecha_inicio;
	public Date fecha_fin;
	public int idempresa;
	public Membresia() {
		
	}
	public Membresia(int idmembresia, Date fecha_inicio, Date fecha_fin, int idempresa) {
		
		this.idmembresia = idmembresia;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.idempresa = idempresa;
	}
	public int getIdmembresia() {
		return idmembresia;
	}
	public void setIdmembresia(int idmembresia) {
		this.idmembresia = idmembresia;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public int getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}
	
	
	
}
