package com.esolano.pooclsabst.form.elemts;

public class ClsTextAreaForm extends ClsElemtForm {

     private  int filas;
     private int columna;

    //------------------------Constructor

    public ClsTextAreaForm(String nombre) {
        super(nombre);
    }

    public ClsTextAreaForm(String nombre, int filas, int columna) {
        super(nombre);
        this.filas = filas;
        this.columna = columna;
    }

    //------------------------setter y getter


    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" +this.nombre + "' cols='"
                + this.columna + "' rows='" + this.filas + "'>"
                + this.valor +"</textarea>";
    }
}
