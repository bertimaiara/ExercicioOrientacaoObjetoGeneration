
public class TestaCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.nome = "Ricardo";
		cliente.endereco = "Rua que sobe e desde e o número que ninguém conhece";
		cliente.cidade = "São Paulo";
		cliente.cep = "95043-001";
		cliente.idade = 28;
		
		System.out.println(cliente.nome);
		System.out.println(cliente.endereco);
		System.out.println(cliente.cidade);
		System.out.println(cliente.cep);
		System.out.println(cliente.idade);
		
		cliente.cadastroCliente();
	}
}
