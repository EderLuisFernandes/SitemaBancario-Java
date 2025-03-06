public class sistemabank {
    private double chequeEspecial;
	private double chequeEspecialUsuado = 0;
	private double saldo = 0;
	
	// Verificar ChequeEspecial
	public void chequeEspecialValue() {
		if(saldo <= 500) {
			this.chequeEspecial = 50;
			
		}else{
			this.chequeEspecial = saldo * 0.5;
					
		}
		System.out.println("Valor do Cheque Especial é " + this.chequeEspecial);
}
	//  Ver o Saldo
	public double consultarSaldo() {
		return  this.saldo;
	}
    // Verificar Cheque Especial se tem valor adicional e se ele está sendo usado 
	public double  consultarChequeEspecial() {
		chequeEspecialValue();
		return  this.chequeEspecial  ;
		
	}
    // Depositar Dinheiro
	public void depositar(double saldoAtual) {
		if(saldoAtual > 0 ) {
			saldo += saldoAtual;
			chequeEspecialValue();
			System.out.printf("Deposito de Valor  R$ %.2f ", saldoAtual, "Realizado com sucesso!");
		}else {
			System.out.println("Valor tem que ser maior que ZERO");
		}
	}
	// Sacar Dinheiro
	public void sacar(double saldoAtual) {
		if(saldoAtual > 0) {
			saldo -= saldoAtual;
			System.out.println("Saque Realizado com Sucesso!"+ "\n R$"+saldoAtual);
		}
		else if(saldoAtual <= saldo){
			double restante = saldoAtual - saldo;
			this.saldo = 0;
			this.chequeEspecial += restante;
			
			System.out.println("saldo de R$ "+ saldoAtual + "Realizado com o Cheque especial");
		}else {
			System.out.println("o valor para  saque  tem que ser maio que ZERO");
		}
		
	}
    // Pagar Boleto sendo ele usa a mesma logica do sacar e adiciono um valor do paramentro
	public void pagarBoleto(double valor) {
		sacar(valor);
	}
    // Verificar se está usando Cheque Especial
	public boolean chequeEscialUsandos() {
		return chequeEspecialUsuado > 0 || saldo < 0 ;
	}
	// Metodo toString para mostrar o que ta sendo imprimido ajuda bastante 
	public String toString() {
		return  String.format("\nsaldo atual é R$ %.2f", consultarSaldo()) +
				" Valor do Cheque " + consultarChequeEspecial();
	}
}
