package application;

import utilitario.ListaPerson;

public class MyApp {

	public static void main(String[] args) {
		String res;
		ListaPerson lp = new ListaPerson();
		
		lp.adicionar("Primeira Instancia");
		lp.adicionar("Segunda Instancia");
		lp.adicionar("terceira Instancia");
		lp.adicionar("Quarta Instancia");
		lp.adicionar("Quinta Instancia");
		
		
		System.out.println(lp.findAll());		
		
		
		
		
		
	
	}

}
