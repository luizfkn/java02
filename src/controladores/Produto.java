package controladores;

import java.util.ArrayList;

public class Produto {

	// Atributos
	private String nomeProduto;
	private double valorProduto;
	private int quantidadeProduto;

	// ArrayList
	public static ArrayList<Produto> dados = new ArrayList<>();
	
	//Métodos Mágicos
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	
}
