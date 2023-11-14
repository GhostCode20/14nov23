/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.placa;

/**
 *
 * @author Karina Peña
 */
public class auto {
    
    private String id;
    private String marca;
    private String placa;

    public auto(String id, String marca, String placa) {
        this.id = id;
        this.marca = marca;
        this.placa = placa;
    }

    
    
    
    
    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
    
    
}
