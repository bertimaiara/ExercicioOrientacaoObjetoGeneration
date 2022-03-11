
public class Aviao {

	String marca;
	String modelo;
	String tipo;
	int ano;
	int numPassageiros;
	double capCombustivel;
	
	void exibirAutonomia() {
		System.out.println("O tamanho do tanque é " + capCombustivel + " litros");
	}
}
