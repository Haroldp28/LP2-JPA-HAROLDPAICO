package TestEntidades;

import Dao.ClienteImp;
import Dao.UsuarioImp;
import Modelo.TblCliente;
import Modelo.TblUsuario;

public class TestTblUsuario {

	public static void main(String[] args) {
		// Realizamos la respetiva instancia
				TblUsuario usuario=new TblUsuario();
				UsuarioImp climp= new UsuarioImp();
				
				//Asignamos los valores
				usuario.setUsuario("asd");
				usuario.setPassword("asd");
				
				

	}

}
