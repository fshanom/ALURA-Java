
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente filipe = new Gerente();

		filipe.setNome("Filipe Shanom");
		filipe.setCpf("17730467720");
		filipe.setSalario(1000.0);
		
		System.out.println(filipe.getNome());
		System.out.println(filipe.getBonificacao());
	}
}
