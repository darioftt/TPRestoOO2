package test;

import negocio.HabitacionABM;

public class TestAgregarHabitacion {
	public static void main(String[] args){
		HabitacionABM abm = new HabitacionABM();
		@SuppressWarnings("unused")
		long ultimoIdCliente= abm.agregarHabitacion(50,3,"1",50,"A");
	}
}
