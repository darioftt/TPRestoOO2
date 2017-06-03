package test;

import negocio.IngredienteABM;

public class TestAgregarIngrediente {
	public static void main(String[] args){
		IngredienteABM abm = new IngredienteABM();
		@SuppressWarnings("unused")
		long ultimoId= abm.agregarIngrediente("brocoli","verduritas",2.37f,"B",true);
	}
}