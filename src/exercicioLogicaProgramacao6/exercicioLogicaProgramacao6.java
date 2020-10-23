package exercicioLogicaProgramacao6;
import java.util.Scanner;

public class exercicioLogicaProgramacao6 {
	public static void main(String[] args) {
		
		Scanner Leitor = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int resto;
		
		System.out.println("digite o valor 1:");
		valor1 = Leitor.nextInt();
		
		System.out.println("digite o valor 2:");
		valor2 = Leitor.nextInt();
		
		while(valor2 != 0) {
			resto = valor1 % valor2;
			valor1 = valor2;
			valor2 = resto;
			
		}
		System.out.println(" MDC: " + valor1);
		
	}

}
