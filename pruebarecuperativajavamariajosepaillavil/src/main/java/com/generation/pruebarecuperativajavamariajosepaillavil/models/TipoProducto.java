package com.generation.pruebarecuperativajavamariajosepaillavil.models;

public class TipoProducto extends Producto { //Clase hijx

    public String formatoVenta; // Puede ser granel, unidad o pack.

    public TipoProducto() {
        super();
    }

    public TipoProducto(String formatoVenta) {
        this.formatoVenta = formatoVenta;
    }

    public String getFormatoVenta() {
        return formatoVenta;
    }

    public void setFormatoVenta(String formatoVenta) {
        this.formatoVenta = formatoVenta;
    }

    @Override
    public String toString() {
        return super.toString() + "TipoProducto [formatoVenta=" + formatoVenta + "]";
    }

    
    
    
    
}
