package com.entidades; 

public class Vehiculo {
	
	private String matricula;
	private String fecha;
	private String hora;
	
	public Vehiculo(String matricula, String fecha, String hora){
		this.matricula = matricula;
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	
}
