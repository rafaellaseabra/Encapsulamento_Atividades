package Encapsulamento;

public class ObjItemTema {

	public static void main(String[] args) {

		ItemTema tema1 = new ItemTema (321,"Painel de festa", "1,50 x 1,00");

		System.out.println("----------ID--------------");
		System.out.println(tema1.getId());
		System.out.println("----------Nome------------");
		System.out.println(tema1.getNome());
		System.out.println("------Painel de festa--------");
		System.out.println(tema1.getDescricao());



	}

}
