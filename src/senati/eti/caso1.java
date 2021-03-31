package senati.eti;

import java.util.Scanner;

import com.Senati.eti.Model.calculadora;

public class caso1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculadora calc=new calculadora();
		float n1 =0, n2=0;
		
		System.out.println("numero 1: ");
		n1=sc.nextFloat();
		System.out.println("numero 2: ");
		n2=sc.nextFloat();
		
		calc.setNumero1(n1);
		calc.setNumero2(n2);
		
		System.out.println("****numeros ingresados****");
		System.out.println("numero 1: "+calc.getNumero1());
		System.out.println("numero 2: "+calc.getNumero2());
		
		System.out.println("****resultados****");
		System.out.println("suma: "+calc.suma());
		System.out.println("resta: "+calc.resta());
		System.out.println("multiplicacion: "+calc.Producto());

	}

}
