package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaUsuario;

public class Program {
	
	public static void main(String[] args) {
		
		ContaUsuario contaUsuario;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("----------------------------------");
		System.out.println("--------------Banco---------------");
		System.out.println("----------------------------------");
		System.out.println();
		
		System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Voce gostaria de fazer um deposito inicial? [s/n]: ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 's') {
			System.out.print("Entre com saldo inicial: ");
			double primeiroDeposito = sc.nextDouble();
			contaUsuario = new ContaUsuario(numero, titular, primeiroDeposito);
		}
		else {
			contaUsuario = new ContaUsuario(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta.");
		System.out.println(contaUsuario);
		
		System.out.println();
		System.out.print("Digite o valor do deposito: ");
		double valorDoDeposito = sc.nextDouble();
		contaUsuario.deposito(valorDoDeposito);
		
		System.out.println();
		System.out.println("Dados da Conta.");
		System.out.println(contaUsuario);

		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorDoSaque = sc.nextDouble();
		contaUsuario.saque(valorDoSaque);
		
		System.out.println();
		System.out.println("Dados da Conta.");
		System.out.println(contaUsuario);
		
		sc.close();
	}
}
