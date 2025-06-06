package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity // indica que esuna entidad JPA
@Table(name="tbl_usuario") //el nombre de la tabla en la BD...
@NamedQuery(name="TblUsuario.findAll",query="SELECT u FROM TblUsuario u")
public class TblUsuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuario;
	private String usuario;
	private String password;
	
	//constructor con parametros
	public TblUsuario(int idusuario, String usuario, String password) {
		super();
		this.idusuario = idusuario;
		this.usuario = usuario;
		this.password = password;
	}
	
	public TblUsuario()
	{}
	
	//getters y setters
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
