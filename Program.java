package brogus;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program {
	//CRIAÇÃO da principal janela
	public static void main(String[] args) {
		JLabel label = new JLabel("Olá mundo!", JLabel.CENTER);
		JFrame janela = new JFrame();
		janela.setSize(400, 400);
		janela.getContentPane().setBackground(new Color(102, 0, 102));
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
		JButton ola = new JButton("Olá");
		janela.add(ola);
		ola.setBounds(150,100,100,30);
	    ola.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent ev) {
	    		janela.getContentPane().setBackground(new Color(0, 51, 0));
	    		janela.add(label);
	    		label.setFont(new Font("Calibri", Font.BOLD, 40));
	    		label.setForeground(Color.white);
	    		ola.setBounds(0, 0, 0, 0);
	    	}
	    });
	    //Fechar o programa pelo botao sair
		JButton sair = new JButton("Sair");
		sair.setBounds(150, 210, 100, 30);
		janela.add(sair);
		sair.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent ev) {
				janela.dispose();
			}
		});
		//CRIUS nome dado ao botão responsavel por abrir uma nova janela para criar um usuario 
		//CRIA é uma nova janela para que faça a inscrição do usuario
		JButton crius = new JButton("Criar Usuário");
		janela.add(crius);
		crius.setBounds(100, 150, 200, 30);
		crius.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent ev) {
				JFrame cria = new JFrame("Criar Usuario");
				cria.setSize(300,400);
				cria.setVisible(true);
				janela.setVisible(false);
				JButton voltar = new JButton("Voltar");
				voltar.setSize(100, 30);
				cria.add(voltar);
				voltar.setBounds(10, 180, 100, 30);
				voltar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						cria.setVisible(false);
						janela.setVisible(true);
					}
				});
			}
		   });
	}
}