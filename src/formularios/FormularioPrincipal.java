package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controladores.Acao;

public class FormularioPrincipal {

	//Construtor
	public FormularioPrincipal() {
		
		// JFrame
		JFrame formulario = new JFrame("Formulário Principal");
		formulario.setSize(500, 420);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Componentes para realizar o cadastro
		JLabel lblNomeProduto = new JLabel("Nome do produto:");
		JLabel lblValorProduto = new JLabel("Valor do produto:");
		JLabel lblQuantidadeProduto = new JLabel("Quantidade do produto:");
		JTextField txtNomeProduto = new JTextField();
		JTextField txtQuantidadeProduto = new JTextField();
		JTextField txtValorProduto = new JTextField();
		JButton btnCadastrar = new JButton("Cadastrar Produto");
		
		lblNomeProduto.setBounds(80, 10, 120, 20);
		lblValorProduto.setBounds(80, 40, 120, 20);
		lblQuantidadeProduto.setBounds(80, 70, 150, 20);
		txtNomeProduto.setBounds(220, 10, 200, 20);
		txtValorProduto.setBounds(220, 40, 200, 20);
		txtQuantidadeProduto.setBounds(220, 70, 200, 20);
		btnCadastrar.setBounds(180, 110, 150, 30);
		
		// Instanciar um objeto da classe Ação
		Acao a = new Acao();
		
		// JTable
		JTable tabela = new JTable(a.listarProdutos());		


		// JScrollPane
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(74, 160, 350, 200);
		
		// Ação no botão de cadastro
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Obter os dados informados pelo usuário
				String nomeProduto = txtNomeProduto.getText();
				double valorProduto = Double.parseDouble(txtValorProduto.getText());
				int quantidadeProduto = Integer.parseInt(txtQuantidadeProduto.getText());
				
				// Criar objeto e chamar o método
				a.cadastrar(nomeProduto, valorProduto, quantidadeProduto);
				
				//Atualizar tabela
				tabela.setModel(a.listarProdutos());
				
				// Limpar campos
				txtNomeProduto.setText("");
				txtValorProduto.setText("");
				txtQuantidadeProduto.setText("");
				
				// Cursor no campo nome
				txtNomeProduto.requestFocus();
				
			}
		});
		
		
		// Ação na tabela
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter a linha 
				int linha = tabela.getSelectedRow();
				
				// Obter os dados
				String nomeProduto = tabela.getValueAt(linha, 0).toString();
				double valorProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				int quantidadeProduto = Integer.parseInt(tabela.getValueAt(linha, 2).toString());
				
				// Criar o novo formulário
				FormularioAlteracao f = new FormularioAlteracao(nomeProduto, valorProduto, quantidadeProduto, linha);
				
				// Fechar o FormulárioPrincipal
				formulario.dispose();
						
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		// Adicionar elemenetos ao JFrame
		formulario.add(lblNomeProduto);
		formulario.add(lblValorProduto);
		formulario.add(lblQuantidadeProduto);
		formulario.add(txtNomeProduto);
		formulario.add(txtValorProduto);
		formulario.add(txtQuantidadeProduto);
		formulario.add(btnCadastrar);
		formulario.add(barra);
		
		// Exibir Estrutura
		formulario.setVisible(true);
		
	}
	
}



