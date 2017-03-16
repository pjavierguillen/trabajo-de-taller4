package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.dao.ProductoDao;
import py.edu.facitec.model.Producto;

@Transactional 
@Controller
public class Productocontroller {
	@Autowired
	private ProductoDao productoDao;
	
	@RequestMapping("/producto")
	public String save(Producto producto){
		System.out.println("ingresando producto"+producto);
		productoDao.save(producto);
		
		return"view/producto/ok";
	}

}
