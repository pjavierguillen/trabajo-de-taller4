package py.edu.facitec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity

public class Departamento {
	@Id
	@GeneratedValue
	
	private Integer id;
	private String descripcion;
	//aplicacion de asociacion bidireccional
	//nombre del objecto departamento en la clase Gerente
	//Solo en una de las clases se utiliza la propiedad mappydBy
	@OneToOne(mappedBy="departamento") //relacion de uno a uno
	private Gerente gerente;
	
    @OneToMany(mappedBy="departamento")
	private List<Usuario> usuarios;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
	

}
