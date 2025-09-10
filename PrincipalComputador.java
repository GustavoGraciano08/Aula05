package atividades;

public class PrincipalComputador {
	public static void main(String[] args) {
		 
		ComputadorGamer computador1 = new ComputadorGamer();
		ComputadorHome computador2 = new ComputadorHome();
		
		computador1.ligar();
		computador1.reiniciar();
		computador1.desligar();
		computador1.carregandoSistema();
		
		System.out.println(" ");
		
		computador2.ligar();
		computador2.reiniciar();
		computador2.desligar();
		computador2.carregandoSistema();

	}

	
}
