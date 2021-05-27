
public class SeguroDeVida extends Conta implements Tributavel {

	public SeguroDeVida(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorImposto() {
		return 42;
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
