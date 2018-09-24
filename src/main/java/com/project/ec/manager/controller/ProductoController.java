/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.ec.manager.controller;

import com.project.ec.manager.entities.Producto;
import com.project.ec.manager.repository.ProductoRepository;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pedro
 */
@RestController
@RequestMapping("/api")
public class ProductoController {
    
    @Autowired
    ProductoRepository productoRepository;
    
    
    //Get All Products
    @GetMapping("/products")
    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }
    
    // Create a new Productos
    @PostMapping("/products")
    public Producto createProduct(@Valid @RequestBody Producto producto){
        return productoRepository.save(producto);
    }
}
