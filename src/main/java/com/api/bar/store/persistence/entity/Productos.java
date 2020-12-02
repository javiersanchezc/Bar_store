package com.api.bar.store.persistence.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Getter
@Setter
public class Productos {
    @Id
    private  int id_producto;
    private int id_categoria;
    private  String nombre;
    private  String descripcion;
    private  Float precio;
    private  int stock;
    private  String imagen;
    private  int visible;
    @Temporal(TemporalType.DATE)
    private Date control;
    private Float impuesto;

}
