package com.tecnicos.servicios.SERVICIOSTECNICOS.repositories;

import com.tecnicos.servicios.SERVICIOSTECNICOS.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ClientesRepositorie extends JpaRepository<Clientes,Integer> {
}
