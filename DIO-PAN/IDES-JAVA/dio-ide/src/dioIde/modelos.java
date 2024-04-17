package dioIde;

import java.util.Objects;

public class modelos {
	
	private String nome;
	private String cor;
	private Integer idade;
	
	
	
	
	
	//construtor vazio
	public modelos() {}
	
	
	//construtor cheio
	public modelos(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}


	
	
	
	
	//get and setters
	
	@Override
	public String toString() {
		return "modelos [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		modelos other = (modelos) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
	
	
	//public modelos(String nome , String cor, Integer idade) {}
	
	
	
	
}
