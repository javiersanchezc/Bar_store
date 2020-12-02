package com.api.bar.store.controller;


import com.api.bar.store.persistence.entity.Productos;
import com.api.bar.store.service.IproductoService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/api")
@Api(tags = "LA Barra Bar" ,value = "Lista de todos los tipos de cajeros de la tabla UNICO_CAJERO_TIPO")

@CrossOrigin(origins = "*", allowedHeaders = "*")

public class ProductoController {
    @Autowired
    IproductoService iproductoService;
    @GetMapping("/productos")
    List<Productos> index(){
        return iproductoService.findall();

    }


}
