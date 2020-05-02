import java.util.Scanner;

public class Ejercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner (System.in); 
		
		int rpt;
		int a;
		int b;
		float R;
		
		
		System.out.println("Dame el primer número ");
		a=scan.nextInt();
		System.out.println("Dame el segundo número ");
		b=scan.nextInt();
		
		System.out.println("Menú de operaciones");
		System.out.println(" 1.- Suma ");
	    System.out.println(" 2.- Resta");
        System.out.println(" 3.- División ");
        System.out.println(" 4.- Multiplicación ");
        
        rpt=scan.nextInt();
        
        switch(rpt) {
          case 1:
        	  R=a+b;
        	  
        	  System.out.println("El resultado es : "+R);
        	break;
          case 2: 
        	  R=a-b;
        	  
        	  System.out.println("El resultado es : "+R);
        	break;
          case 3:
        	 R=a/b; 
        	 
        	 System.out.println("El resultado es : "+R);
        	 break;
          case 4:
        	  R=a*b;
        	  
        	  System.out.println("El resultado es : "+R);
        	  break;
          default: 
        	  System.out.println("No es opción ");
        	  
        	  break;
        
        
        }
        
        
	}

}
