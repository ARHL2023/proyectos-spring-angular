package com.tecnicos.servicios.SERVICIOSTECNICOS.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombres;
    private String direccion;
    private String telefono;
    private int cedula;
    private String requerimiento;
    private Boolean garantia;


    @Column(name = "fechaSolicitud")
    private LocalDate fechaSolicitud;

    @PrePersist
    public void asignarFecha(){
        fechaSolicitud= LocalDate.now();
    }

}
