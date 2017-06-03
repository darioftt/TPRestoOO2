package test;

import negocio.ClienteABM;

public class TestAgregarCliente {
	public static void main(String[] args){
		String apellido="orazi";
		String nombre="dario";
		ClienteABM abm = new ClienteABM();
		@SuppressWarnings("unused")
		long ultimoIdCliente= abm.agregarCliente(nombre,apellido,111111111,"Rivadavia","mail","cuitCuil",true,"observaciones");
	}
}