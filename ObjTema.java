package Encapsulamento;

public class ObjTema {

	public static void main(String[] args) {

		Tema tema1 = new Tema (1234,"Branca de neve",1550,"Amarela, Vermelha e Azul");

		System.out.println("----------ID--------------");
		System.out.println(tema1.getId());
		System.out.println("----------Nome------------");
		System.out.println(tema1.getNome());
		System.out.println("-----Valor do Aluguel------");
		System.out.println(tema1.getValorAluguel());
		System.out.println("------Cor da toalha--------");
		System.out.println(tema1.getCorToalha());
	}

}
