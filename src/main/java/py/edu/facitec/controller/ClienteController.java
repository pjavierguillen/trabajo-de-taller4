/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import py.edu.facitec.dao.ClienteDao;
import py.edu.facitec.model.Cliente;

/**
 *
 * @author 
 */

@Transactional
@Controller	
public class ClienteController { 
    @Autowired
    private ClienteDao clienteDAO;
    
    @RequestMapping("/cliente")
    public String save(Cliente cliente){
        System.out.println("Registrando el cliente: "+cliente);
        clienteDAO.save(cliente); 
        return "view/cliente/ok";
    }
} 
