
public class TestaBanco {
	public static void main(String[] args) {
		Cliente filipe = new Cliente();
		filipe.nome = "Filipe Shanom Xavier";
		filipe.cpf = "122.122.122.34";
		filipe.profissao = "Programador";
		
		Conta contaDoFilipe = new Conta();
		contaDoFilipe.titular = filipe;
		contaDoFilipe.deposita(500);
		System.out.println(contaDoFilipe.titular.nome);
		System.out.println(contaDoFilipe.titular);
		System.out.println(filipe);
	}
}
