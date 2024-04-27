package com.tecnicos.servicios.SERVICIOSTECNICOS.services;

import com.tecnicos.servicios.SERVICIOSTECNICOS.models.Clientes;
import java.util.List;

public interface ClienteServices {

    List<Clientes> listarClientes();
    Clientes obtenerClientePorId(Integer id);
    Clientes agregarCliente(Clientes clientes);
    Clientes actualizarCliente(Integer id,Clientes clientes);
    void eliminarClientes(Integer id);

}
