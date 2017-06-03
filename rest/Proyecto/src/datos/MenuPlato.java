package datos;

public class MenuPlato {
	private int idMenuPlato;
	private Plato plato;
	private boolean activo;

	public MenuPlato() {}

	public MenuPlato(int idMenuPlato, Plato plato, boolean activo) {
		super();
		this.idMenuPlato = idMenuPlato;
		this.plato = plato;
		this.activo = activo;
	}

	public int getIdMenuPlato() {
		return idMenuPlato;
	}

	public void setIdMenuPlato(int idMenuPlato) {
		this.idMenuPlato = idMenuPlato;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "MenuPlato [idMenuPlato=" + idMenuPlato + ", " + plato.getPlato() + ", activo=" + activo + "]";
	}
	
	
}
