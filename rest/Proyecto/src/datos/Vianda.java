package datos;

public class Vianda {
	private int idVianda;
	private Producto producto;
	private Plato plato;
	private double precio;
	
	public Vianda() {}

	public Vianda(int idVianda, Producto producto, Plato plato, double precio) {
		super();
		this.idVianda = idVianda;
		this.producto = producto;
		this.plato = plato;
		this.precio = precio;
	}

	public int getIdVianda() {
		return idVianda;
	}

	public void setIdVianda(int idVianda) {
		this.idVianda = idVianda;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vianda [idVianda=" + idVianda + ", producto=" + producto.getProducto() + ", plato=" + plato.getPlato() + ", precio=" + precio
				+ "]";
	}
	

}
