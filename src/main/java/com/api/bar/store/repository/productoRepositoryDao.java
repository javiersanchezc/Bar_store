package com.api.bar.store.repository;

import com.api.bar.store.persistence.entity.Productos;
import org.springframework.data.repository.CrudRepository;

public interface productoRepositoryDao extends CrudRepository <Productos,Integer>{
}
