package com.code.sysPedidos_backend.Entity;

public class Menu {
	
	public int idMenu;
	public String plato;
	public double precio;
	public int estado;
	public int idempresa;
	public Menu() {
		
	}
	public Menu(int idMenu, String plato, double precio, int estado, int idempresa) {
		
		this.idMenu = idMenu;
		this.plato = plato;
		this.precio = precio;
		this.estado = estado;
		this.idempresa = idempresa;
	}
	public int getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}
	public String getPlato() {
		return plato;
	}
	public void setPlato(String plato) {
		this.plato = plato;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdempresa() {
		return idempresa;
	}
	public void setIdempresa(int idempresa) {
		this.idempresa = idempresa;
	}
	

}
