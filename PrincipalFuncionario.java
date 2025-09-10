package atividades;

public class PrincipalFuncionario {
	public static void main(String[] args) {
		
	Jornada funcionario1 = new Jornada(1, "Gustavo", "99879-1831", 108, "Rua Shozo Ito", 70.0, 180);
	Horista funcionario2 = new Horista(2, "Bruna", "99746-2992", 198, "Rua Benedito Amancio Diniz", 90.0, 200);
	PessoaJuridica funcionario3 = new PessoaJuridica(3, "Empresa Coca-Cola", "99788-3923", 145, "Av. Paulista", 10500.0, 3800.0);
		
	System.out.println(funcionario1.getNome() + " - Salário: R$ " + funcionario1.calculoSalario());
	System.out.println(funcionario2.getNome() + " - Salário: R$ " + funcionario2.calculoSalario());
	System.out.println(funcionario3.getNome() + " - Salário: R$ " + funcionario3.calculoSalario());
	}

}
