package br.com.dev2me.aula2;

public class Ex7 {

	public static void main(String[] args) {
		int estoque = 50;
		
		if (estoque >= 100) {
			System.out.println("Produto com estoque suficiente!");
			System.out.println("Quantidade: " +estoque);
		} 
		else if (estoque <100 && estoque >= 50) {
			System.out.println("Avaliar novo pedido!");
			System.out.println("Quantidade: " +estoque);
		}
		else {
			System.out.println("ATENÇÃO, Realizar novo pedido!");
			System.out.println("Quantidade: " +estoque);
		}
		
	}

}
