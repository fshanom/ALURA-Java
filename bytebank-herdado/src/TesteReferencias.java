
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Filipe");
		g1.setSalario(5000.0);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Filipe");
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setNome("Cristiano");
		d.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}

}
