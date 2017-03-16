package py.edu.facitec.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.Producto;

@Repository
public class ProductoDao {
@PersistenceContext
private EntityManager manager;


public void save(Producto producto){
	manager.persist(producto);
}

}
