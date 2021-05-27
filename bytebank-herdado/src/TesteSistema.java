
public class TesteSistema {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente d = new Cliente();
		d.setSenha(2222);
		
		SistemaInterno s = new SistemaInterno();
		s.autentica(g);
		s.autentica(adm);

		s.autentica(d);
	}
}
