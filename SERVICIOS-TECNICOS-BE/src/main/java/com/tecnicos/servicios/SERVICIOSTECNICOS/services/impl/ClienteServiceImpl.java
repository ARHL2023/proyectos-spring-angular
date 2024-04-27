package com.tecnicos.servicios.SERVICIOSTECNICOS.services.impl;

import com.tecnicos.servicios.SERVICIOSTECNICOS.models.Clientes;
import com.tecnicos.servicios.SERVICIOSTECNICOS.repositories.ClientesRepositorie;
import com.tecnicos.servicios.SERVICIOSTECNICOS.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteServices {

    @Autowired
    private ClientesRepositorie clientesRepositorie;

    @Override
    public List<Clientes> listarClientes() {
        return clientesRepositorie.findAll();
    }

    @Override
    public Clientes obtenerClientePorId(Integer id) {
        return clientesRepositorie.findById(id).orElse(null);
    }

    @Override
    public Clientes agregarCliente(Clientes clientes) {
        return clientesRepositorie.save(clientes);
    }

    @Override
    public Clientes actualizarCliente(Integer id, Clientes clientes) {
        Clientes clientesBBDD = clientesRepositorie.findById(id).orElse(null);
        if(clientesBBDD!=null){
            clientesBBDD.setNombres(clientes.getNombres());
            clientesBBDD.setDireccion(clientes.getDireccion());
            clientesBBDD.setTelefono(clientes.getTelefono());
            clientesBBDD.setCedula(clientes.getCedula());
            clientesBBDD.setGarantia(clientes.getGarantia());
            clientesBBDD.setRequerimiento(clientes.getRequerimiento());
            clientesBBDD.setFechaSolicitud(LocalDate.now());

            System.out.println("Fecha de solicitud recibida en el servicio: " + clientes.getFechaSolicitud());


            clientesRepositorie.save(clientesBBDD);
        }
        return null;
    }

    @Override
    public void eliminarClientes(Integer id) {
        clientesRepositorie.deleteById(id);
    }



}
