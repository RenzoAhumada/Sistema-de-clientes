package com.Clientes.demo.Controllers;

import com.Clientes.demo.Entity.Clientes;
import com.Clientes.demo.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerClientes {

    @Autowired
    private ClienteService clienteservice;

    @GetMapping("/listar")
    public String ListarClientes(Model model) {
        model.addAttribute("titulo", "Lista de Clientes");
        model.addAttribute("clientes", clienteservice.listarClientes());
        return "lista/cliente-lista";
    }

    @GetMapping("/crear")
    public String crearClienteGet(Model model) {
        model.addAttribute("cliente", new Clientes());
        model.addAttribute("titulo", "Regitrar Cliente");
        return "formulario/Form-Cliente";
    }

    @PostMapping("/formCliente")
    public String crearClientePost(Clientes cliente) {
        clienteservice.crearCliente(cliente);
        return "redirect:/cliente/listar";
    }
    @GetMapping("/editar/{id}")
    public String editarCliente(@PathVariable("id") Integer id, Model model){
        model.addAttribute("cliente",clienteservice.findByIdClientes(id));
        model.addAttribute("titulo","Editar Cliente");
        return "formulario/Form-Cliente";
    }
    
       @GetMapping("/eliminar/{id}")
    public String eliminarCliente (@PathVariable("id") Integer id, Model model){
        clienteservice.eliminarCliente(id);
        return "redirect:/cliente/listar";
    }
}
