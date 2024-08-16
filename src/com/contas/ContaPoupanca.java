package com.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
	
	public void renderJuros() {
		super.saldo = super.saldo * 0.07 + super.saldo;
	}
}
