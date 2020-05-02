import java.util.Scanner;

public class Ejercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner diner =new Scanner (System.in); 

        double cantidad, precio,pago, descuento;
        System.out.println("ingresar cantidad: ");
        cantidad=diner.nextInt();
        System.out.println("ingrese el precio: ");
        precio=diner.nextInt();

        pago=cantidad*precio;
        if(pago<50){
            descuento=pago*0.08;
            pago=pago-descuento;
            System.out.println("el descuento es: "+descuento+" , el pago a realizar es: "+pago);
        }
        else{           
             descuento=pago*0.1;
             pago=pago-descuento;
             System.out.println("el descuento es: "+descuento+" , el pago a realizar es: "+pago);
        }
	}

}
