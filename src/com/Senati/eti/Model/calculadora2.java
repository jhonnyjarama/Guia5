package com.Senati.eti.Model;

public class calculadora2 {
	//variables
	private  float Numero1;
	private  float Numero2;
	//geters and setter
	public float getNumero1() {
		return Numero1;
	}
	public void setNumero1(float numero1) {
		Numero1 = numero1;
	}
	public float getNumero2() {
		return Numero2;
	}
	public void setNumero2(float numero2) {
		Numero2 = numero2;
	}
	//metodo costructor
	public calculadora2() {
		
	}
	public calculadora2(float numero1, float numero2) {
		
		Numero1 = numero1;
		Numero2 = numero2;
	}
	public float operar(int tipo) {
		float rpta=0;
		switch(tipo){
		case 1:
			rpta=this.Numero1+this.Numero2;
			break;
			
		}
		return rpta;
	}
	
	
	

}
