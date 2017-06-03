package datos;

import java.util.GregorianCalendar;

public class MovimientoStock {
	private int idMovimiento;
	private String evento;
	private GregorianCalendar fechaHora;
	private Producto producto;
	private int stockActual;
	private int stockAnterior;
	
	public MovimientoStock() {}

	public MovimientoStock(int idMovimiento, String evento, GregorianCalendar fechaHora, Producto producto,
			int stockActual, int stockAnterior) {
		super();
		this.idMovimiento = idMovimiento;
		this.evento = evento;
		this.fechaHora = fechaHora;
		this.producto = producto;
		this.stockActual = stockActual;
		this.stockAnterior = stockAnterior;
	}

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public int getStockAnterior() {
		return stockAnterior;
	}

	public void setStockAnterior(int stockAnterior) {
		this.stockAnterior = stockAnterior;
	}

	@Override
	public String toString() {
		return "MovimientoStock [idMovimiento=" + idMovimiento + ", evento=" + evento + ", fechaHora=" + fechaHora
				+ ", producto=" + producto + ", stockActual=" + stockActual + ", stockAnterior=" + stockAnterior + "]";
	}
	
}
