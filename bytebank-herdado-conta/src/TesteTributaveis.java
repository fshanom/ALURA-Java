
public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222,333);
		cc.deposita(10);
		
		SeguroDeVida sv = new SeguroDeVida(223,564);
		sv.deposita(42);
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(cc);
		calc.registra(sv);
		
		System.out.println(calc.getTotalImposto());
	}
}
