package tp5.farmacia;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private int dni;
    private String obraSocial;
    private boolean tieneObreSocial;
    private ArrayList<String> sintomas;
    private ArrayList<String> alergias;
    
    public void Paciente(String nombre, int dni){
        this.tieneObreSocial = false;
        this.nombre = nombre;
        this.dni = dni;
    }
    public void Paciente(String nombre, int dni, String obraSocial){
        this.tieneObreSocial = true;
        this.obraSocial = obraSocial;
        this.nombre = nombre;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getDni() {
        return dni;
    }
    
    public String getObraSocial() {
        return obraSocial;
    }
    
    public void setObraSocial(String obraSocial) {
        this.tieneObreSocial=true;
        this.obraSocial = obraSocial;
    }

    public ArrayList<String> getSintomas() {
        return sintomas;
    }

}
