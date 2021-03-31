package com.Senati.eti.Model;

public class calculadora {
	//definir atributos
	private float numero1;
	private float numero2;
	
	//leer y establecer valores
	//getter and setters
	public float getNumero1() {
		return this.numero1;
	}
	public void setNumero1(float n1) {
		this.numero1=n1;
	}
	public float getNumero2() {
		return this.numero2;
	}
	public void setNumero2(float n2) {
		this.numero2=n2;
	}
	public calculadora() {
		
	}
	public calculadora(float n1,float n2) {
		this.numero1=n1;
		this.numero2=n2;
	}
	//metodos solicitados
	public float suma() {
		return this.numero1+this.numero2;
		
	}
	public float resta() {
		return this.numero1- this.numero2;
	}
	public float Producto() {
		return this.numero1*this.numero2;
	}
    public float Division() {
		return this.numero1/this.numero2;
				
	}
    public float RestoEntero() {
    	float r=0;
    	if (this.numero2 != 0) {
			r=this.numero1%this.numero2;
		}
    	return r;
}
}
