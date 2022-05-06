package ex39;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class projeto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<contaBancaria> listaBanco = new ArrayList<>();
		
		int opcao;
		int id;
		int idade;
		contaBancaria conta;
		
		do {
			System.out.printf("===> Banco <===\n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Criar cliente/conta \n" +
								"2 - Depósito \n" + 
								"3 - Saque \n" +
								"4 - Transfêrencia \n" +
								"5 - Consulta saldo \n" +
								"6 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if(opcao == 1) {
				Cliente cliente = new Cliente();
				
			}
		}
		
	}

}
