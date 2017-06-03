package datos;

import java.util.ArrayList;
import java.util.List;

public class Plato {
	private int idPlato;
	private String plato;
	private double costo;
	private boolean almacenable;
	private List<Ingrediente> lstIngrediente =  new ArrayList<Ingrediente>();
	
	public Plato(){};
	
	public Plato(int idPlato, String plato, double costo, boolean almacenable, List<Ingrediente> lstIngrediente) {
		super();
		this.idPlato = idPlato;
		this.plato = plato;
		this.costo = costo;
		this.almacenable = almacenable;
		this.lstIngrediente = lstIngrediente;
	}

	public int getIdPlato() {
		return idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public boolean isAlmacenable() {
		return almacenable;
	}

	public void setAlmacenable(boolean almacenable) {
		this.almacenable = almacenable;
	}

	public List<Ingrediente> getLstIngrediente() {
		return lstIngrediente;
	}

	public void setLstIngrediente(List<Ingrediente> lstIngrediente) {
		this.lstIngrediente = lstIngrediente;
	}

	@Override
	public String toString() {
		return "Plato [idPlato=" + idPlato + ", plato=" + plato + ", costo=" + costo + "$, almacenable=" + almacenable
				+ ", lstIngrediente=" + lstIngrediente.toString()+ "]";
	}

	
	
}
