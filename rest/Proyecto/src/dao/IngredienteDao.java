package dao;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Ingrediente;

public class IngredienteDao {
	private static Session session;
	private Transaction tx;
	private void iniciaOperacion() throws HibernateException{
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	private void manejaException(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}
	
	public int agregar(Ingrediente objeto){
		int id =0;
		try{
			iniciaOperacion();
			id =Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch (HibernateException he){
			manejaException(he);
			throw he;
		}finally{
			session.close();
		}
		return id;
	}
	
	
	public void actualizar(Ingrediente objeto) throws HibernateException{
		try{
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		} catch (HibernateException he){
			manejaException(he);
			throw he;
		}finally{
			session.close();
		}
	}
	
	public void eliminar(Ingrediente objeto) throws HibernateException{
		try{
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he){
			manejaException(he);
			throw he;
		}finally{
			session.close();
		}
	}
	

	public Ingrediente traerIngrediente(int idIngrediente) throws HibernateException {
		Ingrediente objeto =null;
		try{
			iniciaOperacion();
			objeto = (Ingrediente) session.get(Ingrediente.class, idIngrediente);		
		} finally {
			session.close();
		}
		return objeto;
	}

	
	@SuppressWarnings("unchecked")
	public List<Ingrediente> traerIngrediente() throws HibernateException{
		List<Ingrediente> lista=null;
		try{
			iniciaOperacion();
			lista=session.createQuery("from Ingrediente i order by i.idIngrediente asc i.producto asc").list();
		} finally {
			session.close();
		}
		return lista;
	}

}