package models;
import java.util.UUID;

public class Produto {
	
	private String id;
	
	private String nome; 
	
	private String fabricante;

	private double price;
	public Produto(String nome, String fabricante, double price) {
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.fabricante = fabricante;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return "Produto: " + getNome() + " - Fabricante: " + getFabricante();
	}
}
