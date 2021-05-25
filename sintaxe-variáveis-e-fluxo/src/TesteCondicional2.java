
public class TesteCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais.");
		int idade = 14;
		int qtdPessoas = 1;
		boolean acompanhado = qtdPessoas >= 2;
		
		System.out.println("A pessoa tem " + idade + " anos.");

		if (acompanhado) {
			System.out.println("Pode entrar.");
		}else {
			System.out.println("Não pode entrar pois é menor de idade.");				
		}
		
	}
}
