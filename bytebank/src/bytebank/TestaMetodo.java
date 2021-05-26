package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoFilipe = new Conta();
		contaDoFilipe.deposita(500);
		System.out.println(contaDoFilipe.saldo);
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(500);
		
		boolean sucessoTransferencia = contaDoFilipe.transfere(200, contaDoPaulo);
		
		if (sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		}else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDoFilipe.saldo);
		System.out.println(contaDoPaulo.saldo);


	} 
}
