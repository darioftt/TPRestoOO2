package datos;

public class MenuProducto {
	private int idMenuProducto;
	private Producto producto;
	private boolean activo;
	
	public MenuProducto() {}

	public MenuProducto(int idMenuProducto, Producto producto, boolean activo) {
		super();
		this.idMenuProducto = idMenuProducto;
		this.producto = producto;
		this.activo = activo;
	}

	public int getIdMenuProducto() {
		return idMenuProducto;
	}

	public void setIdMenuProducto(int idMenuProducto) {
		this.idMenuProducto = idMenuProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "MenuProducto [idMenuProducto=" + idMenuProducto + ", producto=" + producto.getProducto() + ", activo=" + activo + "]";
	}
	
	

}
