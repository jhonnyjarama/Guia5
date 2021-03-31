package com.Senati.eti.Model;

public class alumno {
	private String nombre;
	private String apellido;
	private String genero;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public alumno() {
		super();
	}
	public alumno(String nombre, String apellido, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
	}
	public  String Nombrecompleto() {
		return this.nombre+this.nombre;
	}
	public String Mostrargenero() {
		/*String m="";
		if (this.genero.equals("F")) {
			m="femenino";
		}
		else if (this.genero.equals("M")) {
			m="masculino";
			
		}
		return m;
		*/
		return (this.genero.equals("F") ? "femenino": "masculino");
		
			
	}
	public String mostrarestado() {
			return (this.edad>=18 ? "mayor de edad": "menor de edad");
	}
	
}
