package datos;

public class StockPlato {
	private int idStockPlato;
	private Plato plato;
	private int stockActual;
	private int stockDeseado;
	private int stockMinimo;
	
	public StockPlato() {}

	public StockPlato(int idStockPlato, Plato plato, int stockActual, int stockDeseado, int stockMinimo) {
		super();
		this.idStockPlato = idStockPlato;
		this.plato = plato;
		this.stockActual = stockActual;
		this.stockDeseado = stockDeseado;
		this.stockMinimo = stockMinimo;
	}

	public int getIdStockPlato() {
		return idStockPlato;
	}

	public void setIdStockPlato(int idStockPlato) {
		this.idStockPlato = idStockPlato;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
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
		return "StockPlato [idStockPlato=" + idStockPlato + ", plato=" + plato + ", stockActual=" + stockActual
				+ ", stockDeseado=" + stockDeseado + ", stockMinimo=" + stockMinimo + "]";
	}

	
}
