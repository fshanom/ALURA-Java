
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(123, 1233112);
		Conta conta2 = new Conta(123, 1873112);
		Conta conta3 = new Conta(123, 1873872);
		
		System.out.println(Conta.getTotal());
	}
}
