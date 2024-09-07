package view;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira a String desejada: ");
		String stringInserida = scanner.nextLine();
		
		StringBuffer stringInvertida = new StringBuffer(stringInserida);
		
		System.out.println("String Invertida: " + stringInvertida.reverse().toString());
		scanner.close();
	}

}
