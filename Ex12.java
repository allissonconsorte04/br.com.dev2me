package br.com.dev2me.aula2;

import javax.swing.JOptionPane;

public class Ex12 {

	public static void main(String[] args) {
		int opcao = 0;
		int voto = 0;
		int angela = 0;
		int gean = 0;
		int cesar = 0;
		int nulo = 0;
		int branco = 0;
		int quantidade = 0;
	       do {  
	    	   opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:"
            		   + "- 1) Preparar Votação"
            		   + "2) Finalizar a votação"
            		   + "9) Sair do programa."));
	    	
	    	if (opcao == 1) {
	    		voto = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu candidato:"
	    				+ "1 - Angela Pepino - PMDB; "
	    				+ "2 - Gean da Silva - PT; "
	    				+ "3 - Cesar Souza Neto - DEM; "
	    				+ "4 - Nulo; "
	    				+ "5 - Branco"));
	    		
	    		if (voto == 1) {
	    			angela ++;
	    		}
	    		else if (voto == 2) {
	    			gean ++;
	    		}
	    		else if (voto == 3) {
	    			cesar ++;
	    		}
	    		else if (voto == 5) {
	    			branco ++;
	    		}
	    		else {
	    			nulo ++;
	    		}
	    		quantidade ++;
	    	}
	    	
	    	if (opcao == 2) {
	    		System.out.println("Quantidade de votos em cada candidato:");
	    		System.out.println("1 - Angela Pepino - PMDB: " +angela);
	    		System.out.println("2 - Gean da Silva - PT: " +gean);
	    		System.out.println("3 - Cesar Souza Neto - DEM: " +cesar);
	    		System.out.println("4 - Votos Nulos: " +nulo);
	    		System.out.println("5 - Votos em branco: " +branco);
	    		System.out.println(" ");
	    		System.out.println("Quantidade de eleitores:" +quantidade);
	    	}	    	
	    } 
while(opcao != 9);
	    
	    System.out.println("Programa finalizado.");
	}

	}

