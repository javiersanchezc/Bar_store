package com.api.bar.store.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api")
@Api(value = "Lista de todos los tipos de cajeros de la tabla UNICO_CAJERO_TIPO")
@CrossOrigin(origins = "*", allowedHeaders = "*")


public class categoriaController {
    @RequestMapping("/categoria")
     public  void  index(){

     }

}
