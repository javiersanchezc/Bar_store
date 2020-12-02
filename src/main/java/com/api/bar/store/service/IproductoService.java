package com.api.bar.store.service;

import com.api.bar.store.persistence.entity.Productos;

import java.util.List;
import java.util.Optional;

public interface IproductoService {


    public List<Productos> findall();
    public Productos save(Productos productos);
    public Optional<Productos> findById(Integer  id_producto);


    public void delete(Productos producto);
}
