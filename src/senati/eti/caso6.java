package senati.eti;
import java.util.Scanner;

import com.Senati.eti.Model.alumno;

import java.io.*;
public class caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			
			archivo = new FileWriter("info.txt", true);
			pw = new PrintWriter(archivo);
			
			System.out.println("REGISTRO DE DATOS");
			System.out.println("=================");
			System.out.print("Nombre......: ");
			String nom = sc.nextLine();
			System.out.print("Apellido......: ");
			String ape = sc.nextLine();
			System.out.print("Genero [M-F]......: ");
			String gen = sc.nextLine();
			System.out.print("Edad......: ");
			int ed = sc.nextInt();
			
			alumno alu = new alumno ( nom , ape, gen, ed);
			
			pw.println("Datos Registrados");
			pw.println("===========");
			pw.println("===========");
			pw.println("Nombre y Apellidos . . . : " + alu.Nombrecompleto());
			pw.println("Género [M-F] . . . . . . . . : " + alu.Mostrargenero());
			pw.println("Estado . . . . . . . . . . . . . : " + alu.mostrarestado());
			
			System.out.println("El archivo fue creado correctamente . . .");
		}catch(Exception ex1 ) {
			ex1.printStackTrace();
	
		} finally {
			//Cierre del archivo
			try {
				if ( archivo != null) archivo.close();
			
			}catch (Exception ex2) {
				ex2.printStackTrace();
			}
		}
		
		
		
		
		
		
		

	}

}