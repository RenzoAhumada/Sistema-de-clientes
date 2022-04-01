
package com.Clientes.demo.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="clientes")
public class Clientes implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id", nullable = false)
    private Integer id;
    
    @Id
    @Column (name = "nombre", nullable = false)
    private String nombre;
    
    @Id
    @Column (name = "documento",nullable = false)
    private Integer documento;
    
    @Id
    @Column (name = "telefono")
    private Integer telefono;
    
    
    
}
