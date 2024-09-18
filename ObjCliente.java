package Encapsulamento;

public class ObjCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente (321,"Cecília", "1599887000","44455533311","12345678-0");

		System.out.println("----------ID--------------");
		System.out.println(cliente1.getId());
		System.out.println("----------Nome------------");
		System.out.println(cliente1.getNome());
		System.out.println("------Telefone--------");
		System.out.println(cliente1.getTelefone());
		System.out.println("------CPF--------");
		System.out.println(cliente1.getCpf());
		System.out.println("------RG--------");
		System.out.println(cliente1.getRg());


	}
}
