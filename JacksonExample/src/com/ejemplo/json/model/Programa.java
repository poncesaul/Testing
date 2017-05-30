package com.ejemplo.json.model;

import java.util.Date;
import java.util.List;

public class Programa {

	private Integer codigo;
	private String nombre;
	private List<String> modulos;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<String> getModulos() {
		return modulos;
	}
	
	public void setModulos(List<String> modulos) {
		this.modulos = modulos;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
		
	
}
