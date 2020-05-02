import java.util.Scanner;

public class Ejercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan =new Scanner (System.in); 
		System.out.println("Escribe tu nota1");
		int nota = scan.nextInt();
		System.out.println("Escribe tu nota2");
		int nota2 = scan.nextInt();
		System.out.println("Escribe tu nota3");
		int nota3 = scan.nextInt();
		
		
		double promedi; 
		
		promedi= (nota+nota2+nota3)/3;
		
		if (promedi > 10.5) {
			
			System.out.println("¡Estás aprobado!");
		}
		else {
			System.out.println("Estás desaprobado");
		}
		
		System.out.println("El promedio es: "+ promedi);
	}

}
