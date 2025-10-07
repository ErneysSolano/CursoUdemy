package com.esolano.pooclsabst.form.elemts.select;

public class ClsOpcion {
    private String valor;
    private String nombre;
    private  boolean selected;

    //------------------------Constructor

    public ClsOpcion() {
    }

    public ClsOpcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    //------------------------setter y getter

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
