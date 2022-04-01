package com.Clientes.demo.Service;

import com.Clientes.demo.Entity.Clientes;
import java.util.List;


public interface ClienteService{
    
    List <Clientes> listarClientes();
    
    void eliminarCliente (Integer id);
    
    void crearCliente (Clientes cliente);
    
    Clientes findByIdClientes (Integer id);
    
    Clientes buscarClientePorNombre (Integer id);
    
} 

