import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int numero;
		int factorial=1;
		System.out.print("Ingrese el numero del cual desea saber el factorial: ");
		numero=scanner.nextInt();
		for(int i=1;i<=numero;i++){
			factorial=factorial*i;
		}
		System.out.println("El factorial de "+numero+" es: "+factorial);
	}
}