
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337,144535);
		System.out.println(conta.getNumero());
		
		Cliente filipe = new Cliente();
		
		filipe.setNome("Filipe Shanom Xavier");
		
		conta.setTitular(filipe);
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(filipe.getProfissao());
		
	}
}
