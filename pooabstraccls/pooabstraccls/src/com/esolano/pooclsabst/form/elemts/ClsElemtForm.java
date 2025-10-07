package com.esolano.pooclsabst.form.elemts;

abstract public class ClsElemtForm {

    protected String valor;
    protected String nombre;

    public ClsElemtForm() {
    }

    public ClsElemtForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    abstract public String dibujarHtml();
}
