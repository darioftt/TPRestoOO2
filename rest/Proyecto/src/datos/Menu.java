package datos;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Menu {
	private int idMenu;
	private GregorianCalendar fecha;
	private List<MenuPlato> lstMenuPlato = new ArrayList<MenuPlato>();
	private List<MenuProducto> lstMenuProducto = new ArrayList<MenuProducto>();
	
	public Menu() {}

	public Menu(int idMenu, GregorianCalendar fecha, List<MenuPlato> lstMenuPlato, List<MenuProducto> lstMenuProducto) {
		super();
		this.idMenu = idMenu;
		this.fecha = fecha;
		this.lstMenuPlato = lstMenuPlato;
		this.lstMenuProducto = lstMenuProducto;
	}

	public int getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(int idMenu) {
		this.idMenu = idMenu;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public List<MenuPlato> getLstMenuPlato() {
		return lstMenuPlato;
	}

	public void setLstMenuPlato(List<MenuPlato> lstMenuPlato) {
		this.lstMenuPlato = lstMenuPlato;
	}

	public List<MenuProducto> getLstMenuProducto() {
		return lstMenuProducto;
	}

	public void setLstMenuProducto(List<MenuProducto> lstMenuProducto) {
		this.lstMenuProducto = lstMenuProducto;
	}

	@Override
	public String toString() {
		return "Menu [idMenu=" + idMenu + ", fecha=" + fecha + ", lstMenuPlato=" + lstMenuPlato.toString() + ", lstMenuProducto="
				+ lstMenuProducto.toString() + "]";
	}
	
}
