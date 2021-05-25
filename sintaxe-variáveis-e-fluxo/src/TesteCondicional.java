
public class TesteCondicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");
		int idade = 14;
		int qtdPessoas = 1;
		System.out.println("A pessoa tem " + idade + " anos.");

		if (idade >= 18) {
			System.out.println("Pode entrar pois é maior de idade.");
		} else {
			if (qtdPessoas >= 2) {
				System.out.println("Pode entrar pois é menor mas está acompanhado");
			}else {
				System.out.println("Não pode entrar pois é menor de idade.");				
			}
		}
	}
}
