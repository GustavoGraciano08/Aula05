package atividades;

public class PrincipalCalculo {
	public static void main(String[] args) {
		Calculando calculo = new Calculando();
		
		System.out.println("Soma: " + calculo.somar(10, 5));
		System.out.println("Subtração: " + calculo.sub(10, 5));
		System.out.println("Multiplicação: " + calculo.mult(10, 5));
		System.out.println("Divisão: " + calculo.div(10, 5));
		System.out.println("Exponenciação: " + calculo.exp(2, 3));

}
}
