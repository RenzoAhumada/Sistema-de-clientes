
package com.Clientes.demo.Service;

import com.Clientes.demo.Entity.Clientes;
import com.Clientes.demo.Repositorios.ClienteRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImple implements ClienteService {
    
 @Autowired
private ClienteRepository clienterepository;

  @Override
  @Transactional
    public List <Clientes> listarClientes(){
            return clienterepository.findAll();
    }
    
    @Override
    @Transactional
    public void eliminarCliente (Integer id){
        clienterepository.delete(findByIdClientes(id));}
    
    @Override
    @Transactional
    public void crearCliente (Clientes cliente){
        clienterepository.save(cliente);
    }
    
    @Override
    @Transactional
    public Clientes findByIdClientes (Integer id){
        return clienterepository.findById(id).orElse(null);
    }
       
    
      @Override
       public Clientes buscarClientePorNombre (Integer id){
           return clienterepository.findById(id).orElse(null);
       }
}
