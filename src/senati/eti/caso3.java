package senati.eti;
import java.util.ArrayList;
import java.util.Scanner;
import com.Senati.eti.Model.alumno;
public class caso3 {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		
		ArrayList <alumno> arralumno=new ArrayList<alumno>();
		//forma 1
		alumno alum1 = new alumno();
		alum1.setNombre("joe");
		alum1.setApellido("castillo");
		alum1.setGenero("M");
		alum1.setEdad(25);
		//forma 2
		alumno alum2 =new alumno("rosa","flores","F",25);
		//forma 3 crear al objeto de tipo de alumo
		alumno alum3=null;
		String nom=" ",ape="",gen="";
		int ed=0;
		
		System.out.println("resgistro de datos");
		System.out.println("==================");
		System.out.print("nombre...........:");
		nom=sc.nextLine();
		System.out.print("apellido.........:");
		ape=sc.nextLine();
		System.out.print("genero [M/F].....:");
		gen=sc.nextLine();
		System.out.print("edad [15-30].....:");
		ed=sc.nextInt();
		
		alum3=new alumno(nom,ape,gen,ed);
		
		arralumno.add(alum1);
		arralumno.add(alum2);
		arralumno.add(alum3);
		
		System.out.println("Lista de Datos Registrados");
		System.out.println("==========================");
		String patron="%-4s %-20s %-10s %-15s";
		System.out.println(String.format(patron,"N","NOMBRE Y APELLIDOS","GENERO","ESTADO"));
		System.out.println(String.format(patron,"-","------------------","------","------"));
		
		for (int i = 0; i < arralumno.size(); i++) {
			System.out.println(String.format(patron, (i+1),arralumno.get(i).Nombrecompleto(),arralumno.get(i).Mostrargenero(),arralumno.get(i).mostrarestado()));
		}
		
		

	}

}
