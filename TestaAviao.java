
public class TestaAviao {
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.marca = "Airbus";
		aviao.modelo = "Airbus A380";
		aviao.tipo = "Bimotor";
		aviao.ano = 2020;
		aviao.numPassageiros = 366;
		aviao.capCombustivel = 254000;
		
		System.out.println(aviao.marca);
		System.out.println(aviao.modelo);
		System.out.println(aviao.tipo);
		System.out.println(aviao.ano);
		System.out.println(aviao.numPassageiros);
		System.out.println(aviao.capCombustivel);
		
		aviao.exibirAutonomia();
	}
}
