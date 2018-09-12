package tp4.CoperativaCeleales;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList <String> mineralesNesesarios;
    
    public Cereal(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public boolean aceptaLote(Lote lote){
        int i=0;
        
        while(i<this.mineralesNesesarios.size()){
            if(!lote.tieneMineral(this.mineralesNesesarios.get(i))){
                return false;
            }
            i++;
        }
        
        return true;
    }
}
