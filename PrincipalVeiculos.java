package atividades;

public class PrincipalVeiculos {
	public static void main(String[] args) {
		
		VeiculoCarro carro = new VeiculoCarro();
		VeiculoOnibus onibus = new VeiculoOnibus();
		
		carro.acelerar();
		carro.desligar();
		carro.engatar();
		carro.frear();
		carro.ligar();
		carro.manobrar();
		
		System.out.println(" ");
		
		onibus.acelerar();
		onibus.desligar();
		onibus.engatar();
		onibus.frear();
		onibus.ligar();
		onibus.manobrar();
	}

}
