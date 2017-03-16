package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
	@Id
	@GeneratedValue
	//cuando el id de tipo string
	//no se puede autogenerar
	private Integer id;
	private String ci;
	private  String nombre;
	//Aplicacion Bidireccional de OnetoOne
	@OneToOne
	private Departamento departamento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
