package negocio;

import java.util.List;
import dao.IngredienteDao;
import datos.Ingrediente;
import datos.Producto;

public class IngredienteABM{
	IngredienteDao dao= new IngredienteDao();
	
	public Ingrediente traerIngrediente(int idIngrediente){
		Ingrediente i =dao.traerIngrediente(idIngrediente);
		
		return i;	
	}

	
	public int agregarIngrediente(int idIngrediente, Producto producto,String unidad, double cantidad){
		Ingrediente i=new Ingrediente(idIngrediente,producto,unidad,cantidad);
		return dao.agregar(i);
	}
	
	public void modificar(Ingrediente i){
		dao.actualizar(i);
		
	}
	
	public void eliminar(int idIngrediente){
		Ingrediente i=dao.traerIngrediente(idIngrediente);
		dao.eliminar(i);
		
	}
	
	public List<Ingrediente> traerIngrediente(){
		return dao.traerIngrediente();
		}
	
}