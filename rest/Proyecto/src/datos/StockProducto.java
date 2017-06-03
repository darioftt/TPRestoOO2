package datos;

public class StockProducto {
	private int idStockProducto;
	private Producto producto;
	private String unidadCompra;
	private int stockActual;
	private int stockDeseado;
	private int stockMinimo;
	
	public StockProducto() {}

	public StockProducto(int idStockProducto, Producto producto, String unidadCompra, int stockActual, int stockDeseado,
			int stockMinimo) {
		super();
		this.idStockProducto = idStockProducto;
		this.producto = producto;
		this.unidadCompra = unidadCompra;
		this.stockActual = stockActual;
		this.stockDeseado = stockDeseado;
		this.stockMinimo = stockMinimo;
	}

	public int getIdStockProducto() {
		return idStockProducto;
	}

	public void setIdStockProducto(int idStockProducto) {
		this.idStockProducto = idStockProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getUnidadCompra() {
		return unidadCompra;
	}

	public void setUnidadCompra(String unidadCompra) {
		this.unidadCompra = unidadCompra;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public int getStockDeseado() {
		return stockDeseado;
	}

	public void setStockDeseado(int stockDeseado) {
		this.stockDeseado = stockDeseado;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@Override
	public String toString() {
		return "StockProducto [idStockProducto=" + idStockProducto + ", producto=" + producto + ", unidadCompra="
				+ unidadCompra + ", stockActual=" + stockActual + ", stockDeseado=" + stockDeseado + ", stockMinimo="
				+ stockMinimo + "]";
	}
	
	
}
