import java.util.Locale;
import java.util.Scanner;

public class bancoFernandes {
    public static void main(String[] args) throws Exception {
      Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		sistemabank banco = new sistemabank();
		boolean continuar = true;
		
		while(continuar) {
			 	System.out.println("\n📌 MENU DO BANCO 📌");
	            System.out.println("1 Consultar Saldo");
	            System.out.println("2 Consultar Cheque Especial");
	            System.out.println("3 Depositar Dinheiro");
	            System.out.println("4 Sacar Dinheiro");
	            System.out.println("5 Pagar Boleto");
	            System.out.println("6 Verificar se está usando Cheque Especial");
	            System.out.println("7 Sair");
	            System.out.print("Escolha uma opção: ");
	            
	            int opcao = sc.nextInt();
	           
	            switch(opcao) {
	            case 1:
	            	System.out.println(" Saldo atual: R$" + banco.consultarSaldo());
                    break;
	            case 2:
	            	banco.chequeEspecialValue();
	            	
	            	break;
	            case 3:
	            	System.out.println("Digite um valor para Depositar");
	            	double valorDeposito = sc.nextDouble();
	        		banco.depositar(valorDeposito);
	        		banco.toString();
	        		System.out.println("\" Depósito realizado!\"" );
	        		break;
	            
	            case 4 :
	            	System.out.println("Digite um valor para Sacar");
	            	double sacar = sc.nextDouble();
	        		banco.sacar(sacar);
	            	break;
	            case 5 :
	            	System.out.println("Digite o valor do Boleto");
	            	double boleto = sc.nextDouble();
	            	System.out.println("\" e  Boleto pago com sucesso!\"");
	            	banco.pagarBoleto(boleto);
	            	break;
	            case 6 :
	            	if(banco.chequeEscialUsandos()) {;
	            	System.out.println(" Você está usando o cheque especial!");
	            	}else {
	            		System.out.println("✅ Você NÃO está usando o cheque especial.");
	            	}
	            	break;
	            case 7 :
	            	System.out.println("\" Obrigado por usar o SistemaBank! Volte sempre! \"");
	            	sc.close();
	            	continuar = false;
	            	break;
	            default:
	            	System.out.println(" Opçoes invalida. Escolha um numero de 1 a 7");
		}
	            if (continuar) {
	                System.out.println("\n🔵 Pressione ENTER para continuar...");
	                sc.nextLine();  
	                sc.nextLine();  
	            }
	            
		
	}

}
	
    }

