import java.util.*;
public class Ejercicio13{
	public static void main(String args[]){

		Scanner read = new Scanner (System.in);
		int salir=0;


		do{
			System.out.println("ingrese numero1 ");
			int numero1=read.nextInt();
			System.out.println("ingrese numero2 ");
			int numero2=read.nextInt();

			int suma = numero1 +numero2;

			if (numero2 == 0) {
				System.out.println("no se puede dividir por 0");
				
			}else{
				float division = (float)numero1/(float)numero2;
				System.out.println("division : "+division);
			}			

			System.out.println("suma : "+suma);


			System.out.println("para salir presione 1 ");
			salir=read.nextInt();

		}while(salir!=1);

	}

}