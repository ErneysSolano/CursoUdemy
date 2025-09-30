package com.esolano.pooherencia;

public class ClsAlumno extends ClsPersona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public ClsAlumno(){
        System.out.println("Alumno: inicializando constructor...");
    }
 //<--------  sobrecarga de constructores ------->
    public  ClsAlumno(String nombre, String apellido){
        super(nombre, apellido); //----> Con super accedo al constructor de la clase padre
    }

    public  ClsAlumno(String nombre, String apellido, int edad){
        super(nombre, apellido,edad); //----> Con super accedo al constructor de la clase padre
    }

    public  ClsAlumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido,edad); //----> Con super accedo al constructor de la clase padre**//
        this.institucion = institucion;
        /** donde esta la plabra super tambiem se puede colocar this
         * this(nombre, apellido,edad); y es lo mismo
         */
    }

    public  ClsAlumno(String nombre, String apellido, int edad, String institucion, double notaMatematica,
                      double notaCastellano, double notaHistoria){
        this(nombre, apellido,edad,institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    //-------getter y setter --------------------------*/
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        String saludar = super.saludar(); //reutiliza el texto que esta en la clase padre
       return saludar + "  soy un alumno yy mi nombre es " + getNombre();
    }

    public  double calcularPromedio(){
       // System.out.println("calcularPromedio " + this.getClass().getCanonicalName());//--> se revisa que metodo esta llamando
        System.out.println("calcularPromedio " + ClsAlumno.class.getCanonicalName());//--> imprime el atributo etatico
        return (notaHistoria + notaCastellano + notaMatematica)/3;
    }

    @Override
    public String toString() {
        return super.toString() + "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio= " + this.calcularPromedio();
    }
}
