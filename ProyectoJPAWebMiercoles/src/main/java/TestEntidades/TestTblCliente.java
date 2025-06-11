package TestEntidades;

import java.util.List;

import Dao.ClienteImp;
import Modelo.TblCliente;

public class TestTblCliente {

	public static void main(String[] args) {
		// Realizamos la respetiva instancia
		TblCliente cliente=new TblCliente();
		ClienteImp climp= new ClienteImp();
		//Asignamos los valores
		/*cliente.setNomcliente("Cristiano");
		cliente.setApecliente("Ronaldo");
		cliente.setDnicliente("4563789");
		cliente.setEmailcliente("cristiano@gmail.com");
		cliente.setSexcliente("m");
		cliente.setNacioncliente("portugues");
		cliente.setTelcliente("3814675");
		//invocamos al metodo
		climp.RegistrarCliente(cliente);
		System.out.println("Dato registrado en BD");*/
		
		
		//***** TESTEANDO EL METODO ACTUALIZAR
		  //Actualizando el codigo 3
		/*cliente.setIdcliente(3);
		cliente.setNomcliente("leo");
		cliente.setApecliente("messi");
		cliente.setDnicliente("55555");
		cliente.setEmailcliente("leo@gmail.com");
		cliente.setSexcliente("m");
		cliente.setTelcliente("35555");
		cliente.setNacioncliente("Argentina");
		
		//invocamos el metodo actualizar
		 climp.ActualizarCliente(cliente);
		//mensaje
		System.out.println("Se ha actualizado en la BD");*/
		
		
		//USANDO EL METODO ELIMINAR
		//Eliminando el codigo 4
		//
		/*cliente.setIdcliente(3);
		//invocamos el metodo eliminar
		climp.EliminarCliente(cliente);
		//mensaje
				System.out.println("Se ha eliminado de la BD");*/
		/*
		//USANDO EL METODO LISTAR
		List<TblCliente> listado=climp.ListarCliente();
		//aplicamos un bucle for
		for(TblCliente lis:listado){
			//imprimimos por pantalla
			System.out.println("Codigo es "+lis.getIdcliente()+
					" Nombre "+lis.getNomcliente()+
					" Apellido "+lis.getApecliente()+
					" DNI "+lis.getDnicliente()+
					" Nacionalidad "+lis.getNacioncliente()+
					" Email "+lis.getEmailcliente()+
					" Telefono "+lis.getTelcliente()+
					" Sexo "+lis.getSexcliente());
			
		}//fin el bucle for
		
		*/
		
		//metodo buscar
		//codigo a buscar
		cliente.setIdcliente(1);
		TblCliente buscliente=climp.BuscarCliente(cliente);
		System.out.println("Codigo "+buscliente.getIdcliente()+
				"| Nombre "+buscliente.getNomcliente()+
				"| Apellido "+buscliente.getApecliente()+
				"| Telefono "+buscliente.getTelcliente()+
				"| Email "+buscliente.getEmailcliente());
		
	} //fin del metodo principal....

} //fin de la clase
