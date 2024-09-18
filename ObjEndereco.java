package Encapsulamento;

public class ObjEndereco {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco(555000,"Rua encantada", 100,"prefeitura","era uma vez","StoryBrooke", "14000345","EUA");

		System.out.println("---ID---");
		System.out.println(endereco1.getId());
		System.out.println("---Logradouro---");
		System.out.println(endereco1.getLogradouro());
		System.out.println("---Número---");
		System.out.println(endereco1.getNumero());
		System.out.println("---Complemento---");
		System.out.println(endereco1.getComplemento());
		System.out.println("---Bairro---");
		System.out.println(endereco1.getBairro());
		System.out.println("---Cidade---");
		System.out.println(endereco1.getCidade());
		System.out.println("---Cep---");
		System.out.println(endereco1.getCep());
		System.out.println("---UF---");
		System.out.println(endereco1.getUf());

	}

}
