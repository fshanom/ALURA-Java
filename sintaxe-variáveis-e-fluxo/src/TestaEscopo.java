
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais.");
		int idade = 14;
		int qtdPessoas = 1;
		
		boolean acompanhado;

		if (qtdPessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("A pessoa tem " + idade + " anos.");
		if (acompanhado) {
			System.out.println("Pode entrar.");
		} else {
			System.out.println("N�o pode entrar pois � menor de idade.");
		}

	}
}
