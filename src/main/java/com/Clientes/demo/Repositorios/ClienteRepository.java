
package com.Clientes.demo.Repositorios;

import com.Clientes.demo.Entity.Clientes;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ClienteRepository extends JpaRepository<Clientes, Integer >{
    
    @Query("SELECT c FROM siste,a_venta_productos c WHERE c.clientes.id =:p")
    Optional<Clientes> findByClientesid (@Param("p") Integer idClientes);
    
}
