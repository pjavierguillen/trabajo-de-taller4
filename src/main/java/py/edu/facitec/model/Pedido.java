package py.edu.facitec.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private Long id;
	private Date FechaToma;
	private Date FechaEntrega;
	private double total;
	//Aplicacion de asociacion bidireccional
	//Relacion de Muchos a uno
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	
	private Usuario usuario;
	
	@OneToMany(mappedBy="pedido")
	private List<ItemPedido> itemPedidos; 
	//get y set
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFechaToma() {
		return FechaToma;
	}
	public void setFechaToma(Date fechaToma) {
		FechaToma = fechaToma;
	}
	public Date getFechaEntrega() {
		return FechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
	
	
	

}
