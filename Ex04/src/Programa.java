import java.util.Scanner;

public class Programa {	
	
	public static void main(String[] args) {

		
		Scanner leitor = new Scanner(System.in);
		
		String matricula = "111111";
		String nome = "Pedro";
		double[] notas = new double[5];
		double[] pesos = {0.05 , 0.05 , 0.2 , 0.2, 0.5};
		
		int contador = 0;
		double nFinal = 0;
		do {
			System.out.println("Digite a nota " + (contador + 1)+ ":");
			double temp = leitor.nextDouble();
			// se nota válida
			if(temp >= 0 && temp <= 10) {
				notas[contador] = temp;
				nFinal = nFinal + temp * pesos[contador];
				//notas[contador] = temp * pesos[contador];
				contador++;
			} else {
				System.out.println("A nota " + temp + " é inválida!");
			}
		} while (contador < 5);
		
//		double nFinal = 
//				(notas[0] * pesos[0]) + 
//				(notas[1] * pesos[1]) + 
//				(notas[2] * pesos[2]) + 
//				(notas[3] * pesos[3]) + 
//				(notas[4] * pesos[4]);
		
		System.out.println();
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome: " + nome);
		
		//double nFinal = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Nota " + (i + 1) + ":" + notas[i]);
			//nFinal = nFinal + notas[i];
		}
		
		System.out.println("Nota final: " + nFinal);
		if (nFinal > 6) {
			System.out.println("Aprovado: (x)sim ( )não");
		} else {
			System.out.println("Aprovado: ( )sim (x)não");
		}
				
		leitor.close();
	}

}
