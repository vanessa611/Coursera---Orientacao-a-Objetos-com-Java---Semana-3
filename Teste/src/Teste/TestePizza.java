package Teste;

import java.util.ArrayList;

import model.Pizza;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestePizza {
	
	@Before
	public void limparRegPizza() {
		Pizza.zeraIngredientes();
	}

	@Test
	public void test() {
		Pizza pedidoPizza1 = new Pizza();
		
		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Orégano");
		
		assertEquals(4, pedidoPizza1.getIngrediente().size());
	}
	
	@Test
	public void testIngredientes() {
		Pizza pedidoPizza1 = new Pizza();
		
		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Orégano");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.addAll(pedidoPizza1.getIngrediente());
		
		assertEquals(ingredientes, pedidoPizza1.getIngrediente());
	}
	
}