package com.tecnicos.servicios.SERVICIOSTECNICOS.controllers;

import com.tecnicos.servicios.SERVICIOSTECNICOS.models.Clientes;
import com.tecnicos.servicios.SERVICIOSTECNICOS.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class ClienteController {

    @Autowired
    private ClienteServices clienteServices;

    @GetMapping("/clientes")
    public List<Clientes> listarClientes(){
        return clienteServices.listarClientes();
    }

    @PostMapping("/clientes")
    public Clientes listarClientes(@RequestBody Clientes clientes){
        return clienteServices.agregarCliente(clientes);
    }

    @GetMapping("/clientes/{id}")
    public Clientes listarClientes(@PathVariable Integer id){
        return clienteServices.obtenerClientePorId(id);
    }

    @PutMapping("/clientes/{id}")
    public Clientes actualizarClientes(@PathVariable Integer id, @RequestBody Clientes clientes){
        System.out.println("Fecha de solicitud recibida en el controlador: " + clientes.getFechaSolicitud());
        System.out.println(clientes.toString());
        return clienteServices.actualizarCliente(id,clientes);
    }

    @DeleteMapping("/clientes/{id}")
    public void eliminarClientes(@PathVariable Integer id){
        clienteServices.eliminarClientes(id);
    }


}
