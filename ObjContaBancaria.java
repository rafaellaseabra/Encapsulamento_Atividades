package Encapsulamento;

public class ObjContaBancaria {

	public static void main(String[] args) {
		
	
		ContaBancaria conta = new ContaBancaria(100000.00);
		
		// saldo inicial
		System.out.println("SALDO");
		System.out.println(conta.getSaldo());
		
		//Depósitos
		System.out.println("");
		System.out.println("Depósitando 1000 e 500 reais que resulta em:");
		conta.depositar(500);
		conta.depositar(1000);
		
		//mostrar saldo após os 2 depósitos
		System.out.println(conta.getSaldo());
		
		//saque
		System.out.println("---------------------------");
		System.out.println("Tirando de 1000");
		conta.sacar(1000);
		//após o saque
		System.out.println("---------------------------");
		System.out.println("Saldo após o saque");
		System.out.println(conta.getSaldo());
		

	}

}
