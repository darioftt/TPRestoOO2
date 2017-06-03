package datos;

public class Ingrediente {
	private int idIngrediente;
	private Producto producto;
	private String unidad;
	private double cantidad;
	
	public Ingrediente(){} //constructor vacio, nunca olvidar

	public Ingrediente(int idIngrediente, Producto producto,String unidad, double cantidad) {
		super();
		this.idIngrediente = idIngrediente;
		this.producto = producto;
		this.unidad = unidad;
		this.cantidad = cantidad;
	}

	public int getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return "Ingrediente [idIngrediente=" + idIngrediente + ", producto=" + producto.getProducto() + ", unidad=" + unidad
				+ ", cantidad=" + cantidad + "]";
	}

}
