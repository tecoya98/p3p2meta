package mx.edu.tesoem.isc.teco.p3p2meta;

public class Datos {
    private String Nombre;
    private int Edad;
    private String Correo;
    private String Curp;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String curp) {
        Curp = curp;
    }

    public Datos(String nombre, int edad, String correo, String curp){
        Nombre=nombre;
        Edad=edad;
        Correo=correo;
        Curp=curp;
    }
}
