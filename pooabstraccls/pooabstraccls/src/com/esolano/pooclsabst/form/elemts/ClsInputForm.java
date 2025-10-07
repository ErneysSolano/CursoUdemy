package com.esolano.pooclsabst.form.elemts;

public class ClsInputForm extends  ClsElemtForm {// si se estiende una clase abstracta, debe haber un metodo abtracto de la clase padre para que no salga error

    private  String tipo = "text";
    //------------------------Constructor
    public ClsInputForm(String nombre) {
        super(nombre);
    }

    public ClsInputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    //------------------------setter y getter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "input type=\" " + this.tipo
                + "\" name=\"" + this.nombre
                + "\" value=\""+ this.valor +"\">";
    }
}