class Conta {
	int numero;
	String titular;
	double saldo;
	int agencia;
}

class Programa {

	public static void main(String[] args) {
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.saldo = 800.0;
		mauricio.titular = "Mauricio Aniche";
		mauricio.agencia = 842;

		Conta guilherme = new Conta();
		guilherme.numero = 456;
		guilherme.saldo = 1200.0;

		System.out.println(mauricio.saldo);
		System.out.println(guilherme.saldo);
	}
}