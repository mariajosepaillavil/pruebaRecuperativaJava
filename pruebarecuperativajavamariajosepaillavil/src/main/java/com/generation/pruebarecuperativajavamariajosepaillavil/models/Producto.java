package com.generation.pruebarecuperativajavamariajosepaillavil.models;

public class Producto { //Clase Padre

    public String nombreProducto;
    public String categoriaProducto;
    public double precioProducto;
    
    
    public Producto() {
    }


    public Producto(String nombreProducto, String categoriaProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.precioProducto = precioProducto;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }


    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    public String getCategoriaProducto() {
        return categoriaProducto;
    }


    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }


    public double getPrecioProducto() {
        return precioProducto;
    }


    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }


    @Override
    public String toString() {
        return "Producto [nombreProducto=" + nombreProducto + ", categoriaProducto=" + categoriaProducto
                + ", precioProducto=" + precioProducto + "]";
    }

    
    
    
    
}

