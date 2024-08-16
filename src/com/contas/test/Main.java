package com.contas.test;
import com.contas.Cliente;
import com.contas.Conta;
import com.contas.ContaCorrente;
import com.contas.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		((ContaPoupanca)poupanca).renderJuros();
		poupanca.imprimirExtrato();
	}

}
