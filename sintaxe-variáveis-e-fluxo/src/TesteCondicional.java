
public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");
		int idade = 14;
		int qtdPessoas = 1;
		System.out.println("A pessoa tem " + idade + " anos.");

		if (idade >= 18) {
			System.out.println("Pode entrar pois � maior de idade.");
		} else {
			if (qtdPessoas >= 2) {
				System.out.println("Pode entrar pois � menor mas est� acompanhado");
			}else {
				System.out.println("N�o pode entrar pois � menor de idade.");				
			}
		}
	}
}
