package ex39;

public class Cliente {
	public int id;
	public String nome;
	public int idade;
	public contaBancaria conta;
	
	Cliente(){
		
	}
	Cliente(int id, String nome, int idade, contaBancaria conta){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.conta = conta;
	}

}
