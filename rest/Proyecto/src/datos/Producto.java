package datos;

public class Producto {
	private int idProducto;
	private String producto;
	private double precio;
	private String imagen;
	
	public Producto(){};
	
	public Producto(int idProducto, String producto,double precio, String imagen) {
		super();
		this.idProducto = idProducto;
		this.producto = producto;
		this.precio = precio;
		this.imagen = imagen;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", producto=" + producto + ", precio="
				+ precio + ", imagen=" + imagen + "]";
	}
	
	

}
