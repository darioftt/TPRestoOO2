package negocio;

import java.util.List;
import dao.ProductoDao;
import datos.Producto;

public class ProductoABM{
	ProductoDao dao= new ProductoDao();
	
	public Producto traerProducto(int idProducto){
		Producto i =dao.traerProducto(idProducto);
		
		return i;	
	}

	
	public int agregarProducto(int idProducto, String producto,double precio, String imagen){
		Producto p=new Producto(idProducto,producto,precio,imagen);
		return dao.agregar(p);
	}
	
	public void modificar(Producto p){
		dao.actualizar(p);
		
	}
	
	public void eliminar(int idProducto){
		Producto p=dao.traerProducto(idProducto);
		dao.eliminar(p);
		
	}
	
	public List<Producto> traerProducto(){
		return dao.traerProducto();
		}
	
}