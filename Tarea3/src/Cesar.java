import java.util.Scanner;


public class Cesar {
	public static void main(String [] arg){
		int x =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("Ingrese un n�mero: ");
		x= sc.nextInt();
		if (x%2==0) {
			System.out.println("El n�mero " + x + " es PAR");
		} else {
			System.out.println("El n�mero " + x + " es IMPAR");
		}
	}

}
