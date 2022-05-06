package ex39;

public class contaBancaria {
	public String agencia;
	public String numero;
	public double saldo;
	
	contaBancaria(){
		
	}
	
	contaBancaria(String agencia, String numero){
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void depositar(double valorDeposito) {
		
	}
	
	public void sacar(double valorSacar) {
		
	}
	
	public void transferir(double valorTransf) {
		
	}
	
	public double consultarSaldo(int id) {
		return saldo;
		
	}
}
