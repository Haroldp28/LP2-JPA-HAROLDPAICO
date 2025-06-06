package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import Modelo.TblUsuario;

public class UsuarioImp implements IUsuario {

	public void RegistrarUsuario(TblUsuario usuario) {
		// nos conectamos con la U.P.(Unidad de persistencia)
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		//administrar transaccion
		EntityManager em=emf.createEntityManager();
		try{
			//iniciaos la transaccion
			
			em.getTransaction().begin();
			//invocamos el metodo registrar..
			em.persist(usuario);
			//confirmamos
			em.getTransaction().commit();
			
		}catch(RuntimeException ex){
			
			ex.getMessage();
		}finally {
			//cerramos
			em.close();
		}// fin del finally
		
		
	}// fin del metodo registrar
}
