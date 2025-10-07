package com.esolano.pooclsabst.form.elemts;

import com.esolano.pooclsabst.form.elemts.select.ClsOpcion;

import java.util.ArrayList;
import java.util.List;

public class ClsSelectForm extends ClsElemtForm {

    private List<ClsOpcion> opciones;
    //------------------------Constructor

    public ClsSelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<>();
    }

    public ClsSelectForm(String nombre, List<ClsOpcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //------------------------setter y getter

    public ClsSelectForm addOpcion(ClsOpcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name=''")
                .append(this.nombre)
                .append("'>");

        for (ClsOpcion opcion : this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()){
                sb.append(" selected");
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
