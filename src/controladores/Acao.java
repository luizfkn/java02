package controladores;

import javax.swing.table.DefaultTableModel;

public class Acao {

	//Método para cadastro
	public void cadastrar(String nomeProduto, double valorProduto, int quantidadeProduto) {
		
		//Criar objeto
		Produto p = new Produto();
		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);
		p.setQuantidadeProduto(quantidadeProduto);
		
		//Adicionar ao ArrayList
		Produto.dados.add(p);
		
	}
	
	//Método para retornar os dados do produto
	public DefaultTableModel listarProdutos() {
		
		
		//DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");
		modelo.addColumn("Quantidade");
		
		for(int indice=0; indice<Produto.dados.size(); indice++) {
			modelo.addRow(new Object[] {
				Produto.dados.get(indice).getNomeProduto(),
				Produto.dados.get(indice).getValorProduto(),
				Produto.dados.get(indice).getQuantidadeProduto()
			});
			
		}
		
		//Retorno
		return modelo;
		
	}
	
	// Método para excluir
	public void excluir(int linha) {
		Produto.dados.remove(linha);
	}
	
	// Método para alterar
	public void alterar(String nomeProduto, double valorProduto, int quantidadeProduto, int linha) {
		
		// Criar objeto
		Produto p = new Produto();
		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);
		p.setQuantidadeProduto(quantidadeProduto);
		
		// Realizar a alteração
		Produto.dados.set(linha, p);

		
	}
	
	
}