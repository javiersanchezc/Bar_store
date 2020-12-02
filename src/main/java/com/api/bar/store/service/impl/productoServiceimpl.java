package com.api.bar.store.service.impl;

import com.api.bar.store.persistence.entity.Productos;
import com.api.bar.store.repository.productoRepositoryDao;
import com.api.bar.store.service.IproductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class productoServiceimpl implements IproductoService {

    @Autowired
    productoRepositoryDao  IproductoRepositoryDao;

    @Override
    public List<Productos> findall() {
        return (List<Productos>) IproductoRepositoryDao.findAll() ;
    }

    @Override
    public Productos save(Productos productos) {
        return null;
    }

    @Override
    public Optional<Productos> findById(Integer id_producto) {
        return Optional.empty();
    }

    @Override
    public void delete(Productos producto) {

    }
}
