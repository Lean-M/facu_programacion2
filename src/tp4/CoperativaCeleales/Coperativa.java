package tp4.CoperativaCeleales;

import java.util.ArrayList;

public class Coperativa {
    private String nombre;
    private ArrayList<Cereal> cereales;
    private ArrayList<Lote> lotes;
    private ArrayList<String> mineralesP;
    private ArrayList<String> mineralesS;
    
    public boolean esEspecial(Lote l){
        int i=0;
        
        while (i<this.mineralesP.size()){
            if(!l.tieneMineral(this.mineralesP.get(i))){
                return false;
            }
            i++;
        }
        
        return true;
    }
    
    public ArrayList<Cereal> getCerealesAptos(Lote l){
        ArrayList <Cereal> aux = new ArrayList<>();
        
        for(Cereal c : cereales){
            if(c.aceptaLote(l)){
                aux.add(c);
            }
        }
        
        return aux;
    }
    
}
