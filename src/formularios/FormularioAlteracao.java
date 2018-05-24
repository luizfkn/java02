package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladores.Acao;
import controladores.Produto;

public class FormularioAlteracao {

	// Construtor
	public FormularioAlteracao(String nomeProduto, double valorProduto, int quantidadeProduto, int linha) {

		// JFrame
		JFrame formulario = new JFrame("Alterar produto");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Componentes para realizar o cadastro
		JLabel lblNomeProduto = new JLabel("Nome do produto:");
		JLabel lblValorProduto = new JLabel("Valor do produto:");
		JLabel lblQuantidadeProduto = new JLabel("Quantidade do produto:");
		JTextField txtNomeProduto = new JTextField(nomeProduto);
		JTextField txtValorProduto = new JTextField(String.valueOf(valorProduto));
		JTextField txtQuantidadeProduto = new JTextField(String.valueOf(quantidadeProduto));
		
		lblNomeProduto.setBounds(80, 10, 120, 20);
		lblValorProduto.setBounds(80, 40, 120, 20);
		lblQuantidadeProduto.setBounds(80, 70, 150, 20);
		txtNomeProduto.setBounds(220, 10, 200, 20);
		txtValorProduto.setBounds(220, 40, 200, 20);
		txtQuantidadeProduto.setBounds(220, 70, 200, 20);
		
		// JButton
		JButton btnAlterar = new JButton("Alterar Produto");
		JButton btnExcluir = new JButton("Excluir Produto");
		JButton btnCancelar = new JButton("VAITIMFUDE");

		btnAlterar.setBounds(20, 130, 140, 20);
		btnExcluir.setBounds(170, 130, 140, 20);
		btnCancelar.setBounds(320, 130, 140, 20);
		
		// Ações - Alterar
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Obter os dados
				String nomeProduto = txtNomeProduto.getText();
				double valorProduto = Double.parseDouble(txtValorProduto.getText());
				int quantidadeProduto = Integer.parseInt(txtQuantidadeProduto.getText());
				
				// Executar a ação para alterar
				Acao a = new Acao();
				a.alterar(nomeProduto, valorProduto, quantidadeProduto, linha);
			
				// Fechar formulário atual
				formulario.dispose();
				
				// Chamar o formulário principal
				FormularioPrincipal fp = new FormularioPrincipal();
				
			}
		});
		
		
		// Ações - Excluir
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Método para executar a exclusão
				Acao a = new Acao();
				a.excluir(linha);
			
				// Fechar formulário atual
				formulario.dispose();
				
				// Chamar o formulário principal
				FormularioPrincipal fp = new FormularioPrincipal();				
				
			}
			
		});
		
		
		// Ações - Cancelar
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				// Fechar formulário atual
				formulario.dispose();
				
				// Chamar o formulário principal
				FormularioPrincipal fp = new FormularioPrincipal();
					
			}
		});
		
		
		// Adicionar elemenetos ao JFrame
		formulario.add(lblNomeProduto);
		formulario.add(lblValorProduto);
		formulario.add(lblQuantidadeProduto);
		formulario.add(txtNomeProduto);
		formulario.add(txtValorProduto);
		formulario.add(txtQuantidadeProduto);
		formulario.add(btnAlterar);
		formulario.add(btnExcluir);
		formulario.add(btnCancelar);
				
		// Exibir Estrutura
		formulario.setVisible(true);
				

	}

}
