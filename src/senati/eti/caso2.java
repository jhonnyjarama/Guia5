package senati.eti;
import java.util.Scanner;
import com.Senati.eti.Model.calculadora2;
public class caso2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Numero1: ");
		float n1=sc.nextFloat();
		System.out.println("Numero2: ");
		float n2 =sc.nextFloat();
		
		calculadora2 calc =new calculadora2 (n1,n2);
		System.out.println("****numeros ingresados****");
		System.out.println("numero 1: "+calc.getNumero1());
		System.out.println("numero 2: "+calc.getNumero2());
		
		System.out.println("****resultados****");
		System.out.println("suma: "+calc.operar(1));
		System.out.println("resta: "+calc.operar(2));

	}

}
